package week3.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AbhiBus {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.abhibus.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='source']")).sendKeys("Chennai");
	driver.findElement(By.xpath("//li[text()='Chennai']")).click();
	driver.findElement(By.xpath("//input[@id='destination']")).sendKeys("Bangalore");
	driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
	driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
	driver.findElement(By.xpath("//a[text()='26']")).click();
	driver.findElement(By.xpath("//a[text()='Search']")).click();
	String firstResultBus = driver.findElement(By.xpath("(//div[@class='search-column1']//h2)[1]")).getText();	
	System.out.println(firstResultBus);
	driver.findElement(By.id("Bustypes4")).click();
	String firstSeatCount = driver.findElement(By.xpath("(//div[@class='search-column2-col1']//p)[1]")).getText();
	System.out.println(firstSeatCount);
	driver.findElement(By.xpath("(//div[@class='col2']//a)[1]")).click();
	driver.findElement(By.xpath("(//li[contains(@class,'sleeper available')]//a)[1]")).click();
	String seatSelected = driver.findElement(By.xpath("(//div[@class='jurnydetails']//div[1]//p[1])[1]")).getText();
	System.out.print(seatSelected + " ");
	String seatNumber = driver.findElement(By.id("seatnos")).getText();
	System.out.println(seatNumber);
	String totalFare = driver.findElement(By.xpath("(//div[@class='jurnydetails']//div[2]//p[1])[1]")).getText();
	System.out.print(totalFare +" ");
	String totalFareCost = driver.findElement(By.xpath("(//div[@class='jurnydetails']//div[2]//span)")).getText();
	System.out.println(totalFareCost);
	WebElement boardingPoint = driver.findElement(By.id("boardingpoint_id"));
	Select sourceDrpDwn=new Select(boardingPoint);
	sourceDrpDwn.selectByIndex(1);
	WebElement droppingPoint = driver.findElement(By.id("droppingpoint_id"));
	Select dropDrpDwn=new Select(droppingPoint);
	dropDrpDwn.selectByIndex(1);
	String title = driver.getTitle();
	System.out.println("Title: " +title);
	driver.close();
}
}
