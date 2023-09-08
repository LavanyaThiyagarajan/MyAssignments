package week5.day5;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class ServiceNow {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();		
		driver.get("https://dev124621.service-now.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("Ak^x88vhDMV=");
		driver.findElement(By.id("sysverb_login")).click();
		
		//access shadow element
		Shadow dom=new Shadow(driver);
		dom.setImplicitWait(15);
		dom.findElementByXPath("//div[text()='All']").click();
		dom.setImplicitWait(5);
		dom.findElementByXPath("//span[text()='Service Catalog']").click();
		
		//access frame inside shadow			
		WebElement frameElement = dom.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frameElement);
		
		//Thread.sleep(2000);
		driver.findElement(By.linkText("Mobiles")).click();
		driver.findElement(By.linkText("Apple iPhone 13 pro")).click();
		
		driver.findElement(By.xpath("(//span[@class='input-group-radio']//label)[1]")).click();
		driver.findElement(By.xpath("//div[@class='col-xs-6  form-field input_controls sc-form-field ']//input[2]")).sendKeys("99");
		WebElement dataAllowance = driver.findElement(By.xpath("//div[@class='col-xs-6  form-field input_controls sc-form-field ']//select"));
		dataAllowance.click();
		Select drpDown=new Select(dataAllowance);
		drpDown.selectByIndex(2);
		driver.findElement(By.xpath("(//span[@class='input-group-radio']//label)[7]")).click();
		WebElement storage = driver.findElement(By.xpath("(//span[@class='input-group-radio']//label)[10]"));
		driver.executeScript("arguments[0].click();", storage);
		
		driver.findElement(By.id("oi_order_now_button")).click();
		String text = driver.findElement(By.xpath("(//div[@class='notification notification-success']//span)[1]")).getText();
		System.out.println("Verified Order is placed: "+text);
		String requestNum = driver.findElement(By.xpath("//a[@id='requesturl']/b")).getText();
		System.out.println("Request Number: "+requestNum);
		
		//snapshot
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snap/ServiceNow.png");
		FileUtils.copyFile(source, dest);
		
		driver.close();
		
		
		
		

	}

}
