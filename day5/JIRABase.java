package week6.day5;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class JIRABase {
	public ChromeDriver driver;
	public String sheetName;
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void preCondition(String url,String uname,String pwd)
	{		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);		
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("login-submit")).click();
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
