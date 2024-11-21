package com.qa.saucelab.pages;

import com.microsoft.playwright.Page;

public class LoginPage {
	
	Page page;
	
	private String username = "//input[@id='user-name']";
	private String password = "//input[@id='password']";
	private String loginbutton= "//input[@id='login-button']";
	
	public LoginPage(Page page) {
		this.page = page;
	}
	
	public void sendUsername(String Username) {
		page.fill(username, Username);
	}
	
	public void sendPassword(String Password) {
		page.fill(password, Password);
	}
	
	public void clickLogin() {
		page.click(loginbutton);
	}
	
	
	

}
