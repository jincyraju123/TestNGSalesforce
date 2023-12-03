package com.testng.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


import com.testng.base.BasePage;


  public class usermenusalesforcePage extends BasePage{

	public usermenusalesforcePage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id="userNavLabel")
	WebElement usermenudropdown;
	@FindBy(id="userNav-menuItems")
	List<WebElement> dropdownitems;
	//MyProfile
	@FindBy(xpath="//a[text()='My Profile']")
	WebElement myprofileoption;
	@FindBy(xpath="//a[@class='contactInfoLaunch editLink']")
	WebElement editprofile;
	@FindBy(id="contactInfoContentId")
	WebElement editprofileframe;
	@FindBy(id="aboutTab")
	WebElement Abouttab;
	@FindBy(id="lastName")
	WebElement lastnamefield;
	@FindBy(xpath="//input[@value='Save All']")
	WebElement saveallbutton;
	@FindBy(xpath="(//span[@class='publisherattachtext '])[1]")
	WebElement post;
	@FindBy(xpath="//iframe[@aria-describedby='cke_65']")
	WebElement postiframe;
	@FindBy(xpath="//body[contains(text(),'Share an update')]")
	WebElement posttextfield;
	@FindBy(id="publishersharebutton")
	WebElement sharebutton;
	//file upload
	@FindBy(xpath="//span[normalize-space()='File']")
	WebElement filelink;
	@FindBy(xpath="//a[@id='chatterUploadFileAction']")
	WebElement uploadfile;
	@FindBy(xpath="//input[@id='chatterFile']")
	WebElement choosefile;
	// photo upload
	@FindBy(xpath="//span[@class='profileImage chatter-avatarFull chatter-avatar']//img[@title='Jincy Jinu']")
	WebElement photoimage;
	@FindBy(xpath="//a[@id='uploadLink']")
	WebElement addphoto;
	@FindBy(xpath="//iframe[@id='uploadPhotoContentId']")
	WebElement uploadphotoframe;
	@FindBy(xpath="//input[@id='j_id0:uploadFileForm:uploadInputFile']")
	WebElement choosefilephoto;
	@FindBy(xpath="//input[@id='j_id0:uploadFileForm:uploadBtn']")
	WebElement uploadsavebutton;
	@FindBy(xpath="//input[@id='j_id0:j_id7:save']")
	WebElement savebutton1;
	
	//My Settings
	@FindBy(xpath="//a[@title='My Settings']")
	WebElement mysettingsoption;
	//display and layout link
	@FindBy(id="DisplayAndLayout_font")
	WebElement displayandlayoutlink;
	@FindBy(id="CustomizeTabs_font")
	WebElement customizemytabs;
	@FindBy(id="p4")
	WebElement customappdropdown;
	@FindBy(xpath="//option[@value='report']")
	WebElement Reportstab;
	@FindBy(xpath="//img[@title='Add']")
	WebElement Add;
	@FindBy(name="save")
	WebElement savebutton;
	//personal link
	@FindBy(xpath="//span[text()='Personal']")
	WebElement personallink;
	@FindBy(xpath="//span[text()='Login History']")
	WebElement loginhistory;
	@FindBy(xpath="//a[contains(text(),'Download login history for last six months')]")
	WebElement downloadhistory;
	//Email link
	@FindBy(id="EmailSetup")
	WebElement Email;
	@FindBy(id="EmailSettings_font")
	WebElement Myemailsettings;
	@FindBy(id="sender_name")
	WebElement Emailname;
	@FindBy(id="sender_email")
	WebElement Emailaddress;
	@FindBy(id="auto_bcc1")
	WebElement AutomaticbccYes;
	@FindBy(name="save")
	WebElement save;
	//Calendar and Remainders
	@FindBy(id="CalendarAndReminders_font")
	WebElement calendarandremainderslink;
	@FindBy(id="Reminders_font")
	WebElement Activityremainders;
	@FindBy(id="testbtn")
	WebElement Openatestremainderbutton;
	//Developer Console
	@FindBy(xpath="//a[@title='Developer Console (New Window)']")
	WebElement DeveloperConsole;
	//Logout
	@FindBy(xpath="//a[@title='Logout']")
	WebElement Logout;
	
	
	public void clickusermenudropdown() {
		
		usermenudropdown.click();
	
		for(WebElement menuitem:dropdownitems) {
			System.out.println(menuitem.getText());
			}
	}
	public void usermenuMyProfile() {
		
		myprofileoption.click();
		editprofile.click();
		SwitchToFrame(editprofileframe);
		Abouttab.click();
		lastnamefield.clear();
		lastnamefield.sendKeys("Jinu George");
		saveallbutton.click();
		SwitchTodefaultcontent();
		post.click();
		SwitchToFrame(postiframe);
		posttextfield.sendKeys("Welcome to TestNG");
		SwitchTodefaultcontent();
		sharebutton.click();
		filelink.click();
		uploadfile.click();
		choosefile.click();
		waitforelement(sharebutton);
		sharebutton.click();
		waitforelement(photoimage);
		actionclass(photoimage);
		addphoto.click();
		SwitchToFrame(uploadphotoframe);
		choosefilephoto.sendKeys("C:\\Users\\Administrator\\Downloads\\Image.jpg");
		uploadsavebutton.click();
		waitforelement(savebutton1);
		savebutton1.click();
	}
	public void usermenuMySettingsPersonal() {
		
		mysettingsoption.click();
		personallink.click();
		loginhistory.click();
		downloadhistory.click();
		
	}
	public void usermenuMySettingsdisplayandlayout() {
		
		mysettingsoption.click();
		displayandlayoutlink.click();
		customizemytabs.click();
		Select customApp=new Select(customappdropdown);
		customApp.selectByVisibleText("Salesforce Chatter");
		Reportstab.click();
		Add.click();
		savebutton.click();
		
	}
	public void usermenuMySettingsEmail() {
		
		mysettingsoption.click();
		Email.click();
		Myemailsettings.click();
		Emailname.clear();
		Emailname.sendKeys("Jincy Raju");
		Emailaddress.clear();
		Emailaddress.sendKeys("jincyraju90@gmail.com");
		AutomaticbccYes.click();
		save.click();
		gettitleofthepage();
	}
	public void usermenuMySettingsCalenderandremainders() {
		
		mysettingsoption.click();
		calendarandremainderslink.click();
		Activityremainders.click();
		Openatestremainderbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

		
	}
	public void usermenuDeveloperConsole() {
		
		DeveloperConsole.click();
	}
	public void usermenuLogout() {
		
		Logout.click();
		gettitleofthepage();
	}
		
		
		
	}
	



