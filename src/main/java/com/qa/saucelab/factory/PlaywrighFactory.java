package com.qa.saucelab.factory;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
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
	Properties prop;
	
	
	public Page initBrowser(Properties prop) {
		String browserName= prop.getProperty("broswer");
		System.out.println("browser name is : " + browserName);
		playwright = Playwright.create();
		
		switch (browserName.toLowerCase()) {
		case "chromium": 
			browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
			break;
		case "firefox": 
			browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
			break;
		case "webkit": 
			browser = playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
			break;
		case "chrome": 
			browser = playwright.chromium().launch(new LaunchOptions().setChannel("chrome").setHeadless(false));
			break;
		
		default:
			System.out.println("Please pass the right browsername");
			break;
		}
		browserContext = browser.newContext();
		page = browserContext.newPage();
		page.navigate(prop.getProperty("url"));
		
		return page;
		
	}
	
	//Method to read the properties file
	public Properties init_prop() {
	try {
		FileInputStream ip = new FileInputStream("./src/test/resources/config/config.properties");
		prop = new Properties();
		prop.load(ip);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	return prop;
	
	}
	
}

