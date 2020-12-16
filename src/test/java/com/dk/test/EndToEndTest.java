package com.dk.test;


import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import com.dk.applicationSteps.CoreSteps;
import com.dk.browserconf.BrowserConfig;
import com.dk.testdata.TestingData;

public class EndToEndTest {

	WebDriver dr;
	CoreSteps cs;
	BrowserConfig bc;

	@Before
	public void openBrowser() throws InterruptedException {

		bc = new BrowserConfig();
		// This will return a webdriver from the BrowserConfig.java
		// cause we need this in our CoreSteps.java because there is no
		// web driver instance in the CoreSteps
		dr = bc.open();

		// Create a new instance of Core Steps and passing the driver(dr)ß as a
		// constructor parameter
		cs = new CoreSteps(dr);
		Thread.sleep(2000);
	}

	@Test
	public void a_Test() {
		System.out.println("Test One");
		cs.goToASpecificWebsite(TestingData.url);
	}

	@Test
	public void b_Test() throws InterruptedException {
		System.out.println("Test Two");
		cs.goToASpecificWebsite(TestingData.url);
		dr.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test
	public void c_Test() throws InterruptedException {
		System.out.println("Test Three");
		cs.goToASpecificWebsite(TestingData.url);
		dr.manage().window().setSize(new Dimension(800, 800));
		Thread.sleep(3000);
		System.out.println("The title of the current page is : " + dr.getTitle());
	}
	
	@Test
	public void d_Test() throws InterruptedException {
		System.out.println("Test Four");
		cs.goToASpecificWebsite(TestingData.url);
		dr.manage().window().setSize(new Dimension(1024, 800));
		Thread.sleep(2000);
		System.out.println("The current url of the website is: " + dr.getCurrentUrl());
	}
	
	@Test
	public void e_Test() throws InterruptedException {
		System.out.println("Test Five");
		cs.goToASpecificWebsite(TestingData.url);
		dr.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("The page source of the current page is: " + dr.getPageSource());
	}

	@Test
	public void f_Test() throws InterruptedException {
		System.out.println("Test Six");
		cs.goToASpecificWebsite(TestingData.url);
		dr.manage().window().maximize();
		Thread.sleep(2000);

		/*
		 * Validate the title of the webpage
		 */
		String actualTitle = dr.getTitle();
		assertTrue(actualTitle.equals(TestingData.expectedTitle));

		/*
		 * Validate the current url of the webpage
		 */
		String actualUrl = dr.getCurrentUrl();
		assertTrue(actualUrl.equals(TestingData.expectedUrl));
	}

	@After
	public void closeBrowser() {
		bc.close();
	}
}
