package abhijitsir;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/reg/?nex%2FnopCommerce");
		WebElement monthdropdown =driver.findElement(By.id("month"));
		Select	monthSelect =new  Select(monthdropdown);
		
		monthSelect.selectByIndex(11);
		monthSelect.selectByValue("8");
		monthSelect.selectByVisibleText("Aug");
		
		WebElement yeardropdown =driver.findElement(By.id("year"));
		Select yeardSelect  = new Select (yeardropdown);
		yeardSelect .selectByValue("2022");
		
		
			
	}

}
