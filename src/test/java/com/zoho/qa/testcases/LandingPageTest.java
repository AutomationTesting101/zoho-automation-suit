package com.zoho.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zoho.qa.base.TestBase;
import com.zoho.qa.pages.ContactSalesPage;
import com.zoho.qa.pages.CustomersPage;
import com.zoho.qa.pages.FreeSignUpPage;
import com.zoho.qa.pages.LandingPage;
import com.zoho.qa.pages.HomePage;
import com.zoho.qa.pages.SigninPage;
import com.zoho.qa.pages.SupportPage;
import com.zoho.qa.pages.searchpopup;

public class LandingPageTest extends TestBase{

	
	HomePage homePage;
	LandingPage landingPage;
	CustomersPage customersPage;
	SigninPage signinPage;
	SupportPage supportPage;
	ContactSalesPage contactSalesPage;
	FreeSignUpPage freeSignUpPage;
	searchpopup Searchpopup;

	
	public LandingPageTest(){
	super();
	}
	

	//test cases should be separated -- independent with each other
	//before each test case -- launch the browser and login
	//@test -- execute test case
	//after each test case -- close the browser
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homePage = new HomePage();
		landingPage = new LandingPage();
		customersPage = new CustomersPage();
		signinPage = new SigninPage();
		supportPage = new SupportPage();
		contactSalesPage = new ContactSalesPage();
		freeSignUpPage = new FreeSignUpPage();
		Searchpopup = new searchpopup();

		
	}
	
	
	@Test(priority=1)
	public void verifyLandingPageTitleTest(){
		String LandingPageTitle = landingPage.verifyLandingPageTitle();
		Assert.assertEquals(LandingPageTitle, "Zoho - Cloud Software Suite and SaaS Applications for Businesses","Home page title not matched");
	}
	
	@Test(priority=2)
	public void zohologoTest(){
		boolean flag = landingPage.validatezohologo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void validatesearchLinkTest(){
		Searchpopup  = landingPage.validatesearchLink();
		
	}
	@Test
	public void validateclickonlanguageTest(){
		 landingPage.clickonlanguage();
		
	}
	
	@Test(priority=4)
	public void verifyCustomersLinkTest(){
		customersPage = landingPage.clickOnCustomersLink();
	}
	
	@Test(priority=5)
	public void verifySupportLinkTest(){
		supportPage = landingPage.clickOnSupportLink();
	}
	
	@Test(priority=6)
	public void verifyContactSalesLinkTest(){
		contactSalesPage = landingPage.clickOnContactSalesLink();
	}
	
	@Test(priority=7)
	public void verifySigninLinkTest(){
		signinPage = landingPage.clickOnSigninLink();
	}
	
	@Test(priority=8)
	public void verifyFreeSignUpLinkTest(){
		freeSignUpPage = landingPage.clickOnFreeSignUpLink();
	}
	

		
	@AfterMethod
	public void tearDown(){
		driver.quit();
		}
	
}
