package abhijitsir;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Assignment3 {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://www.myntra.com/");
		WebElement kidlink = driver.findElement(By.linkText("KIDS"));
		Actions act = new Actions(driver);
		act.moveToElement(kidlink).perform();
		
		
		WebElement ethniclink = driver.findElement(By.linkText("Ethnic Wear"));
		ethniclink.click();
		
		if(ethniclink.equals(ethniclink))
		{
			System.out.println("verified successfully");
		}
		else
		{
			System.out.println("not verified");
			
		}
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot3/action1.png");
		FileHandler.copy(temp, dest);
	}

}