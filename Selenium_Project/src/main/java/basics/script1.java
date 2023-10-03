package basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();    
		driver.get("https://selenium.obsqurazone.com/window-popup.php"); 								// url launched
		WebElement element = driver.findElement(By.partialLinkText("Like us On Facebook")); 			// button locate
		element.click();																				// click on button 
		
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		
		Iterator<String> i = child.iterator();
		while(i.hasNext())
		{
			String currentpoint = i.next();
			if(!currentpoint.equals(parent))
			{
				driver.switchTo().window(currentpoint);
				Thread.sleep(5000);
				
				WebElement email = driver.findElement(By.id(":rl:"));	
				email.sendKeys("123@hello.com");
				
				WebElement pass = driver.findElement(By.id(":rn:"));	
				pass.sendKeys("1234567");
				
					
				
				WebElement login=driver.findElement(By.xpath("//span[@class = 'Log in']"));
				login.click();
				
			}
			
			driver.switchTo().window(parent);
		//	driver.quit();
		}
	}

}

/*

https://selenium.obsqurazone.com/window-popup.php
WebElement email=driver.findElement(By.xpath("//input[@name='email' and @type='text']"));

*/