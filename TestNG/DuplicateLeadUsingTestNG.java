package week4.day2.TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLeadUsingTestNG extends baseclassLeads{
	
	
	  @DataProvider(name ="duplicateLeadData")
	  public String[][] duplicateLeadData() {
		  String [] [] obj = new String [2] [1];
		  obj [0][0]= "TonyStark@StarkInd.com";
		  obj [1][0]="TonyStark1@StarkInd.com";
		  return obj;
	  }
	
	@Test(dataProvider ="duplicateLeadData" )
	public void duplicateLead(String dupdata) throws InterruptedException {
		//CRM/SFA Page
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		System.out.println("CRM/SFA Page link has been clicked");
		
		//Leads Tab
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		System.out.println("Leads Tab has been clicked");

		//Find Lead
		driver.findElement(By.linkText("Find Leads")).click();
		System.out.println("Find Lead Tab has been clicked");
		
		// Lead Search
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys(dupdata);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		System.out.println("Find Leads search with email");
		
		//Duplicate Lead		
		WebElement firstName = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"));
		String name = firstName.getText();
		System.out.println(name);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
		String title = driver.getTitle();
		System.out.println("Title of the Duplicate Lead before click - " + title );
		driver.findElement(By.linkText("Duplicate Lead")).click();
		System.out.println("Duplicate Lead has been clicked");

		//Title Check
		String title1 = driver.getTitle();
		System.out.println("Title of the Duplicate Lead after click - " + title1);
		
		String expectedTitle = "Duplicate Lead | opentaps CRM";
		if(title1.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("Title is as expected");
		}
		else
		{
			System.out.println("Title is not as expected");
		}
		
		// Create Lead with duplicate details
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		WebElement text2 = driver.findElement(By.id("viewLead_firstName_sp"));
		String duplicateLeadname = text2.getText();
		if(name.equals(duplicateLeadname))
		{
			System.out.println("Lead has been created with duplicated details");
		}
		
	}

}
