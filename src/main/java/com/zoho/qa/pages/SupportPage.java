package com.zoho.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoho.qa.base.TestBase;

public class SupportPage extends TestBase{


	@FindBy(className = "Header__welcomeTitle")
	WebElement linktext;
	
	@FindBy(xpath = "//a[contains(text(),'Product Help')]")
	WebElement producthelp;
	
	@FindBy(xpath = "//a[normalize-space()='Support Plans']")
	WebElement supportplan;
	
	@FindBy(xpath = "//a[contains(text(),'Support Services ')]")
	WebElement supportservice;
	
	@FindBy(xpath = "//a[contains(text(),'Popular Articles ')]")
	WebElement popularartical;
	
	@FindBy(xpath = "//a[@href='#contactus']")
	WebElement contactus;
	
	@FindBy(xpath = "//a[normalize-space()='Testimonials']")
	WebElement Testimonials;
	
	@FindBy(xpath = "//a[@id='Solutions_tab']")
	WebElement knowlagebase;
	
	@FindBy(xpath = "//li[@id='portal_tabCommunity']//a[@id='Community_tab']")
	WebElement community;
	
	@FindBy(xpath = "//input[@id='contactId']")
	WebElement ContactName;
	
	@FindBy(xpath = "//input[@id='cf_issue_description']")
	WebElement dcinfo;
    
	@FindBy(xpath = "//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@id='subject']")
	WebElement subject;
	
	@FindBy(xpath = "//span[@class='Button__primary Button__basic commonStyle__inlineBlock commonStyle__cursor commonStyle__overflowDotted Button__btnmedium']")
	WebElement submit;


	
	// Initializing the Page Objects:
				public SupportPage() {
					PageFactory.initElements(driver, this);
				}
	
		public boolean verifytext(){
					return linktext.isDisplayed();
				}
		

		public void clickonproducthelp(){
					 producthelp.click();
				}
		
		public void clickonsupportplan(){
			supportplan.click();
		}
		
		public void clickonsupportservice(){
			supportservice.click();
		}
		
		public void clickonpopularartical(){
			popularartical.click();
		}
		
		public void clickoncontactus(){
			contactus.click();
		}
		
		public void clickonknowlagebase(){
			knowlagebase.click();
		}
		
		public void clickonTestimonials(){
			Testimonials.click();
		}
		
		public void clickoncommunity(){
			community.click();
		}
		
		public void createsubmitrequest(String CName,String ZName,String Dept,String rjn,String info,String mail,String sbt) {
			ContactName.sendKeys("CName");
			//
			driver.findElement(By.xpath("//div[contains(text(),'ZOHO CRM')]")).click();
			List<WebElement> list1 = driver.findElements(By.xpath("//*[@id=\"field_cf_zoho_service_name\"]/div/div/ul/li"));
			for (int i = 0; i < list1.size(); i++) {
				if (list1.get(i).getText().equals("ZName")) {
					list1.get(i).click();
					break;
				     }
				}
				//
				driver.findElement(By.xpath("//div[contains(text(),'Zoho CRM')]")).click();
				List<WebElement> list2 = driver.findElements(By.xpath("//*[@id=\"field_departmentId\"]/div/div/div/ul/li"));
				for (int j = 0; j < list2.size(); j++) {
					if (list2.get(j).getText().equals("Dept")) {
						list2.get(j).click();
						break;
					}
		         }
				//
				driver.findElement(By.xpath("//div[contains(@data-id,'field_Region_-None-')]")).click();
				List<WebElement> list3 = driver.findElements(By.xpath("//*[@id=\"field_cf_region\"]/div/div/ul/li"));
				for (int k = 0; k < list3.size(); k++) {
					if (list3.get(k).getText().equals("rjn")) {
						list3.get(k).click();
						break;
					}
				}
				//
				dcinfo.sendKeys("info");
				email.sendKeys("mail");
				subject.sendKeys("sbt");
				submit.click();
				
			}
		
		
		
		
		
		
		
		
		
		
}
