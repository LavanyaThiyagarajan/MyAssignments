package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("//table[@class='twoColumnForm']//tr[1]//a")).click();
		
		
		//Switch to second window
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> win=new ArrayList<String>(windowHandles);
		driver.switchTo().window(win.get(1));
		
		driver.findElement(By.xpath("((//table[@class='x-grid3-row-table'])[1]//a)[1]")).click();
		driver.switchTo().window(win.get(0));
		driver.findElement(By.xpath("//table[@class='twoColumnForm']//tr[2]//a")).click();
		System.out.println(win.size());
		System.out.println(driver.getTitle());
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		//creating another windowhandle since previous one is obsolete
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> win1=new ArrayList<String>(windowHandles1);
		driver.switchTo().window(win1.get(1));
				
		driver.findElement(By.xpath("((//table[@class='x-grid3-row-table'])[2]//a)[1]")).click();
		driver.switchTo().window(win1.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
		//confirmation alert
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		System.out.println(driver.getTitle());
		
		
		
		
		
		

	}

}
