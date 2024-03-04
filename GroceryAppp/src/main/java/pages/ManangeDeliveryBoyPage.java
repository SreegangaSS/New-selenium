package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManangeDeliveryBoyPage 
{
	WebDriver driver;
	public ManangeDeliveryBoyPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver , this);
		
	}

		@FindBy(xpath = "//a[@onclick='click_button(2)']")WebElement searchMenuButton;
		@FindBy(xpath = "//input[@placeholder='Name']")WebElement nameField;
		@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-deliveryboy']//parent::li")WebElement managedeliveryboyinfo;
		@FindBy(xpath = "//button[@value='sr']")WebElement submitbutton ;
		@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']")WebElement table;
		
		
		public void clickOnManageDeliveryBoyInfo()
		{
			managedeliveryboyinfo.click();
		}
		public void clickOnSearchButton()
		
		{
			searchMenuButton.click();
		}
		
		public void enterDeliveryBoyNameField(String deliveryBoyName )
		{
			nameField.sendKeys(deliveryBoyName);
			
		}
		public void clickonSubmitButton()
		{
			submitbutton.click();
			
		}
		public boolean isDeliveryBoySearchResultDisplayed()
		{
			return table.isDisplayed();
		}
		

}
