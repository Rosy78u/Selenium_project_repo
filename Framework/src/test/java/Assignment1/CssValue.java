package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class CssValue {
	public static void main(String[] args) {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop-global.malaicha.com/login");
		WebElement Register =driver.findElement(By.xpath("//button[text()='Register']"));
		String	backgroundcolor =Register.getCssValue("background-color");
		System.out.println("background-color = "+ backgroundcolor);
		 String convertedToHexaDecimalValue= Color.fromString(backgroundcolor).asHex();
		 System.out.println("convertedToHexaDecimalValue = " + convertedToHexaDecimalValue);
		 
		 
		 WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		 String outlinecolor  = username.getCssValue("outline-color");
		 System.out.println("outline-color  = "+ outlinecolor);
		 String covertedToHexaDecimalValue = Color.fromString(outlinecolor).asHex();
		 System.out.println("covertedToHexaDecimalValue = "+ covertedToHexaDecimalValue);
		 	 
		 WebElement Register1 =driver.findElement(By.xpath("//button[text()='Register']"));
		 String	backgroundcolor1 =Register1.getCssValue("color");
		 System.out.println("backgroundcolor1 = "+backgroundcolor1 );
		 String covertedToHexaDecimalValue1 = Color.fromString(backgroundcolor1).asHex();
		 System.out.println("covertedToHexaDecimalValue = "+ covertedToHexaDecimalValue1);
		 
		 
		 
	     WebElement Passward = driver.findElement(By.xpath("//input[@name='pin']"));
	    String outlinecolor1 =  Passward.getCssValue("outline-color ");
	    System.out.println("outline-color ="+outlinecolor );
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
	

}
