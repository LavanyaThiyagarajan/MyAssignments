package week4.day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountRowsColumns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
	    WebElement table = driver.findElement(By.xpath("//div[@class='render']//table"));
	    List<WebElement> column = table.findElements(By.tagName("th"));
	    List<WebElement> row = table.findElements(By.tagName("tr"));
	    int columnCount = column.size();
	    int rowCount=row.size();
	    System.out.println("ColumnCount: "+columnCount  + "  RowCount:" +rowCount);
	    WebElement table1 = driver.findElement(By.xpath("//table[@class='attributes-list']"));
	    List<WebElement> column1 = table1.findElements(By.tagName("th"));
	    List<WebElement> row1 = table1.findElements(By.tagName("tr"));
	    int columnCount1 = column1.size();
	    int rowCount1=row1.size();
	    System.out.println("ColumnCount: "+columnCount1  + "  RowCount:" +rowCount1);
	}

}
