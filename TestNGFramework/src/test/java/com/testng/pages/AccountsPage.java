package com.testng.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.testng.base.BasePage;

public class AccountsPage extends BasePage{

	public AccountsPage(WebDriver driver) {
		
		super(driver);
		
	}
	//create an account
	@FindBy(xpath="//a[@title='Accounts Tab']")
	WebElement accountstab;
	@FindBy(name="new")
	WebElement newbutton;
	@FindBy(id="acc2")
	WebElement accountname;
	@FindBy(id="acc6")
	WebElement selectType;
	@FindBy(id="00NHn00000HYJPs")
	WebElement customerpriority;
	@FindBy(name="save")
	WebElement savebutton;
	//create new view
	@FindBy(xpath="//a[contains(text(),'Create New View')]")
	WebElement createnewview;
	@FindBy(id="fname")
	WebElement viewname;
	@FindBy(id="devname")
	WebElement viewuniquename;
	@FindBy(name="save")
	WebElement save;
	//Edit view
	@FindBy(id="fcf")
	WebElement dropdownview;
	@FindBy(xpath="//a[text()='Edit']")
	WebElement Editbutton;
	@FindBy(id="fname")
	WebElement Viewname;
	@FindBy(xpath="//select[@title='Search By 1']")
	WebElement dropdownfield;
	@FindBy(id="fop1")
	WebElement dropdownOperator;
	@FindBy(id="fval1")
	WebElement value ;
	@FindBy(name="save")
	WebElement save2;
	
	//create account report
	@FindBy(xpath="//a[text()='Accounts with last activity > 30 days']")
	WebElement Lastactivity ;
	@FindBy(id="ext-gen148")
	WebElement dropdownarrow;
	@FindBy(xpath="//div[contains(text(),'Created Date')]")
	WebElement datefield ;
	@FindBy(id="ext-gen152")
	WebElement From ;
	@FindBy(xpath="//button[text()='Today']")
	WebElement fromToday ;
	@FindBy(id="ext-gen154")
	WebElement To ;
	@FindBy(xpath="(//button[text()='Today'])[2]")
	WebElement ToToday ;
	@FindBy(id="ext-gen49")
	WebElement save3 ;
	@FindBy(id="saveReportDlg_reportNameField")
	WebElement reportname ;
	@FindBy(id="saveReportDlg_DeveloperName")
	WebElement reportuniquename ;
	@FindBy(xpath="//button[text()='Save and Run Report']")
	WebElement saveandrun ;
	//Merge accounts
	@FindBy(xpath="//a[text()='Merge Accounts']")
	WebElement mergeAccounts ;
	@FindBy(id="srch")
	WebElement searchtextbox ;
	@FindBy(xpath="//input[@value='Find Accounts']")
	WebElement findAccountsbutton ;
	@FindBy(id="cid0")
	WebElement selectaccount1 ;
	@FindBy(xpath="//input[@title='Select row 1']")
	WebElement selectaccount2 ;
	@FindBy(name="goNext")
	WebElement nextbutton ;
	@FindBy(xpath="//input[@value=' Merge ']")
	WebElement mergebutton ;
	
	
	public void createnewAccount() {
		
		accountstab.click();
		newbutton.click();
		accountname.sendKeys("Jincy Jinu George");
		Select Type=new Select(selectType);
		Type.selectByValue("Technology Partner");
		Select customerPriority=new Select(customerpriority);
		customerPriority.selectByValue("High");
		savebutton.click();
	}
	public void createNewView() {
		accountstab.click();
		createnewview.click();
		viewname.sendKeys("Jincy");
		viewuniquename.sendKeys("JincyR5");
		save.click();
	}
	public void editview() {
		accountstab.click();
		Select view = new Select(dropdownview);
		view.selectByIndex(2);
		Editbutton.click();
		Viewname.sendKeys("Jincy Jinu");
		Select field = new Select(dropdownfield);
		field.selectByValue("ACCOUNT.NAME");
		Select operator = new Select(dropdownOperator);
		operator.selectByIndex(3);
		value.clear();
		value.sendKeys("a");
		save2.click();
	}
	public void mergeAccounts() {
		accountstab.click();
		mergeAccounts.click();
		searchtextbox.sendKeys("Jincy");
		waitforelement(findAccountsbutton);
		findAccountsbutton.click();
		selectaccount1.click();
		selectaccount2.click();
		nextbutton.click();
		gettitleofthepage();
		mergebutton.click();
		alert();
	}
	public void createaccountreport() {
		accountstab.click();
		Lastactivity.click();
		dropdownarrow.click();
		datefield.click();
		From.click();
		fromToday.click();
		To.click();
		ToToday.click();
		save3.click();
		reportname.sendKeys("Jincy George");
		reportuniquename.sendKeys("jincyg1");
		waitforelement(saveandrun);
		saveandrun.click();
		gettitleofthepage();
	}

}
