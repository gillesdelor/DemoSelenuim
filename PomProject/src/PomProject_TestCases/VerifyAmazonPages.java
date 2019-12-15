/**
 * 
 */
package PomProject_TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import AmazonPages.HomePage;
import AmazonPages.SignInPage;

/**
 * @author Gilles Z
 *
 */
public class VerifyAmazonPages 
{
	
	@Test
	
	public void VerifyValidSignIn(){
		
		// Launch the browser and open the url
		System.setProperty("webdriver.chrome.driver", "C:\\Gilles Z\\Desktop\\Selenium\\SeleniumScripts\\PomProject\\Files\\chromedriver.exe" );	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		
		// Create Sign in object and call this method in Sign in class	with arguemnts	
		SignInPage signin = new SignInPage(driver);
		signin.signinToAmazon("gillesdelor@gmail.com", "Azerty77");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
	
		// Create Home Page object and call this method in Home Page class with arguments
		HomePage page = new HomePage();	
		page.SearchItem("iphone");
		 
		
	}
}

 
//signin.clickOnAccountAndListButton();
//signin.typeUsername("gillesdelor@gmail.com");
//signin.clickOnContinueButton();
//signin.typePassword("Azerty77");
//signin.clickOnSignIn();
