package locators;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LinkText {
	public static void main(String[] args) {
		//modified to github
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement forgottenPasswordLink = driver.findElement(By.partialLinkText("Forgotten pass"));
		forgottenPasswordLink.click();
		
		
	}

}
