package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("demoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Lavanya");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Thiyagarajan");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("lava.lavanya1991@gmail.com");
	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9840636359");
	driver.findElement(By.name("submitButton")).click();
	
	
}
}
