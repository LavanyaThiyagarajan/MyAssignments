package week6.day5;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class CheapoairBase {
	public ChromeDriver driver;
	public String sheetName;
	
	@Parameters({"url"})
	@BeforeMethod
	public void preCondition(String url) throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		Thread.sleep(7000);
		driver.findElement(By.xpath("//div[@class='modal-close-icon']")).click();
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	
	@DataProvider(name="fetchData")
	public String[][] readData() throws IOException {
		String[][] data = ReadExcel.readData(sheetName);
		return data;
	}

}
