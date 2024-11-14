package testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BankAssignment {
	@Test(priority= 1)
	public  void createAccount()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/login");
		Reporter.log("Account created successfully" , true);
		
	}
	
@Test(priority = 2, dependsOnMethods = " createAccount ")
	
	public void editAccount()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/login");
		Reporter.log("Account edited successfully" , true);
		
	}

@Test(priority = 3 , dependsOnMethods = {"createAccount" , "editAccount"}, invocationCount = 2 , threadPoolSize = 2)
 public void deleteAccount()
 {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demowebshop.tricentis.com/login");
	Reporter.log("Account deleted successfully" , true);
 }

	
	
}
