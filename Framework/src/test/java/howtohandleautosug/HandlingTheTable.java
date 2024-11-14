package howtohandleautosug;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTheTable {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://money.rediff.com/gainers");
		List<WebElement>  toalnumberofrows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println(toalnumberofrows.size());
		
		
		int numberofcolumns = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th")).size();
		System.out.println( numberofcolumns);
		     
		
		
		List<WebElement> firstcolumnData = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		//for(WebElementfirstcolumnData)
		
		
	
		
		
		
	}

}
