package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtilities;

public class ManageOrdersPage 
{
	WebDriver driver;
	public ManageOrdersPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver , this);
		
	}

		@FindBy(xpath = " //table[@class='table table-bordered table-hover table-sm']//tbody//tr//td[7]")WebElement actioncell;
		@FindBy(xpath = "(//i[@class='fas fa-trash-alt'])[1]")WebElement deletebutton;
		@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-order']//parent::li")WebElement manageorderstestinfo;
		@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")WebElement manageorderalert;
		public void clickOnManageOrderInfo()
		{
			manageorderstestinfo.click();;

		}
		public void clickDeleteButton()
		
		{
			
			deletebutton.click();
		}
	
		public boolean isAlertDisplayed()
		{
			PageUtilities pageutilities =new PageUtilities();
			pageutilities.acceptAlert(driver);
			return actioncell.isDisplayed();
		}
		

}
