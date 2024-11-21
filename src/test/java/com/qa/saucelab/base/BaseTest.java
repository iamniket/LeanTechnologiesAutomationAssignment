package com.qa.saucelab.base;

import java.util.Properties;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.microsoft.playwright.Page;
import com.qa.saucelab.factory.PlaywrighFactory;
import com.qa.saucelab.pages.CheckoutPage;
import com.qa.saucelab.pages.LoginPage;

public class BaseTest {
	PlaywrighFactory pf;
	Page page;
	protected Properties prop;
	protected LoginPage loginpage;
	protected CheckoutPage checkoutpage;
	
	@BeforeTest
	public void setUp() {
		pf = new PlaywrighFactory();
		prop = pf.init_prop();
		page = pf.initBrowser(prop);
		loginpage = new LoginPage(page);

	}
	
	@AfterTest
	public void tearDown() {
		page.context().browser().close();
	}

}
