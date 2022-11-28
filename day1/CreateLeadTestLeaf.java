package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadTestLeaf {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		System.out.println("URL has been launched");
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		System.out.println("Username has been clicked and entered UserName");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		System.out.println("password has been entered UserName"); 
		
		driver.findElement(By.className("decorativeSubmit")).click();
		System.out.println("Login Button has been clicked");
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		System.out.println("CRM/SFA Link has been clicked");
		
		driver.findElement(By.linkText("Leads")).click();
		System.out.println("Leads Tab has been clicked ");
		
		driver.findElement(By.partialLinkText("Create")).click();
		System.out.println("Create Leads Section has been clicked");
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("SuVi Corp");
		System.out.println("Company Name has been entered");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vijay");
		System.out.println("First Name has been entered");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		System.out.println("Last Name has been entered");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Test check in description");
		System.out.println("Description has been entered");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Jay@gmail.com");
		System.out.println("Email has been entered");
		
		
		WebElement countrysele = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select scr = new Select(countrysele);
		
		scr.selectByValue("USA");
		System.out.println("USA Country has been selected");
		
		
		WebElement statesele = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select scr1 = new Select(statesele);
				
		scr1.selectByVisibleText("New York");
		
		System.out.println("New York State has been selected");
		
		
		driver.findElement(By.name("submitButton")).click();
		
		
		

	}

}
