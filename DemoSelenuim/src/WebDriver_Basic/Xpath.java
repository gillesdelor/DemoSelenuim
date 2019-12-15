package WebDriver_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", 
		        "C:\\Users\\Gilles Z\\Desktop\\Selenium\\selenium-libraries\\geckodriver.exe" );
				
				WebDriver driver = new FirefoxDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://www.facebook.com/");
				
				//Webelemnet with xpath
				
				// absolute -------using attributes locator ------------- input[@id="email"]
				
				// relative --------- based on position using chropath -----------------------
				///html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/input[1]
				
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Welcome");

	}

}
