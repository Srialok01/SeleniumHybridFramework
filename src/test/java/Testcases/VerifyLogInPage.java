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
import Pages.LoginPage;

/**
 * @author alok
 *
 */
public class VerifyLogInPage
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
	// to interact with Home Page , We create object of Home page and to initiize the home page we need Page Factory
		
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		
		 String title = home.GetAppTitle();
	   		
		Assert.assertTrue(title.contains("Demo Store"));	
		
		home.clickOnSignLink();		
		
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		
		//login.logIn("aloksrivastav@google.com", "aloksrivastav@google.com");   //retriving data hardcoded
		
		
		//	retrieving data from excel 
		System.out.println("Fetching data from Excel");
		
		
		login.logIn(DataProviderFactory.getEXcel().getdata(0, 0, 0), DataProviderFactory.getEXcel().getdata(0, 0, 1));
		
					
		login.verifySuccessLogIn();
				
	
		}
	
	@AfterMethod
	
	public void CloseBrowser()
	{
		BrowserFactory.Closedriver(driver);
	}
	
	
	}
	
	

