package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("-disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		System.out.println("URL - https://chercher.tech/practice/frames-example-selenium-webdriver has been clicked");
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame("frame1");
		driver.findElement(By.tagName("input")).sendKeys("Nested Frame Check");
		
		System.out.println("Topic Frame has been clicked and enterd data");
		Thread.sleep(3000);
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@id='a']")).click();
		System.out.println("Inner Frame Check box has been clicked");
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		
		WebElement animal = driver.findElement(By.xpath("//select[@id='animals']"));
		Select animalSelect = new Select(animal);
		animalSelect.selectByIndex(3);
		System.out.println("Selected Animal : "+ animalSelect);

		driver.quit();
	}

}
