package week6.day6.salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountCreation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://login.salesforce.com/");
		
		//Login
		driver.findElement(By.id("username")).sendKeys("lavanya.thiyagarajan@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Vedithlavy@123");
		driver.findElement(By.id("Login")).click();
				
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement until = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='appLauncher slds-context-bar__icon-action']//button"))));	
		until.click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();		
				
		
		//AccountCreation
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Accounts");
		driver.findElement(By.xpath("//p/mark")).click();	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='New']")).click();		
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("MarketingAccount");				
		driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input')])[2]")).click();	
		WebElement ele = driver.findElement(By.xpath("//span[@title='Customer - Direct']"));
		driver.executeScript("arguments[0].click();", ele);
		//WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
		//WebElement until1 = wait1.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[@title='Customer - Direct']"))));	
		//until1.click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		//Verify toast message
		String toastMsg = driver.findElement(By.xpath("//div[@class='slds-align-middle slds-hyphenate']")).getText();
		System.out.println(toastMsg);		
		WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@class='slds-align-middle slds-hyphenate']"))));
		
		//create contact
		
		driver.findElement(By.xpath("(//button[text()='New Contact'])")).click();			
		driver.findElement(By.xpath("//a[@class='select']")).click();
		driver.findElement(By.xpath("//a[@title='Mrs.']")).click();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Lavanya");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Raja");
		driver.findElement(By.xpath("//input[@inputmode='email']")).sendKeys("flyytolavu@gmail.com");
		driver.findElement(By.xpath("(//span[text()='Save'])[3]")).click();		
		String toastMsg2 = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
		System.out.println(toastMsg2);		
		WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait3.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]"))));
		
		//deletecontact
		WebElement viewAll = driver.findElement(By.xpath("//span[text()='View All']"));
		driver.executeScript("arguments[0].click();", viewAll);		
		driver.findElement(By.xpath("(//button[contains(@class,'slds-button slds-button_icon-border ')]//lightning-primitive-icon)[2]")).click();
		driver.findElement(By.xpath("//a[@title='Delete']")).click();
		driver.findElement(By.xpath("//span[text()='Delete']")).click();		
		String toastMsg3 = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
		System.out.println(toastMsg3.substring(0, 35));		
		WebDriverWait wait4=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait4.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]"))));		
		WebElement contactEle = driver.findElement(By.xpath("(//span[text()='Contacts'])[1]"));
		driver.executeScript("arguments[0].click();", contactEle);
		driver.findElement(By.xpath("//input[@name='Contact-search-input']")).sendKeys("flyytolavu@gmail.com",Keys.ENTER);
		String actMsg = driver.findElement(By.xpath("//span[text()='No items to display.']")).getText();
		String expMsg="No items to display.";
		if(expMsg.equalsIgnoreCase(actMsg))
			System.out.println("Contact has been deleted associated with this account");
		else
			System.out.println("Contact has not been deleted associated with this account");
		
	}

}
