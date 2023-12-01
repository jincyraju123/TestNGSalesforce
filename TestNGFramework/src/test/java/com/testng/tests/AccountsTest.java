package com.testng.tests;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.base.BaseTest;
import com.testng.log.Log;
import com.testng.pages.AccountsPage;
import com.testng.pages.LoginSalesforcePage;


public class AccountsTest extends BaseTest{
	
	  WebDriver driver;
	
	 LoginSalesforcePage loginpage;
	 AccountsPage accountpage;
	
	@BeforeMethod
	public void beforemethod() {
		
		driver=getdriver();
		launchapplication();
		
		loginpage=new LoginSalesforcePage(driver);
	    accountpage=new AccountsPage(driver);
	    DOMConfigurator.configure("log4j.xml");
	}
	@Test
	public void createanaccount() {
		Log.startTestCase("AccountsTab");
		loginpage.enterusername("jincy@raju.com");
		loginpage.enterpassword("welcome123");
		loginpage.clickloginbutton();
		accountpage.createnewAccount();
		Log.info("New account page is displayed with account details");
		Log.endTestCase("AccountsTab");
	}
	@Test
	public void createnewview() {
		Log.startTestCase("AccountsTab");
		loginpage.enterusername("jincy@raju.com");
		loginpage.enterpassword("welcome123");
		loginpage.clickloginbutton();
		accountpage.createNewView();
		Log.info("New View is displayed in the account view list");
		Log.endTestCase("AccountsTab");
		}
	@Test
	public void Editview() {
		Log.startTestCase("AccountsTab");
		loginpage.enterusername("jincy@raju.com");
		loginpage.enterpassword("welcome123");
		loginpage.clickloginbutton();
		accountpage.editview();
		Log.info("Edit View testcases passed");
		Log.endTestCase("AccountsTab");
		
	}
	@Test
	public void createAccountReport() {
		Log.startTestCase("AccountsTab");
		loginpage.enterusername("jincy@raju.com");
		loginpage.enterpassword("welcome123");
		loginpage.clickloginbutton();
		accountpage.createaccountreport();
		Log.info("Report page with name and details displayed");
		Log.endTestCase("AccountsTab");
		
		}
	@Test
	public void mergeAccounts() {
		Log.startTestCase("AccountsTab");
		loginpage.enterusername("jincy@raju.com");
		loginpage.enterpassword("welcome123");
		loginpage.clickloginbutton();
		accountpage.mergeAccounts();
		Log.info("The accounts are merged");
		Log.endTestCase("AccountsTab");
		}
		
	
	@AfterMethod 
	public void teardown(){
		takesscreenshot(driver,"Salesforce");
		close();
	}
		

}
