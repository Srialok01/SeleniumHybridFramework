/**
 * 
 */
package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 * @author alok-- for Screenshot Capture
 *
 */
public class Helper

	{
	
	public static String CaptureScreenshot(WebDriver driver, String Screenshotname)
	{
		TakesScreenshot ts = (TakesScreenshot)driver; //Type casting driver to take sccreenshot 
		File src =ts.getScreenshotAs(OutputType.FILE);	//returning file as screenshot
		
		String destination = "C:\\Users\\alok\\Desktop\\Workspace\\com.framework.selenum\\Screenshot"+Screenshotname+System.currentTimeMillis()+".png";
		
		try {
			FileUtils.copyFile(src, new File(destination));   //copy file accepts 'file' type as src and destination 
			
			} catch (Exception e)
		
			{
				System.out.println("Failed to attach screenshot"+ e.getMessage());
			}
		return destination;
	}
	
	}
