package AdvancedDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", 
		        "C:\\Users\\Gilles Z\\Desktop\\Selenium\\selenium-libraries\\geckodriver.exe" );			
				WebDriver driver = new FirefoxDriver();				
				driver.get("https://www.amazon.com");
				driver.manage().window().maximize();
		
				
				// Using double click 
				Actions act = new Actions(driver);	
				
				WebElement signin = driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]"));
				
				// act.moveToElement(signin).doubleClick().build().perform();
				act.doubleClick(signin).build().perform();			
				

	}

}
