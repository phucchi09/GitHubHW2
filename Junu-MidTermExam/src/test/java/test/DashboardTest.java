package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import page.QuickDraftLocatorPage;
import util.BrowserFactory;

public class DashboardTest 
{
  WebDriver driver;
  
  @Test
  public void validateDashboardLinkAndQuickDraftInput() throws InterruptedException
  {
	  
	  // Start Browser
	  driver = BrowserFactory.startBrowser();
	  
	  LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);  // create object for LoginPage
	  loginPage.login();
	  
	  //Validating the Dashboard Link displayed 
	  DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
	  dashboardPage.waitForPage();
	 
	  //Validating "Quick Draft" text is displayed 
	  QuickDraftLocatorPage quickDraftLocatorPage = PageFactory.initElements(driver,  QuickDraftLocatorPage.class);
	  quickDraftLocatorPage.waitForPage();
	  	  
	  driver.close();
	  driver.quit();
  
  }
	
}
