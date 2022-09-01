package com.zoho.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.zoho.qa.base.TestBase;
import com.zoho.qa.pages.CustomersPage;
import com.zoho.qa.pages.HomePage;
import com.zoho.qa.pages.LandingPage;
import com.zoho.qa.pages.SupportPage;
import com.zoho.qa.util.TestUtil;


public class SupportPageTest extends TestBase {
	HomePage homePage;
	LandingPage landingPage;
	CustomersPage customersPage;
	SupportPage supportPage;
	TestUtil testUtil;
	
	String sheetName = "ZohoCRMdata";
	
	public SupportPageTest(){
		super();
		}
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homePage = new HomePage();
		landingPage = new LandingPage();
		customersPage= new CustomersPage();
		supportPage = new 	SupportPage();
		testUtil = new TestUtil();
		supportPage = landingPage.clickOnSupportLink();
		testUtil.switchtonexttab();
		
	}

	@Test(priority=1)
	public void verifysupportlinktextTest(){
		Assert.assertTrue(supportPage.verifytext(), "text is not on the page.");
	}
	
	@Test(priority=2)
	public void clickonproducthelpTest(){
		supportPage.clickonproducthelp();
    }
	
	@Test(priority=3)
	public void clickonsupportplanTest(){
		supportPage.clickonsupportplan();
    }
	
	@Test(priority=4)
	public void clickonsupportserviceTest(){
		supportPage.clickonsupportservice();
    }
	
	@Test(priority=5)
	public void clickonpopulararticalTest(){
		supportPage.clickonpopularartical();
    }
	
	@Test(priority=6)
	public void clickoncontactusTest(){
		supportPage.clickoncontactus();
    }
	
	@Test(priority=7)
	public void clickonTestimonialsTest(){
		supportPage.clickonTestimonials();
    }
	
	@Test(priority=8)
	public void clickonknowlagebasesTest(){
		supportPage.clickonknowlagebase();
		testUtil.pagebottommethod();
    }
	
	@Test(priority=9)
	public void clickoncommunityTest(){
		supportPage.clickoncommunity();
		testUtil.pagebottommethod();
    }
	
	@DataProvider
	public Object[][] gettestData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=10,dataProvider="gettestData",retryAnalyzer = RetryAnalyzer.class)
	public void validatecreatesubmitrequestTest(String ContactName,String ZohoServiceName,String Department,String Region,String ZUIDWithDCInfo,String Email,String Subject){
		try {
			supportPage.clickoncontactus();
			Thread.sleep(1000);
			}
			catch (Exception e) {
	            System.out.println(e);
	        }
		landingPage.clickoncrmsubmitrequest();
		supportPage.createsubmitrequest(ContactName, ZohoServiceName, Department, Region, ZUIDWithDCInfo, Email, Subject);
    }
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
		
	}
	
}	
