package Assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentInScreenshot {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		String arr[]= {"//img[@alt='Grocery']","//img[@alt='Mobiles']","//img[@alt='Fashion']"};
		for(int i =0;i<=arr.length;i++)
		{
		WebElement 	ts = driver.findElement(By.xpath(arr[i]));
		
		ts.click();
		
		
		
		}
	}

}
