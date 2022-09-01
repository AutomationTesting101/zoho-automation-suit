package com.zoho.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zoho.qa.base.TestBase;
import com.zoho.qa.pages.CustomersPage;
import com.zoho.qa.pages.HomePage;
import com.zoho.qa.pages.LandingPage;
import com.zoho.qa.util.TestUtil;

public class CustomersPageTest extends TestBase {

	HomePage homePage;
	LandingPage landingPage;
	CustomersPage customersPage;
	TestUtil testutil;

	public CustomersPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		homePage = new HomePage();
		landingPage = new LandingPage();
		customersPage = new CustomersPage();
		testutil = new TestUtil();
		customersPage = landingPage.clickOnCustomersLink();
		testutil.pagescrolldownmethod();
	}

	@Test(priority = 1)
	public void verifyProjectsLabelTest() {
		Assert.assertTrue(customersPage.verifypageimage(), "image missing on the page.");
	}

	@Test(priority = 2)
	public void selectProjectstablTest() {
		// testutil.switchtoframe();
		customersPage.selecttabByName("Automobile");
		customersPage.selecttabByName("Creator");
		customersPage.selecttabByName("India");
		customersPage.clearall();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
