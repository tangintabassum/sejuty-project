package com.dk.browserconf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserConfig {

	// Instance Variable
	public WebDriver dr;

	// Open Browser 
	public WebDriver open() {

		// Checking if the driver is null or not and the purpose of this condition is to
		// not to open two instance of Chrome browser
		if (dr == null) {

			// Set System Property for Chrome Driver
			System.setProperty("webdriver.chrome.driver", "/Users/adnanrahman/Downloads/chromedriver");

			// Initialize a new instance of a Chrome Driver
			dr = new ChromeDriver();
			
			dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			// Returning an instance of a Chrome driver
			return dr;
		}

		return null;
	}

	// Close Browser
	public void close() {

		// Checking if the browser is equal to null or not if its null then we don't need to quit cause 
		// browser is not opened
		if (dr != null)
			dr.quit();
	}
}
