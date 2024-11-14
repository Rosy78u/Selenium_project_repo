package assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

@Test
public class AutomationExerciseAssignment {
	public void userlogin()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		driver.get("https://automationexercise.com/");
		Assert.assertEquals(driver.getTitle(), "Automation Exercise","Home page is displayed");
		Reporter.log("Home page is displayed");
		
		
		driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
		driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("abhis1234@gmail.com");
		driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("abhis@1234");
		driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
		Assert.assertTrue(((WebElement) driver.findElements(By.linkText("Logged in as "))).isDisplayed(), "Logged as jasminsahoo is displayed");
		Reporter.log("logged as jasminsahoo is displayed");
		
		
		driver.findElement(By.partialLinkText("Delete Account")).click();
		Assert.assertEquals(((WebElement) driver.findElements(By.linkText("ACCOUNT DELETED!"))).isDisplayed(), "Account is deleted");
		
		
		
		
		
	}

}
