package week4.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//span[@class='a-size-base puis-normal-weight-text'])[1]")));
				
		String firstCustomerRating = driver.findElement(By.xpath("(//span[@class='a-size-base puis-normal-weight-text'])[1]")).getText();		
		System.out.println(firstCustomerRating);	
		
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> win=new ArrayList<String>(windowHandles);
		driver.switchTo().window(win.get(1));
		System.out.println(win.size());
		
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.id("attach-sidesheet-view-cart-button")).click();
	
		
		//Thread.sleep(2000);
		String cartSubTotal = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap'])[1]")).getText();		
		if(cartSubTotal.contains(".")) {			
			cartSubTotal = cartSubTotal.trim().split("\\.")[0];
			System.out.println(cartSubTotal);
		}
				
		if(cartSubTotal.equals(firstProductPrice)) {
			System.out.println("Cart Subtotal is verified.");
		}
		else {
			System.out.println("Cart Subtotal is not verified.");
		}
		
		
	}

}
