package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OneMoreTopAndBottonAlignment {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sandbox.abdm.gov.in/applications/cowin/Home/cowin_signup_form");
		 WebElement uname =driver.findElement(By.xpath("//input[@name='uname']"));
		// int  unameStartY  = uname.getLocation().getY();
		  //System.out.println(" unameStartY = "+ unameStartY);
		  WebElement  degignationTextField =driver.findElement(By.xpath("//input[@name='degignation']"));
		 // int  degignationStartY  = degignationTextField.getLocation().getY();
		//  System.out.println("degignationStartY ="+degignationStartY);
		//  if(unameStartY == degignationStartY)
		//  {
			//  System.out.println("pass");
		 // }
		  //else
		  //{
			// System.out.println("fail");
		//  }
		  
		  int  unameStartPoint  = uname.getRect().getY();
		  System.out.println("unameStartPoint ");
		  int  unameEndPoint  = uname.getRect().getWidth();
		  System.out.println("unameEndPoint");
		  int nameTopAlignment = unameStartPoint + unameEndPoint;
		  System.out.println(" nameTopAlignment  = "+  nameTopAlignment );
		  
		  int  degignationStartPoint   = degignationTextField.getRect().getY();
		  System.out.println("degignationStartPoint ");
		  int  degignationEndPoint   = degignationTextField.getRect().getWidth();
		  System.out.println("degignationEndPoin");
		  int degignationBottonAligment =  degignationStartPoint +degignationEndPoint;
		  System.out.println("degignationBottonAligment = "+ degignationBottonAligment);
		  
		  
		  if (nameTopAlignment == degignationBottonAligment)
		  {
			  System.out.println("pass");
		  }
		  else
		  {
			  System.out.println("fail");
			  driver.manage().window().minimize();
			  driver.quit();
		  }
		  
		  
		  
		 
		 
		  
		  
		  
		
		
		
	}

}
