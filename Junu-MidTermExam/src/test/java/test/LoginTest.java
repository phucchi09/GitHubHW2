package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.LoginPage;
import util.BrowserFactory;

public class LoginTest
{
   WebDriver driver;  
		
	@Test
	public void validUsersShouldBeAbleToLogin() throws InterruptedException 
	 {		
	   driver = BrowserFactory.startBrowser();
	  	  
	   //Syntax-->  class.object = PageFactory.initElements(driver, pageClassToProxy)
	   // Calling LoginPage Class or Activate
	   LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	 
	   String expectedTitle = "Log In ‹ opensourcecms — WordPress";
	   String actualTitle = loginPage.getPageTitle();
	   //Syntax--> Assert.assertEquals(actual, expected, message);
	   Assert.assertEquals(actualTitle, expectedTitle, "Wrong Title !");
	   
	   // Calling "login" method from  "LoginPage" Class  
	   loginPage.login();
	   Thread.sleep(3000);
       driver.close();
       driver.quit();
	 
      }
}
