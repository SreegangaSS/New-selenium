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

public class ManagePagesPage
{
	WebDriver driver;
	public ManagePagesPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver , this);
	}
	@FindBy(xpath = "//i[@class='fas fa-arrow-circle-right']//parent::a[1] ")WebElement managesPagesInfo ;
	@FindBy(xpath = "(//i[@class='fas fa-edit'])[2]")WebElement managePagesEditButton;
	@FindBy(xpath = "//input[@id='title'] ")WebElement managePagesTitle;
	@FindBy(xpath = "//div[@role='textbox'] ")WebElement  managePagesDescription;
	@FindBy(xpath = " //input[@id='page']")WebElement managePagespage;
	@FindBy(xpath = "//input[@id='main_img']")WebElement managePagesFileUpload ;
	@FindBy(xpath = "//button[@type='submit'] ")WebElement managePagesUpdateButton;
	@FindBy(xpath = " //div[@class='alert alert-success alert-dismissible']")WebElement managePagesalert;
	public void clickOnManagePagesInfo()
	{
		//PageUtilities pageutilities =new PageUtilities ();
    	//pageutilities.javaSriptClick(driver,managesPagesInfo);	
		managesPagesInfo.click();
	}
	public void clickOnEditButton()
	{
		PageUtilities pageutilities =new PageUtilities ();
    	pageutilities.javaSriptClick(driver,managePagesEditButton);	
		//managePagesEditButton.click();
	}
	public void clickOnManagePagesTitle(String title)
	{
		managePagesTitle.sendKeys(title);
	}
	public void clickOnManagePagesDescription(String description)
	{
		managePagesDescription.sendKeys(description);
	}
	public void clickOnManagePagesPage(String pages)
	{
		managePagespage.sendKeys(pages);
	}
	public void clickOnManagePagesImageUpload () throws AWTException
	{
		WaitUtilities waitutitlities = new WaitUtilities();
		waitutitlities.waitForElementToBeClickable(driver,managePagesFileUpload);
		FileUploadUtilities fileuploadutilities =new FileUploadUtilities();
		fileuploadutilities.fileuploadUsingRobertClass(managePagesFileUpload,GeneralUtilities.geoceryimage);
		
	}
	public void clickOnManagePagesUpdateButton()
	{
		PageUtilities pageutilities =new PageUtilities ();
    	pageutilities.javaSriptClick(driver,managePagesUpdateButton);
		//managePagesUpdateButton.click();
	}
	public boolean isManagepagesAlertDisplayed()
	{
		//WaitUtilities waitutitlities = new WaitUtilities();
		// waitutitlities .waitForAlertToBeVisible(driver,managePagesalert);
		return managePagesalert.isDisplayed();
	}
	
	

}
