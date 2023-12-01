package com.testng.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.testng.base.BasePage;

public class ContactsPage extends BasePage {

	public ContactsPage(WebDriver driver) {
		super(driver);
		
	}
	

	@FindBy(id="Contact_Tab")
	WebElement contactstab;

	@FindBy(name="new")
	WebElement newbutton;

	@FindBy(id="name_lastcon2")
	WebElement lastname;

	@FindBy(id="con4")
	WebElement accountname;

	@FindBy(name="save")
	WebElement savebutton;

	@FindBy(xpath="//a[text()='Create New View']")
	WebElement createnewviewbutton;

	@FindBy(id="fname")
	WebElement viewname;

	@FindBy(id="devname")
	WebElement viewuniquename;
	
	@FindBy(id="hotlist_mode")
	WebElement dropdownRecently;
	
	@FindBy(id="fcf")
	WebElement dropdownView;
	@FindBy(name="go")
	WebElement gobutton;
	@FindBy(xpath="//option[@value='00BHn00000EQsyQ']")
	WebElement myContactView;
	
	@FindBy(xpath="//a[text()='Raju']")
	WebElement namefield;
	
	@FindBy(xpath="(//div[@class='errorMsg'])[1] ")
	WebElement Actualerrormessage;
	
	@FindBy(name="cancel")
	WebElement cancelbutton;
	
	@FindBy(id="name_lastcon2")
	WebElement lastName;
	@FindBy(id="con4")
	WebElement accountName;
	@FindBy(name="save_new")
	WebElement savenewbutton;
	@FindBy(xpath="//h2[@class='topName'])")
	WebElement Actualcontactname;		
	
	
	
	
	public void clickContactsTab() {
		contactstab.click();
	}
	public void clickNewButton() {
		newbutton.click();
	}
	public void enterlastname(String strlastname) {
		lastname.sendKeys(strlastname);
	}
	
	public void enteraccountname(String straccountname) {
		accountname.sendKeys(straccountname);
	}
	public void clicksavebutton() {
		savebutton.click();
	}
	public void clickcreatenewview() {
		createnewviewbutton.click();
	}
	public void enterViewName(String Strviewname) {
		viewname.sendKeys(Strviewname);
	}
	public void enterViewUniqueName(String Strviewuniquename) {
		viewuniquename.sendKeys(Strviewuniquename);
	}
	public void recentlyCreated() {
		Select recently=new Select(dropdownRecently);
		recently.selectByIndex(0);
	}
	public void dropdownView() {
		Select view=new Select(dropdownView);
		view.selectByVisibleText("My Contacts");
		
	}
	public void clickgo() {
		gobutton.click();
		
	}
	public void clickcontactnameinNamefield() {
		namefield.click();
	}
	public void compareErrorMessages() {
		comparetext(Actualerrormessage.getText(), "Error: You must enter a value");
	}
	public void clickcancel() {
		cancelbutton.click();
	}
	public void enterLastName(String strname) {
		lastName.sendKeys(strname);
	}
	public void enterAccountName(String straccount) {
		accountName.sendKeys(straccount);
	}
	public void clicksave$newButton() {
		savenewbutton.click();
	}
	public void NewContactisdisplayed() {
		Actualcontactname.isDisplayed();
	}
	
	
	

}
