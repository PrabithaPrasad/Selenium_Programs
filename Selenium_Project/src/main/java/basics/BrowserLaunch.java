package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch 
{
	public static void main (String[] args)
	{
	WebDriver driver = new ChromeDriver(); 													// launch browser
	driver.get("https://mvnrepository.com/");												// launch url
	}
}