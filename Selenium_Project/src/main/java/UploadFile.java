import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile 
{

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();    
		driver.get("https://demo.guru99.com/test/upload/");
		
		WebElement upload = driver.findElement(By.id("uploadfile_0"));
		upload.sendKeys("C:\\Users\\user\\Desktop\\SELENIUM\\testfile.txt");
		
		List<WebElement> checkbox = driver.findElements(By.id("terms"));
		checkbox.get(0).click();
		
		WebElement submit = driver.findElement(By.id("submitbutton"));
		submit.click();
		
		

	}

}
