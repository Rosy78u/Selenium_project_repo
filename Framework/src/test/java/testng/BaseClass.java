package testng;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {
	public WebDriver driver;
	public Properties prop;
	public Workbook workbook;
	@BeforeTest
	public void objectCreation() throws IOException
	{
		//property file
		  FileInputStream pfis = new FileInputStream("./testdata/commondata.properties");
		  prop = new Properties();
		  prop.load(pfis);
		  
		  
		  FileInputStream efis = new FileInputStream("./testdata/TestscriptData.xlsx");
			 workbook = WorkbookFactory.create(efis);	  
		  
	}
	

		

	@Parameters("Browser")
	@BeforeClass
	public void launchBrowser(@Optional("chrome")String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		
		else if(browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
	
		
		
		
		
		
		
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String url = prop.getProperty("url");
		driver.get(url);
		
	}
	@BeforeMethod
	public void login()
	{
		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("abhis1234@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abhis@1234");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.linkText("Log out")).click();
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}

}
