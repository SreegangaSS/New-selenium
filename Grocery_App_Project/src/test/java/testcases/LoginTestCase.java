package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import elementRepository.Home_Page;
import elementRepository.LoginPage;
import utilities.ExcelCodeUtility;

public class LoginTestCase extends BaseClass {
	//to access the driver url using extends keyword
	  @Test(groups = {"regression"})
	  public void verifyLogin() throws IOException {
		  LoginPage lp=new LoginPage(driver);
		  lp.enterUsername(ExcelCodeUtility.getStringData(0, 0));
		  lp.enteerPassword(ExcelCodeUtility.getStringData(1, 0));
		  lp.loginButton();
		  
		  
		  Home_Page hp=new Home_Page(driver);
		  String expected="admin";
		  String actual=hp.getLoginUser();
		  Assert.assertEquals(expected, actual,Constant.errorMessageForInvalid);
		  
		  
		  
	  }
	}


