package com.testng.tests;

import java.util.Iterator;
import java.util.Set;

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
  
  @Test(priority=0)
	public void HomeTabFirstNameLastNameLink() {
		Log.startTestCase("Home Tab");
		loginpage.enterusername("jincy@raju.com");
		loginpage.enterpassword("welcome123");
		loginpage.clickloginbutton();
		randompage.clickhomeTab();
		randompage.checkusernamelinkisdisplayed();
		randompage.clickusernamelink();
		randompage.gettitleofthepage();
		randompage.clickusernamedropdown();
		randompage.clickMyProfile();
		randompage.gettitleofthepage();
		Log.info("FirstnameLastname page is same as My Profile Page");
		Log.endTestCase("Home Tab");
		
  }
  @Test(priority=1)
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
		randompage.enterLastName("Raju");
		randompage.clicksaveAll();
		
		randompage.gettitleofthepage();
		Log.info("LastName updated");
		Log.endTestCase("Home Tab");
  }
  @Test(priority=2)
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
  @Test(priority=3)
	public void verificationofTabbar() {
		Log.startTestCase("Tab Customization");
		loginpage.enterusername("jincy@raju.com");
		loginpage.enterpassword("welcome123");
		loginpage.clickloginbutton();
		randompage.displaytabsPresentinTabbar();
		Log.info(" Verified Selected tab removed from tab bar");
		Log.endTestCase("Tab Customization");
		
  }
  @Test(priority=4)
	public void AddingEventInTheCalender() {
		Log.startTestCase("Event adding");
		loginpage.enterusername("jincy@raju.com");
		loginpage.enterpassword("welcome123");
		loginpage.clickloginbutton();
		randompage.clickhomeTab();
		randompage.clickDateLink();
		randompage.clickEightPMLink();
		randompage.clickSubjectComboIcon();
		Set<String>handles=driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		String parentwindowhandle=it.next();
		System.out.println(parentwindowhandle);
		String childwindowhandle=it.next();
		System.out.println(childwindowhandle);
		
		driver.switchTo().window(childwindowhandle);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		randompage.clickOther();
		driver.switchTo().window(parentwindowhandle);
		randompage.endTimeField();
		randompage.clickNinePM();
		randompage.clicksave();
		randompage.gettitleofthepage();
		randompage.CheckeventIsDisplayed();
		Log.info("Event added in the calender");
		Log.endTestCase("Event adding");
		
		}
  @Test(priority=5)
	public void EventInTheCalenderWithWeeklyRecurrence() {
		Log.startTestCase("Event in the calender with weekly Recurrence");
		loginpage.enterusername("jincy@raju.com");
		loginpage.enterpassword("welcome123");
		loginpage.clickloginbutton();
		randompage.clickhomeTab();
		randompage.clickDateLink();
		randompage.clickFourPMLink();
		randompage.clickSubjectComboIcon();
		Set<String>handles=driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		String parentwindowhandle=it.next();
		System.out.println(parentwindowhandle);
		String childwindowhandle=it.next();
		System.out.println(childwindowhandle);
		
		driver.switchTo().window(childwindowhandle);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		randompage.clickOther();
		driver.switchTo().window(parentwindowhandle);
		randompage.endTimeField();
		randompage.clickEnddate7Pm();
		randompage.clickrecurrence();
		randompage.clickWeeklyRadioButton();
		randompage.checkRecursEvery();
		randompage.recurrenceEndDate();
		randompage.clickOnsave();
		randompage.gettitleofthepage();
		randompage.checkotherEventDisplayedInTimeslot();
		randompage.clickMonthView();
		randompage.gettitleofthepage();;
		Log.info("Event added in the calender with weekly recurrence");
		Log.endTestCase("Event in the calender with weekly Recurrence");
		}
  
  @AfterMethod
  public void teardown() {
	 
	  takesscreenshot(driver, "Salesforce");
	  close();
  }
}
