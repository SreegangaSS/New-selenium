package grocery_testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import element_repository.Home_Page;
import element_repository.LoginPage;
import utilities.ExcelCode;

public class LoginTestCase extends BaseClass {
	//to access the driver url using extends keyword
  @Test
  public void verifyLogin() throws IOException {
	  LoginPage lp=new LoginPage(driver);
	  lp.enterUsername(ExcelCode.getStringData(0, 0));
	  lp.enteerPassword(ExcelCode.getStringData(0, 1));
	  lp.loginButton();
	  
	  
	  Home_Page hp=new Home_Page(driver);
	  String expected="admin";
	  String actual=hp.getLoginUser();
	  Assert.assertEquals(expected, actual,Constant.errorMessageForInvalid);
	  
	  
  }
}
