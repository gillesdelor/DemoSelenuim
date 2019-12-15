package WebDriver_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElement1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", 
		        "C:\\Users\\Gilles Z\\Desktop\\Selenium\\selenium-libraries\\geckodriver.exe" );
				
				WebDriver driver = new FirefoxDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://www.facebook.com/");
				
				// Get the title
				
				String title = driver.getTitle();
				
				System.out.println("Title is " +title);
				
				//-----------------
				
				System.out.println(driver.getCurrentUrl());
				
				WebElement unm = driver.findElement(By.id("email"));
				
				System.out.println(unm.getAttribute("id"));
				
		        System.out.println(unm.getTagName());
				
				
				
				
				
				
	}

}