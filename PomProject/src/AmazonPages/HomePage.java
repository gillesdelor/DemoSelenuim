package AmazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
   // declare variables and Store the UI webElement of Homepage
	By searchtextBox = By.id("text");
	By primeButton = By.xpath("//li[@id='p_85/2470955011']//i[@class='a-icon a-icon-checkbox']");
	By deliveryDayButton = By.xpath("//li[@id='p_90/8308921011']//i[@class='a-icon a-icon-checkbox']");
	By item = By.id("//span[contains(text(),'Apple iPhone 6S, GSM Unlocked, 64GB - Silver (Rene')]");
	By addToCartButton = By.id("add-to-cart-button");
	By addToOrderButton = By.className("a-button-text");
	By cartButton = By.xpath("//a[@id='hlb-view-cart-announce']");
	By deleteButton = By.xpath("//input[@name='submit.delete.C15de13ea-8656-4cbf-a7f9-3a6f4b69c251']");
	
	//Pazametarized default constructor to initialize the webdriver 
	
		public void AddToCart (WebDriver driver)
		{		
			this.driver = driver;
		}
	
		// create Search item object
		
       public void SearchItem (String text)
       {
    	   
    	 // Step 1 :
    	  driver.findElement(searchtextBox).sendKeys(text);
    	  
    	  //Step 2 :
    	  driver.findElement(primeButton).click();
    	  
    	 // Step 3:
    	  driver.findElement(deliveryDayButton).click();
    	  
    	// Step 4:
    	  driver.findElement(item).click();
    	  
    	// Step 5:
    	  driver.findElement(addToCartButton).click();
    	  
    	// Step 6:
    	  driver.findElement(addToOrderButton).click();
    	  
    	// Step 7:
    	  driver.findElement(cartButton).click();
    	  
    	// Step 8:
    	  driver.findElement(deleteButton).click();
       }
       
}
