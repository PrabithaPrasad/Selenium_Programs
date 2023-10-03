package basics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButton 
{
	

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();    
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php"); 
		List<WebElement> gender = driver.findElements(By.name("student-gender"));
		gender.get(0).click();
		
		boolean f = gender.get(1).isSelected();       //whether selected
		System.out.println("f");
			
	}

}
