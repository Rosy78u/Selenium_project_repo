package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheTagName {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
     	 WebElement emailTextField =driver.findElement(By.id("email"));
     	String	emailTextFieldTagName = emailTextField.getTagName();
     	System.out.println("emailTextFieldTagName = "+ emailTextFieldTagName);
     	WebElement forgottenPasswardLink= driver.findElement(By.xpath("//a[contains(@href,'https://www.facebook.com/recover/initiate/?')]"));
     	String forgottenPasswardLinkText= forgottenPasswardLink.getText(); 
     	System.out.println("forgottenPasswardLinkText = "+ forgottenPasswardLinkText);
     	String forgottenPasswardLinkTagName = forgottenPasswardLink.getTagName();
     	System.out.println("forgottenPasswardLinkTagName()= "+ forgottenPasswardLinkTagName);
	
		
	}

	
	}


