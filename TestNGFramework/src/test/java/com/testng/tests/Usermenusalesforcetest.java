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
import com.testng.pages.usermenusalesforcePage;

   public class Usermenusalesforcetest extends BaseTest {
	
	WebDriver driver;
    usermenusalesforcePage usermenupage;
    LoginSalesforcePage loginpage;
	
	@BeforeMethod
	public void beforemethod() {
		
		driver=getdriver();
		launchapplication();
		usermenupage=new usermenusalesforcePage(driver);
		loginpage=new LoginSalesforcePage(driver);
		DOMConfigurator.configure("log4j.xml");
		
	}
	
	@Test
	public void usermenudropdown() {
		Log.startTestCase("Usermenu");
		loginpage.enterusername("jincy@raju.com");
		loginpage.enterpassword("welcome123");
		loginpage.clickloginbutton();
		usermenupage.clickusermenudropdown();
		Log.info("Usermenu dropdown items are present");
		Log.endTestCase("Usermenu");
	}
	@Test
	public void usermenudropdownMyProfile() {
		Log.startTestCase("UsermenuMyProfile");
		loginpage.enterusername("jincy@raju.com");
		loginpage.enterpassword("welcome123");
		loginpage.clickloginbutton();
		usermenupage.clickusermenudropdown();
		usermenupage.usermenuMyProfile();
		Log.info("My Profile Testcases Passed");
		Log.endTestCase("UsermenuMyProfile");
	}
	
	@Test
	public void usermenuMySettingsPersonal() {
		Log.startTestCase("UsermenuMySettings");
		loginpage.enterusername("jincy@raju.com");
		loginpage.enterpassword("welcome123");
		loginpage.clickloginbutton();
		usermenupage.clickusermenudropdown();
		usermenupage.usermenuMySettingsPersonal();
		Log.info("My Settings Personal Testcases Passed");
		Log.endTestCase("UsermenuMySettings");
	}
	@Test
	public void usermenuMySettingsdisplayandlayout() {
		Log.startTestCase("UsermenuMySettings");
		loginpage.enterusername("jincy@raju.com");
		loginpage.enterpassword("welcome123");
		loginpage.clickloginbutton();
		usermenupage.clickusermenudropdown();
		usermenupage.usermenuMySettingsdisplayandlayout();
		Log.info("My Settings Display and Layout Testcases Passed");
		Log.endTestCase("UsermenuMySettings");
	}
	@Test
	public void usermenuMySettingsEmail() {
		Log.startTestCase("UsermenuMySettings");
		loginpage.enterusername("jincy@raju.com");
		loginpage.enterpassword("welcome123");
		loginpage.clickloginbutton();
		usermenupage.clickusermenudropdown();
		usermenupage.usermenuMySettingsEmail();
		Log.info("My Settings Email Testcases Passed");
		Log.endTestCase("UsermenuMySettings");
	}
	@Test
	public void usermenuMySettingsCalenderandremainders() {
		Log.startTestCase("UsermenuMySettings");
		loginpage.enterusername("jincy@raju.com");
		loginpage.enterpassword("welcome123");
		loginpage.clickloginbutton();
		usermenupage.clickusermenudropdown();
		usermenupage.usermenuMySettingsCalenderandremainders();
		 
		  Set<String>handles=driver.getWindowHandles();
			
			Iterator<String> it = handles.iterator();
			
			String parentwindowhandle=it.next();
			System.out.println("Parent window id  "+parentwindowhandle);
			
			String childwindowhandle=it.next();
			System.out.println("Child window id  "+childwindowhandle);
			
			driver.switchTo().window(childwindowhandle);
			
			String childwindowtitle=driver.getTitle();
			System.out.println("Title of the child window is  "+childwindowtitle);
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		
	       driver.close();
			
			driver.switchTo().window(parentwindowhandle);
			
		Log.info("My Settings Calender and Remainders Testcases Passed");
		Log.endTestCase("UsermenuMySettings");
		
	}
	@Test
	public void usermenudropdownDeveloperConsole() {
		Log.startTestCase("UsermenuDeveloperConsole");
		loginpage.enterusername("jincy@raju.com");
		loginpage.enterpassword("welcome123");
		loginpage.clickloginbutton();
		usermenupage.clickusermenudropdown();
		usermenupage.usermenuDeveloperConsole();
		 
		  Set<String>handles=driver.getWindowHandles();
			
			Iterator<String> it = handles.iterator();
			
			String parentwindowhandle=it.next();
			System.out.println("Parent window id  "+parentwindowhandle);
			
			String childwindowhandle=it.next();
			System.out.println("Child window id  "+childwindowhandle);
			
			driver.switchTo().window(childwindowhandle);
			
			String childwindowtitle=driver.getTitle();
			System.out.println("Title of the child window is  "+childwindowtitle);
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		
	       driver.close();
			
			driver.switchTo().window(parentwindowhandle);
			
		Log.info("Developer Console Testcases Passed");
		Log.endTestCase("UsermenuDeveloperConsole");
	}
	@Test
	public void usermenudropdownLogout() {
		Log.startTestCase("UsermenuLogout");
		loginpage.enterusername("jincy@raju.com");
		loginpage.enterpassword("welcome123");
		loginpage.clickloginbutton();
		usermenupage.clickusermenudropdown();
		usermenupage.usermenuLogout();
		Log.info("Successfully loggedout");
		Log.endTestCase("UsermenuLogout");
	}
	
	@AfterMethod 
	public void teardown(){
		takesscreenshot(driver,"Salesforce");
		close();
	}

}
