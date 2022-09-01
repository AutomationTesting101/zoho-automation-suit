package com.zoho.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zoho.qa.base.TestBase;
import com.zoho.qa.pages.ContactSalesPage;
import com.zoho.qa.pages.HomePage;
import com.zoho.qa.pages.LandingPage;
import com.zoho.qa.util.TestUtil;

public class ContactSalesPageTest extends TestBase {
	HomePage homePage;
	LandingPage landingPage;
	ContactSalesPage contactSalesPage;
	TestUtil testUtil;
	public ContactSalesPageTest(){
		super();
		}
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homePage = new HomePage();
		landingPage = new LandingPage();
		contactSalesPage = new ContactSalesPage();
		testUtil = new TestUtil();
		contactSalesPage=landingPage.clickOnContactSalesLink();
	}
	
	@Test(priority=1)
	public void verifypagetextTest(){
		Assert.assertTrue(contactSalesPage.verifypagetext(), "Projects Label missing on the page.");
	}
	
	@Test(priority=2)
	public void containtclickTest(){
		testUtil.pagebottommethod();
		contactSalesPage.containtclick();
	}
	
	@Test(priority=3)
	public void verifypBoxTest(){
		testUtil.pagescrolldownmethod();
		Assert.assertTrue(contactSalesPage.verifypBox(), "Box missing on the page.");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
