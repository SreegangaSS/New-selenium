package testScript;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageSlidersPage;
import utilities.ExcelUtilities;

public class ManageSlidersTest extends Base
{
	@Test(retryAnalyzer=retry.Retry.class,description = "verify whether the user is able to add a new item")
	public void verifyWhetherTheUserIsAbleToAddANewItem() throws AWTException
	{
		
		String username= ExcelUtilities.getString(1,0,"loginpage");
	    String password=ExcelUtilities.getString(1,1,"loginpage");
	    
		String url="https:managersliders";
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(username);
		loginpage.enterPasswordOnPassworldField(password);
	    loginpage.clickonSignInButton();
	    
	    ManageSlidersPage managesliderspage =new ManageSlidersPage (driver);
	    managesliderspage.clickOnManageSlidersInfo();
	    managesliderspage.clickonNewButton();
	    managesliderspage.clickOnChooseFile();
	    managesliderspage.clickOnLink(url);
	    managesliderspage.clickOnSaveButton();
	    boolean manageslidersalert=  managesliderspage.alertdisplayed();
	    assertTrue(manageslidersalert," slider not created");
	

}

}
