package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
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
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Tony1");
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Stark1");
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
		
		WebElement createdleadId = driver.findElement(By.id("viewLead_companyName_sp"));
		String LeadId = createdleadId.getText();
		System.out.println(LeadId);
		String LeadIdNumeric = LeadId.replaceAll("[^0-9]", " ");
		LeadIdNumeric=LeadIdNumeric.trim();
		System.out.println(LeadIdNumeric);
		
		//Delete the created Lead
		driver.findElement(By.linkText("Delete"));
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).click();
		System.out.println("Created Lead has been deleted - " + LeadIdNumeric);
		
		//Find Lead
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(LeadIdNumeric);
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(2000);
		//message print
		String message = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		System.out.println("Result: "+message);
		
		driver.quit();
		
		
	}


	}


