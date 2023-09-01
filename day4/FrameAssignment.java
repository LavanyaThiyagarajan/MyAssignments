package week4.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[contains(text(),'Try')]")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("Lavanya");
		alert.accept();
		System.out.println(driver.findElement(By.xpath("//p[@id='demo']")).getText());
	}

}
