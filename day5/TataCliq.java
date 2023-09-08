package week5.day5;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TataCliq {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://www.tatacliq.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[text()='Brands']"))).perform();
		action.moveToElement(driver.findElement(By.xpath("//div[text()='Watches & Accessories']"))).perform();
		action.moveToElement(driver.findElement(By.xpath("(//div[@class='BrandImage__imageHolder'])[1]"))).perform();
		driver.findElement(By.xpath("(//div[@class='BrandImage__imageHolder'])[1]")).click();
		
		driver.findElement(By.xpath("//div[@class='SelectBoxDesktop__base']")).click();
		Select dropDown=new Select(driver.findElement(By.className("SelectBoxDesktop__hideSelect")));
		dropDown.selectByVisibleText("New Arrivals");
		
		driver.findElement(By.xpath("(//div[@class='CheckBox__base'])[1]")).click();
		
		
		  //to get the all watch price
			
			  List<WebElement> priceList =driver.findElements(By.xpath(
			  "//div[@class='ProductDescription__content']//h3"));
			  System.out.println("Size of watches price: "+priceList.size());
			  
			  Thread.sleep(7000); 
			  //WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
			  //wait.until(ExpectedConditions.visibilityOfAllElements(priceList));
			  
			  System.out.println("Price List: ");
			  for (int i = 0; i < priceList.size();i++)
			  { 
				  System.out.println(priceList.get(i).getText());
				  }
			 
		 
		 String secondWatchPrice = driver.findElement(By.xpath("(//div[@class='ProductDescription__content']//h3)[2]")).getText();
		 System.out.println("secondWatchPrice: "+secondWatchPrice);		 
		 driver.findElement(By.xpath("(//div[@class='ProductModule__base'])[2]")).click();
		 
		 //handle window
		 Set<String> windowHandles = driver.getWindowHandles();
		 List<String> win=new ArrayList<String>(windowHandles);		 
		 //System.out.println(win.size());
	     driver.switchTo().window(win.get(1));		
		 String secondWatchPrice1 = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']//h3")).getText();		
		 if(secondWatchPrice.equals(secondWatchPrice1))
			 System.out.println("Both price are equal");
		 
		 driver.findElement(By.xpath("(//div[@class='Button__base'])[3]")).click();
		 String cartCount = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();
		 System.out.println("CartCount: " +cartCount);
		 driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']")).click();
		 
		 //snapsot
		 Thread.sleep(3000);
		 File source = driver.getScreenshotAs(OutputType.FILE);
		 File dest=new File("./snap/Tatacliq.png");		 
	     FileUtils.copyFile(source, dest);
	     
	     driver.close();	     
	     driver.quit();
	     
	


		
	}

}
