package testScript;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManagePagesPage;
import utilities.ExcelUtilities;

public class ManagePagesTest extends Base
{
	@Test(retryAnalyzer=retry.Retry.class,description = "verify whether the user is able to update a page")
	public void verifyWhetherTheUserIsAbleToUpdateAPage() throws AWTException
	{
		
		String username= ExcelUtilities.getString(1,0,"loginpage");
	    String password=ExcelUtilities.getString(1,1,"loginpage");
	    String title= ExcelUtilities.getString(1,0,"managepage");
	    String description=ExcelUtilities.getString(1,1,"managepage");
	    String page=ExcelUtilities.getString(1,2,"managepage");
		
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(username);
		loginpage.enterPasswordOnPassworldField(password);
	    loginpage.clickonSignInButton();
	    
	    ManagePagesPage managepagespage =new ManagePagesPage(driver);
	    managepagespage.clickOnManagePagesInfo();
	    managepagespage.clickOnEditButton();
	    managepagespage.clickOnManagePagesTitle(title);
	    managepagespage.clickOnManagePagesDescription(description);
	    managepagespage.clickOnManagePagesPage(page);
        managepagespage.clickOnManagePagesImageUpload();
	    managepagespage.clickOnManagePagesUpdateButton();
	    boolean managepagealert= managepagespage.isManagepagesAlertDisplayed();
	    assertTrue(managepagealert,"the user is not able to update the page");
}


}
