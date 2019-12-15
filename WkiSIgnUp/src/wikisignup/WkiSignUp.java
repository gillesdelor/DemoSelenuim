 package wikisignup;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WkiSignUp {
	public WebDriver driver;
	public String Url;
	public String engineSearch;
	
	@BeforeTest
	public void setUp() throws Exception{
		System.setProperty("webdriver.gecko.driver", 
		"C:\\Users\\Gilles Z\\Desktop\\Selenium\\SeleniumScripts\\WkiSIgnUp\\Lib\\geckodriver.exe");
		
		//using firefox
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		//assign the variables
		Url = "https://www.wikipedia.org/";
		engineSearch = "Selenium";
	}
	
	@Test
	public void test_SignUp()throws Exception{
		driver.navigate().to(Url);
		driver.findElement(By.xpath("//a[@id='js-link-box-en']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='searchInput'] ")).sendKeys(engineSearch);
		Thread.sleep(2000);
		log(engineSearch);
	}
	
	@AfterTest
	public void closeBrowser()throws Exception{
		driver.close();
	}
	
	//TimeStamp
		public String timeStamp()throws Exception{
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyy  hh:mm:ss");
			Date date = new Date(System.currentTimeMillis());
			String now = simpleDateFormat.format(date);
			return now;
		}
    // Log
	   public void log (String step) throws Exception{
		   Reporter.log(timeStamp()+"    "+step, true);
	   }
}
