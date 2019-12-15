package AdvancedDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutor {


	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver", 
		        "C:\\Users\\Gilles Z\\Desktop\\Selenium\\selenium-libraries\\geckodriver.exe" );			
				WebDriver driver = new FirefoxDriver();				
				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();	
                Thread.sleep(2000);
         
         // Input data in the email text box using JavaScriptExecutor       
        JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("document.getElementById('email').value='gillesdelor@gmail.com';");
		js.executeScript("document.getElementById('u_0_9').checked=false;");			
		
		// Flashing login button
		
	     WebElement Login = driver.findElement(By.id("u_0_4"));
	     
	
	}
}
