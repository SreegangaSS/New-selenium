package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage 
{
	WebDriver driver;
	public LogOutPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver , this);
	}
	@FindBy(xpath=" //a[@data-toggle='dropdown']") WebElement admin; 
	@FindBy(xpath=" //i[@class='ace-icon fa fa-power-off']") WebElement logouticon; 
	@FindBy(xpath="//body[@class='login-page']") WebElement login; 
	public void clickOnAdmin()
	{
		admin.click();
	}
	public void clickOnLogout()
	{
		logouticon.click();
	}
	/*public boolean isAlertDisplayed()
	{
		return login.isDisplayed();
	}*/

}
