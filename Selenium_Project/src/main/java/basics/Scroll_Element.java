package basics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Element 
{

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();    		
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;									
		WebElement button = driver.findElement(By.id("button-two"));						
        js.executeScript("arguments[0].scrollIntoView()",button);	
        
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);				// takes screenshots
        File destFile = new File ("C:\\Users\\user\\Desktop\\SELENIUM\\Screenshots\\SS2.png");		//specify the destination 
        FileUtils.copyFile(srcFile, destFile); 													//copy scrfile to destination
	}

}
