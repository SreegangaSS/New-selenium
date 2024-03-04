package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.FileUploadUtilities;
import utilities.GeneralUtilities;
import utilities.WaitUtilities;

public class ManageSlidersPage
{WebDriver driver;
public ManageSlidersPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = " (//a[@href='https://groceryapp.uniqassosiates.com/admin/list-slider'])[1]")WebElement manageslidersinfo ;
@FindBy(xpath = "//a[@onclick='click_button(1)']")WebElement newbutton;
@FindBy(xpath = "//input[@name='main_img']")WebElement choosefile;
@FindBy(xpath = " //input[@id='link']")WebElement link;
@FindBy(xpath = "//button[@type='submit'] ")WebElement savebutton;
public void clickOnManageSlidersInfo()
{
	manageslidersinfo.click();

}
public void clickonNewButton()
{
	 newbutton.click();

}
public void clickOnChooseFile() throws AWTException
{
	WaitUtilities waitutitlities = new WaitUtilities();
	waitutitlities.waitForElementToBeClickable(driver,choosefile );
	
	FileUploadUtilities fileuploadutilities =new FileUploadUtilities();
	fileuploadutilities.fileuploadUsingRobertClass(choosefile,GeneralUtilities.geoceryimage);
	

}
public void clickOnLink(String url)
{
	
	link.sendKeys(url );

}
public void clickOnSaveButton()
{
	savebutton.click();

}
public boolean alertdisplayed()
{
	return savebutton.isDisplayed();
}


}
