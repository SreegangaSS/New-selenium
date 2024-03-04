package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import elementRepository.LoginPage;
import elementRepository.ManageOrderPage;
import elementRepository.ManageSearch;
import elementRepository.MnagePageList;
import utilities.ExcelCodeUtility;

public class MangeListTestCase extends BaseClass {
	@Test
	  public void verifyOrderSearch() throws IOException {
		  LoginPage lp=new LoginPage(driver);
		  lp.enterUsername(ExcelCodeUtility.getStringData(0, 0));
		  lp.enteerPassword(ExcelCodeUtility.getStringData(0, 1));
		  lp.loginButton();
		  
		  ManageOrderPage mp=new ManageOrderPage(driver);
		  mp.clickButton();
		  MnagePageList mlp=new MnagePageList(driver);
		  mlp.clickSerachButtonManage();
		  
		  ManageSearch ml=new ManageSearch(driver);
		  ml.enterOrderId(ExcelCodeUtility.getStringData(3, 0));
		  ml.clickSearch();
		  String actual=ml.getPayment();
		  String expected=ExcelCodeUtility.getStringData(4, 0);
		  Assert.assertEquals(actual, expected,Constant.errorMessageForInvalid);
		  
	  }
	}


