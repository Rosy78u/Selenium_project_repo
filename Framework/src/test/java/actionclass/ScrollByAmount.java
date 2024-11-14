package actionclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollByAmount {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/login");
		Actions act = new Actions(driver);
		act.scrollByAmount(0, 500).perform();
		Thread.sleep(2000);
		act.scrollByAmount(0, 500).perform();
		
		
		
		
	}

}
