package testScript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManangeDeliveryBoyPage;
import utilities.ExcelUtilities;

public class ManageDeliveryBoyTest extends Base
{
	@Test(retryAnalyzer=retry.Retry.class,description = "verify the deliveryboy is found in manage delivery boy page ")
	public void verifytheDeliveryBoyFoundInDeliveryBoyPage()
	{
	String username=ExcelUtilities.getString(1,0,"loginpage");
	String password=ExcelUtilities.getString(1,1,"loginpage");
	
	String deliveryBoyName=ExcelUtilities.getString(1, 0,"managedeliveryboy");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUserNameOnUserNameField(username);
	loginpage.enterPasswordOnPassworldField(password);
    loginpage.clickonSignInButton();
    
    ManangeDeliveryBoyPage managedeliveryboypage =new ManangeDeliveryBoyPage(driver);
    managedeliveryboypage.clickOnManageDeliveryBoyInfo();
    managedeliveryboypage.clickOnSearchButton();
    managedeliveryboypage. enterDeliveryBoyNameField(deliveryBoyName);
    managedeliveryboypage.clickonSubmitButton();
    boolean isDeliveryBoyDisplayed=managedeliveryboypage.isDeliveryBoySearchResultDisplayed();
    assertTrue(isDeliveryBoyDisplayed,"delivery boy page not found");
    
    
    
}


}
