package week4.day2.TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclassLeads {
	
	public RemoteWebDriver driver;
	@Parameters({"browser","url","username","password"})
	@BeforeMethod()
	public void logintoLead(String browser, String url, String username, String password) {
		
		if(browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("-disable-notifications");
		driver = new ChromeDriver(options);
		}else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		}
		
		System.out.println("Before Method used from Class - baseclassLeads");
		driver.get(url);
		System.out.println("URL has been launched");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.findElement(By.id("username")).sendKeys(username);
		System.out.println("Username has been clicked and entered UserName");
		
		driver.findElement(By.id("password")).sendKeys(password);
		System.out.println("password has been entered UserName"); 
		
		driver.findElement(By.className("decorativeSubmit")).click();
		System.out.println("Login Button has been clicked");

	}
	@AfterMethod
	public void quitBrowser() {
		
		driver.quit();
		System.out.println("Browser has been closed using quit from Class - baseclassLeads");
		
	}

}
