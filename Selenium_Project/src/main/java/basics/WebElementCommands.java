package basics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class WebElementCommands 
{

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();    
		driver.get("https://selenium.obsqurazone.com/form-submit.php"); 
		WebElement firstname = driver.findElement(By.id("validationCustom01"));
		firstname.sendKeys("Prabitha");   	
		WebElement lastname = driver.findElement(By.id("validationCustom02"));
		lastname.sendKeys("Prasad");
		
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		
		fluentWait.until(ExpectedConditions.visibilityOf(lastname));
		
		
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
	
		
		boolean firstnameDisplayed = firstname.isDisplayed();      // visible or not
		System.out.println("First Name is displayed: " +firstnameDisplayed);
		
		boolean firstnameEnabled = firstname.isEnabled(); // user interactable or not
		System.out.println("First Name enabled? " +firstnameEnabled);
		
		String tagname = firstname.getTagName();	//get the tag name
		System.out.println("tagname of firstname is: " +tagname);
		
		String attribute = firstname.getAttribute("placeholder");  // get the attribute value
		System.out.println("attribute value of placeholder is: " +attribute);
		
		Dimension d = firstname.getSize(); // get size in pixel
		System.out.println("height = " +d.height + "width = " +d.width);
		
		Point p = firstname.getLocation();	// get the x and y axis location 
		System.out.println("x axis = " +p.x + "y axis = " +p.y);
		
		String css = firstname.getCssValue("font-weight");
		System.out.println("Font size is " +css);			//get the css property
		
		//WebElement submit = driver.findElement(By.className("btn-primary"));
		//submit.click();
		
		WebElement submitbutton = driver.findElement(By.className("btn-primary"));    // for classname always take value coming after space i.e. btn btn -primary - here take only btn-primary
		submitbutton.submit();		// element is inside form, and type submit then we can use submit method
		
		//benefit-- it will wait until new page is loaded
		
		String innertext = submitbutton.getText();
		System.out.println("inner text is " +innertext);
		 
	}

}
