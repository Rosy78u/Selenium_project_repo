package abhijitsir;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignmentdropdown {
	public static void main(String[] args) {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.freshersworld.com/");
		 WebElement registerlink =driver.findElement(By.id("reg_new_btn"));
		         registerlink.click();
		WebElement  statedropdown = driver.findElement(By.id("body"));
		
	//Select 	statedropdownSelect = new Select(statedropdown);
	
		
	}

}
