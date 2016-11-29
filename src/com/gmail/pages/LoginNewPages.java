package com.gmail.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginNewPages {
	WebDriver driver;
	public LoginNewPages(WebDriver driver){
		this.driver = driver;
	}

	@FindBy(id="email") 
	@CacheLookup
	WebElement username;
	
	@FindBy(how=How.XPATH,using=".//*[@id='pass']")
	@CacheLookup
	WebElement password;
	
	@FindBy(how=How.XPATH,using=".//*[@id='u_0_n']")
	@CacheLookup
	WebElement loginButton;
	
	public void failLogin(String user, String pass){
		username.sendKeys(user);
		password.sendKeys(pass);
		loginButton.submit();
	}
}
