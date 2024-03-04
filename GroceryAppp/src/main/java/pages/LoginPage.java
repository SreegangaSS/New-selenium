package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver , this);
		
	}
	@FindBy(xpath="//input[@type='text']") WebElement usernameField;
	@FindBy(xpath=" //input[@type='password']") WebElement passwordField;
	@FindBy(xpath="//button[@type='submit']") WebElement signinButton;
	@FindBy(xpath="//li[text()='Dashboard']")WebElement dashboardvalue;
	@FindBy(xpath=" //button[@type='button']")WebElement alert ;
	public void navigateToAPage(String url)
	{
	driver.navigate().to(url);
	}
	
	
	public void enterUserNameOnUserNameField(String  username)
	{
		usernameField.sendKeys(username);
		
	}
	public void enterPasswordOnPassworldField(String  password)
	{
		passwordField.sendKeys(password);
		
	}
	public void clickonSignInButton()
	{
		signinButton.click();
		
	}
	public boolean alertdisplayed()
	{
		return alert.isDisplayed();
	}
	public  boolean isDashBoardLoaded()
	{
		return dashboardvalue.isDisplayed();
		
	}
	


}
