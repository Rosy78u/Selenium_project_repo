package assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ToLearnSoftAssert {
	@Test
	public void login()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://demowebshop.tricentis.com/");
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(driver.getTitle(),"Demo Web Shop" ,"Demo web page is not  displayed");
		Reporter.log("Welcome page is displayed" , true);
		
		
		driver.findElement(By.linkText("Log in")).click();
		soft.assertEquals(driver.getTitle(),"Demo Web Shop. Login", "loginpage is not displayed");
		Reporter.log("login page is displayed" , true);
		
		
		driver.findElement(By.id("Email")).sendKeys("abhis1234@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abhis@1234");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		
		soft.assertEquals(driver.getTitle(), "Demo Web Shop","Homepage is displayed");
		Reporter.log("Homepage is displayed", true);
		
		soft.assertAll();
		
				
	}

}



