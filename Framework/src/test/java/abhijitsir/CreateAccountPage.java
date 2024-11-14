package abhijitsir;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage {
	public static void main(String[] args) throws FileNotFoundException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		WebElement countrydropdown = driver.findElement(By.xpath("//select[@id='sView1:r1:0:country::content']"));
		Select	countrySelect =new  Select(countrydropdown);
		
		countrySelect.selectByVisibleText("Zambia");
		
		byte[]	bytes =countrydropdown.getScreenshotAs(OutputType.BYTES);
		
		//  FileOutputStreamcountrydropdow = new FileOutputStream(new File("./screenshot/contrySelect.png"));
		 // countrydropdown.write(bytes);
		
		
		
		
		
	}

}
