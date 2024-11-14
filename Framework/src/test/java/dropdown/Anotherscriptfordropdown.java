package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Anotherscriptfordropdown {
	public static void main(String[] args) {
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://services.ecourts.gov.in/ecourtindia_v6/?p=casestatus/index&app_token=7bb64caea10bd2f6449d20d6f4fd941ebe56f43d06718475cc9b17dc59e054cd");
	
		
		WebElement	statedropdown =driver.findElement(By.id("sess_state_code"));
		Select stateSelect =new Select(statedropdown);
		stateSelect.selectByVisibleText("Odisha");
	 
	 
	 
	 							WebElement 	 distdropdown =driver.findElement(By.id("sess_dist_code"));
                               Select distSelect =  new Select(distdropdown);
                               distSelect.selectByValue("5");
                               
                              WebElement courtcomplexdropdown =driver.findElement(By.id("court_complex_code"));
                             Select courtcomplexSelect = new Select(courtcomplexdropdown);
                             courtcomplexSelect.selectByValue("1110029@6,7@N");
                               
                               
                               
                               
                             
                      
                     
                               
                               
                               
                               
                               
		
	}

}
