package assignmentwebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebSite1 {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();    
		driver.get("https://demo.guru99.com/test/newtours/"); 
		
		WebElement username = driver.findElement(By.name("userName"));
		username.sendKeys("tutorial");   
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("tutorial");  
		
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();

	}

}
