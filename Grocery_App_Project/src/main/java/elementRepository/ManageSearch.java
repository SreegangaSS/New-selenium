package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class ManageSearch {
	GeneralUtilities g = new GeneralUtilities();
	WebDriver driver;

	public ManageSearch(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//input[@id='od']")
WebElement orderID;

@FindBy(xpath="//button[@name='Search']")
WebElement searchButton;

@FindBy(xpath="//td[text()='Bank']")
WebElement payment;

public void enterOrderId(String orderValue)
{
	g.enterValue(orderID, "708");
}
public void clickSearch()
{
	g.clickButton(searchButton);
}
public String getPayment()
{
	return g.getElementText(payment);
}
}

