/**
 * 
 */
package Factory;

import DataProvider.ConfigDataProvider;
import DataProvider.ExcelDataProvider;

/**
 * @author alok
 *This Function will return object
 */
public class DataProviderFactory

{
	public static ConfigDataProvider getconfig() //creating function with return type as configDataProvider
	{
		ConfigDataProvider config = new ConfigDataProvider();
		return config; 
	} 

	
	
	
	public static ExcelDataProvider getEXcel()  //creating function with return type as ExcelDataProvider
	{
		ExcelDataProvider excel = new ExcelDataProvider();
		return excel;
	}
	
	
}
