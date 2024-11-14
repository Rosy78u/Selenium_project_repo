package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrelloAppAssignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://trello.com/");
		Thread.sleep(2000);
		 WebElement loginLink=driver.findElement(By.xpath("//div[contains(@class,'Buttonsstyles__ButtonGroup')]/a[text()='Log in']"));
				 loginLink.click();
				 Thread.sleep(2000);
		 WebElement usernameTextField =driver.findElement(By.id("username"));
				  usernameTextField.sendKeys("sahoojasmin69@gmail.com");
				  Thread.sleep(2000);
	     WebElement continueToLoginButton =  driver.findElement(By.id("login-submit"));
				   continueToLoginButton.submit();
				  Thread.sleep(2000);
		 WebElement  passwordTextField=driver.findElement(By.id("password"));
		 
		 passwordTextField.sendKeys("Trello@1234");
		 Thread.sleep(2000);
		 WebElement loginButton =driver.findElement(By.xpath("//span[text()='Log in']"));
		 loginButton.click();
		 Thread.sleep(2000);
		 
           WebElement   createnewBoardopt =driver.findElement(By.xpath("//span[text()='Create new board']"))	;	   
           
           createnewBoardopt.click();
           Thread.sleep(2000);
        WebElement  boardTitle =driver.findElement(By.xpath("//input[@type='text']"));
        boardTitle.sendKeys("M11");
        Thread.sleep(2000);
        WebElement Create =driver.findElement(By.xpath("//button[text()='Create']"));
        Create .click();
        Thread.sleep(2000);
        WebElement showmenuopt =driver.findElement(By.xpath("//button[@aria-label='Show menu']"));
        
        showmenuopt.click();
        Thread.sleep(2000);        
      
				  
		
	}

}
