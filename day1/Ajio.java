package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ajio {
public static void main(String[] args) throws InterruptedException {

	ChromeOptions option=new ChromeOptions();
	option.addArguments("--disable-notifications");
	ChromeDriver driver=new ChromeDriver(option);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.ajio.com/");
	driver.manage().window().maximize();
	driver.findElement(By.name("searchVal")).sendKeys("bags");
	driver.findElement(By.xpath("//button[@class='rilrtl-button']")).click();
	driver.findElement(By.xpath("//label[@for='Men']")).click();
	driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
	Thread.sleep(2000);
	System.out.println("Items Count: " +driver.findElement(By.xpath("//div[@class='length']")).getText());
	List<WebElement> brandList = driver.findElements(By.xpath("//div[@class='brand']"));
	List<WebElement> bagList = driver.findElements(By.xpath("//div[@class='nameCls']"));
	System.out.println("BrandList: ");
	for (int i = 0; i < brandList.size(); i++) {
		System.out.println(brandList.get(i).getText());
	}
	System.out.println("BagList: ");
	for (int i = 0; i < bagList.size(); i++) {
		System.out.println(bagList.get(i).getText());
	}
	
}
}
