package wikipediasearch;

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
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Wikipedia {

      //declare variables
	public WebDriver driver;
	public String Url;
    public Capabilities cap;
    public InetAddress addr = null;
    

@BeforeTest
public void setUp()throws Exception{ 
	//initialize variable
	Url = "https://www.wikipedia.org/";	
	//maximize the browser
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--start-maximized");
	//start the browser
	driver = new ChromeDriver(options);

}

@Test      
public void test01_systemInfo() throws Exception{
	log ("Operating System::::::" +getOS());
	log("Username:::::::::" +getUsername());
	log("Java Version:::::::::" +getVersion());
	log("Browser name ::::::::::::" +getBrowserName());
	log ("Browser version::::::::" +getbrowserVersion());
	log("IP address:::::::::" +getIPAddress());
	log ("Hostname:::::::::::" +getHostName());
	
	}
	
@Test
public void test02_searchWikipedia() throws Exception {
	//Step 1: nagivate to the Url
	ArrayList<DataSheetValues> dataSheetList = readXLSheet("XLSheet/Wiki_excel.xls","Sheet1");
		if (dataSheetList.size()==0){
			System.out.println("No Data Found!");
		}else{
		for (DataSheetValues mySheet: dataSheetList){
		// get the values from the sheet
		String value = mySheet.getValue(    );	
		
		driver.navigate().to(Url);
		Thread.sleep(3000);
		//Step 2: find out English and click on the language
		WebElement linkText = driver.findElement(By.xpath("//a[@id='js-link-box-en']"));	
		linkText.click();
		Thread.sleep(2000);
		//Step 3: find out the search box text
		WebElement inputBox = driver.findElement(By.xpath("//input[@id='searchInput']"));
		//Step 4: enter the search text and press enter
		inputBox.sendKeys(value);
		log(value);
	    Thread.sleep(2000);
	    //Step 5: press enter
	    inputBox.submit();   
	    Thread.sleep(4000);	 
}
		}		
}

@AfterTest
public void closeBrowse()throws Exception {
	driver.close();	
}
     //time Stamp
public String timeStamp()throws Exception{
	SimpleDateFormat format = new SimpleDateFormat ("MM/dd/yyyy   hh:mm:ss");
	Date date = new Date(System.currentTimeMillis());
	String now = format.format(date);
	return now;
}
    // log method
public void log (String step)throws Exception{
	// log the step
	Reporter.log(timeStamp()+"     "+step, true);
}
    //get the computer name (OS)
public String getOS(){
	String os = System.getProperty("name.OS");
	return os;	
}
    //get the username 
public String getUsername(){
	String username = System.getProperty("user.name");
	return username;
}
   // get the java version
public String getVersion(){
	String version = System.getProperty("Java.version");
	return version;
}
    //get the browser name
public String getBrowserName(){
	cap = ((RemoteWebDriver)driver).getCapabilities();
	String browserName = cap.getBrowserName();
	return browserName.substring(0, 1).toUpperCase()+ browserName.substring(1);
}
    // get the browser version
public String getbrowserVersion(){
	cap = ((RemoteWebDriver)driver).getCapabilities();
	String browserVersion = cap.getVersion();
	return browserVersion;	
}
    // get the Ip address
public String getIPAddress(){
	String ip = null;
	try{
		addr = InetAddress.getLocalHost();
	}catch (UnknownHostException e){
		e.getStackTrace();
	}
	ip = addr.getHostAddress();
	return ip;
}
    // get host name
public String getHostName(){
	try{
		addr = InetAddress.getLocalHost();
	}catch (UnknownHostException e){
		e.getStackTrace();
	}
	String hostname = addr.getHostName();
	return hostname.toUpperCase();
}
   // data-driven
public ArrayList<DataSheetValues>readXLSheet(String sheetPath, String sheetName)throws Exception{
	 //declare varaibles
	Row row = null;
	int rows_total = 0;
	HSSFCell cell = null;
	
	//set the file path
	FileInputStream myStream = new FileInputStream(sheetPath);
	HSSFWorkbook myWorkbook = new HSSFWorkbook(myStream);
	HSSFSheet mySheet = myWorkbook.getSheet(sheetName);
	rows_total = mySheet.getLastRowNum();
	DataSheetValues dataSheet = null;
	ArrayList <DataSheetValues> dataSheetList = new ArrayList <DataSheetValues>();
	DataFormatter formatter = new DataFormatter();
	
	// step throught the excel sheet to get the values
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