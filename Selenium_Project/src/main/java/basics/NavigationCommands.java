package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands 
{

	public static void main(String[] args) 
	{
		//NavigationCommands
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();       // maximize the window
		driver.navigate().to("https://selenium.obsqurazone.com/form-submit.php");
		driver.navigate().to("https://www.selenium.dev/");    // store browser history
		driver.navigate().back();   			// used to go back
		driver.navigate().forward();			// used to go forward
		driver.navigate().refresh();			// used to go forward
			
	}

}
