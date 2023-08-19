package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	driver.findElement(By.xpath("//a[text()='Leads']")).click();
	driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
	driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TEST");	
	driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Lavanya");
	driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("R");
	driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("lava.lavanya1991@gmail.com");
	driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("9840636359");
	driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
	 
	
}
}
