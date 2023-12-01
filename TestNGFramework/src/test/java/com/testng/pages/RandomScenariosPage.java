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
	@FindBy(id="home_Tab")
	WebElement hometab;
	@FindBy(xpath="//h1[@class='currentStatusUserName']")
	WebElement usernamelink;
	
	@FindBy(xpath="(//a[text()='Jincy Jinu George'])[1]")
	WebElement nameLink;
	@FindBy(id="userNavLabel")
	WebElement usernamedropdown;
	@FindBy(xpath="//a[text()='My Profile']")
	WebElement myprofile;
	@FindBy(id="tailBreadcrumbNode")
	WebElement myprofilepage;
	
	@FindBy(xpath="(//span[text()='Jincy Jinu'])[2]")
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
	
	@FindBy(xpath="//img[@class='allTabsArrow']")
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
	public void checkmyProfilePageisdisplayed() {
		myprofilepage.isDisplayed();
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
	
	//public void verifyUsermenuName() {
	//	comparetext(usernamedropdown.getText(), "Jincy Jinu");
	//}
	
	public void clickalltabplusbutton(){
		tabsArrow.click();
	}
	public void clickCustomizeMyTabs() {
		customizeMyTabsbutton.click();
	}
	public void selectAnyTabFromSelectedTabs() {
		
		Select selectedtabs=new Select(dropdownSelectedtabs);
		selectedtabs.selectByVisibleText("Accounts");
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
	
	

}
