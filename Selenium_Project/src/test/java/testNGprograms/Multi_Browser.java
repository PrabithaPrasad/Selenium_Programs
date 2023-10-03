package testNGprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multi_Browser {
	WebDriver driver;
  @Test
  public void f() {
	  	
	  	WebElement usernamefield = driver.findElement(By.name("userName"));
	  	usernamefield.sendKeys("tutorial");   
		WebElement passwordfield = driver.findElement(By.name("password"));
		passwordfield.sendKeys("tutorial");  
		WebElement submit = driver.findElement(By.name("submit"));		
		submit.click();
}
@Parameters({"browser"})
@BeforeTest
public void beforeTest(String browser) {
	  if(browser.equalsIgnoreCase("chrome"))
	  {
		  driver = new ChromeDriver();
	  }
	  else if (browser.equalsIgnoreCase("edge"))
	  {
		  driver = new EdgeDriver();
	  }
	  else
	  {
		  System.out.println("Please enter correct browser");
	  }
		driver.manage().window().maximize();    
		driver.get("https://demo.guru99.com/test/newtours/"); 
}

@AfterTest
public void afterTest() {
}

}
