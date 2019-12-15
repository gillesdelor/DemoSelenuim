package AdvancedDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", 
		        "C:\\Users\\Gilles Z\\Desktop\\Selenium\\selenium-libraries\\geckodriver.exe" );			
				WebDriver driver = new FirefoxDriver();				
				driver.get("https://jqueryui.com/droppable/");
				driver.manage().window().maximize();
				
				// Drag and Drop
				Actions act = new Actions (driver);
				
				driver.findElement(By.tagName("iframe"));	
				driver.switchTo().frame(0);
				Thread.sleep(2000);
				
				WebElement drag = driver.findElement(By.id("draggable"));
				WebElement drop = driver.findElement(By.id("droppable"));
				
				act.dragAndDrop(drag, drop).perform(); 
				
				//Drop validation	
				if(drop.getText().matches("Dropped!"))
				{
					System.out.println("Successfully dropped!!");
					
				}

	}

}
