package com.qa.saucelab.tests;

import org.testng.annotations.BeforeTest;

import com.qa.saucelab.factory.PlaywrighFactory;

public class LoginPageTest {
	
	PlaywrighFactory pf;
	
	@BeforeTest
	public void setUp() {
		pf = new PlaywrighFactory();
		pf.initBrowser("chromium");
		
	}

}
