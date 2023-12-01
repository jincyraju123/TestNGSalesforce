package com.testng.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.testng.base.BasePage;

public class OpportunitiesPage extends BasePage {

	public OpportunitiesPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(id="Opportunity_Tab")
	WebElement opportunitiestab;
	@FindBy(id="fcf")
	WebElement viewdropdown;
	@FindBy(id="fcf")
	List<WebElement> viewdropdownlist;
	
	//create new opportunity
	@FindBy(name="new")
	WebElement newbutton;
	@FindBy(id="opp3")
	WebElement opportunityname;
	@FindBy(id="opp4")
	WebElement accountname;
	@FindBy(id="opp6")
	WebElement dropdownleadsource;
	@FindBy(id="opp9")
	WebElement closedate;
	@FindBy(id="opp11")
	WebElement dropdownStage;
	@FindBy(id="opp12")
	WebElement probability;
	@FindBy(name="save")
	WebElement save;
	//opportunity pipeline
	@FindBy(xpath="//a[text()='Opportunity Pipeline']")
	WebElement pipelinelink;
	@FindBy(xpath="//h1[@class='noSecondHeader pageType']")
	WebElement Actualheadertext;
	//stuck opportunities
	@FindBy(xpath="//a[text()='Stuck Opportunities']")
	WebElement stuckopportunities;
	@FindBy(xpath="//h1[@class='noSecondHeader pageType']")
	WebElement Actualheader;
	//Quarterly summary
	@FindBy(id="quarter_q")
	WebElement dropdownInterval;
	@FindBy(id="open")
	WebElement dropdownInclude;
	@FindBy(xpath="//input[@value='Run Report']")
	WebElement Runreport;
	@FindBy(xpath="//h1[@class='noSecondHeader pageType']")
	WebElement Actualpageheader;
	
	
	
	public void opportunitiesDropdown() {
		opportunitiestab.click();
		viewdropdown.click();
		for(WebElement list:viewdropdownlist) {
			System.out.println(list.getText());
		}
		
	}
	public void createnewopportunity() {
		opportunitiestab.click();
		newbutton.click();
		opportunityname.sendKeys("All opportunities");
		accountname.sendKeys("Jincy Raju");
		Select leadsource=new Select(dropdownleadsource);
		leadsource.selectByIndex(1);
		closedate.sendKeys("11/19/2023");
		Select stage=new Select(dropdownStage);
		stage.selectByIndex(2);
		probability.clear();
		probability.sendKeys("90");
		save.click();
	}
	public void opportunityPipeline() {
		
		opportunitiestab.click();
		pipelinelink.click();
		
		comparetext(Actualheadertext.getText(), "Opportunity Pipeline");
	
	}
	public void stuckopportunity() {
		
		opportunitiestab.click();
		stuckopportunities.click();
		comparetext(Actualheader.getText(), "Stuck Opportunities");
		
		}
    public void quarterlysummary() {
		
		opportunitiestab.click();
		Select interval = new Select(dropdownInterval);
		interval.selectByIndex(0);
		Select include = new Select(dropdownInclude);
		include.selectByIndex(0);
		
		//comparetext(Actualpageheader.getText(),"Opportunity Report");
		}

}
