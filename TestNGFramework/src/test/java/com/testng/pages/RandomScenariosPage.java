package com.testng.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.testng.base.BasePage;

public class RandomScenariosPage extends BasePage {

	public RandomScenariosPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//a[normalize-space()='Home']")
	WebElement hometab;
	@FindBy(xpath="//h1[@class='currentStatusUserName']")
	WebElement usernamelink;
	
	@FindBy(xpath="(//a[text()='Jincy Jinu George'])[1]")
	WebElement nameLink;
	@FindBy(xpath="//span[@id='userNavLabel']")
	WebElement usernamedropdown;
	@FindBy(xpath="//a[text()='My Profile']")
	WebElement myprofile;
	
	
	@FindBy(xpath="(//span[text()='Jincy Raju'])[2]")
	WebElement FirstnameLastnamelink;
	@FindBy(xpath="//a[@class='contactInfoLaunch editLink']")
	WebElement editprofilebutton;
	@FindBy(id="contactInfoContentId")
	WebElement editprofileframe;
	@FindBy(id="aboutTab")
	WebElement aboutTab;
	@FindBy(id="lastName")
	WebElement lastnamefield;
	@FindBy(xpath="//input[@value='Save All']")
	WebElement saveallbutton;
	
	@FindBy(xpath="//img[@title='All Tabs']")
	WebElement tabsArrow;
	@FindBy(name="customize")
	WebElement customizeMyTabsbutton;
	@FindBy(id="duel_select_1")
	WebElement dropdownSelectedtabs;
	@FindBy(xpath="//img[@alt='Remove']")
	WebElement removebutton;
	@FindBy(name="save")
	WebElement savebutton;
	@FindBy(xpath="//a[@title='Logout']")
	WebElement Logout;
	@FindBy(id="tabBar")
	List<WebElement>tabspresent;
	
	@FindBy(xpath="(//a[contains(text(),'2023')])[1]")
	WebElement datelink;
	@FindBy(xpath="//a[contains(text(),'8:00 PM')]")
	WebElement eightpmlink;
	@FindBy(xpath="//img[@alt='Subject Combo (New Window)']")
	WebElement subjectcomboicon;
	@FindBy(xpath="//a[text()='Other']")
	WebElement otherfromdropdown;
	@FindBy(id="EndDateTime_time")
	WebElement endtimefield;
	@FindBy(xpath="//div[text()='9:00 PM']")
	WebElement ninepm;
	@FindBy(name="save")
	WebElement save;
	@FindBy(xpath="//div[@class='multiLineEventBlock dragContentPointer']")
	WebElement eventblock;
	
	@FindBy(xpath="//a[contains(text(),'4:00 PM')]")
	WebElement fourpmlink;
	@FindBy(xpath="//div[text()='7:00 PM']")
	WebElement enddate7pm;
	@FindBy(id="IsRecurrence")
	WebElement recurrence;
	@FindBy(id="rectypeftw")
	WebElement weeeklyradiobutton;
	@FindBy(id="wi")
	WebElement recurseevery;
	@FindBy(id="RecurrenceEndDateOnly")
	WebElement recurrenceenddate;
	@FindBy(xpath="(//input[@name='save'])[2]")
	WebElement buttonsave;
	@FindBy(xpath="//h1[normalize-space()='Calendar for Jincy Jinu - Day View']")
	WebElement calenderpage;
	@FindBy(xpath="//div[@id='p:f:j_id25:j_id69:20:j_id71:0:j_id72:calendarEvent:i']//div[@class='multiLineEventBlock dragContentPointer']")
	WebElement othereventintimeslot;
	@FindBy(xpath="//img[@alt='Month View']")
	WebElement monthview;
	@FindBy(xpath="//h1[normalize-space()='Calendar for Jincy Jinu - Month View']")
	WebElement monthviewpage;
	
	
	
	public void clickhomeTab() {
		hometab.click();
	}
	public void checkusernamelinkisdisplayed() {
		usernamelink.isDisplayed();
		
	}
	public void clickusernamelink() {
		nameLink.click();
		
	}
	public void clickusernamedropdown() {
		usernamedropdown.click();
	}
	public void clickMyProfile() {
		myprofile.click();
	}
	
	public void clickfirstNameLastnameLink() {
		FirstnameLastnamelink.click();
	}
	public void clickeditprofilebutton() {
		editprofilebutton.click();
		
	}
	public void switchtoframe() {
		SwitchToFrame(editprofileframe);
		
	}
	public void clickAboutTab() {
		aboutTab.click();
	}
	public void enterLastName(String strlastname) {
		lastnamefield.clear();
		lastnamefield.sendKeys(strlastname);
	}
	public void clicksaveAll() {
		saveallbutton.click();
	}
	
	
	public void clickalltabplusbutton(){
		tabsArrow.click();
	}
	public void clickCustomizeMyTabs() {
		customizeMyTabsbutton.click();
	}
	public void selectAnyTabFromSelectedTabs() {
		
		Select selectedtabs=new Select(dropdownSelectedtabs);
		selectedtabs.selectByVisibleText("Leads");
	}
	public void clickRemove() {
		removebutton.click();
	}
	public void clicksave() {
		savebutton.click();
	}
	public void clickLogout() {
		Logout.click();
	}
	public void displaytabsPresentinTabbar() {
		
		for(WebElement tab:tabspresent) {
			System.out.println(tab.getText());
		}
	}
	public void clickDateLink() {
			datelink.click();
		}
	public void clickEightPMLink() {
		eightpmlink.click();
	}
	public void clickSubjectComboIcon() {
		subjectcomboicon.click();
	}
	public void clickOther() {
		otherfromdropdown.click();
	}
	public void endTimeField() {
		endtimefield.click();
	}
	public void clickNinePM() {
		ninepm.click();
	}
	public void clickSaveButton() {
		save.click();
	}
	public void CheckeventIsDisplayed() {
		eventblock.isDisplayed();
	}
	public void clickFourPMLink() {
		fourpmlink.click();
	}
	public void clickEnddate7Pm() {
		enddate7pm.click();
		
	}
	public void clickrecurrence() {
		recurrence.click();
	}
	public void clickWeeklyRadioButton() {
		// Added the comment for testing GIT
		weeeklyradiobutton.click();
	}
	public void checkRecursEvery() {
		
		System.out.println("Recurs every displayed as  "+recurseevery.getAttribute("value"));
	}
	public void recurrenceEndDate() {
		recurrenceenddate.sendKeys("12/23/2023");
	}
	public void clickOnsave() {
		buttonsave.click();
		
	}
	
	public void checkotherEventDisplayedInTimeslot() {
		othereventintimeslot.isDisplayed();
	}
	public void clickMonthView() {
		monthview.click();
	}
	

	}
	


