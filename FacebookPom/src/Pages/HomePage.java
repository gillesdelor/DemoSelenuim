package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage 
{
     WebDriver driver;
	
	// Step 1: Click on Marketplace button 
	By marketplaceButton = By.xpath("//div[contains(text(),'Marketplace')]");
	
	// Step 2: Click on Vehicule button
	By vehiculeButton = By.xpath("//div[contains(text(),'Vehicles')]");
	
	//Step 3: Input the min price in the min text box
	By minPrice = By.id("jsc_c_l");
	
	//Step 4: Input the max price in the max text box
	By maxPrice = By.id("jsc_c_m");
	
	//Step 5 : Input the min year in the min text box
	By minYear = By.id("jsc_c_n");
	
	// Step 6 : Input the max year in the max text box
	By maxYear = By.id("jsc_c_o");	
		
	//Pazametarized default constructor to initialize the webdriver 
	
	public HomePage(WebDriver driver)
	{		
		this.driver = driver;
	}
	
	// Create the method for performing the UI Webelement on Step 1
	
	public void ClickMarketPlace()
	{
		driver.findElement(marketplaceButton).click();
	}
	// Create the method for performing the UI Webelement on Step 2
	public void ClickVehicule()
	{
		driver.findElement(vehiculeButton).click();
	}
	// Create the method for performing the UI Webelement on Step 3
	
	public void InputMinPrice (String minP)
	{
		driver.findElement(minPrice).sendKeys(minP);
	}
	// Create the method for performing the UI Webelement on Step 4
	
	public void InputMaxPrice (String maxP)
	{
		driver.findElement(maxPrice).sendKeys(maxP);
	}
	// Create the method for performing the UI Webelement on Step 5
	
	public void InputMinYear (String minY)
	{
		driver.findElement(minYear).sendKeys(minY);
	}
	// Create the method for performing the UI Webelement on Step 6
	
	public void InputMaxYear (String maxY)
	{
		driver.findElement(maxYear).sendKeys(maxY);
	}
		
}
