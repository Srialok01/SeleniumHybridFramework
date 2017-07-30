/**
 * 
 */
package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author alok
 * To retrieve data from Excel created in Application Testdata
 */
public class ExcelDataProvider
   {

	XSSFWorkbook wb;
	
	/* Create Constructor to load the Excel File*/
	
	
	public ExcelDataProvider()
	{
		
		File src = new File ("./Application Testdata/Excel Sheet.xlsx");
		
			try 
			{
				FileInputStream fis = new FileInputStream(src); 	//Loading of Excel File
													
				wb = new XSSFWorkbook(fis);								//Reading from Excel sheet 
				
			}
			catch (Exception e)			
			{
				System.out.println("The Exception is "+ e.getMessage());
			}
	 }
	
	
	public String getdata(int sheetIndex,int row,int column)
	{
		//String data = wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
		
		String data=wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
		
		return data;
		
	}
	
	
}
