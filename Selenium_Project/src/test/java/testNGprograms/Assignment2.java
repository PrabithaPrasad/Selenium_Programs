package testNGprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Assignment2 {
	WebDriver driver;
	  @Test
	  public void f() 
	  {
		  	WebElement username = driver.findElement(By.name("email"));
			username.sendKeys("admin@admin.com");	
			WebElement password = driver.findElement(By.name("password"));
			password.sendKeys("12345678");
			WebElement login = driver.findElement(By.xpath("//button[contains(text(),\"Sign in\")]"));		
			login.submit();
			
			
	  }	
	  
	  //https://qalegend.com/crm/index.php/signin
	  //admin@admin.com
	 // 12345678
	 // https://demo.guru99.com/test/newtours/register.php
		//  https://demo.guru99.com/test/newtours/reservation.php
	  
	  @BeforeTest
	  public void beforeTest() 
	  {
		  	driver= new ChromeDriver();
			driver.manage().window().maximize();    
			driver.get("https://qalegend.com/crm/index.php/signin"); 
	  }
  @AfterTest
  public void afterTest() 
  {
  }

}
