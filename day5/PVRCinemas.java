package week3.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class PVRCinemas {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions options = new ChromeOptions(); 
	options.addArguments("--disable-notifications"); 
	ChromeDriver driver = new ChromeDriver(options); 	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.pvrcinemas.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
	driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
	WebElement city = driver.findElement(By.name("city"));
	Select cityValue=new Select(city);
	cityValue.selectByValue("Chennai");
	WebElement genre = driver.findElement(By.name("genre"));
	Select genreValue=new Select(genre);
	genreValue.selectByVisibleText("ANIMATION");
	WebElement language = driver.findElement(By.name("lang"));
	Select languageValue=new Select(language);
	languageValue.selectByVisibleText("ENGLISH");
	driver.findElement(By.xpath("//button[text()='Apply']")).click();
	Thread.sleep(5000);	
	driver.findElement(By.xpath("(//div[@class='movie-list']//div//img)[1]")).click();
	driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
	
	Thread.sleep(2000);
	WebElement cinemaName = driver.findElement(By.name("cinemaName"));
	Select cinemaNameValue=new Select(cinemaName);
	cinemaNameValue.selectByIndex(1);
	driver.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']//input")).click();
	driver.findElement(By.xpath("//span[@class='day-unit ng-star-inserted']")).click();
	WebElement timing = driver.findElement(By.name("timings"));
	Select timingValue=new Select(timing);
	timingValue.selectByIndex(2);
	driver.findElement(By.name("noOfTickets")).sendKeys("2");
	driver.findElement(By.name("name")).sendKeys("Lavanya");
	driver.findElement(By.name("email")).sendKeys("lavanyathyagu@gmail.com");
	driver.findElement(By.name("mobile")).sendKeys("9840636358");
	Thread.sleep(2000);
	WebElement foodRequire = driver.findElement(By.name("food"));
	Select foodRequireValue=new Select(foodRequire);
	foodRequireValue.selectByIndex(1);	
	driver.findElement(By.name("comment")).sendKeys("Nil");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[@class='form-group col-sm-6'])[1]")).click();
	driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
	driver.findElement(By.xpath("//button[@aria-label='Close this dialog']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(text(),'CANCEL')])[2]")).click();
	String title = driver.getTitle();
	System.out.println("Title: " +title);
}
}
