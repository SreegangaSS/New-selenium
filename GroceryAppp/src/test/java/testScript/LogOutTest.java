package testScript;

import org.testng.annotations.Test;

import pages.LogOutPage;
import pages.LoginPage;
import utilities.ExcelUtilities;

public class LogOutTest extends Base
{
	@Test(retryAnalyzer=retry.Retry.class,groups= {"Reggression"},description = "verify whether the user is add a new location")
	public void verifyWhetherTheUserIsAddANewLocation()
	{
		String username=ExcelUtilities.getString(1, 0,"loginpage");
		String password=ExcelUtilities.getString(1,1,"loginpage");
		
		
	    LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(username);
		loginpage.enterPasswordOnPassworldField(password);
	    loginpage.clickonSignInButton();
	    
	    LogOutPage logoutpage=new LogOutPage(driver);
	    logoutpage.clickOnAdmin();
	    logoutpage.clickOnLogout();
	   // boolean isAlertShowedUp =logoutpage.isAlertDisplayed();
	  //  assertTrue(isAlertShowedUp, "Home page is loaded with incorrect password");
}


}
