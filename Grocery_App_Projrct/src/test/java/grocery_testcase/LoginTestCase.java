package grocery_testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import element_repository.Home_Page;
import element_repository.LoginPage;
import utilities.ExcelUtilities;

public class LoginTestCase extends BaseClass {
	//to access the driver url using extends keyword
  @Test(groups = {"regression"})
  public void verifyLogin() throws IOException {
	  LoginPage lp=new LoginPage(driver);
	  lp.enterUsername(ExcelUtilities.getStringData(0, 0));
	  lp.enteerPassword(ExcelUtilities.getStringData(1, 0));
	  lp.loginButton();
	  
	  
	  Home_Page hp=new Home_Page(driver);
	  String expected="admin";
	  String actual=hp.getLoginUser();
	  Assert.assertEquals(expected, actual,Constant.errorMessageForInvalid);
	  
	  
	  
  }
}
