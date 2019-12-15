 package WebDriver_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Status {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", 
		        "C:\\Users\\Gilles Z\\Desktop\\Selenium\\selenium-libraries\\geckodriver.exe" );			
				WebDriver driver = new FirefoxDriver();				
				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
				
				WebElement img = driver.findElement(By.xpath("//div[@class='_7d _6_ _76']//div[1]//div[1]//img[1]"));
				
				System.out.println(img.isDisplayed());
				
				System.out.println(img.isEnabled());
				
				System.out.println(img.isSelected());

            //===================
				WebElement unm = driver.findElement(By.id("email"));
				unm.sendKeys("Welcome");
				Thread.sleep(2000);
				
				unm.clear();
				Thread.sleep(2000);
				unm.sendKeys("gillesdelor@gmail.com");
				
				
				 
	}

}
