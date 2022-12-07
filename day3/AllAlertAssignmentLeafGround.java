package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllAlertAssignmentLeafGround {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option= new ChromeOptions();
        option.addArguments("-disable-notifications");
        
		 ChromeDriver driver=new ChromeDriver(option);
		 driver.get("https://www.leafground.com/alert.xhtml");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.manage().window().maximize();
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		 
		 driver.switchTo().alert().accept();
		 
		 System.out.println("Alert (Simple Dialog) - Show has been Clicked");
		 
		 String simpleDialogMessage = driver.findElement(By.id("simple_result")).getText();
		 System.out.println("Message from the simpleDialogMessage - " + simpleDialogMessage);
		 
		 System.out.println("Alert (Confirm Dialog)");
		 driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
		 driver.switchTo().alert().accept();
		 
		 String confirmAlert = driver.findElement(By.xpath("//span[@id = 'result']")).getText();
		 System.out.println(confirmAlert);
		 
		 
		 System.out.println("Alert (Prompt Dialog - 1)");
		 driver.findElement(By.xpath("(//span[text() = 'Show'])[5]")).click();
		 driver.switchTo().alert().sendKeys("Vijay");
		 driver.switchTo().alert().accept();
		 String promptMessagesent = driver.findElement(By.xpath("//span[@id = 'confirm_result']")).getText();
		 System.out.println(promptMessagesent);
		 
		 System.out.println("Alert (Prompt Dialog - 2)");
		 driver.findElement(By.xpath("(//span[text() = 'Show'])[5]")).click();
		 //driver.switchTo().alert().sendKeys("Vijay");
		 driver.switchTo().alert().dismiss();
		 String promptMessagesent1 = driver.findElement(By.xpath("//span[@id = 'confirm_result']")).getText();
		 System.out.println(promptMessagesent1);
		 
		 driver.findElement(By.xpath("(//span[text() = 'Show'])[3]")).click();
		 
		 driver.findElement(By.xpath("(//span[text() = 'Dismiss'])")).click();
		
		
		driver.findElement(By.xpath("(//span[text() = 'Show'])[4]")).click();
		
		String sweetText = driver.findElement(By.xpath("//p[@class = 'm-0']")).getText();
		System.out.println(sweetText);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//span[@class = 'ui-icon ui-icon-closethick'])[2]")).click();
		 	
		driver.findElement(By.xpath("//span[text() = 'Delete']")).click();
		driver.findElement(By.xpath("//span[text() = 'Yes']")).click();
		

	}

}
