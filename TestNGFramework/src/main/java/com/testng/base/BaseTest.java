package com.testng.base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	WebDriver driver;
	
	public WebDriver getdriver() {
		
		if(driver==null) {
			
			WebDriverManager.chromedriver().setup();
			
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--no-sandbox");
			chromeOptions.addArguments("--disable-setuid-sandbox");
			chromeOptions.addArguments("--remote-debugging-port=9222");
			chromeOptions.addArguments("--disable-dev-shm-using"); 
			chromeOptions.addArguments("--disable-extensions"); 
			chromeOptions.addArguments("--disable-gpu");;
			chromeOptions.addArguments("start-maximized"); 
			chromeOptions.addArguments("disable-infobars");
			chromeOptions.addArguments("--headless"); 
			chromeOptions.addArguments("--remote-debugging-port=9222");
			
			driver=new ChromeDriver(chromeOptions);
		}
		return driver;
		
	}
	
	public void launchapplication() {
		
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		
	}
	
	public void takesscreenshot(WebDriver driver,String methodName) {
		
		TakesScreenshot screenshot=((TakesScreenshot)driver);
		 
		File srcfile=screenshot.getScreenshotAs(OutputType.FILE);
		
		Date current= new Date();
		
		//time stamp is giving to get the screenshots of all the test(methods)
		
		String timestamp=new SimpleDateFormat("yyyy-MM-DD HH-mm-ss").format(current);  
		
		String filepath="C:\\Source\\Workspaces\\TestNGFramework\\screenshots\\"+methodName+timestamp+".jpeg";
		
		File destfile=new File(filepath);
		
		try {
			
			FileUtils.copyFile(srcfile, destfile);  //copy source file to dest file
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	public void close() {
		driver.close();
		driver=null;
	}
	

}
