package week3.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.amazon.in/ ");
	driver.manage().window().maximize();
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
	driver.findElement(By.xpath("//span[text()=' for boys']")).click();
	String text = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']//span[1]")).getText();
	String text1 = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']//span[3]")).getText();
	System.out.println("Text: " +text +text1);	
	driver.findElement(By.xpath("(//div[@id='brandsRefinements']//div[contains(@class,'a-checkbox')]//label//i)[1]")).click();
	driver.findElement(By.xpath("(//div[@id='brandsRefinements']//div[contains(@class,'a-checkbox')]//label//i)[2]")).click();
	driver.findElement(By.xpath("//span[@data-action='a-dropdown-button']")).click();
	driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
	String name = driver.findElement(By.xpath("(//a[contains(@class,'a-link-normal s-underline-text')]//span)[1]")).getText();
	System.out.println("Name: " +name);	
	String discountedPrice = driver.findElement(By.xpath("(//div[contains(@class,'s-price-instructions-style')]//span[@class='a-price-whole'])[1]")).getText();
	System.out.println("DiscountedPrice: Rs." +discountedPrice);
	String title = driver.getTitle();
	System.out.println("Title: " +title);
	driver.close();
	
}
}
