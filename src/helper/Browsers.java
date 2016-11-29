package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers {

	static WebDriver driver;
	
	public static WebDriver selectBrowser(String browser, String url){
		
		if(browser.equalsIgnoreCase("Firefox")){
			
			System.setProperty("webdriver.gecko.driver", "/Users/talosdigital/Downloads/geckodriver");
			  driver = new FirefoxDriver();
			  
		}else if(browser.equalsIgnoreCase("Chrome")){
			
		}else{
			System.out.println("Browser not Found");
		}
		driver.manage().window().maximize();
		driver.get(url);
		
		return driver;
	}
}
