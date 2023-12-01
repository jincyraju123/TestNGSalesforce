package com.testng.tests;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.base.BaseTest;
import com.testng.log.Log;
import com.testng.pages.LoginSalesforcePage;
import com.testng.pages.RandomScenariosPage;

public class RandomScenariosTest extends BaseTest {
	
	WebDriver driver;
	LoginSalesforcePage loginpage;
	RandomScenariosPage randompage;
	
  @BeforeMethod
  
  public void beforeMethod() {
	  driver=getdriver();
	  launchapplication();
	  loginpage=new LoginSalesforcePage(driver);
	  randompage=new RandomScenariosPage(driver);
	  DOMConfigurator.configure("log4j.xml");
  }
  
  /*@Test
	public void HomeTabFirstNameLastNameLink() {
		Log.startTestCase("Home Tab");
		loginpage.enterusername("jincy@raju.com");
		loginpage.enterpassword("welcome123");
		loginpage.clickloginbutton();
		randompage.clickhomeTab();
		randompage.checkusernamelinkisdisplayed();
		randompage.clickusernamelink();
		randompage.checkmyProfilePageisdisplayed();
		randompage.clickusernamedropdown();
		randompage.clickMyProfile();
		randompage.checkmyProfilePageisdisplayed();
		Log.info("FirstnameLastname page is same as My Profile Page");
		Log.endTestCase("Home Tab");
		
  }
  @Test
	public void HomeTabEditLastName() {
		Log.startTestCase("Home Tab");
		loginpage.enterusername("jincy@raju.com");
		loginpage.enterpassword("welcome123");
		loginpage.clickloginbutton();
		randompage.clickhomeTab();
		randompage.clickfirstNameLastnameLink();
		randompage.clickeditprofilebutton();
		randompage.switchtoframe();
		randompage.clickAboutTab();
		randompage.enterLastName("Jinu");
		randompage.clicksaveAll();
		
		//randompage.verifyUsermenuName();
		randompage.gettitleofthepage();
		Log.info("LastName updated");
		Log.endTestCase("Home Tab");
  }*/
  @Test
	public void TabCustomization() {
		Log.startTestCase("Tab Customization");
		loginpage.enterusername("jincy@raju.com");
		loginpage.enterpassword("welcome123");
		loginpage.clickloginbutton();
		randompage.clickalltabplusbutton();
		randompage.clickCustomizeMyTabs();
		randompage.selectAnyTabFromSelectedTabs();
		randompage.clickRemove();
		randompage.clicksave();
		randompage.clickusernamedropdown();
		randompage.clickLogout();
		Log.info("Selected tab removed from tab bar");
		Log.endTestCase("Tab Customization");
		
  }
  @Test
	public void verificationofTabbar() {
		Log.startTestCase("Tab Customization");
		loginpage.enterusername("jincy@raju.com");
		loginpage.enterpassword("welcome123");
		loginpage.clickloginbutton();
		randompage.displaytabsPresentinTabbar();
		Log.info(" Verified Selected tab removed from tab bar");
		Log.endTestCase("Tab Customization");
		
  }
  @AfterMethod
  public void teardown() {
	 
	  takesscreenshot(driver, "Salesforce");
	  close();
  }
}
