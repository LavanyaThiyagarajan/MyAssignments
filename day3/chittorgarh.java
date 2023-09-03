package week4.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chittorgarh {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("navbtn_stockmarket")).click();
		driver.findElement(By.xpath("(//a[text()='NSE Bulk Deals'])[1]")).click();
		WebElement table = driver.findElement(By.xpath("//table[@class='table table-bordered table-striped table-hover w-auto']"));		
		List<WebElement> row = table.findElements(By.tagName("tr"));

		System.out.println(row.size());

		Set<String> oriSet=new LinkedHashSet<String>();  
		Set<String> dupSet=new LinkedHashSet<String>();

		for (int i = 1; i <row.size()-1; i++) {
			String text = driver.findElement(By.xpath("//table[@class='table table-bordered table-striped table-hover w-auto']//tbody//tr["+i+"]//td[1]")).getText();
			if(!oriSet.add(text))
				dupSet.add(text);			 	
		}
		List<String> arrList=new ArrayList<String>(oriSet);//Convert set to arraylist
		Collections.sort(arrList);

		System.out.println("Security Names:");
		for (String res : arrList) {
			System.out.println(res);
		}
		System.out.println("Duplicates:");
		System.out.println(dupSet.size());		
		System.out.println(dupSet);
	}

}
