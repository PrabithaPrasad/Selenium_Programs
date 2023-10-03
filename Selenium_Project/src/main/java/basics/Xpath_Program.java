package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Program {

	public static void main(String[] args) 
	{

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();    
		driver.get("https://selenium.obsqurazone.com/form-submit.php");
		WebElement firstname = driver.findElement(By.xpath("//input[@placeholder ='First name']"));
		firstname.sendKeys("Prabitha");   	
		WebElement lastname = driver.findElement(By.xpath("//input[@placeholder ='Last name']"));
		lastname.sendKeys("Prasad");	
		WebElement username = driver.findElement(By.xpath("//input[@placeholder ='Username']"));
		username.sendKeys("prabitha925");	
		WebElement city = driver.findElement(By.xpath("//input[@placeholder ='City']"));
		city.sendKeys("Trivandrum");
		WebElement state = driver.findElement(By.xpath("//input[@placeholder ='State']"));
		state.sendKeys("Kerala");
		WebElement zip = driver.findElement(By.xpath("//input[@placeholder ='Zip']"));	
		
		//WebElement zip = driver.findElement(By.xpath("//input[starts-with(@placeholder, ='zi')]"));  - TBC on starts- with
		
		zip.sendKeys("00087");
		WebElement checkbox = driver.findElement(By.xpath("//input[@id ='invalidCheck']"));
		checkbox.click();
		WebElement submitbutton = driver.findElement(By.className("btn-primary"));
		submitbutton.submit();

	}

}
