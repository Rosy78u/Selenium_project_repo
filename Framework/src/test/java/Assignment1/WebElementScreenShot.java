package Assignment1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementScreenShot{
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 String dateAndTime =LocalDateTime.now().toString();
		 System.out.println("dateAndTime "+dateAndTime);
		String replaceOldChar = dateAndTime.replace(':'  ,  '-');
		System.out.println("replaceoldchar "+replaceOldChar);
		driver.get("https://knowindia.india.gov.in/national-identity-elements/state-emblem.php");
	    WebElement 	logo = driver.findElement(By.xpath("//h1[@class='logo']"));
	    File tempFileLocation =logo.getScreenshotAs(OutputType.FILE);
	    File permLocation = new File("./screenshot3/" + replaceOldChar + "logoscreenshot.png");
	    FileUtils.copyFile(tempFileLocation, permLocation);
	    driver.quit();		
	}

}
