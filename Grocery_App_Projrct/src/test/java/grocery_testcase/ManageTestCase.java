package grocery_testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import element_repository.LoginPage;
import element_repository.ManageOrderPage;
import utilities.ExcelUtilities;

public class ManageTestCase extends BaseClass{
  @Test
  public void verifyLogin() throws IOException {
	  LoginPage lp=new LoginPage(driver);
	  lp.enterUsername(ExcelUtilities.getStringData(0, 0));
	  lp.enteerPassword(ExcelUtilities.getStringData(1, 0));
	  lp.loginButton();
	  
	  ManageOrderPage mp=new ManageOrderPage(driver);
	  mp.clickButton();
	  mp.orderButton();
	  String expected="Search";
	  String actual=mp.getLoginSearch();
	  Assert.assertEquals(expected, actual,Constant.messagePassed);
	  
  }
}
