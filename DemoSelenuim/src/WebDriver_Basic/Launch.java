package WebDriver_Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", 
        "C:\\Users\\Gilles Z\\Desktop\\Selenium\\selenium-libraries\\geckodriver.exe" );
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
	}

}
 