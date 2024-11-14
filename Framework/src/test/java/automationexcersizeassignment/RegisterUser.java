package automationexcersizeassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterUser {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://automationexercise.com/");
		if(driver.getCurrentUrl().equals("https://automationexercise.com/"))
		{
			System.out.println("homepage verified successfully");
			
		}
		else
		{
			System.out.println("home page not verified properly");
		}
		driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
		 String NewUserSignupText = driver.findElement(By.xpath("//h2[text()='New User Signup!']")).getText();
		 if(NewUserSignupText.equals("New User Signup!"))
		 {
			 System.out.println("visible successfully");
		 }
		 else
		 {
			 System.out.println("not visible successfully");
		 }
		 driver.findElement(By.name("name")).sendKeys("Jasmin");
		 driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("jasminsahoo226@gmail.com");
		 driver.findElement(By.xpath("//button[text()='Signup']")).click();
	}

}
