package com.testng.tests;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.base.BaseTest;
import com.testng.log.Log;
import com.testng.pages.LeadsPage;
import com.testng.pages.LoginSalesforcePage;

public class LeadsTest extends BaseTest{
	WebDriver driver;
	LeadsPage leadpage;
	LoginSalesforcePage loginpage;
	
	
	@BeforeMethod
	public void beforemethod() {
		driver=getdriver();
		launchapplication();
		loginpage=new LoginSalesforcePage(driver);
		leadpage=new LeadsPage(driver);
		DOMConfigurator.configure("log4j.xml");
	}
	@Test(priority = 0)
	public void Leadstab() {
		Log.startTestCase("LeadsTab");
		loginpage.enterusername("jincy@raju.com");
		loginpage.enterpassword("welcome123");
		loginpage.clickloginbutton();
		leadpage.leadstab();
		Log.info("Leads home page is displayed");
		Log.endTestCase("LeadsTab");
	}
	@Test(priority = 1)
	public void Leadsview() {
		Log.startTestCase("LeadsTab");
		loginpage.enterusername("jincy@raju.com");
		loginpage.enterpassword("welcome123");
		loginpage.clickloginbutton();
		leadpage.leadstab();
		leadpage.leadsviewdropdown();
		Log.info("Leads view dropdown items are present");
		Log.endTestCase("LeadsTab");
	}
	@Test(priority=2)
	public void Leadsselectview() {
		Log.startTestCase("LeadsTab");
		loginpage.enterusername("jincy@raju.com");
		loginpage.enterpassword("welcome123");
		loginpage.clickloginbutton();
		leadpage.leadstab();
		leadpage.leadsdefaultview();
		Log.info("Testcase passed");
		Log.endTestCase("LeadsTab");
		}
		@Test(priority=3)
	public void Leadsdefaultview() {
		Log.startTestCase("LeadsTab");
		loginpage.enterusername("jincy@raju.com");
		loginpage.enterpassword("welcome123");
		loginpage.clickloginbutton();
		leadpage.leadstab();
		leadpage.logindefaultview();
		Log.info("Leads default view is displayed");
		Log.endTestCase("LeadsTab");
		}
		@Test(priority = 4)
	public void todaysLeadPage() {
			Log.startTestCase("LeadsTab");
			loginpage.enterusername("jincy@raju.com");
			loginpage.enterpassword("welcome123");
			loginpage.clickloginbutton();
			leadpage.leadstab();
			leadpage.Todaysleadpage();
			Log.info("Today's Lead page is displayed");
			Log.endTestCase("LeadsTab");
			}
	@Test(priority = 5)
	public void NewLeadViewPage() {
		Log.startTestCase("LeadsTab");
		loginpage.enterusername("jincy@raju.com");
		loginpage.enterpassword("welcome123");
		loginpage.clickloginbutton();
		leadpage.leadstab();
		leadpage.leadsNew();
		Log.info("New Lead View page is displayed");
		Log.endTestCase("LeadsTab");
		}
		
	
	@AfterMethod 
	public void teardown(){
		takesscreenshot(driver,"Salesforce");
		close();
	}

}
