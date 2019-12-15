package WebDriver_Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", 
		        "C:\\Users\\Gilles Z\\Desktop\\Selenium\\selenium-libraries\\geckodriver.exe" );			
				WebDriver driver = new FirefoxDriver();				
				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
				
				// Get the number of the gender
				
			List < WebElement> gender = driver.findElements(By.name("sex"));
			int cnt = gender.size();
			
			System.out.println(cnt);
			
			// Get a particular gender
						
			for (int i=0 ; i <cnt ;i++)
			{
				String txt = gender.get(i).getText();
				System.out.println(txt);
				
				gender.get(i).click();
				Thread.sleep(1000);
						
			}
			
	}

}
