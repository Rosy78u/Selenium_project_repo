package bikeassignment;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ktm {
	@Test(groups = { "smoke" , "integression"})
	public void lunch()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		driver.get("https://www.ktmindia.com/");
		Reporter.log("Ktm bike is launched successfully", true);
		

}
}

