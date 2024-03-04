package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class MnagePageList {
	GeneralUtilities g = new GeneralUtilities();
	WebDriver driver;

	public MnagePageList(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@href='javasript:void(0)']")
	WebElement searchButton;
	
	@FindBy(xpath="//input[@name='od']")
	WebElement oderIDButton;
	
	public void clickSerachButtonManage()
	{
		g.clickButton(searchButton);
	}
	public void enterOrderButton()
	{
		g.enterValue(oderIDButton, "708");
	}

}



