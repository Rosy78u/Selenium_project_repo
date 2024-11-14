package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyTheDropDown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://bengaluru.dcourts.gov.in/case-status-search-by-case-number/");
		 WebElement courtradioButton =driver.findElement(By.id("chkYes"));
		 if(courtradioButton.isSelected())
		 {
			 System.out.println("By default selected");
		 }
		 else
		 {
			 System.out.println("By default not selected");
		 }
		 WebElement courtcomplexdropdrowm =driver.findElement(By.id("est_code"));
	    Select  selectoptions =	 new Select(courtcomplexdropdrowm);
	  List<WebElement>  courtcomplexdropdrowm1 =selectoptions.getOptions();
	  System.out.println(courtcomplexdropdrowm1.size());
	  for(WebElement  allDropdowns : courtcomplexdropdrowm1 )
		  
	  {
		String allTexts = allDropdowns.getText();
		System.out.println(allTexts);
				
			
			
	  }
	  

		
	}

}
