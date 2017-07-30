/**
 * 
 */
package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Factory.BrowserFactory;
import Factory.DataProviderFactory;
import Pages.HomePage;

/**
 * @author alok
 *
 */
public class VerifyHomePage
{

	WebDriver driver;
	
	
	@BeforeMethod
	public void Setup()
	{
	driver=BrowserFactory.getBrowser("firefox");
	driver.get(DataProviderFactory.getconfig().geturl());
	}
	
	@Test
		
		public void verifyTestcase()
		 {		
	// to interact with Home Page , We create object of Home page and to initialize the home page we need Page Factory
		//HomePage home = PageFactory.initElements(driver, HomePage.class);
		
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		
		 String title = home.GetAppTitle();
	   		
		Assert.assertTrue(title.contains("Demo Store"));	
		
		System.out.println("Assertion Passed");
	
		}
	
	@AfterMethod
	
	public void CloseBrowser()
	{
		BrowserFactory.Closedriver(driver);
	}
	
	
	}
	
	

