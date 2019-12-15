/**
 * 
 */
package AmazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Gilles Z
 * 
 * 
 * This class store all the locators and methods of sign in page	
 *
 */
public class SignInPage 
{
	
	WebDriver driver;
	
	// Store the UI webElement of SignIn
	By accountAndListButton = By.xpath("//span[contains(@class,'nav-line-2')][contains(text(),'Account & Lists')]");
	By username = By.id("ap_email");
	By continueButton = By.id("continue");
	By password = By.id("ap_password");  
	By signInButton = By.id("signInSubmit");
	
	//Pazametarized default constructor to initialize the webdriver 
	
	public SignInPage(WebDriver driver)
	{		
		this.driver = driver;
	}
	// Create the methods to calling UI Webelement UI
	
	public void clickOnAccountAndListButton()
	{
	    driver.findElement(accountAndListButton).click();
	}
	
	public void typeUsername(String uid)
	{
	    driver.findElement(username).sendKeys(uid);	
	}
	
	public void clickOnContinueButton()
	{
		driver.findElement(continueButton).click();
	}
	
	public void typePassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickOnSignIn()
	{
		driver.findElement(signInButton).click();
	}
  
   // create another sign in to amazon method 
	
	public void signinToAmazon(String userId , String pass)
	{
	    driver.findElement(accountAndListButton).click();
	    driver.findElement(username).sendKeys(userId);	
		driver.findElement(continueButton).click();
		driver.findElement(password).sendKeys(pass);
		driver.findElement(signInButton).click();


	}
	
}
