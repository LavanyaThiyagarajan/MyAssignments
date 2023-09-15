package week6.day5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Cheapoair extends CheapoairBase {

	@BeforeTest
	public void setUp() {
		sheetName="Cheapoair";
	}
	
	@Test(dataProvider="fetchData")
	public  void runCheapoair(String from,String to) throws InterruptedException {
		// TODO Auto-generated method stub
				
		driver.findElement(By.xpath("//label[@for='onewayTrip']")).click();
		driver.findElement(By.id("from0")).sendKeys(from);
		driver.findElement(By.xpath("(//ul[@class='suggestion-box__list autoSuggest__list']//li)[1]")).click();
		driver.findElement(By.id("to0")).sendKeys(to);
		driver.findElement(By.xpath("(//ul[@class='suggestion-box__list autoSuggest__list']//li)[1]")).click();
		driver.findElement(By.xpath("//a[@class=' month-date is--today']")).click();	
		
		int min=1;
		int max=2;
		int randomNum = min + (int) (Math.random () * ( (max-min) + 1));
		System.out.println("RandomNumber: "+randomNum);
		if(randomNum==1) {
			driver.findElement(By.id("searchNow")).click();
		}
		else if(randomNum==2) {
			driver.findElement(By.xpath("//div[text()='Traveler']")).click();
			driver.findElement(By.id("addadults")).click();
			driver.findElement(By.xpath("//button[text()='Done']")).click();
			driver.findElement(By.id("searchNow")).click();
		}
		driver.findElement(By.xpath("//button[text()='See Flights Only']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@class='p-0 sort-tab__item tabHeight tabWidth is--tab-cheapest ']")).click();		
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='fare-details__fare focus']//span[2]"));
		System.out.println(price.size());
		Thread.sleep(1000);
		for(int i=0;i<price.size();i++) {
			String priceList = price.get(i).getText().replaceAll("\"", "");
			System.out.println(priceList);
		}		
		driver.findElement(By.xpath("(//section[@class='fare-details undefined']//button)[1]")).click();
	}

}
