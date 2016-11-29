package com.gmail.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*this class will store all locator and methods of login pages*/

public class LoginPages {
	WebDriver driver;
	
    By username = By.id("email");
    By password = By.xpath(".//*[@id='pass']");
    By loginButton = By.xpath(".//*[@id='u_0_n']");

    
    public LoginPages(WebDriver driver){
    	this.driver = driver;
    }
    
    public void typeUserName(String user){
    	driver.findElement(username).sendKeys(user);
    }
    
    public void typePassword(String pass){
    	driver.findElement(password).sendKeys(pass);
    }
    
    public void ClickloginButton(){
    	driver.findElement(loginButton).submit();
    }
    
}
