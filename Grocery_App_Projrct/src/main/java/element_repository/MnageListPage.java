package element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class MnageListPage {
	GeneralUtilities g = new GeneralUtilities();
	WebDriver driver;

	public MnageListPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@href='javasript:void(0)']")
	WebElement searchButton;
	
	@FindBy(xpath="//input[@name='od']")
	WebElement oderIDButton;
	
	public void clickSerachButtonManage()
	{
		searchButton.click();
	}
	public void enterOrderButton()
	{
		oderIDButton.click();
	}

}
