package takescreenshotscript;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementScreenShotScript {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rcb.com/");
		 WebElement logo =driver.findElement(By.xpath("//img[@class='mkdf-light-logo']"));
		 File tempFileLocation = logo.getScreenshotAs(OutputType.FILE);
		  File permFileLocation =new File("./screenshot/logoscreenshot.png");
		  FileUtils.copyFile(tempFileLocation, permFileLocation);
		 
		
	}

}
