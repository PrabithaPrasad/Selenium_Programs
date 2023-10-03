package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 
{

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();    
		driver.get("https://selenium.obsqurazone.com/select-input.php"); 
		
		WebElement dropdown = driver.findElement(By.id("single-input-field"));
		Select colour = new Select(dropdown);
		colour.selectByVisibleText("Red");						// 1 way
		//colour.selectByValue("Yellow");
		//colour.selectByIndex(3);
		
		List<WebElement> option = colour.getOptions();
		
		for (int i=0; i<option.size(); i++)
		{
			String value = option.get(i).getText();
			System.out.println(value);
		}
		
		WebElement selectdoption = colour.getFirstSelectedOption();
		String selectedvalue = selectdoption.getText();
		System.out.println("Selected Value is " +selectedvalue);
		
		
	}

}
