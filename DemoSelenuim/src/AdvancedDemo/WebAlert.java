package AdvancedDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", 
		        "C:\\Users\\Gilles Z\\Desktop\\Selenium\\selenium-libraries\\geckodriver.exe" );			
				WebDriver driver = new FirefoxDriver();				
				driver.get("https://ksrtc.in/oprs-web/");
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']")).click();
				Thread.sleep(2000);
				
				// Get the popup
				String txt = driver.switchTo().alert().getText();
				System.out.println(txt);
				
				// click on the popup
				if (txt.contentEquals("Please select start place."))
				{
					driver.switchTo().alert().accept();
					System.out.println("Correct Alert appeared.....");	
				}
				else
					System.out.println("Invalid Alert....");	
							
	}
	                             
}
            