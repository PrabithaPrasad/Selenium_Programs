package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox 
{

	public static void main(String[] args) 
		{

			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();    
			driver.get("https://selenium.obsqurazone.com/check-box-demo.php"); 
			List<WebElement> checkbox = driver.findElements(By.className("check-box-list"));
			checkbox.get(0).click();	
			checkbox.get(1).click();
			checkbox.get(2).click();
			checkbox.get(3).click();
			
			boolean t = checkbox.get(1).isSelected();       //whether selected
			System.out.println("t");
		}
}