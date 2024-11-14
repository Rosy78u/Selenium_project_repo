package datadriventestingASir;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadTheDataFromPropertyFileRegister {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./testdata/registerdetails.properties");
		Properties pro = new Properties();
		pro.load(fis);
		String url =  pro.getProperty("url");
		String firstname =  pro.getProperty("firstname");
		String lastname =  pro.getProperty("lastname");
		String email =  pro.getProperty("email");
		String password =  pro.getProperty("password");
		String confirmpassword =  pro.getProperty("confirmpassword");
		
		
		
		System.out.println(url);
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(email);
		System.out.println(password);
		System.out.println(confirmpassword);
		
		
		 WebDriver driver  = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		driver.get(url);
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.name("FirstName")).sendKeys(firstname);
		driver.findElement(By.id("LastName")).sendKeys(lastname);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmpassword);
		driver.findElement(By.id("register-button")).click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[]	bytes =ts.getScreenshotAs(OutputType.BYTES);
		FileOutputStream  fos=  new FileOutputStream(new File("./screenshot3/register.png"));
		 fos.write(bytes);
		 fos.close();
		
		
		
		
		
		

		
		
	}

}
