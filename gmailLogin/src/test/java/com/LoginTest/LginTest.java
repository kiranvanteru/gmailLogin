package com.LoginTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import utilities.InitializeDriver;

import com.gmailLoginPage.LoginPagePageFactory;

public class LginTest {
	
	LoginPagePageFactory gml;
 
	 @BeforeTest
	  public void beforeTest() {
		 InitializeDriver.driver=InitializeDriver.openBrowser("firefox");
		 InitializeDriver.driver.manage().window().maximize();
		 InitializeDriver.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 InitializeDriver.driver.get("https://gmail.com");
		 gml=PageFactory.initElements(InitializeDriver.driver, LoginPagePageFactory.class); 
	  }
	
	@Test
  public void f() {
		
		gml.LoginGmail("kk23vanteru", "infoguyusad");
		String title=InitializeDriver.driver.getTitle();
		System.out.println("title is "+title);
		
  }
  
 

  @AfterTest
  public void afterTest() {
	  InitializeDriver.driver.quit();
  }

}
