package uberMavens;

import java.io.FileInputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class UberMaven {
	
	//declare variables	
    public WebDriver driver;
    public String Url;
    public Capabilities cap;
    public InetAddress addr = null;
    
    
    @Before
    public void setUp()throws Exception	{
    	System.setProperty("webdriver.gecko.driver",
    	"C:\\Users\\Gilles Z\\Desktop\\Selenium\\SeleniumScripts\\UberMavens\\libs\\geckodriver.exe");
    	
    	//using firefox
    	driver = new FirefoxDriver();   
   	    driver.manage().window().maximize();
   	     	    
   	//initialize the variable
    	Url = "https://www.uber.com/sign-in/";
    }
   
    @Test  
    public void test01_systemInfo()throws Exception{
    log ("Operating System ::::::::::" +getOS());
    log ("Username::::::::::::::" +getUsername());
    log ("Java Version:::::::::::::" +getJavaVersion());
    log ("Browser Name :::::::::::::" +getBrowserName());
    log ("Browser Version :::::::::::" +getBrowserVersion());
    log ("IP Address::::::::::::::::::" +getIpAddress());
    log  ("Hostname ::::::::::::::::" +getHostname());
    }
      
    @Test
    public void test02_signUp()throws Exception{
    	//Step1: navigate to the browser
    	driver.navigate().to(Url);
    	Thread.sleep(3000);
    	//Step 2: click on Sign Up
        driver.findElement(By.xpath("//button/div[text()='Sign up']")).click();
        Thread.sleep(3000);
        //Step 3: click on Sign up to drive
        driver.findElement(By.xpath("//a/span[text()='Sign up to drive']")).click();
        Thread.sleep(2000);
        
    	ArrayList<DataSheetValues> DataSheetList = readXLSheet("XLSheet/Uber_Excel.xls","Sheet1");
    	if (DataSheetList.size() == 0){
    		System.out.println("No Data Found!!!" );
    	}else{
    		for (DataSheetValues mySheet: DataSheetList){
    			
    	//get the values from the sheet
    		String email = mySheet.getEmail();
    	    String firstname = mySheet.getFirstname();
    	    String lastname = mySheet.getLastname();
    	    String phonenumber = mySheet.getPhoneNumber();
    	    String password = mySheet.getPassword();
    
    	//Step 4: find out the sign Up button and click on it
    	driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
    	driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
    	driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(email);
    	Thread.sleep(2000);
    	log(email);
    	//Step 5: find out the driver sign up and click on it
    	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
    	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(firstname);
    	Thread.sleep(2000);
    	log(firstname);
    	//Step 6: find I have a car button and select it	
    	driver.findElement(By.xpath("//input [@placeholder='Last Name']")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
    	driver.findElement(By.xpath("//input [@placeholder='Last Name']")).sendKeys(lastname);
    	Thread.sleep(2000);
    	log(lastname);
    	//Step 7: find out the email text box and enter email
    	driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
    	driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys(phonenumber);
    	Thread.sleep(2000);
    	log(phonenumber);
    	//Step 8: find out the firstname text box and enter first name
    	driver.findElement(By.xpath("//input [@placeholder='Create Password']")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
    	driver.findElement(By.xpath("//input [@placeholder='Create Password']")).sendKeys(password);
    	Thread.sleep(2000);
    	log(password);
    	// Step 9: Find the city
    	driver.findElement(By.xpath("//input[@placeholder='City']")).click();
    	WebElement selectCity = driver.findElement(By.xpath("//input[@placeholder='City']"));
    	selectCity.sendKeys(Keys.chord(Keys.CONTROL, "a"));
    	selectCity.sendKeys("Manassas");
    	Thread.sleep(2000);
    	selectCity.sendKeys(Keys.ARROW_DOWN);
    	selectCity.sendKeys(Keys.ENTER);
    	Thread.sleep(3000);
    	log(selectCity.getAttribute("value"));
    	//Step 10: select type of car
        driver.findElement(By.xpath("//select[@class='_style_1dkuSV']")).click();
        Thread.sleep(2000);
    	Select select = new Select(driver.findElement(By.xpath("//select[@class='_style_1dkuSV']")));
    	select.selectByValue("personal_vehicle");
    	Thread.sleep(3000);
    	//log(driver.findElement(By.xpath("//select/option[@value='personal_vehicle']")).getText());
    	
    		}
    	}   	  	   	
    }
       
    @After
    public void closeBrowser()throws Exception{
    	driver.close();
    }
    
    //time stamp method
    public String timeStamp()throws Exception{
    	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
    	Date date = new Date (System.currentTimeMillis());
    	String now = simpleDateFormat.format(date);
    	return now;
    }
    	//log method
    public void log(String step)throws Exception{
    	
    	//log the step
    	Reporter.log(timeStamp()+"    "+step, true);
    }
       // get the computer name (OS)
    public String getOS(){
    	String os = System.getProperty("name.OS");
    	return os;
    }
       // get the username
    public String getUsername(){
    	String username = System.getProperty("username");
    	return username;
    }
       // get the java version
    public String getJavaVersion(){
    	String javaVersion = System.getProperty(" java.version");
    	return javaVersion;  
    }
      // get the browser name
    public String getBrowserName(){
    	cap = ((RemoteWebDriver)driver).getCapabilities();
    	String browserName = cap.getBrowserName();
    	return browserName.substring(0, 1).toUpperCase()+ browserName.substring(1);
    }
      // get the browser version
    public String getBrowserVersion(){
    	cap = ((RemoteWebDriver)driver).getCapabilities();
    	String browserVersion = cap.getVersion();
    	return browserVersion;
    }
     // get the IP Address
    public String getIpAddress(){
       String ip = null;
        try{
        addr = InetAddress.getLocalHost();
        }catch (UnknownHostException e){
        	e.getStackTrace();
        }
       ip = addr.getHostAddress();
       return ip;
    }
    // get the hostname 
    public String getHostname(){
    	try{
    	addr = InetAddress.getLocalHost();
    	}catch (UnknownHostException e){
    		e.getStackTrace();   	
    	}
    	String hostname =addr.getHostName();
    	return hostname.toUpperCase();
    }
     // Data_Driven
    public ArrayList<DataSheetValues>readXLSheet(String sheetPath, String sheetName )throws Exception{
    	//declare variables
    	Row row = null;
    	int rows_total = 0;
    	HSSFCell cell = null;    
    	
    	//set up the file path
    	FileInputStream myStream = new FileInputStream(sheetPath);
    	HSSFWorkbook myWorkbook = new HSSFWorkbook(myStream);
    	HSSFSheet mySheet = myWorkbook.getSheet(sheetName);
    	rows_total = mySheet.getLastRowNum();
    	DataSheetValues dataSheet = null;
    	ArrayList <DataSheetValues> dataSheetList = new ArrayList <DataSheetValues>();
    	DataFormatter formatter = new DataFormatter();
    	
    	//step throught the excel sheet to get the values
    	for (int i = 0; i < rows_total; i++){
    		row = mySheet.getRow(i);
    		dataSheet = new DataSheetValues();
    		cell = (HSSFCell)row.getCell(0);
    		dataSheet.setEmail(formatter.formatCellValue(row.getCell(0)));
    		
    		cell = (HSSFCell)row.getCell(0);
    		dataSheet.setFirstname(formatter.formatCellValue(row.getCell(1)));
    		
    		cell = (HSSFCell)row.getCell(0);
    		dataSheet.setLastname(formatter.formatCellValue(row.getCell(2)));
    		
    		cell = (HSSFCell)row.getCell(0);
    		dataSheet.setPhoneNumber(formatter.formatCellValue(row.getCell(3)));
    		
    		cell = (HSSFCell)row.getCell(0);
    		dataSheet.setPassword(formatter.formatCellValue(row.getCell(4)));
    		
    	 	// add the data to data sheet list
    		dataSheetList.add(dataSheet);
    	}
    	  myWorkbook.close();
    	  return dataSheetList;   	    	
    }

}
