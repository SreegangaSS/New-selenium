package element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class Home_Page {
	GeneralUtilities g=new GeneralUtilities();
	WebDriver driver;
	public Home_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@data-toggle='dropdown']")
	WebElement user;
	
	public String getLoginUser()
	{
		return g.getElementText(user);
	}

}
