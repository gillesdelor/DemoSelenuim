package WebDriver_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", 
		        "C:\\Users\\Gilles Z\\Desktop\\Selenium\\selenium-libraries\\geckodriver.exe" );
				
				WebDriver driver = new FirefoxDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://www.facebook.com/");
		
		// WebElement with Id Locator
				
		WebElement Unm = driver.findElement(By.id("email"));		
            Unm.sendKeys("gillesdelor@gmail.com");
            
         // WebElement with name Locator
            driver.findElement(By.name("pass")).sendKeys("Test");
            
         // WebElement with button
            driver.findElement(By.id("loginbutton")).click();
         
         // WebElement of two attributes with the operator AND
            
           driver.findElement(By.xpath("//input[@name='email'][@id='email']"));
            
            
         // WebElement of two attributes with the operator OR
           driver.findElement(By.xpath("//input[@name='email'or @id='email']"));
           
            
         // WebElement with contains
           driver.findElement(By.xpath("//a[contains(text(),'Forgot account?')]"));
         
        // WebElement with the opeartor = 
           driver.findElement(By.xpath("//a[(text()='Forgot account?')]"));
           
        // WebElement with any tagname
           driver.findElement(By.xpath("//*[@name='email'or @id='email']"));
       
        // WebElement with starts-with
           driver.findElement(By.xpath("//a[starts-with(text(),'Forgot ')]"));
           
        // WebElement with CSS Selector
           driver.findElement(By.cssSelector("#email")).sendKeys("Test");
           
        // WebElement with Xpath Axes
           //preceding
           //ancestor
           //parent
           //preceding-sibling
           //Element
           //child
           // descendant
           //following-sibling
           //following
           //syntax example ://input[@id='email']/ancestor::*
        
        
            
           
        
  
           
         
           
            
            
          
            
          
            
	}

}
