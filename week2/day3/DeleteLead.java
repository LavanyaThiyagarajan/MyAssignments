package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	driver.findElement(By.xpath("//a[text()='Leads']")).click();
	driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9840636359");		
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();	
	Thread.sleep(2000);
	String firstLeadResult = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]//a[@class='linktext']")).getText();
	System.out.println("FirstLeadID: " +firstLeadResult);
	driver.findElement(By.linkText(firstLeadResult)).click();
	driver.findElement(By.xpath("//a[text()='Delete']")).click();
	driver.findElement(By.xpath("//a[text()='Find Leads']")).click(); 
	driver.findElement(By.xpath("//input[@name='id']")).sendKeys(firstLeadResult);
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	String expectedDisplayRecords="No records to display";
	String actualDisplayRecords=driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
	if(expectedDisplayRecords.equals(actualDisplayRecords)) {
		System.out.println("Passed. No records to display");
	}
	driver.close();
	}
}
