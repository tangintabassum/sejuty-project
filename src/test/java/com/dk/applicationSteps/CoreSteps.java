package com.dk.applicationSteps;

import org.openqa.selenium.WebDriver;

public class CoreSteps {

	WebDriver dr;

	public CoreSteps(WebDriver dr) {
		this.dr = dr;
	}

	public void goToASpecificWebsite(String url) {
		dr.get(url);
	}

}
