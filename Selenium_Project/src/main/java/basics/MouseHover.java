package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) 
	{
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();    
			driver.get("https://demoqa.com/menu/#"); 
			
			Actions actions = new Actions(driver);
			
			WebElement main_item = driver.findElement(By.linkText("Main Item 2"));
			actions.moveToElement(main_item).perform();
			
			WebElement sub_item = driver.findElement(By.linkText("SUB SUB LIST"));
			actions.moveToElement(sub_item).perform();
			
			WebElement subitem_option = driver.findElement(By.linkText("Sub Sub Item 2"));
			actions.moveToElement(subitem_option).perform();
			
			
			
			
			

	}

}
