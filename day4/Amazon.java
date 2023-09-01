package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		String firstProductPrice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();	
		System.out.println(firstProductPrice);
		Thread.sleep(7000);
		String firstCustomerRating = driver.findElement(By.xpath("(//span[@class='a-size-base puis-bold-weight-text'])[1]")).getText();
		
		System.out.println(firstCustomerRating);	
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		Thread.sleep(7000);
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(2000);
		String cartSubTotal = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		if(cartSubTotal.equals(firstProductPrice)) {
			System.out.println("Cart Subtotal is verified.");
		}
		driver.close();
		
	}

}
