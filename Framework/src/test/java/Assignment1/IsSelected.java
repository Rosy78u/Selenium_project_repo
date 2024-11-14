package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		      WebElement  experienced =driver.findElement(By.xpath("//p[text()='I have work experience(excluding internships)']"));
		      if(experienced.isEnabled())
		      {
		    	  experienced.click();
		      }
		      else
		      {
		    	  System.out.println("Disable");
		      }
		
	}

}
