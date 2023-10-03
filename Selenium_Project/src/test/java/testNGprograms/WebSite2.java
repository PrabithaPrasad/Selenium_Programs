package testNGprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class WebSite2 
{
		WebDriver driver;
  @Test
  public void f() {
		WebElement firstname = driver.findElement(By.id("validationCustom01"));
		firstname.sendKeys("Prabitha");   	
		WebElement lastname = driver.findElement(By.id("validationCustom02"));
		lastname.sendKeys("Prasad");	
		WebElement username = driver.findElement(By.id("validationCustomUsername"));
		username.sendKeys("prabitha925");	
		WebElement city = driver.findElement(By.id("validationCustom03"));
		city.sendKeys("Trivandrum");
		WebElement state = driver.findElement(By.id("validationCustom04"));
		state.sendKeys("Kerala");
		WebElement zip = driver.findElement(By.id("validationCustom05"));
		zip.sendKeys("00087");
		WebElement checkbox = driver.findElement(By.className("form-check-input"));
		checkbox.click();
  }
  @BeforeTest
  public void beforeTest() 
  {
	  	driver= new ChromeDriver();
		driver.manage().window().maximize();    
		driver.get("https://selenium.obsqurazone.com/form-submit.php"); 
  }
  @AfterTest
  public void afterTest() 
  {
	  driver.close();
  }
}
