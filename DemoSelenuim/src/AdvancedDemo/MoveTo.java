package AdvancedDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveTo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", 
		        "C:\\Users\\Gilles Z\\Desktop\\Selenium\\selenium-libraries\\geckodriver.exe" );			
				WebDriver driver = new FirefoxDriver();				
				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
				
				Actions act = new Actions (driver);
				
				WebElement unm = driver.findElement(By.xpath("//input[@id='email']"));
				unm.click();
				
				WebElement pwd = driver.findElement(By.xpath("//input[@id='pass']"));
				
				WebElement log = driver.findElement(By.id("loginbutton"));
				
				int x = log.getLocation().getX();
				int y = log.getLocation().getY();
				
				unm.click();
				act.moveToElement(unm).sendKeys("gillesdelor@gmail.com").build().perform();
				
				pwd.click();
				act.moveToElement(pwd).sendKeys("Test").build().perform();
		
				act.moveByOffset(x, y).click().build().perform();
				

	}

}
