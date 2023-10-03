package assignmentwebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebSite2 
{

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();    
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement firstname = driver.findElement(By.name("firstName"));
		firstname.sendKeys("Prabitha");   
		
		WebElement lastname = driver.findElement(By.name("lastName"));
		lastname.sendKeys("Prasad");
		
		WebElement phone = driver.findElement(By.name("phone"));
		phone.sendKeys("0001112223");
		
		WebElement username = driver.findElement(By.id("userName"));
		username.sendKeys("apple@fruit.com");
		
		WebElement address = driver.findElement(By.name("address1"));
		address.sendKeys("Home@, Trivandrum, Kerala");
		
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Trivandrum");
		
		WebElement state = driver.findElement(By.name("state"));
		state.sendKeys("Kerala");
		
		WebElement code = driver.findElement(By.name("postalCode"));
		code.sendKeys("345678");
		
		WebElement country = driver.findElement(By.name("country"));
		country.sendKeys("INDIA");
		
		WebElement UserName = driver.findElement(By.id("email"));
		UserName.sendKeys("dream");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("2345Tu.com");
		
		WebElement confirmpassword = driver.findElement(By.name("confirmPassword"));
		confirmpassword.sendKeys("2345Tu.com");
		
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
	
	}
}
