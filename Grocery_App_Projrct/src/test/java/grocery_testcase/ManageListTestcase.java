package grocery_testcase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import element_repository.LoginPage;
import element_repository.ManageSearch;
import element_repository.MnageListPage;
import utilities.ExcelUtilities;
import element_repository.ManageOrderPage;

public class ManageListTestcase extends BaseClass {
	
  @Test
  public void verifyOrderSearch() throws IOException {
	  LoginPage lp=new LoginPage(driver);
	  lp.enterUsername(ExcelUtilities.getStringData(0, 0));
	  lp.enteerPassword(ExcelUtilities.getStringData(0, 1));
	  lp.loginButton();
	  
	  ManageOrderPage mp=new ManageOrderPage(driver);
	  mp.clickButton();
	  MnageListPage mlp=new MnageListPage(driver);
	  mlp.clickSerachButtonManage();
	  
	  ManageSearch ml=new ManageSearch(driver);
	  ml.enterOrderId(ExcelUtilities.getStringData(3, 0));
	  ml.clickSearch();
	  String actual=ml.getPayment();
	  String expected=ExcelUtilities.getStringData(4, 0);
	  Assert.assertEquals(actual, expected,Constant.errorMessageForInvalid);
	  
  }
}
