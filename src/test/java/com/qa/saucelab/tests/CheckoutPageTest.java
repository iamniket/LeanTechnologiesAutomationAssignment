package com.qa.saucelab.tests;

import org.testng.annotations.Test;

import com.qa.saucelab.base.BaseTest;

public class CheckoutPageTest extends BaseTest{
	
	@Test (priority = 1)
	public void doLogin() {
		loginpage.sendUsername(prop.getProperty("username"));
		loginpage.sendPassword(prop.getProperty("password"));
		loginpage.clickLogin();
	}
	
	@Test (priority = 2)
	public void clickAddToCart() {
		checkoutpage.addProductToCart();
	}

}
