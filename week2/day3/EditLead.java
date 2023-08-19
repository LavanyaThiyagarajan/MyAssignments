package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
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
	driver.findElement(By.xpath("//input[@id='ext-gen248']")).sendKeys("Lavanya");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(2000);
	
	String previousCompanyName = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-companyName'])[1]")).getText();	  
	driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]//a[@class='linktext']")).click();
	String expectedTitle="View Lead | opentaps CRM";
	String actualTitle=driver.getTitle();	
	if(actualTitle.equals(expectedTitle)) {
		System.out.println("Passed. Title is verified:" +actualTitle);
	}
	else {
		System.out.println("Failed. Title is not matched:");
	}
	
	driver.findElement(By.xpath("//a[text()='Edit']")).click();	
	System.out.println("PreviousCompanyName:" +previousCompanyName);
	driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
	driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("HCL");
	driver.findElement(By.xpath("//input[@value='Update']")).click();
	String updatedCompanyName = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
	System.out.println("UpdatedCompanyName: " +updatedCompanyName);	
	driver.close();
}
}
