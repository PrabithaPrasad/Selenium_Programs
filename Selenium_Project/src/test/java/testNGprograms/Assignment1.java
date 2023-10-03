package testNGprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Assignment1 
{
		WebDriver driver;
  @Test
  public void f() 
  {
	  	WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("admin");	
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("123123");
		WebElement checkbox = driver.findElement(By.name("remember"));
		checkbox.click();		
		WebElement login = driver.findElement(By.className("btn-primary"));
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
		driver.get("https://qalegend.com/billing/public/home"); 
  }
  @AfterTest
  public void afterTest() 
  {
	  driver.close();
  }

}

