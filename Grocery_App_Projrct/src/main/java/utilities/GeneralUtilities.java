package utilities;

import org.openqa.selenium.WebElement;

public class GeneralUtilities {
	public String getElementText(WebElement element)
	{
		String text=element.getText();
		return text;
	}
	public void clickButton(WebElement element)
	{
		element.click();
	}
	public void orderButton(WebElement element) {
		element.click();
	}
	public void enterValue(WebElement element ,String value)
	{
		element.sendKeys(value);
	}

	
}
