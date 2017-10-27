package com.bank.tests;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjects.EnrollPO;
import PageObjects.HomePagePO;

public class HomePageIT extends BaseIT {
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();

	public static final String USERNAME = "YOUR_USERNAME";
	public static final String ACCESS_KEY = "5eff05a3-a91a-41aa-90ff-0a54533fe9ba";
	public static final String SELENIUM_GRID = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";

	@BeforeClass(alwaysRun = true)
	public void SetUp() throws Exception {
		driver = new RemoteWebDriver(new URL(SELENIUM_GRID), DesiredCapabilities.chrome());
		baseUrl = "https://www.wellsfargo.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void testWellsFargo() throws Exception {
		// preconditions
		driver.get(baseUrl);
		HomePagePO home = new HomePagePO(driver);
		home.enrollLink.click();
		
		EnrollPO enroll = new EnrollPO(driver);
		enroll.continueButton.click();
		enroll.homeLink.click();		
		enroll.exitButton.click();
	    enroll.wellsFargologo.click();
		System.out.println("Logo link is clicked");
		this.screenshot(driver,"home", "home_link.png");
	}
	
		@AfterMethod
		@AfterClass(alwaysRun = true)
		public void tearDown() throws Exception {
			driver.quit();
			String verificationErrorString = verificationErrors.toString();
			if (!"".equals(verificationErrorString)) {
				Assert.fail(verificationErrorString);
			}
		}
}
