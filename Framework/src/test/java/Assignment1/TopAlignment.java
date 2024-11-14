package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TopAlignment {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/identify");
		 WebElement emailTextField = driver.findElement(By.xpath("//input[@type='email']"));
		 // int emailStartY=emailTextField .getLocation().getY();
		//  System.out.println("emailStartY = "+emailStartY);
		  
		  
		  
		  
		  
		
	}

}
