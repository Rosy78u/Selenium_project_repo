package baseClass;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestAssignment extends TestScript {
	@Test
	public void clickonsales()
	{
	driver.findElement(By.linkText("Sales")).click();
	Assert.assertEquals(driver.getTitle(), "SkillRary Ecommerce","sales page is displayed");
	Reporter.log("sales page is displayed", true);
	}
	

}
