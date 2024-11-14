package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseageOfClick {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/flights/?utm_source=bing&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only%20Goibibo&utm_term=!SEM!DF!B!Brand!RSA!150035352!1211662109442708!!e!goibibo!c!");
		WebElement closelink =driver.findElement(By.xpath("//span[@role='presentation']"));
		closelink.click();
		
		
		WebElement  abc =driver.findElement(By.xpath("//div[text()='Senior Citizen']"));
		abc.click();
		
		
		
	}

}
