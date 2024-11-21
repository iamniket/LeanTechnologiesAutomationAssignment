package com.qa.saucelab.pages;
import com.microsoft.playwright.Page;

public class LoginPage {
	
	private Page page;
	
	private String username = "//input[@id='user-name']";
	private String password = "//input[@id='password']";
	private String loginbutton= "//input[@id='login-button']";
	private String productpageheader = "//span[@class='title']";
	private String productlogo = "//div[@class='app_logo']";
	
	public LoginPage(Page page) {
		this.page = page;
	}
	
	public String getLoginPageTitle()
	{
		String title = page.title();
		System.out.println("Page title: " +title);
		return title;
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
	
	public String validateProductPageHeader() {
		String productPageHeader = page.textContent(productpageheader);
		System.out.println("Product page header: "+ productPageHeader);
		return productPageHeader;
	}
	
	public CheckoutPage validateTheCheckoutPage() {
		boolean isPresent = page.isVisible(loginbutton);
		 if (isPresent) {
             System.out.println("Element is present on the page.");
         } else {
             System.out.println("Element is not present on the page.");
         }
		return new CheckoutPage(page);
	}
	

	
	
	

}
