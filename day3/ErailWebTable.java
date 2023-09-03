package week4.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailWebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.get("https://www.leafground.com/table.xhtml");
		driver.get("https://erail.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS",Keys.ENTER);
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("CBE",Keys.ENTER);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		WebElement table = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']"));
		List<WebElement> column = table.findElements(By.tagName("th"));
		List<WebElement> row = table.findElements(By.tagName("tr"));
		System.out.println(column.size());
		System.out.println(row.size());	
		List<String> list2=new ArrayList<String>();
		/*for (int i = 2; i <= row.size(); i++) 
		{			
				 String text = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr[" +i+"]//td[2]")).getText();				
				
					System.out.println(text);
				}
		}*/
		for (int i = 2; i <= row.size(); i++) 
		{			
				List<WebElement> trainName = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr[" +i+"]//td[2]"));				
				for (int k = 0; k < trainName.size(); k++) {
					String  trains = trainName.get(k).getText();
					System.out.println(trains);
					list2.add(trains);
				}
		}
		System.out.println("Sorted");
		Collections.sort(list2);
		System.out.println(list2);	
	}
			
		
	}


