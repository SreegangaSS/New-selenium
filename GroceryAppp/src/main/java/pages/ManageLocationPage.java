package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtilities;
import utilities.WaitUtilities;

public class ManageLocationPage
{
	WebDriver driver;
	public ManageLocationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver , this);
		
	}
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-location']//parent::li")WebElement managelocationinfo;
	@FindBy(xpath = "//a[@onclick='click_button(1)']")WebElement newButton;
	@FindBy(xpath = "//select[@id='country_id']")WebElement countrydropdown ;
	@FindBy(xpath = "//select[@id='st_id']")WebElement statedropdown;
	@FindBy(xpath = "//input[@id='location']")WebElement locationfield ;
	@FindBy(xpath = "//input[@id='delivery']")WebElement deliverychargefield;
	@FindBy(xpath = " //button[@type='submit']")WebElement save;
	@FindBy(xpath = " //div[@class='alert alert-success alert-dismissible']")WebElement alert;
	public void clickOnManageLocationInfo()
	{
		managelocationinfo.click();
	}
	public void clickOnNewButton()
	{
		newButton.click();
	}
	
	public void selectCountry()
	{
		PageUtilities pageutilities=new PageUtilities();
	pageutilities.selectDropdownbyText(countrydropdown," United Kingdom");
	countrydropdown.click();
	}
	public void selectState( ) 
	{
		PageUtilities pageutility=new PageUtilities();
		pageutility.selectDropdownbyText(statedropdown,"Armagh");
	    WaitUtilities waitutility=new WaitUtilities();
		waitutility.fluentwaitelementtoBeClicked(driver, statedropdown);	
		
		statedropdown.click();
	}
	public void enterTheLocationField(String location )
	{
		locationfield.sendKeys(location);
		
	}	
	public void enterTheDeliveryCharge(String deliveryCharge )
	{
		deliverychargefield.sendKeys(deliveryCharge );
		
	}	
	public void saveButton()
	{
		save.click();
		
	}	
	public boolean alertdisplayed()
	{
		return alert.isDisplayed();
	}

}
