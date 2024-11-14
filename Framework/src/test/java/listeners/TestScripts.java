package listeners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



public class TestScripts {
	@Test
	public void login()
	{
		Reporter.log("Launch Browser",true);
		Reporter.log("navigate to url", true);
		Reporter.log("Click on login link" , true);
		Reporter.log("Enter valid credentials" , true);
		Reporter.log("click on login button" , true);
		Assert.assertEquals(true, false);
	}

}
