package week4.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertSampleAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		String text = driver.findElement(By.id("simple_result")).getText();
		System.out.println(text);
		
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Alert alert1=driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert1.dismiss();
		String text1 = driver.findElement(By.id("result")).getText();
		System.out.println(text1);					
				
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();		
		driver.findElement(By.id("j_idt88:j_idt98")).click();
		
		driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();			
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-close ui-corner-all'])[2]")).click();			

		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert alert5 = driver.switchTo().alert();	
		alert5.sendKeys("Lavanya");
		System.out.println(alert5.getText());
		alert5.accept();
		String text5 = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(text5);	
		
		driver.findElement(By.xpath("//span[text()='Delete']")).click();			
		driver.findElement(By.id("j_idt88:j_idt108")).click();
		
		driver.findElement(By.id("j_idt88:j_idt111")).click();
		driver.findElement(By.xpath("//a[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-maximize ui-corner-all']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-close ui-corner-all'])[3]")).click();
		
	}

}
