package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
	 WebDriverManager.chromedriver().setup();
	 ChromeDriver driver = new ChromeDriver();
	 driver.get("https://www.redbus.in/");
	 
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
	 driver.findElement(By.id("src")).sendKeys("Chennai");
	 
	 System.out.println("Selenium Assignment Week 2 Day 4 Assignment 1 - RedBus");
	 
	 System.out.println("Chennai has been entered in the From field");
	 
	 Thread.sleep(3000);
	 
	 WebElement FromText = driver.findElement(By.id("src"));
	 FromText.sendKeys(Keys.ENTER);
	 
	 driver.findElement(By.id("dest")).sendKeys("Bangalore");
	 System.out.println("Bangalore has been entered in the To field");
	 
	 Thread.sleep(3000);
	 
	 WebElement ToText = driver.findElement(By.id("dest"));
	 ToText.sendKeys(Keys.ENTER);
	 
		/*
		 * WebElement calenderdate =
		 * driver.findElement(By.xpath("(//td[@class='current day'])")); String
		 * selectedDate = calenderdate.getText(); System.out.println(selectedDate);
		 */
	 
	 
	 driver.findElement(By.xpath("//div[@class = 'fl search-box date-box gtm-onwardCalendar']/span")).click();
	 
	 Thread.sleep(3000);
	 
	 driver.findElement(By.xpath("//td[@class = 'current day']/following-sibling::td")).click();
	 driver.findElement(By.id("search_btn")).click();
	 
	 System.out.println("Calender Click date");
	 
	 String NoOfBuses = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
	 System.out.println("Number of Buses : " + NoOfBuses);
	 
	 
	 driver.findElement(By.xpath("//label[@title='SLEEPER']")).click();
	 Thread.sleep(3000);
	 
	 String SecondPrint = driver.findElement(By.xpath("(//div[contains(@class, 'travels')])[2]")).getText();
	 System.out.println(SecondPrint);
	 
	 Thread.sleep(10000);
	 
	 driver.findElement(By.xpath("(//div[contains(@class, 'view-seats')])[2]")).click();
	 System.out.println("Clicked the View Seats of second selection");
	 

	}

}
