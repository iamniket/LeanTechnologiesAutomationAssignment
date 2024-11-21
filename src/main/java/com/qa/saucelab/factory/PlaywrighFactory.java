package com.qa.saucelab.factory;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrighFactory {
	
	Playwright playwright;
	Browser browser;
	BrowserContext browserContext;
	Page page;
	
	public Page initBrowser(String browserName) {
		System.out.println("browser name is : " + browserName);
		playwright = Playwright.create();
		
		switch (browserName.toLowerCase()) {
		case "chromium": 
			browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		case "firefox": 
			browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
		case "webkit": 
			browser = playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
		case "chrome": 
			browser = playwright.chromium().launch(new LaunchOptions().setChannel("chrome").setHeadless(false));
		
		default:
			System.out.println("Please pass the right browsername");
			break;
		}
		browserContext = browser.newContext();
		page = browserContext.newPage();
		page.navigate("https://www.saucedemo.com/");
		
		return page;
		
		
		
		
		
	}

}
