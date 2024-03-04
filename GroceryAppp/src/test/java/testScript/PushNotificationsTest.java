package testScript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.PushNotificationsPage;
import utilities.ExcelUtilities;

public class PushNotificationsTest extends Base
{
	@Test(retryAnalyzer=retry.Retry.class,description = "verify whether the user is able to push notification")
	public void verifyWhetherTheUserIsAbleToPushNotification()
	{
		String username= ExcelUtilities.getString(1,0,"loginpage");
	    String password=ExcelUtilities.getString(1,1,"loginpage");
	    String title= ExcelUtilities.getString(1,0,"pushnotification");
	    String description=ExcelUtilities.getString(1,1,"pushnotification");
		

		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(username);
		loginpage.enterPasswordOnPassworldField(password);
	    loginpage.clickonSignInButton();
	    
	    PushNotificationsPage  pushnotificationspage =new PushNotificationsPage (driver);
	    pushnotificationspage.pushNotificationInfo();
	    pushnotificationspage.pushNotificationTitle(title);
	    pushnotificationspage.pushNotificationDescription(description);
	    pushnotificationspage.pushNotificationSendButton();
	     boolean pushalert=pushnotificationspage .ispushNotificationDisplayed();
	     assertTrue(pushalert,"unable to send the push notification");
    }
}


