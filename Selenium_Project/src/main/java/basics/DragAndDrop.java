package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop 
{

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();    
		driver.get("https://jqueryui.com/droppable/"); 
		
		//driver.switchTo().frame("demo-frame");     // transfer control to frame
		
		WebElement iframe = driver.findElement(By.className("demo-frame"));   //locate frame
		driver.switchTo().frame(iframe);
		
	
		WebElement dragelement1 = driver.findElement(By.id("draggable"));
		WebElement dropelement1 = driver.findElement(By.id("droppable"));
		
		//actions ----> for keyboard and mouse interaction  // Drag and Drop
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(dragelement1, dropelement1).perform();
		
		// perform : to execute the action
		
		driver.switchTo().defaultContent();  // switches to main content 

	}
}
