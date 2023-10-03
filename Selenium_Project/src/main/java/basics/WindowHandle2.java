package basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();    
		driver.get("https://demo.guru99.com/popup.php"); 												// url launched
		WebElement element = driver.findElement(By.partialLinkText("Click Here")); 			// button locate
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
				
				WebElement email = driver.findElement(By.name("emailid"));	
				email.sendKeys("123@helloworld.com");
			}
			
			driver.switchTo().window(parent);
	}}}

