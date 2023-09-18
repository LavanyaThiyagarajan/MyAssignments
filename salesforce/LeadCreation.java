package week6.day6.salesforce;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeadCreation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("--disable-notifications"); 
		ChromeDriver driver = new ChromeDriver(options); 		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("lavanya.thiyagarajan@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Vedithlavy@123");
		driver.findElement(By.id("Login")).click();
		//Thread.sleep(3000);
		//System.out.println("Title: "+driver.getTitle());
		
		driver.findElement(By.xpath("//div[@class='appLauncher slds-context-bar__icon-action']//button")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Marketing");
		driver.findElement(By.xpath("//p/mark")).click();
		
		WebElement lead = driver.findElement(By.xpath("//span[text()='Leads']"));
		driver.executeScript("arguments[0].click();", lead);
		
		driver.findElement(By.xpath("//div[text()='New']")).click();
				
		driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='Mrs.']")).click();
		//name
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Shalu");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("T");
		driver.findElement(By.xpath("//input[@name='Company']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		String confirmMsg = driver.findElement(By.xpath("//div[@class='toastContent slds-notify__content']")).getText();
		System.out.println("Confirmation Message: " +confirmMsg);
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border-filled']")).click();
		driver.findElement(By.xpath("//span[text()='Convert']")).click();
		
		WebElement oppurtunityName = driver.findElement(By.xpath("(//button[@class='slds-button transparentButton'])[3]"));		
		driver.executeScript("arguments[0].click();", oppurtunityName);
		driver.findElement(By.xpath("(//input[@class=' input'])[4]")).clear();
		//oppName
		driver.findElement(By.xpath("(//input[@class=' input'])[4]")).sendKeys("TestLeaf-opp");
		driver.findElement(By.xpath("//button[text()='Convert']")).click();
		
		String leadMsg = driver.findElement(By.xpath("//div[@class='title']//lightning-formatted-text")).getText();
		System.out.println("Lead Message: " +leadMsg);
		driver.findElement(By.xpath("//button[text()='Go to Leads']")).click();
		
		driver.findElement(By.xpath("//input[@name='Lead-search-input']")).sendKeys("Shalu",Keys.ENTER);
		String actMsg = driver.findElement(By.xpath("//span[text()='No items to display.']")).getText();	
		String expMsg="No items to display.";
		System.out.println(actMsg);
		if(actMsg.equalsIgnoreCase(expMsg)) 		
			System.out.println("Lead has been converted to oppurtunity");					
		else 
			System.out.println("Lead has not been converted to oppurtunity");				
		WebElement opportunity = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();", opportunity);
				
		//oppName
		driver.findElement(By.xpath("//input[@name='Opportunity-search-input']")).sendKeys("TestLeaf-opp",Keys.ENTER);
		WebElement firstopp = driver.findElement(By.xpath("(//span[@class='slds-grid slds-grid--align-spread forceInlineEditCell']//a)[1]"));		
		driver.executeScript("arguments[0].click();", firstopp);				
		String oppName = driver.findElement(By.xpath("//div[@class='slds-media__body']//lightning-formatted-text")).getText();
		System.out.println("oppName is: "+oppName);
	
		
		
	}

}
