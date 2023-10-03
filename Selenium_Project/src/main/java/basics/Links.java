package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();    
		driver.get("https://selenium.obsqurazone.com/form-submit.php"); 
		
		WebElement formlink1 = driver.findElement(By.linkText("Select Input"));			//1 method
		formlink1.click();
		
		/*WebElement formlink2 = driver.findElement(By.partialLinkText("Select In"));			//2 method
		formlink2.click();*/
		
		
	}

}
