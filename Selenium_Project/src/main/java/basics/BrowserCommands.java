package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands 
{

	public static void main(String[] args) 
	{
		// Browser Commands // WebDriver Commands (commands used for webdriver) - 6 Commands are there--perform browser operations
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();       // maximize the window
		driver.get("https://selenium.obsqurazone.com/form-submit.php");   // launch url
		String actualtitle = driver.getTitle(); // to get title of the page
		System.out.println(actualtitle);
		String actualurl = driver.getCurrentUrl();   // to get current url
		System.out.println(actualurl);
		String pagesource = driver.getPageSource();  // to get html code ofthe page
		System.out.println(pagesource);
		//driver.close();     close the current tab
		driver.quit(); 			// close all the windows
		
		// when only one tab - close and quit act as the same
		
		
	}
	

}
