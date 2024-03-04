package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.FileUploadUtilities;
import utilities.GeneralUtilities;
import utilities.PageUtilities;
import utilities.WaitUtilities;

public class ManageExpensePage 
{
	WebDriver driver;
	public ManageExpensePage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver , this);
		
	}	
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/expense'] ")WebElement manageexpenseinfo ;
	@FindBy(xpath = "//a[@onclick='click_button(1)']")WebElement newbutton;
	@FindBy(xpath = "//select[@name='user_id'] ")WebElement userfield ;
	@FindBy(xpath = " //input[@id='ex_date']")WebElement datefield ;
	@FindBy(xpath = "//select[@name='ex_cat'] ")WebElement categoryfield ;
	@FindBy(xpath = " //select[@id='order_id']")WebElement  orderIdfield;
	@FindBy(xpath = "//select[@id='purchase_id'] ")WebElement purchaseid ;
	@FindBy(xpath = "//select[@id='ex_type'] ")WebElement expensetype ;
	@FindBy(xpath = "//input[@id='amount'] ")WebElement amountfield ;
	@FindBy(xpath = " //textarea[@id='content']")WebElement  remarksfield;
	@FindBy(xpath = "//input[@name='userfile'] ")WebElement choosefiles ;
	@FindBy(xpath = "//button[@type='submit'] ")WebElement savebutton ;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible'] ")WebElement alertfield ;
	
	public void clickOnManageExpenseInfo()
	{
		PageUtilities pageutilities =new PageUtilities ();
		pageutilities.javaSriptClick(driver,manageexpenseinfo);
		//manageexpenseinfo.click();

	}
	public void clickOnNewButton()
	
	{
		//PageUtilities pageutilities =new PageUtilities ();
		// pageutilities.javaSriptClick(driver,newbutton);
		newbutton.click();
	}
    public void clickOnUserField()
	
	{
    	PageUtilities pageutilities =new PageUtilities ();
    	pageutilities .selectByValue(userfield,"7");
    	userfield.click();
	}
    public void clickOnDateField(String date)
	
	{
    	
		datefield.sendKeys(date);
	}
    public void clickOncategoryField()
	
   	{
    	PageUtilities pageutilities =new PageUtilities ();
    	pageutilities.selectByVisibleText(categoryfield,"IceCreams");
    	categoryfield.click();
   	}
   	
    public void clickOnOrderId()
	
   	{
    	PageUtilities pageutilities =new PageUtilities ();
    	pageutilities.selectDropDownByIndexValue(orderIdfield,2);
   		
   	}
	
public void clickOnPurchaseId()
	
   	{
    	PageUtilities pageutilities =new PageUtilities ();
    	pageutilities.selectByVisibleText(purchaseid,"6");
    	pageutilities.javaSriptClick(driver,purchaseid);	
   	}
    public void clickOnExpenseType()

	{
	PageUtilities pageutilities =new PageUtilities ();
	pageutilities.selectByVisibleText(expensetype,"Debit Bank");
	expensetype.click();
	}
	
    public void clickOnAmountField(String amount)

	{
  		amountfield.sendKeys(amount);
	}
    public void clickOnRemarks(String remarks)

    {
	
	remarksfield.sendKeys(remarks);
    }
    public void clickOnchoosefile() throws AWTException

    {
	WaitUtilities waitutitlities = new WaitUtilities();
	waitutitlities.waitForElementToBeClickable(driver,choosefiles );
	FileUploadUtilities fileuploadutilities =new FileUploadUtilities();
	fileuploadutilities.fileuploadUsingRobertClass(choosefiles,GeneralUtilities.geoceryimage);
	
    }
    public void clickOnSaveButton()

   {
	PageUtilities pageutilities =new PageUtilities ();
	
	pageutilities.javaSriptClick(driver,savebutton);
	//savebutton.click();
   }	
   public boolean isManageExpensePageDisplayed()
   {
	return alertfield.isDisplayed();
   }

}
