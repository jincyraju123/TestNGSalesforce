package com.testng.tests;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.base.BaseTest;
import com.testng.log.Log;
import com.testng.pages.LoginSalesforcePage;

   public class Loginsalesforcetest extends BaseTest {
	
	WebDriver driver;
	LoginSalesforcePage loginpage;
	
	@BeforeMethod
	public void beforemethod() {
		
		driver=getdriver();
		launchapplication();
		loginpage=new LoginSalesforcePage(driver);  //passing the driver to find element
		
		DOMConfigurator.configure("log4j.xml");
	}
	
	@Test
	public void loginapplicationwithoutpassword() {
		Log.startTestCase("Login");
		loginpage.enterusername("jincy@raju.com");
		loginpage.enterpassword("");
		loginpage.clickloginbutton();
		Log.info("Login failed");
		Log.endTestCase("Login");
	}
	@Test
	public void loginapplication() {
		Log.startTestCase("Login");
		loginpage.enterusername("jincy@raju.com");
		loginpage.enterpassword("welcome123");
		loginpage.clickloginbutton();
		Log.info("Successfully Logged");
		Log.endTestCase("Login");
	}
	@Test
	public void checkrememberme() {
		Log.startTestCase("Login");
		loginpage.enterusername("jincy@raju.com");
		loginpage.enterpassword("welcome123");
		loginpage.remembermecheckbox();
		loginpage.clickloginbutton();
		loginpage.usermenudropdown();
		loginpage.clicklogout();
		loginpage.comparestring();
		Log.info("Username field <username> is displayed");
		Log.endTestCase("Login");
	}
	@Test 
	public void forgotpassword() {
		Log.startTestCase("Login");
		loginpage.forgotpassword();
		loginpage.username("jincy@raju.com");
		loginpage.clickcontinuebutton();
		Log.info("An email sent to the emailaccount");
		Log.endTestCase("Login");
	}
	@Test
	public void invalidusernameandpassword() {
		Log.startTestCase("Login");
		loginpage.enterusername("jincycom");
		loginpage.enterpassword("welcome12345");
		loginpage.clickloginbutton();
		loginpage.compareerrormessage();
		Log.info("Error message is displayed");
		Log.endTestCase("Login");
		
	}
	
	@AfterMethod 
	public void teardown(){
		takesscreenshot(driver,"Salesforce");
		close();
	}
	

}
