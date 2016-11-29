package com.gmail.testCases;

import org.testng.annotations.Test;

import com.gmail.pages.LoginPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class VerifyGmailLogin {
	WebDriver driver;
  @Test
  public void verifyInvalidLogin() {
	  LoginPages login = new LoginPages(driver);
	  
	  login.typeUserName("admin");
	  login.typePassword("demo123");
	  login.ClickloginButton();
	  
	  
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.gecko.driver", "/Users/talosdigital/Downloads/geckodriver");
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.facebook.com");
  }

}
