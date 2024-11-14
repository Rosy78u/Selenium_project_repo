package hiddendivisionpopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision {
		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.makemytrip.com/");
			 WebElement closebutton = driver.findElement(By.xpath("//span[@class='commonModal__close']"));
			 closebutton.click();
			 WebElement departuredate = driver.findElement(By.xpath("//p[@data-cy='departureDate']"));
			 departuredate.click();
			 String month ="January";
			 int year = 2026;
			 int date = 21;
			 while(true) {
				 try {
					 driver.findElement(By.xpath("//div[text()='"+month+""+year+"']/../..//p[text()='"+date+"']")).click();
					 break;
				 }
				 catch(Exception e) {
					 driver.findElement(By.xpath("//span[aria-label='Next Month']"));
					 
					 
				 }
			 
			 
			 }
		}
	}
			 



