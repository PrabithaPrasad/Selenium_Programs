package testNGprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Website1 
{
	WebDriver driver; // should be declared as global variable
  @Test
  public void f() 					// all scenarios that needs to be verified will be given h
  {
		WebElement username = driver.findElement(By.name("userName"));
		username.sendKeys("tutorial");   
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("tutorial");  
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
	  driver.close();
  }
}



/*
before suit
before test
before class
before method
@test
after method
after class
after test
after suit 
*/
