 package WebDriver_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextLocator {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", 
		        "C:\\Users\\Gilles Z\\Desktop\\Selenium\\selenium-libraries\\geckodriver.exe" );
				
				WebDriver driver = new FirefoxDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://www.facebook.com/");
				
		   //WebElement with LinkText
			//	driver.findElement(By.linkText("Data Policy")).click();
				
			//WebElement with partiallinktext
				driver.findElement(By.partialLinkText("Data")).click();
				
				
				//Parent Window
				//driver.close();
				
				//parent and child
				driver.quit();
		       
	}

}
