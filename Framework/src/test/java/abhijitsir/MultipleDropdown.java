package abhijitsir;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapp.skillrary.com/");
             WebElement pricelistbox=driver.findElement(By.id("cars"));
             
            Select   pricelistboxSelect = new Select(pricelistbox);
            
            pricelistboxSelect.selectByIndex(0);
            pricelistboxSelect.selectByValue("99");
            pricelistboxSelect.selectByVisibleText("INR 50 - INR 99 ( 1 ) ");
             
	}

}
