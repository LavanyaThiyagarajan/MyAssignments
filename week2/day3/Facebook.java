package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	driver.findElement(By.name("firstname")).sendKeys("Lavanya");
	driver.findElement(By.name("lastname")).sendKeys("Raja");
	driver.findElement(By.name("reg_email__")).sendKeys("9840636359");
	driver.findElement(By.name("reg_passwd__")).sendKeys("R@j@123");
	WebElement day = driver.findElement(By.id("day"));
	Select dropdownDay=new Select(day);
	dropdownDay.selectByValue("24");	
	WebElement month = driver.findElement(By.id("month"));
	Select dropdownMonth=new Select(month);
	dropdownMonth.selectByIndex(0);
	WebElement year = driver.findElement(By.id("year"));
	Select dropdownYear=new Select(year);
	dropdownYear.selectByVisibleText("1991"); 
	driver.findElement(By.name("sex")).click();	
		 	
}
}
