package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookMyShow {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://in.bookmyshow.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//span[contains(text(),'Hyderabad')]")).click();

		System.out.println("Selenium Assignment Week 2 Day 4 Assignment 2 - BookMyShow");

		System.out.println("Hyderabad City Link has been clicked");

		String url = driver.getCurrentUrl();
		System.out.println(url);

		boolean urlCheck = url.contains("hyderabad");
		System.out.println(" Url with City Hyderabad : " + urlCheck);

		driver.findElement(By.xpath("//div[contains(text(),'Avatar')]")).click();
		System.out.println("Clicked the Favorite Movie - Avatar");

		driver.findElement(By.xpath("//span[contains(text(),'tickets')]")).click();
		System.out.println("Clicked the Book Tickets for Favorite Movie - Avatar");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[contains(text(),'2D')]")).click();
		System.out.println("Clicked the 2d for Favorite Movie - Avatar");

		String firstTheatre = driver.findElement(By.xpath("//div[@class='__title']/a")).getText();
		System.out.println("First Theatre : " + firstTheatre);

		driver.findElement(By.xpath("//div[contains(text(),'INFO')]")).click();
		System.out.println("Click on the info icon of the first");

		String park = driver.findElement(By.xpath("//div[contains(text(),'Parking Facility')]")).getText();
		System.out.println(park);

		park.contains("Parking Facility");

		driver.findElement(By.className("cross-container")).click();
		System.out.println("Click the Close icon in theatre pop up");

		driver.findElement(By.xpath("//div[contains(@class, '_available')]")).click();
		System.out.println("Click on the Available showtime");

		Thread.sleep(3000);

		driver.findElement(By.id("btnPopupAccept")).click();
		System.out.println("Click on the Accept pop-up");

		Thread.sleep(3000);
		
		  driver.findElement(By.id("pop_1")).click();
		  System.out.println("Click on the 1 Seat");
		 

		driver.findElement(By.xpath("//div[@id='proceed-Qty']")).click();
		System.out.println("Select Seat has been clicked");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[@class = '_available']")).click();
		System.out.println("Select the Available seat");

		Thread.sleep(3000);

		driver.findElement(By.id("btmcntbook")).click();

		String subTotal = driver.findElement(By.id("subTT")).getText();
		System.out.println(subTotal);
	}

}
