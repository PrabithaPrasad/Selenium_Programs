package testNGprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Assignment4 {
	
		WebDriver driver;
  @Test
  public void f() {
		List<WebElement> checkbox = driver.findElements(By.name("tripType"));
		checkbox.get(1).click();
		WebElement dropdown1 = driver.findElement(By.name("passCount"));
		Select passenger = new Select(dropdown1);
		passenger.selectByVisibleText("2");	
		WebElement dropdown2 = driver.findElement(By.name("fromPort"));
		Select depart = new Select(dropdown2);
		depart.selectByVisibleText("New York");	
		WebElement dropdown3 = driver.findElement(By.name("fromMonth"));
		Select month = new Select(dropdown3);
		month.selectByVisibleText("July");
		WebElement dropdown4 = driver.findElement(By.name("fromDay"));
		Select day = new Select(dropdown4);
		day.selectByVisibleText("4");
		WebElement dropdown5 = driver.findElement(By.name("toPort"));
		Select arrive = new Select(dropdown5);
		arrive.selectByVisibleText("London");
		
  } 
  @Test
  public void extra() {
	  	List<WebElement> checkbox2 = driver.findElements(By.name("servClass"));
		checkbox2.get(1).click();
		WebElement dropdown6 = driver.findElement(By.name("airline"));
		Select airline = new Select(dropdown6);
		airline.selectByVisibleText("Blue Skies Airlines");
		
		WebElement submitbutton = driver.findElement(By.name("findFlights"));
		submitbutton.submit();
}
  @BeforeTest
  public void beforeTest() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();    
		driver.get("https://demo.guru99.com/test/newtours/reservation.php"); 
  }

  @AfterTest
  public void afterTest() {
  }

}
