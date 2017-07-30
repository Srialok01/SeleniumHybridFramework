/**
 * 
 */
package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/**
 * @author alok
 *
 */
public class ConfigDataProvider
{	Properties pro;
	public ConfigDataProvider()
	{
		File src = new File("./Configuration/Config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			
			pro= new Properties();
			pro.load(fis);			//loading properties file	
			} 
		catch (Exception e)
			{
			
			System.out.println(e.getMessage());
			}
			
	}
	
	public String geturl()
	{
		String url=pro.getProperty("url");
				return url;
				
	}
	
	public String getChromePath()
	{
		String url=pro.getProperty("ChromePath");
		return url;
	}
	public String getMozillaPath()
	{
		String url=pro.getProperty("MozillaPath");
		return url;
	}
}
