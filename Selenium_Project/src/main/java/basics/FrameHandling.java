package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();    
		driver.get("https://demoqa.com/frames"); 
		
		//driver.switchTo().frame("frame1"); // control is transfered to frame   : 1st method
		
		WebElement iframefirst = driver.findElement(By.id("frame1"));   //locate frame
		//driver.switchTo().frame(iframefirst);     // : 2nd method
		
		driver.switchTo().frame(0);
		
		WebElement text = driver.findElement(By.id("sampleHeading"));
		String print = text.getText();
		System.out.println(print);	
	}

}






/*
 * if iframe is present in page.we need to switch to frame.There are 3 methods
 * 1.using name or id driver.switchTo().frame(name or id) 2.using webelement
 * WebElement
 * iframefirst=driver.findElement(By.xpath("//iframe[@id='frame1']"));
 * driver.switchTo().frame(iframefirst);
 */
