package testng;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript  extends BaseClass {
	@Test
	public void clickOnBooks()
	{
		driver.findElement(By.partialLinkText("Books")).click();
		if(driver.getTitle().equals("Demo Web Shop. Books"))
		{
			Reporter.log("book page is displayed" ,true);
		}
		else
		{
			Reporter.log("book page is  not displayed" ,true);
		}
	}

}