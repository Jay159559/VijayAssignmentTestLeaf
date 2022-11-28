package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadXpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		
		//Login Page
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		System.out.println("Username , Password has been enterd and Login button has been clicked");
		
		//CRM/SFA Page
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		System.out.println("CRM/SFA Page link has been clicked");
		
		//Leads Tab
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		System.out.println("Leads Tab has been clicked");
		
		//Create Lead
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		
		//CompanyName , First Name , Last Name Enter 
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("Tony Industries");
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Tony");
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Stark");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Test for Tony");
		driver.findElement(By.xpath("(//input[@name='primaryEmail'])[4]")).sendKeys("Tony@starlk.com");
		

		WebElement countrysele = driver.findElement(By.xpath("//select[@name='generalCountryGeoId']"));
		Select scr = new Select(countrysele);
		
		scr.selectByValue("USA");
		System.out.println("USA Country has been selected");
		
		
		WebElement statesele = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select scr1 = new Select(statesele);
				
		scr1.selectByVisibleText("New York");
		
		System.out.println("New York State has been selected");
		
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
	}

}
