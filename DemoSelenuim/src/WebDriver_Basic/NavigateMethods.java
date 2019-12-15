package WebDriver_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateMethods {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", 
		        "C:\\Users\\Gilles Z\\Desktop\\Selenium\\selenium-libraries\\geckodriver.exe" );			
				WebDriver driver = new FirefoxDriver();			
				driver.manage().window().maximize();
		 		
				//driver.get("https://www.facebook.com/");
				
				//navigate to the browser and click on image
				driver.navigate().to("https://www.google.com/");
				driver.findElement(By.linkText("Images")).click();
				Thread.sleep(2000);
				
				//Execute back button
		       driver.navigate().back();  
		       Thread.sleep(2000);
		       System.out.println("Back executed... ");
		       
		     //Execute forward button
		       driver.navigate().forward();
               Thread.sleep(2000);	       
		       System.out.println("Forward executed... ");
		       
		     //Execute refresh button
		       driver.navigate().refresh();
		       Thread.sleep(2000);
		       System.out.println("Refresh done... ");
		       
		       
		       

	}

}
