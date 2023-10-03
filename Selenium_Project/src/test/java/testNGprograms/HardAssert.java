package testNGprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class HardAssert {
	WebDriver driver;
  @Test
  public void f() {
	  	WebElement firstname = driver.findElement(By.id("validationCustom01"));
		firstname.sendKeys("Prabitha");   
		
		boolean c = firstname.isDisplayed();		// here boolean is used verify whether the field is present in the concerned form
		Assert.assertTrue(c);
		WebElement lastname = driver.findElement(By.id("validationCustom02"));
		lastname.sendKeys("Prasad");	
		boolean d = lastname.isEnabled();
		Assert.assertTrue(d);
		
		WebElement username = driver.findElement(By.id("validationCustomUsername"));
		username.sendKeys("prabitha925");	
		boolean e = username.isEnabled();
		Assert.assertTrue(e);
		WebElement city = driver.findElement(By.id("validationCustom03"));
		city.sendKeys("Trivandrum");
		boolean g = city.isEnabled();
		Assert.assertTrue(g);
		WebElement state = driver.findElement(By.id("validationCustom04"));
		state.sendKeys("Kerala");
		boolean h = state.isDisplayed();
		Assert.assertTrue(h);
		WebElement zip = driver.findElement(By.id("validationCustom05"));
		zip.sendKeys("00087");
		boolean i = zip.isDisplayed();
		Assert.assertTrue(i);
		WebElement checkbox = driver.findElement(By.className("form-check-input"));
		checkbox.click();
		
		WebElement submit = driver.findElement(By.className("btn-primary"));
		submit.click();
		
		WebElement text = driver.findElement(By.id("message-one"));
		
		String actualvalue = text.getText();
		String expectedvalue = "Form has been submitted successfully!";
		
		Assert.assertEquals(actualvalue,expectedvalue);
  }
  @BeforeTest
	  public void beforeTest() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();    
		driver.get("https://selenium.obsqurazone.com/form-submit.php"); 
  }

  @AfterTest
  public void afterTest() {
  }

}
