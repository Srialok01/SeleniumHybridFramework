/**
 * 
 */
package Factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import DataProvider.ExcelDataProvider;

/**
 * @author alok
 *
 */
public class BrowserFactory
{
	static WebDriver driver;

	public static WebDriver getBrowser(String browser) //need to return webdriver
	{
		if (browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver",DataProviderFactory.getconfig().getMozillaPath());
			driver = new FirefoxDriver();
		}
		
		else if (browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver",DataProviderFactory.getconfig().getChromePath());
					driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
		
	}
	
	public static void Closedriver(WebDriver ldriver)
	{
	ldriver.quit();	
	}
	
}
