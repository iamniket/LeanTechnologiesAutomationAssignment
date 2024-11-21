package com.qa.saucelab.pages;

import com.microsoft.playwright.Page;

public class CheckoutPage {
	private Page page;
	
	
	private String product1= "//button[@id='add-to-cart-sauce-labs-backpack']";
	private String product2= "//button[@id='add-to-cart-sauce-labs-bike-light']";
	private String product3= "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']";
	private String shoppingcartlink = "//a[@class='shopping_cart_link']";
	private String checkoutbutton= "//button[@id='checkout']";
	private String firstname= "//input[@id='first-name']";
	private String lastname= "//input[@id='last-name']";
	private String zipcode= "//input[@id='postal-code']";
	private String continuebutton="//input[@id='continue']";
	private String finishbutton= "//button[@id='finish']";
	private String successmessage= "//h2[@class='complete-header']";

	public CheckoutPage(Page page) {
		this.page = page;
	}
	
	public void addProductToCart() {
		  // Array of locators
        String[] productLocators = {product1, product2, product3};

        // Loop through locators and click the "Add to Cart" button
        for (String locator : productLocators) {
            page.locator(locator).click();
        }
        System.out.println("All selected products have been added to the cart.");

	}
	
	public void checkoutJourney() {
		page.click(shoppingcartlink);
		page.click(checkoutbutton);
	}
	
	public void personalDetails(String Firstname, String Lastname, String Zipcode) {
		page.fill(firstname, Firstname);
		page.fill(lastname, Lastname);
		page.fill(zipcode, Zipcode);
		page.click(continuebutton);
	}
	
	public String validateOrder() {
		page.click(finishbutton);
		String SuccessMessage = page.textContent(successmessage);
		System.out.println("Product page header: "+ SuccessMessage);
		return SuccessMessage;
			
	}
}
