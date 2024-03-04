package testScript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageOrdersPage;
import utilities.ExcelUtilities;

public class ManageOrdersTest extends Base
{
	@Test(retryAnalyzer=retry.Retry.class,description = "verify the alertmessage is found in manage orders page")
	public void verifyWhetherTheUserIsAbleToDeleteTheField()
	{
	String username=ExcelUtilities.getString(1, 0,"loginpage");
	String password=ExcelUtilities.getString(1,1,"loginpage");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUserNameOnUserNameField(username);
	loginpage.enterPasswordOnPassworldField(password);
    loginpage.clickonSignInButton();
    
    ManageOrdersPage  manageorderspage=new  ManageOrdersPage(driver);
    manageorderspage.clickOnManageOrderInfo();
    manageorderspage.clickDeleteButton();
    boolean isalertDisplayed=manageorderspage.isAlertDisplayed();
    assertTrue(isalertDisplayed,"user is unable to delete the field");
	}  

}
