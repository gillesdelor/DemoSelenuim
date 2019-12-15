package Facebook_TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;

public class VerifyFacebookPages {
	
@Test
	
	public void VerifyValidSignIn()
    {
		
		// Launch the browser and open the url
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gilles Z\\Desktop\\Selenium\\SeleniumScripts\\FacebookPom\\Files\\chromedriver.exe" );
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--disable-notifications");	
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
	

		// Create Sign in object and call this method LoginPage class with arguemnts	
		LoginPage login = new LoginPage(driver);
		login.InputEmail("gillesdelor@yahoo.fr");
		login.InputPassword("azerty77");
		login.ClickLogin();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
        Assert.assertTrue(true, "Login successfully passed");
        

		// Create Sign in object and call this method HomePage class with arguments     		
		HomePage facebookHomePage = new HomePage(driver);
		
		// Step 1: Click on Marketplace button 
		   facebookHomePage.ClickMarketPlace();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
	
	    // Step 2: Click on Vehicule buton
		   facebookHomePage.ClickVehicule();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
  
	   // Step 3: Input the min price in the min text box
		   facebookHomePage.InputMinPrice("2000");
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
           Assert.assertEquals("2000", "2000");
		//Step 4: Input the max price in the max text box
		   facebookHomePage.InputMaxPrice("4000");
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );

		//Step 5 : Input the min year in the min text box
		   facebookHomePage.InputMinYear("2010");
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
 
		// Step 6 : Input the max year in the max text box
		   facebookHomePage.InputMaxYear("2015");
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );

		// Quit the page
		driver.quit();
}

}