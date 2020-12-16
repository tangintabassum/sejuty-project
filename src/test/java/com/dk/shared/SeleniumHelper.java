package com.dk.shared;

import org.openqa.selenium.WebElement;

/*
 * SeleniumHelper.class
 * ====================
 * The purpose of creating this class is to 
 * use all the common functionality so that
 * we don't need to type repeated code 
 * again and again
 */

public class SeleniumHelper {
	
	// Type anything for any input field
	public static void type(WebElement ele, String value) {
		ele.sendKeys(value);
	}
	
	// Click on anything that is intractable in the web browser
	public static void click(WebElement ele) {
		ele.click();
	}
	
	// Get the text of the web element
	public static String getCurrentWebEleText(WebElement ele) {
		return ele.getText();
	}
	
	// Check if the web element is currently displayed or not
	public static boolean isWebElementDisplayed(WebElement ele) {
		return ele.isDisplayed();
	}
}
