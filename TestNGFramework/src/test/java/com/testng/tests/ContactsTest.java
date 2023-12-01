package com.testng.tests;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.base.BaseTest;
import com.testng.log.Log;
import com.testng.pages.ContactsPage;
import com.testng.pages.LoginSalesforcePage;

public class ContactsTest extends BaseTest{
	
	WebDriver driver;
	LoginSalesforcePage loginpage;
	ContactsPage contactpage;
	
	
	@BeforeMethod
	public void beforemethod() {
		driver=getdriver();
		launchapplication();
		loginpage=new LoginSalesforcePage(driver);
		contactpage=new ContactsPage(driver);
		DOMConfigurator.configure("log4j.xml");
	}
	@Test
	public void contactsTab() {
		Log.startTestCase("Contacts Tab");
		loginpage.enterusername("jincy@raju.com");
		loginpage.enterpassword("welcome123");
		loginpage.clickloginbutton();
		contactpage.clickContactsTab();
		contactpage.clickNewButton();
		contactpage.enterlastname("Jinu");
		contactpage.enteraccountname("Jincy");
		contactpage.clicksavebutton();
		contactpage.gettitleofthepage();
		Log.info("New contact is created and Contacts page is displayed");
		Log.endTestCase("Contacts Tab");
	}
	@Test
	public void createNewView() {
		Log.startTestCase("Contacts Tab");
		loginpage.enterusername("jincy@raju.com");
		loginpage.enterpassword("welcome123");
		loginpage.clickloginbutton();
		contactpage.clickContactsTab();
		contactpage.clickcreatenewview();
		contactpage.enterViewName("Jincy Jinu");
		contactpage.enterViewUniqueName("JincyJ3");
		contactpage.clicksavebutton();
		contactpage.gettitleofthepage();
		
		Log.info(" Contacts Home page is opened and created view name is displayed");
		Log.endTestCase("Contacts Tab");
	
	}
	@Test
	public void RecentlycreatedContacts() {
		Log.startTestCase("Contacts Tab");
		loginpage.enterusername("jincy@raju.com");
		loginpage.enterpassword("welcome123");
		loginpage.clickloginbutton();
		contactpage.clickContactsTab();
		contactpage.recentlyCreated();
		Log.info(" Recently created contacts is displayed");
		Log.endTestCase("Contacts Tab");
	}
	@Test
	public void MyContacts() {
		Log.startTestCase("Contacts Tab");
		loginpage.enterusername("jincy@raju.com");
		loginpage.enterpassword("welcome123");
		loginpage.clickloginbutton();
		contactpage.clickContactsTab();
		contactpage.dropdownView();
		contactpage.clickgo();
		Log.info(" My contacts view is displayed");
		Log.endTestCase("Contacts Tab");
	}
	@Test
	public void viewAContactinContactPage() {
		Log.startTestCase("Contacts Tab");
		loginpage.enterusername("jincy@raju.com");
		loginpage.enterpassword("welcome123");
		loginpage.clickloginbutton();
		contactpage.clickContactsTab();
		contactpage.clickcontactnameinNamefield();
		contactpage.gettitleofthepage();
		Log.info(" ContactName page is displayed");
		Log.endTestCase("Contacts Tab");
	}
	@Test
	public void createNewviewwithoutViewName() {
		Log.startTestCase("Contacts Tab");
		loginpage.enterusername("jincy@raju.com");
		loginpage.enterpassword("welcome123");
		loginpage.clickloginbutton();
		contactpage.clickContactsTab();
		contactpage.clickcreatenewview();
		contactpage.enterViewUniqueName("EFGH");
		contactpage.clicksavebutton();
		contactpage.compareErrorMessages();
		Log.info(" Error message is displayed");
		Log.endTestCase("Contacts Tab");
	}
	@Test
	public void cancelButtonInCreateNewView() {
		Log.startTestCase("Contacts Tab");
		loginpage.enterusername("jincy@raju.com");
		loginpage.enterpassword("welcome123");
		loginpage.clickloginbutton();
		contactpage.clickContactsTab();
		contactpage.clickcreatenewview();
		contactpage.enterViewName("Jincy Jinu");
		contactpage.enterViewUniqueName("JincyJ5");
		contactpage.clickcancel();
		contactpage.gettitleofthepage();
		Log.info("New view is not created");
		Log.endTestCase("Contacts Tab");
	}
	@Test
	public void saveAndNewButtoninNewContactPage() {
		Log.startTestCase("Contacts Tab");
		loginpage.enterusername("jincy@raju.com");
		loginpage.enterpassword("welcome123");
		loginpage.clickloginbutton();
		contactpage.clickContactsTab();
		contactpage.clickNewButton();
		contactpage.enterLastName("Jinu");
		contactpage.enterAccountName("Jincy Raju");
		contactpage.clicksave$newButton();
		contactpage.NewContactisdisplayed();
		
	}
	
	@AfterMethod 
	public void teardown(){
		takesscreenshot(driver,"Salesforce");
		close();
	}

}
