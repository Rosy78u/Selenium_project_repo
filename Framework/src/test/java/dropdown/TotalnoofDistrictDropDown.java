package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TotalnoofDistrictDropDown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://services.ecourts.gov.in/ecourtindia_v6/?p=casestatus/index&app_token=7bb64caea10bd2f6449d20d6f4fd941ebe56f43d06718475cc9b17dc59e054cd");
		WebElement statedropdown = driver.findElement(By.id("sess_state_code"));
		 Select stateSelect =new Select(statedropdown);
	
		List<WebElement>  stateOptions =stateSelect.getOptions();
		System.out.println("state count : "+ stateOptions.size());
		
		
		for(WebElement state  :  stateOptions)
		{
			System.out.println("state is : " + state.getText());  
		
		}
	}

}
