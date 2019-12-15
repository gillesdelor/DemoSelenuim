package AdvancedDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Keys {

	public static void main(String[] args) {
		      
		System.setProperty("webdriver.gecko.driver", 
		        "C:\\Users\\Gilles Z\\Desktop\\Selenium\\selenium-libraries\\geckodriver.exe" );			
				WebDriver driver = new FirefoxDriver();				
				driver.get("http://www.newtours.demoaut.com/");
				driver.manage().window().maximize();
				
			// Using the key			
				Actions act = new Actions (driver);
				driver.findElement(By.name("userName")).sendKeys("gzannou");
				 
				 // Select data from user name text box and copy it
                 act.click(driver.findElement(By.name("userName")))
                 .keyDown(org.openqa.selenium.Keys.CONTROL)
                 .sendKeys("a")
                 .sendKeys("c")
                 .keyUp(org.openqa.selenium.Keys.CONTROL)
                 
                 //Click the password text box and paste
                 .click( driver.findElement(By.name("password")))
                 .keyDown(org.openqa.selenium.Keys.CONTROL)
                 .sendKeys("v")
                 .keyUp(org.openqa.selenium.Keys.CONTROL)
                 
                 // Built and perform them
                 .build().perform();
                 
                 
                 
                

	}
	}


