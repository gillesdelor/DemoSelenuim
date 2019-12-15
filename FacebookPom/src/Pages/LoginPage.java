package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	
	WebDriver driver;
	
	
	// Store the UI webElement of SignIn
	By userEmail = By.id("email");
	By password = By.id("pass");
	By loginButton = By.id("loginbutton"); 
			
		
	//Pazametarized default constructor to initialize the webdriver 
	
	public LoginPage(WebDriver driver)
	{		
		this.driver = driver;
	}
	
	public void InputEmail (String email)
	{
		driver.findElement(userEmail).sendKeys(email);
	}
		
	public void InputPassword (String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void ClickLogin()
	{
		driver.findElement(loginButton).click();
	}
	
	
}
