package facebooksignup;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookSignUp {

	//declare variables
		 public WebDriver driver;
		 public String Url;
		 public String firstname;
		 public String lastname;
		 public String email;
		 public String password;
		 public String birthMonth;
		 public String birthDay ;
		 public String birthYear;
		 
 @BeforeTest
 public void setUp()throws Exception {
	 //initialize the variables
	 //System.setProperty("webdriver.chrome.driver",
	 //"C:\\Users\\Gilles Z\\Desktop\\Selenium\\SeleniumScripts\\FacebookSignUp\\lib\\chromedriver.exe");
	 
	 //using the Firefox
	 System.setProperty("webdriver.gecko.driver",
	 "C:\\Users\\Gilles Z\\Desktop\\Selenium\\SeleniumScripts\\FacebookSignUp\\lib\\geckodriver.exe");
	 
	 driver = new FirefoxDriver();
	 driver.manage().window().maximize();
	 //maximize the browser
	 //ChromeOptions options = new ChromeOptions();
	 //options.addArguments("--start-maximized");
	 
	 //start the chrome browser
	 //driver = new ChromeDriver(options);
	  
	 //assign the  Url
	 Url = "https://www.facebook.com";	
	 firstname = "Tonya";
	 lastname = "Strong";
	 email = "tonyastrong@gmail.com";
	 password = "@@@@@1245";
	 birthMonth = "jun";
	 birthDay = "25";
	 birthYear = "1965";
	 
 }
 
 @Test 
 public void test01_signUp() throws Exception {
	//Step 1: navigate to the browser
	 driver.navigate().to(Url);
	 Thread.sleep(3000);
	 log (Url);
	//Step 2: find out the first name text box and enter first name 
	  driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstname);
	 Thread.sleep(2000);
	 log(firstname);
	 //Step 3: find out the last name text box and enter last name
	  driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastname);
	 Thread.sleep(2000);
	 log(lastname);
	 //Step 4: find out the email or mobile number and enter it
	   driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(email);
	 Thread.sleep(2000);
	 log(email);
	 //Step 5: find out the email again and enter it
	    driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys(email);
		Thread.sleep(2000);
	 //Step 6: find out the password text box and enter the password
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(password);
		Thread.sleep(2000);
	 //Step 7: find out the birth month drop drop down and select it 
		driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys(birthMonth);
		Thread.sleep(2000);
		 log(birthMonth);
	 //Step 8: find out the birth day drop down and select it
		driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys(birthDay);
		Thread.sleep(2000);
		 log(birthDay);
	 // Step 9: find out the birth year and select it
		driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys(birthYear);
		Thread.sleep(2000);
		 log(birthYear);
   	 // Step 10: find the gender radio and click on it
		driver.findElement(By.xpath("//input[@value='1']")).click();
		Thread.sleep(5000);	
		Reporter.log(timeStamp()+ "    "+ "Male");
 }
 
 @AfterTest
 public void closeBrowser()throws Exception {
	 //close the browser
	 driver.close();	   
 }
 
     //timestamp
 public String timeStamp()throws Exception{
	 SimpleDateFormat simpleDateFormat = new SimpleDateFormat ("MM/dd/yyyy   hh:mm:ss");
	 Date date = new Date (System.currentTimeMillis());
	 String now = simpleDateFormat.format(date);
	 return now;
 }
     //log method
 public void log (String step)throws Exception {
	 // log the step
	 Reporter.log(timeStamp()+ "      "+step, true);
 }
}
 