package WebDriver_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", 
		        "C:\\Users\\Gilles Z\\Desktop\\Selenium\\selenium-libraries\\geckodriver.exe" );			
				WebDriver driver = new FirefoxDriver();				
				driver.get("https://www.amazon.com");
				driver.manage().window().maximize();
				
				// Input in the text box search and click ont it 
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
				
				driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//li[@id='p_89/Apple']//i[@class='a-icon a-icon-checkbox']")).click();
				

	}

}
