package listeners;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListernerImplementation extends BaseClass  implements ITestListener
{

	@Override
	public void onTestSuccess(ITestResult result) {
	
		String methodName = result.getName();
		String time = LocalDateTime.now().toString().replace(":", "_");
		Reporter.log("TestScript is failed", true);
		TakesScreenshot ts =(TakesScreenshot)driver;  //or Baseclass.driver
		File tem = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/"+methodName+time+".png");
		try {
			FileHandler.copy(tem, dest);
		} catch (IOException e) {
			
			e.printStackTrace();
		}

		
	}

	
	}
	



