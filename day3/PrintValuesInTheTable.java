package week4.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintValuesInTheTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		WebElement Head=driver.findElement(By.xpath("//div[@class='render']/table/thead"));
		WebElement Body=driver.findElement(By.xpath("//div[@class='render']/table/tbody"));
		List<WebElement> row=Body.findElements(By.tagName("tr"));
		List<WebElement> column=Head.findElements(By.tagName("th"));
		System.out.println(row.size());
		System.out.println(column.size());
		
		for (int i = 1; i <= column.size(); i++) {
			String text = driver.findElement(By.xpath("//div[@class='render']/table/thead/tr[1]/th[" + i + "]")).getText();
			System.out.print(text+ "\t\t\t");		
		}
		
		for (int i = 1; i <= row.size(); i++) {
			System.out.println();
			for (int j = 1; j <= column.size(); j++) {
				String text = driver.findElement(By.xpath("//div[@class='render']/table/tbody/tr[" + i + "]/td[" + j + "]")).getText();
				System.out.print(text+ "\t\t\t");
			}
		}
	}

}
	
