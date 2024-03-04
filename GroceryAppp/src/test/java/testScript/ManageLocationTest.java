package testScript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageLocationPage;
import utilities.ExcelUtilities;

public class ManageLocationTest extends Base
{
	@Test(retryAnalyzer=retry.Retry.class,description = "verify whether the user is able to add a new location")
	public void verifyWhetherTheUserIsAbleToAddANewLocation()
	{
		String username=ExcelUtilities.getString(1, 0,"loginpage") ;
		String password=ExcelUtilities.getString(1,1,"loginpage");
		String location=ExcelUtilities.getString(1, 0,"managelocation") ;
		String deliveryCharge=ExcelUtilities.getString(1,1,"managelocation");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(username);
		loginpage.enterPasswordOnPassworldField(password);
	    loginpage.clickonSignInButton();
	  	ManageLocationPage managelocationpage=new ManageLocationPage(driver);
	    managelocationpage.clickOnManageLocationInfo();
	    managelocationpage.clickOnNewButton();
	    managelocationpage.selectCountry();
	    managelocationpage.selectState();
	    managelocationpage.enterTheLocationField(location);
	    managelocationpage.enterTheDeliveryCharge(deliveryCharge);
	    managelocationpage.saveButton();
	 	boolean isnewlocationadded=managelocationpage.alertdisplayed();
	    assertTrue(isnewlocationadded,"delivery boy page not found");
	}
	


}
