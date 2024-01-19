package grocery_testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import element_repository.LoginPage;
import element_repository.ManageOrderPage;

public class ManageTestCase extends BaseClass{
  @Test
  public void verifyLogin() {
	  LoginPage lp=new LoginPage(driver);
	  lp.enterUsername("admin");
	  lp.enteerPassword("admin");
	  lp.loginButton();
	  
	  ManageOrderPage mp=new ManageOrderPage(driver);
	  mp.clickButton();
	  mp.orderButton();
	  String expected="Search";
	  String actual=mp.getLoginSearch();
	  Assert.assertEquals(expected, actual,Constant.messagePassed);
	  
  }
}
