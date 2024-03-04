package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class ManageOrderPage {

	GeneralUtilities g = new GeneralUtilities();
	WebDriver driver;

	public ManageOrderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-order']")
	WebElement manage;

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	WebElement search;

	public String getLoginSearch() {
		return g.getElementText(search);
	}
	public void clickButton()
	{
		g.clickButton(manage);
	}
	public void orderButton() {
		g.orderButton(search);
	}
}



