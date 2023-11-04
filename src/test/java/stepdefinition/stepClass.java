package stepdefinition;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;



public class stepClass {
WebDriver driver;


	@Given("^open demoblaze application$")
	public void open_demoblaze_application() throws Throwable {
	 System.setProperty("Webdriver.chrome.driver", "C:\\chrome driver\\chrome-win64\\chrome.exe");
	 ChromeOptions run = new ChromeOptions();
	 run.addArguments("--remote-allow-origins=*");
	 
	 driver = new ChromeDriver();
	 
	 driver.get("https://www.demoblaze.com/index.html");
	 
	 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
	 driver.manage().window().maximize();
	 
	 
	}

	@Then("^click login$")
	public void click_login() throws Throwable {
	
		WebElement login = driver.findElement(By.id("login2"));
		
		login.click();
		
		
	}

	@Then("^Enter username$")
	public void enter_username() throws Throwable {
	  WebElement username = driver.findElement(By.id("loginusername"));
	  username.sendKeys("nasrin");
		
		
	}

	@Then("^Enter password$")
	public void enter_password() throws Throwable {
	   
		WebElement password = driver.findElement(By.id("loginpassword"));
		password.sendKeys("42345");
		
	}
	@Then("^click on login$")
	public void click_on_login() throws Throwable {
		WebElement verify = driver.findElement(By.xpath("//button[text()='Log in']"));
		verify.click();
		
		Thread.sleep(3000);
		   
	}
	@Then("^Verify user can login$")
	public void verify_user_can_login() throws Throwable {
	  
   boolean tom = driver.findElement(By.id("nameofuser")).isDisplayed();
	Assert.assertTrue(tom);
	
	Thread.sleep(3000);
	driver.close();
	
	}	
	@Then("^click cart link$")
	public void click_cart_link() throws Throwable {
	    
		WebElement cart = driver.findElement(By.id("cartur"));
		cart.click();
		
		Thread.sleep(2000);
		
		
		
	}
	@Then("^verify user in cart page$")
	public void verify_user_in_cart_page() throws Throwable {
	boolean y  =  driver.findElement(By.xpath("//button[text()='Place Order']")).isDisplayed();
	
	Assert.assertTrue(y);
	Thread.sleep(2000);
	driver.close();
	}

	@Then("^click Sony xperia z(\\d+)$")
	public void click_Sony_xperia_z(int arg1) throws Throwable {
	  ((JavascriptExecutor)driver).executeScript("scroll(0,500)"); //scroll down
	  Thread.sleep(5000);
	  
	WebElement  h	= driver.findElement(By.xpath("//a[text()='Sony xperia z5']"));
	h.click();
		
	Thread.sleep(5000);
	driver.close();
		
	}
	}

	
	
	
	
	
	

