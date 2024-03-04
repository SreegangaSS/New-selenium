package testScript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import com.sun.net.httpserver.Authenticator.Retry;

import pages.LoginPage;
import utilities.ExcelUtilities;

public class LoginTest extends Base
{
	@Test(retryAnalyzer=retry.Retry.class,groups= {"Reggression"},description = "verify the user is able to login using valid credentials")
	
	public void verifyTheUserIsAbleToLoginUsingValidCredentials()
	{
		String username= ExcelUtilities.getString(1,0,"loginpage");
	    String password=ExcelUtilities.getString(1,1,"loginpage");
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(username);
		loginpage.enterPasswordOnPassworldField(password);
        loginpage.clickonSignInButton();
        boolean isHomePageLoaded=loginpage.isDashBoardLoaded();
        assertTrue(isHomePageLoaded,"Home page is not loaded when user is entering valid credentials");
}
	@Test
	public void varifyWhetherTheUserIsUnableToLoginWithCorrectUserNameAndIncorrectPassWord() {
		String username = ExcelUtilities.getString(2, 0,"loginpage");
		String password=ExcelUtilities.getString(2,1,"loginpage");
		
		LoginPage loginPage = new LoginPage(driver);
	    loginPage.enterUserNameOnUserNameField(username);
	    loginPage.enterPasswordOnPassworldField(password);
	    loginPage.clickonSignInButton();
		
        boolean isAlertShowedUp =loginPage.alertdisplayed();
		
      assertTrue(isAlertShowedUp, "Home page is loaded with incorrect password");

	}
	@Test
	public void varifyWhetherTheUserIsUnableToLoginWithInCorrectUserNameAndcorrectPassWord() {
		String username =ExcelUtilities.getString(3, 0,"loginpage");
		String password=ExcelUtilities.getString(3,1,"loginpage");
		
		LoginPage loginPage = new LoginPage(driver);
	    loginPage.enterUserNameOnUserNameField(username);
	    loginPage.enterPasswordOnPassworldField(password);
	    loginPage.clickonSignInButton();
		
        boolean isAlertShowedUp =loginPage.alertdisplayed();
		
      assertTrue(isAlertShowedUp, "Home page is loaded with incorrect username");

	}
	@Test
	public void varifyWhetherTheUserIsUnableToLoginWithInCorrectUserNameAndIncorrectPassWord() {
		String username =ExcelUtilities.getString(4, 0,"loginpage");
		String password=ExcelUtilities.getString(4,1,"loginpage");
		
		LoginPage loginPage = new LoginPage(driver);
	    loginPage.enterUserNameOnUserNameField(username);
	    loginPage.enterPasswordOnPassworldField(password);
	    loginPage.clickonSignInButton();
		
        boolean isAlertShowedUp =loginPage.alertdisplayed();
		
      assertTrue(isAlertShowedUp, "Home page is loaded with incorrect username and incorrect password");

	}
	@DataProvider(name="LoginProvider")
	public Object[][] getDataFromTestData(){
		return new Object[][] {{ExcelUtilities.getString(1, 0, "LoginPage"),ExcelUtilities.getString(1, 1, "LoginPage")}};
		
	
	
	}


}
