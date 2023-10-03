package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();    
		driver.get("https://selenium.obsqurazone.com/select-input.php"); 
		
		WebElement multicolor = driver.findElement(By.id("single-input-field"));
		Select multiselect = new Select(multicolor);
		boolean f = multiselect.isMultiple();
		System.out.println("Multi colour dropdown"+f);
		
		multiselect.selectByIndex(0);
		multiselect.selectByIndex(1);
		System.out.println("Selected Options are : ");
		List<WebElement> optionlist = multiselect.getAllSelectedOptions();
		
		for (int i=0; i<optionlist.size(); i++)
			
		{
			String s = optionlist.get(i).getText();
			System.out.println(s);
		}
		
			  multiselect.deselectByIndex(1);
			//multiselect.deselectByValue("Yellow");
			//multiselect.deselectAll();
	}

}
