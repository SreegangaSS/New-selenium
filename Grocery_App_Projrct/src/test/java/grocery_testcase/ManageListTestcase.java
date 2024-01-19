package grocery_testcase;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import element_repository.LoginPage;
import element_repository.ManageSearch;
import element_repository.MnageListPage;
import element_repository.ManageOrderPage;

public class ManageListTestcase extends BaseClass {
	
  @Test
  public void verifyOrderSearch() {
	  LoginPage lp=new LoginPage(driver);
	  lp.enterUsername("admin");
	  lp.enteerPassword("admin");
	  lp.loginButton();
	  
	  ManageOrderPage mp=new ManageOrderPage(driver);
	  mp.clickButton();
	  MnageListPage mlp=new MnageListPage(driver);
	  mlp.clickSerachButtonManage();
	  
	  ManageSearch ml=new ManageSearch(driver);
	  ml.enterOrderId("708");
	  ml.clickSearch();
	  String actual=ml.getPayment();
	  String expected="Bank";
	  Assert.assertEquals(actual, expected,Constant.errorMessageForInvalid);
	  
  }
}
