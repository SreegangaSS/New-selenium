package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import elementRepository.Home_Page;
import elementRepository.LoginPage;
import elementRepository.Push_Notification;
import utilities.ExcelCodeUtility;

public class PushNotifications extends BaseClass {
	@Test
	public void verifySendOfPushNotification() throws IOException {
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername(ExcelCodeUtility.getStringData(0, 0));
		lp.enteerPassword(ExcelCodeUtility.getStringData(1, 0));
		lp.loginButton();
		Home_Page hp = new Home_Page(driver);
		hp.clickPushNotification();
		Push_Notification pn = new Push_Notification(driver);
		pn.sendKeysToTitleTextbox("title send");
		pn.sendKeysToDescriptionTextbox("send description");
		pn.clickSendButton();
		boolean actual = pn.verifyPresenceOfSuccessToast();
		boolean expected = true;
		Assert.assertEquals(actual, true, Constant.message);
	}

	@Test(groups = { "smoketest" },retryAnalyzer =listeners.Retry.class)
	public void verifyCssValuesOfSendButtonInPushNotificationPage() throws IOException {
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername(ExcelCodeUtility.getStringData(0, 0));

		lp.enteerPassword(ExcelCodeUtility.getStringData(1, 0));
		lp.loginButton();
		Home_Page hp = new Home_Page(driver);
		hp.clickPushNotification();
		Push_Notification pn = new Push_Notification(driver);
		String actual = pn.getCssValueOfSendButton("background-color");
		String expected = "rgba(23, 162, 184, 1)";
		Assert.assertEquals(actual, expected, Constant.errorMessageForColorOfSendButtonFailed);
		String actual1 = pn.getCssValueOfSendButton("text-align");
		String expected1 = "center";
		Assert.assertEquals(actual1, expected1, Constant.errorMessageForTextAlignOfSendButtonFailed);

	}

	@Test(groups = { "smoketest" })

	public void verifyBorderColorOfSendButtonInPushNotificationPage() throws IOException {
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername(ExcelCodeUtility.getStringData(0, 0));
		lp.enteerPassword(ExcelCodeUtility.getStringData(1, 0));
		lp.loginButton();
		Home_Page hp = new Home_Page(driver);
		hp.clickPushNotification();
		Push_Notification pn = new Push_Notification(driver);
		String actual = pn.getCssValueOfSendButton("border-color");
		String expected = "rgb(23, 162, 184)";
		Assert.assertEquals(actual, expected, Constant.message);

	}

	@Test(groups = { "smoketest" })

	public void verifyAttributeValueOfClassOfSendButtonInPushNotificationPage() throws IOException {
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername(ExcelCodeUtility.getStringData(0, 0));
		lp.enteerPassword(ExcelCodeUtility.getStringData(1, 0));
		lp.loginButton();
		Home_Page hp = new Home_Page(driver);
		hp.clickPushNotification();
		Push_Notification pn = new Push_Notification(driver);
		String actual = pn.getAttributeValueOfSendButton("class");
		String expected = "btn btn-block-sm btn-info";
		Assert.assertEquals(actual, expected, Constant.errorMessageForAttributeValueOfSendButtonFailed);

	}

}


