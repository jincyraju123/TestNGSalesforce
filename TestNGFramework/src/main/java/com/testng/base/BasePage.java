package com.testng.base;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {
	
	WebDriver driver;
	
	public BasePage(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void waitforelement(WebElement element) {
		
		WebDriverWait wait=new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
   
  public void SwitchToFrame(WebElement element) {
	  
	  driver.switchTo().frame(element);
	
	}
	
  public  void SwitchTodefaultcontent() {
	  
	  driver.switchTo().defaultContent();
		
	}
  
  public void gettitleofthepage() {
	  
	  System.out.println("Title of the current Page is : "+driver.getTitle());
  }
  
  public void getwindowhandle() {
	  
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
		
  }
  public void comparetext(String actualtext,String expectedtext) {
		
		Assert.assertEquals(actualtext, expectedtext);
	}
  public void alert() {
	  driver.switchTo().alert().accept();
  }
	
	
}
