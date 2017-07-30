/**
 * 
 */
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



/**
 * @author alok
 *Class for Log In Page
 */


public class LoginPage 
{
	WebDriver driver;
	
	public  LoginPage(WebDriver ldriver)
	{ 
		driver= ldriver;
		
		
	}
	

	@FindBy(name="email") WebElement userName;   //Finding xpaths
	
	@FindBy(name="passwd") WebElement password;
	
	@FindBy(xpath="//input[@value='Sign In']") WebElement signUp;
	
	By SignOut = By.xpath("//div[@class='pre-header']//a[text()='Sign Out']");
	
	/* Now Writing methods to perform operations*/
	
	public  void logIn(String user, String pass)
	{
		userName.sendKeys(user);
		password.sendKeys(pass);
		signUp.click();
	}
	
	public void verifySuccessLogIn()
	{
		//Providing Explicitly wait to check presence of Sign out link//
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement wb=wait.until(ExpectedConditions.presenceOfElementLocated(SignOut));
			String text=wb.getText();
		Assert.assertEquals(text, "Sign Out","Login UnSuccessfull");
	}
		

	
}
