/**
 * 
 */
package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



/**
 * @author alok
 *
 */


public class HomePage 
{
	WebDriver driver;
	
	public  HomePage(WebDriver ldriver)
	{ 
		driver= ldriver;
		
		
	}
	

	@FindBy(xpath="//a[text()='Sign In']") WebElement signInLink;   //Finding xpaths
	
	@FindBy(xpath="//a[text()='My Account']") WebElement myAccountLink;

	
	@FindBy(xpath="//a[text()='My Cart']") WebElement myCartLink;

	
	@FindBy(xpath="//a[text()='Checkout']") WebElement checkOutLink;

	/* Now Writing methods to perform operations*/
	
	public void clickOnSignLink()
	{
		signInLink.click();
	}
	
	public void ClickOnMyAccountLink()
	{
		myAccountLink.click();
	}
	
	public void ClickOnMyCartLink()
	{
		myCartLink.click();
	}
	public void ClickOnCheckOutLink()
	{
		checkOutLink.click();
	}

	public String GetAppTitle()
	{
		
		System.out.println("Before title fetch");
			 
		
		return driver.getTitle();
		
		
		
	
	}
	

	
}
