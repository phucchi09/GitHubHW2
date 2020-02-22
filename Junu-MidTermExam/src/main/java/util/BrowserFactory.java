package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory 
{
	// Global, so all methods can use
	static WebDriver driver;

	public static WebDriver startBrowser() 
	 {
	   //Set Chrome Driver Properties
	   System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	   // Create ChromeDriver object and launch Chrome Browser
	   driver = new ChromeDriver();
	   
	   //Go to the site
	   driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
	
	   // return the driver to the test class    
       return driver;    
	    
	 }

}
