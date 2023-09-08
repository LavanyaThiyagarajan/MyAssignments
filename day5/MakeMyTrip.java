package week5.day5;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);		
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//frame
		WebElement frameWebElement = driver.findElement(By.id("webklipper-publisher-widget-container-notification-frame"));
		driver.switchTo().frame(frameWebElement);
		Thread.sleep(2000);
		driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='landingContainer eng']")).click();
		
		Thread.sleep(1000);
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//li[@class='menu_Holidays removeItemMargin']//span[2]"))).perform();
		driver.findElement(By.xpath("//li[@class='menu_Holidays removeItemMargin']//span[2]")).click();
		
		driver.findElement(By.id("fromCity")).click();		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Enter City']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Enter City']")).sendKeys("Chennai");
		driver.findElement(By.xpath("(//div[@class='searchedCity']//span)[1]")).click();
		
		
		driver.findElement(By.id("toCity")).click();	
		driver.findElement(By.xpath("//input[@placeholder='To']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Goa");	
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='dest-city-name'])[1]")).click();
			
		//WebElement date = driver.findElement(By.xpath("//p[text()='Select Date']"));
		//driver.executeScript("arguments[0].click();", date);
					
		
		driver.findElement(By.xpath("(//div[@class='DayPicker-Day'])[2]")).click();					
		driver.findElement(By.xpath("//div[@data-testid='adult-increment-counter']")).click();
		driver.findElement(By.xpath("//div[@data-testid='child-increment-counter']")).click(); 
		driver.findElement(By.xpath("//ul[@class='font12 darkText childAge-selector-scale']//li[5]")).click();
		driver.findElement(By.xpath("//button[@class='applyBtn']")).click();
		
		//driver.findElement(By.xpath("//div[text()='Select Filters (Optional)']")).click();
		
		WebElement slidermax = driver.findElement(By.xpath("//div[@aria-valuenow='8']"));
		WebElement slidermin = driver.findElement(By.xpath("//div[@aria-valuenow='2']"));
		
		action.clickAndHold(slidermin).moveByOffset(50, 0).release().perform();
		action.clickAndHold(slidermax).moveByOffset(-200, 0).release().perform();
		driver.findElement(By.xpath("//button[text()='APPLY']")).click();
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		driver.findElement(By.xpath("//button[text()='SKIP']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='close closeIcon']")).click();
			
		
		/*USE COMMENTed OR BELOW CODE TO TAKE PARTICULAR ELEMENT SCREENSHOT
		 * WebElement scroll =
		 * driver.findElement(By.xpath("(//div[@class='priceWrapper']//p)[3]"));
		 * action.scrollToElement(scroll).perform(); 
		 * WebElement firstImg =driver.findElement(By.xpath("(//div[@class='sliderCard'])[1]")); 
		 * File source= firstImg.getScreenshotAs(OutputType.FILE); 
		 * File dest=new File("./snap/MakemyTrip.jpeg");
		 *  FileUtils.copyFile(source, dest);
		 */
		WebElement scroll = driver.findElement(By.xpath("(//div[@class='sliderCard'])[1]")); 
		driver.executeScript("arguments[0].scrollIntoView();", scroll);
		File source=scroll.getScreenshotAs(OutputType.FILE); 
		File dest=new File("./snap/MakemyTrip.jpeg"); 
		FileUtils.copyFile(source, dest);
				
		String title = driver.getTitle();
		System.out.println("Title: "+title);
		driver.close();
		
		 
	}

}
