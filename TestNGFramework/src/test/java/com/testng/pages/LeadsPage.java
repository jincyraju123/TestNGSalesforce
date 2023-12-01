package com.testng.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.testng.base.BasePage;

public class LeadsPage extends BasePage {

	public LeadsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="Lead_Tab")
	WebElement leadstab;
	
	@FindBy(id="fcf")
	WebElement dropdownview;
	@FindBy(id="fcf")
	List<WebElement> viewdropdownlists;
	
	@FindBy(id="userNavLabel")
	WebElement usermenudropdown;
	
	@FindBy(xpath="//a[@title='Logout']")
	WebElement logout;
	@FindBy(xpath="//option[@value='00BHn00000EQsxj']")
	WebElement Actualleadview;
	@FindBy(xpath="//input[@name='go']")
	WebElement gobutton;

	@FindBy(name="new")
	WebElement newbutton;
	@FindBy(id="name_lastlea2")
	WebElement lastname;
	@FindBy(id="lea3")
	WebElement companyname;
	@FindBy(name="save")
	WebElement savebutton;
	
	
	public void leadstab() {
		leadstab.click();
		gettitleofthepage();
	}
	public void leadsviewdropdown() {
		dropdownview.click();
		for(WebElement leadlist:viewdropdownlists) {
			System.out.println(leadlist.getText());
		}
		
	}
	public void leadsdefaultview() {
		dropdownview.click();
		usermenudropdown.click();
		logout.click();
		}
		
	public void logindefaultview() {
		dropdownview.click();
		comparetext(Actualleadview.getText(), "Today's Leads");
		gobutton.click();
	} 
	public void Todaysleadpage() {
		Select view=new Select(dropdownview);
		view.selectByVisibleText("Today's Leads");
		gobutton.click();
	}
	public void leadsNew() {
		newbutton.click();
		lastname.sendKeys("JINU");
		companyname.sendKeys("ABCD");
		savebutton.click();
		gettitleofthepage();
		
	}

}
