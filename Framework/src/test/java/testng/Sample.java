package testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample {
	@Test(priority =1 ,enabled = false)
	public void Register()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Assert.fail();
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("register is successfull", true);
	}
	@Test(priority =2 , invocationCount = 4  , threadPoolSize = 4)
	public void Login()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("login is successfull", true);
		
		
	}

}
