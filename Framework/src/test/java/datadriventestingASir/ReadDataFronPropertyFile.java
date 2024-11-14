package datadriventestingASir;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFronPropertyFile {
	
	public static void main(String[] args) throws IOException {
		
		//step 1: create FileInputStream object
		FileInputStream fis = new FileInputStream("./testdata/commondata.properties");
		
		//step  2: create 5 respective file type object
		Properties prop  = new Properties();
		
		//step 3:  call read methods
		prop.load(fis);
		 String url =  prop.getProperty("url");
		 String username =  prop.getProperty("username");
		 String password =  prop.getProperty("password");
		 
		 
		 System.out.println(url);
		 System.out.println(username);
		 System.out.println(password);
		 
		 
		 WebDriver driver  = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 driver.get(url);
		 driver.findElement(By.linkText("LOGIN")).click();
		 driver.findElement(By.id("email")).sendKeys(username);
		 driver.findElement(By.id("password")).sendKeys(password);
		 
		 
	}

}