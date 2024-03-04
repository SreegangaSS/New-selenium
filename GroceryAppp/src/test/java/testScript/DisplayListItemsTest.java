package testScript;

import org.testng.annotations.Test;

import pages.DisplayListItemsPage;
import pages.LoginPage;
import utilities.ExcelUtilities;

public class DisplayListItemsTest extends Base
{
	@Test(retryAnalyzer=retry.Retry.class,description = " verify that selected tile is displayed")
	public void verifyThatSelectedTileIsDisplayed()
	{
		String username= ExcelUtilities.getString(1,0,"loginpage");
	    String password=ExcelUtilities.getString(1,1,"loginpage");
	//String tile="Category";
	  String tile=ExcelUtilities.getString(1,0,"displaylistitem");
	LoginPage loginpage=new LoginPage(driver);
	DisplayListItemsPage displaylistitemspage =new DisplayListItemsPage(driver);
    loginpage.enterUserNameOnUserNameField(username);
    loginpage.enterPasswordOnPassworldField(password);
    loginpage.clickonSignInButton();
    displaylistitemspage.clickOnTheMenuInDashboard(tile);
    
}

}
