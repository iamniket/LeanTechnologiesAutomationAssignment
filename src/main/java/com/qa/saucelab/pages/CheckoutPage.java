package com.qa.saucelab.pages;

import com.microsoft.playwright.Page;

public class CheckoutPage {
	private Page page;
	
	
	private String product1= "//button[@id='add-to-cart-sauce-labs-backpack']";
	private String product2= "//button[@id='add-to-cart-sauce-labs-bike-light']";
	private String product3= "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']";

	public CheckoutPage(Page page) {
		this.page = page;
	}
	
	public void addProductToCart() {
		  // Array of locators
        String[] productLocators = {product1, product2, product3};

        // Loop through locators and click the "Add to Cart" button
        for (String locator : productLocators) {
            page.locator(locator).click();

            // Optional: Wait to ensure the cart updates properly
            page.waitForTimeout(1000); // Wait for 1 second
        }

        // Print a success message
        System.out.println("All selected products have been added to the cart.");

	}
}
