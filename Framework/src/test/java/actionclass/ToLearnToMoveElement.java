package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnToMoveElement {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver ,Duration.ofSeconds(20));
		driver.get("https://www.myntra.com/");
		WebElement menlink = driver.findElement(By.partialLinkText("WOMEN"));
		Actions act = new Actions(driver);
		act.moveToElement(menlink).perform();
		
		WebElement womenlink = driver.findElement(By.partialLinkText("WOMEN"));
		Actions act1 = new Actions(driver);
		act.moveByOffset(946, 727);
		
		
		
		
		
		
	}

}
