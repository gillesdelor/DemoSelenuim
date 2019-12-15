/**
 * 
 */
package mariottProject;

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

import org.testng.Reporter;



/**
 * @author Gilles Z
 *
 */
public class MariottProject {
	//declare variables
	public WebDriver driver;
	public String Url;
	public Capabilities cap;
	public InetAddress addr = null;
	private String props= System.getProperty("user.dir") + "\\libs\\geckodriver.exe";
	
	@Before 
	 public void setUp()throws Exception	{
    	System.setProperty("webdriver.gecko.driver",props);
    	
    	//using firefox
    	driver = new FirefoxDriver();   
   	    driver.manage().window().maximize();
   	    
   	//initialize the variable
    	Url = "https://www.marriott.com/default.mi";
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
    	
    	ArrayList<DataSheetValues> DataSheetList = readXLSheet("XLSheet/Mariott_Excel.xls","Sheet1");
    	if (DataSheetList.size() == 0){
    		System.out.println("No Data Found!!!" );
    	}else{
    		for (DataSheetValues mySheet: DataSheetList){
    			
    	//get the values from the sheet
    		String destination;
    		String dates;
    		String nights;
    		  		  		
    	destination = mySheet.getValue();
    	dates = "Wed, Oct 30";
    	nights = "Sat, Nov 9";
    	
    	//Step 2: find out destination text box and enter destination
    	
    	driver.findElement(By.xpath("//input[@name='destinationAddress.destination']")).sendKeys(destination);
    	Thread.sleep(2000);
    	log(destination);
    	
    	//Step 3: find out dates text box and enter dates
    	driver.findElement(By.xpath("//input[@placeholder='Check-in']")).clear();
    	driver.findElement(By.xpath("//input[@placeholder='Check-in']")).click();
    	WebElement selectDates = driver.findElement(By.xpath("//input[@placeholder='Check-in']"));
    	selectDates.sendKeys(dates);
    	Thread.sleep(2000);
    	log(dates);
    	
    	//Step4: find out nights text box and enter nights
    	driver.findElement(By.xpath("//input[@placeholder='Check-out']")).sendKeys(nights);
    	Thread.sleep(2000);
    	log(nights);
    	
    	//Step 5: find out Room Guests and click on room
    	driver.findElement(By.xpath("//a[@aria-label='Add Rooms']")).click();
    	Thread.sleep(2000);
    	
    	//Step 6: find out Adult and click on adult
    	driver.findElement(By.xpath("//a[@aria-label='Add Adults Per Room']")).click();
    	Thread.sleep(2000);
    	
    	//Step 7: find out children and click on children
    	driver.findElement(By.xpath("//a[@aria-label='Add Children Per Room']")).click();
    	Thread.sleep(2000);
    	
    	//Step 6: find out Special Rate and click on
    	 driver.findElement(By.xpath("//a[@aria-label='Special Rates']")).click();
    	 Thread.sleep(2000);
    	 
    	//Step 7: find out use Points/ Certificats
    	 driver.findElement(By.xpath("//input[@name='useRewardsPoints']")).click();
    	 Thread.sleep(3000);
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
    		dataSheet.setValue(formatter.formatCellValue(cell));
    		
    		// add the data to data sheet list
    		dataSheetList.add(dataSheet);
    	}
    	  myWorkbook.close();
    	  return dataSheetList;   
    }
}
