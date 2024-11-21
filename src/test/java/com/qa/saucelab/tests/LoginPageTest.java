package com.qa.saucelab.tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.qa.saucelab.base.BaseTest;
public class LoginPageTest extends BaseTest{


	@Test
	public void verifyLoginTitle() {
		String actualTitle = loginpage.getLoginPageTitle();
		Assert.assertEquals(actualTitle, prop.getProperty("logintitle"));
	}

	@Test
	public void doLogin() {
		loginpage.sendUsername(prop.getProperty("username"));
		loginpage.sendPassword(prop.getProperty("password"));
		loginpage.clickLogin();
	}
	
	@Test
	public void validateProductPageHeader() {
		String actualProductPageHeader = loginpage.validateProductPageHeader();
		Assert.assertEquals(actualProductPageHeader, "Products");
	}

	
}
