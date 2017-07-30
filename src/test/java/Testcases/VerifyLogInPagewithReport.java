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

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Factory.BrowserFactory;
import Factory.DataProviderFactory;
import Pages.HomePage;
import Pages.LoginPage;

/**
 * @author alok
 *
 */
public class VerifyLogInPagewithReport
{

	WebDriver driver;
	
	ExtentReports report;
	ExtentTest logger;
		
	@BeforeMethod
	public void Setup()
	{
		report = new ExtentReports("./Reports/LoginPageReport.html",true);//creating object of Extent Report
		
		logger = new ExtentTest("Verify Login Page","This page will verify successful login"); //Creating object of logger
		
		logger= report.startTest("Verify Login Page"); //Starting test to generate report
		
		
	driver=BrowserFactory.getBrowser("firefox");
	driver.get(DataProviderFactory.getconfig().geturl());
	
	logger.log(LogStatus.INFO,"Browser is launched");
	}
	
	@Test
				public void verifyTestcase()
		 {		
	// to interact with Home Page , We create object of Home page and to initiize the home page we need Page Factory
		
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		
		 String title = home.GetAppTitle();
	   		
		Assert.assertTrue(title.contains("Demo Store"));	
		
		logger.log(LogStatus.PASS," Application is up and running");
		
		home.clickOnSignLink();		
		
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		
		//login.logIn("aloksrivastav@google.com", "aloksrivastav@google.com");   //retriving data hardcoded
		
		
		//	retrieving data from excel 
		System.out.println("Fetching data from Excel");
		
		
		login.logIn(DataProviderFactory.getEXcel().getdata(0, 0, 0), DataProviderFactory.getEXcel().getdata(0, 0, 1));
		
					
		login.verifySuccessLogIn();
		
		logger.log(LogStatus.PASS,"verification of Successful Login");
				
	
		}
	
	@AfterMethod
	
	public void CloseBrowser()
	{
		BrowserFactory.Closedriver(driver);
		report.endTest(logger);
		report.flush();
		
	}
	
	
	}
	
	

