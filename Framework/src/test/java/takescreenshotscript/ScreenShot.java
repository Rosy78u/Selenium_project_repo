package takescreenshotscript;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Base64;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		TakesScreenshot ts = (TakesScreenshot) driver;
		//String base64 =ts.getScreenshotAs(OutputType.BASE64);
		// byte[] convertedRef =Base64.getDecoder().decode(base64);
		 //FileOutputStream  fos=  new FileOutputStream(new File("./screenshot/fbwebpage.png"));
		// fos.write(convertedRef);
		 //fos.close();
	byte[]	bytes =ts.getScreenshotAs(OutputType.BYTES);
	 FileOutputStream  fos=  new FileOutputStream(new File("./screenshot/fbwebpage2.png"));
	 fos.write(bytes);
	 fos.close();
	
	
		
		 
	}

}
