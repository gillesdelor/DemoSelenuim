package WebDriver_Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", 
		        "C:\\Users\\Gilles Z\\Desktop\\Selenium\\selenium-libraries\\geckodriver.exe" );			
				WebDriver driver = new FirefoxDriver();				
				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
				
				WebElement day = driver.findElement(By.id("day"));
				
				Select d1 = new Select(day);
				
				  d1.selectByIndex(3);
				//d1.selectByValue("2"); 
				 //d1.selectByVisibleText("Day")
				  System.out.println(day.getAttribute("value"));
 
				 // Find the total number of the day ==== Method 1
						  
			      List<WebElement> dd = d1.getOptions();
			      System.out.println(dd.size());
			            
			      for (int i=0 ; i < dd.size() ; i++ )    
			      {
					String txt = dd.get(i).getText();
					System.out.println( txt);
					
					dd.get(i).click();			 		    	
			    	  
			      }
			      // Find the total number of the day ==== Method 2
				  
			      List<WebElement> td = driver.findElements(By.tagName("birthday_day"));
			      System.out.println(td.size());
			      
	}

}
