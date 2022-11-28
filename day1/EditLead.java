package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
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
		
		//Find Leads Section
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Vijay");
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("R");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		System.out.println("Leads Search using First Name , Last Name criteria ");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='15514']")).click();
		System.out.println("Leads Search Result Item has been clicked ");
		
		String title = driver.getTitle();
		
		System.out.println("Title after Lead search : " + title);
		String expectedTitle = "View Lead | opentaps CRM";
		if (title.equals(expectedTitle)) {
			System.out.println("Title is matching");
		
		//Edit Lead
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		//Update Company Name
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("SuVi Corporation");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		System.out.println("Company Name has been updated");
		driver.quit();
	}
	}
}


