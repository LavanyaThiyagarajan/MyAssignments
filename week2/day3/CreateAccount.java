package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("demoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	driver.findElement(By.linkText("Accounts")).click(); 
	driver.findElement(By.linkText("Create Account")).click();
	driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
	driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Local Account");
	driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Testleaf");
	driver.findElement(By.xpath("//input[@class='inputBox' and @name='annualRevenue']")).sendKeys("100000");
	WebElement industry = driver.findElement(By.name("industryEnumId"));
	Select inddrpDwn=new Select(industry);
	inddrpDwn.selectByValue("IND_SOFTWARE");
	WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
	Select ownerdrpDwn=new Select(ownership);
	ownerdrpDwn.selectByVisibleText("S-Corporation");
	WebElement source = driver.findElement(By.id("dataSourceId")); 
	Select sourcedrpDwn=new Select(source);
	sourcedrpDwn.selectByValue("LEAD_EMPLOYEE");
	WebElement marketid = driver.findElement(By.id("marketingCampaignId"));
	Select marketdrpDwn=new Select(marketid);
	marketdrpDwn.selectByIndex(5);
	WebElement stateProvince = driver.findElement(By.id("generalStateProvinceGeoId"));
	Select stateprovincedrpDwn=new Select(stateProvince);
	stateprovincedrpDwn.selectByValue("TX");
	driver.findElement(By.xpath("//input[@value='Create Account']")).click();
	
}
}
