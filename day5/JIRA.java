package week6.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JIRA  extends JIRABase{

	@BeforeTest
	public void setUp() {
		sheetName="Jira";
	}
	
	@Test(dataProvider="fetchData")
	public void runJIRA(String summary) throws InterruptedException {
		
		driver.findElement(By.xpath("//p[text()='SDET-5']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("createGlobalItem")).click();
		WebElement storyName = driver.findElement(By.id("summary-field"));
		storyName.sendKeys("New Story for Automation-LavanyaTest");
		String storyText = storyName.getAttribute("value");
		System.out.println("ActualStoryName: "+storyText);
		driver.findElement(By.xpath("(//span[text()='Create']/parent::button)[2]")).click();
		driver.findElement(By.xpath("//span[text()='Backlog']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("search")).sendKeys(summary);
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("(//div[@class='sc-8u98g6-2 kUOIza']//mark)[1]")).getText();
		if(text.equalsIgnoreCase(storyText)) {
			System.out.println("Expected StoryName: "+text);
		}
		else
			System.out.println("Expected StoryName-failed: "+text);
	}
	

}
