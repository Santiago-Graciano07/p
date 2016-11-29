package com.gmail.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gmail.pages.LoginNewPages;

import helper.Browsers;

public class NewTestLogin {
	static WebDriver driver;
	@BeforeMethod
	public void browserAndUrl(){
		driver = Browsers.selectBrowser("Firefox", "http://www.facebook.com");
	}
  @Test
  public void checkValidUser() {
	  
	  LoginNewPages login = PageFactory.initElements(driver, LoginNewPages.class);
	  login.failLogin("admin", "demo123");
  }
}
