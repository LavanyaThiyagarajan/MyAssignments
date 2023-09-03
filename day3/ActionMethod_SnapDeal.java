package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionMethod_SnapDeal {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions options = new ChromeOptions(); 
	options.addArguments("--disable-notifications"); 
	ChromeDriver driver = new ChromeDriver(options); 
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	WebElement menFashion = driver.findElement(By.xpath("(//span[contains(text(),'Men')])[1]"));
	Actions action=new Actions(driver);
	action.moveToElement(menFashion).perform();
	driver.findElement(By.xpath("(//span[text()='Shirts'])[1]")).click();
	WebElement firstProduct = driver.findElement(By.xpath("(//div[@class='col-xs-6  favDp product-tuple-listing js-tuple '])[1]"));
	action.moveToElement(firstProduct).perform();
	firstProduct.click();
	Thread.sleep(2000);
	
}
}
