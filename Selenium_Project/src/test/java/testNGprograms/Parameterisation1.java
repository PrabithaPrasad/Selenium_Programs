package testNGprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterisation1 {
	WebDriver driver;
	@Parameters({"username", "password"})
  @Test
  public void f(String username, String password ) {
	  	WebElement usernamefield = driver.findElement(By.name("userName"));
	  	usernamefield.sendKeys("user101");   
		WebElement passwordfield = driver.findElement(By.name("password"));
		passwordfield.sendKeys("tutorial");  
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
}
  @BeforeTest
  public void beforeTest() 
  {
	  	driver= new ChromeDriver();
		driver.manage().window().maximize();    
		driver.get("https://demo.guru99.com/test/newtours/"); 
  }

  @AfterTest
  public void afterTest() 
  {
	  
  }

  }
