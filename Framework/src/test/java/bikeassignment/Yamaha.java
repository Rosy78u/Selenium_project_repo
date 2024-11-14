package bikeassignment;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Yamaha {
	@Test(groups="system")
	public void lunch()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		driver.get("https://www.yamaha-motor-india.com/yamaha-bikes.html");
		Reporter.log("Yamaha bike is launched successfully", true);
		

}
}


