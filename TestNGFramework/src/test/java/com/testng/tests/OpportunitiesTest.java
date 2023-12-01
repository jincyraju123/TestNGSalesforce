package com.testng.tests;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.base.BaseTest;
import com.testng.log.Log;

import com.testng.pages.LoginSalesforcePage;
import com.testng.pages.OpportunitiesPage;

public class OpportunitiesTest extends BaseTest {

	WebDriver driver;

	LoginSalesforcePage loginpage;
	OpportunitiesPage opportunitiespage;

	@BeforeMethod
	public void beforemethod() {

		driver = getdriver();
		launchapplication();

		loginpage = new LoginSalesforcePage(driver);
		opportunitiespage = new OpportunitiesPage(driver);
		DOMConfigurator.configure("log4j.xml");
	}

	@Test
	public void opportunitiesdropdown() {
		Log.startTestCase("OpportunitiesTab");
		loginpage.enterusername("jincy@raju.com");
		loginpage.enterpassword("welcome123");
		loginpage.clickloginbutton();
		opportunitiespage.opportunitiesDropdown();
		Log.info("opportunities view dropdown items are present");
		Log.endTestCase("opportunitiesTab");

	}

	@Test
	public void createNewopportunity() {
		Log.startTestCase("OpportunitiesTab");
		loginpage.enterusername("jincy@raju.com");
		loginpage.enterpassword("welcome123");
		loginpage.clickloginbutton();
		opportunitiespage.createnewopportunity();
		Log.info("New opportunity page is displayed");
		Log.endTestCase("opportunitiesTab");
	}

	@Test
	public void opportunityPipelineReport() {
		Log.startTestCase("OpportunitiesTab");
		loginpage.enterusername("jincy@raju.com");
		loginpage.enterpassword("welcome123");
		loginpage.clickloginbutton();
		opportunitiespage.opportunityPipeline();
		Log.info("Report page with pipelined opportunities is displayed");
		Log.endTestCase("opportunitiesTab");
	}

	@Test
	public void StuckopportunityReport() {
		Log.startTestCase("OpportunitiesTab");
		loginpage.enterusername("jincy@raju.com");
		loginpage.enterpassword("welcome123");
		loginpage.clickloginbutton();
		opportunitiespage.stuckopportunity();
		Log.info("Report page with stuck opportunities is displayed");
		Log.endTestCase("opportunitiesTab");
	}

	@Test
	public void QuarterlysummaryReport() {
		Log.startTestCase("OpportunitiesTab");
		loginpage.enterusername("jincy@raju.com");
		loginpage.enterpassword("welcome123");
		loginpage.clickloginbutton();
		opportunitiespage.quarterlysummary();
		Log.info("Report page with  selected opportunities is displayed");
		Log.endTestCase("opportunitiesTab");
	}

	@AfterMethod
	public void teardown() {
		takesscreenshot(driver, "Salesforce");
		close();
	}

}
