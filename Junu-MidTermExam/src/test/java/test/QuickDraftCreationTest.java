package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import page.QuickDraftCreationPage;
import util.BrowserFactory;

public class QuickDraftCreationTest
{
	WebDriver driver;
	
	@Test
	public void validUsersShouldBeAbleToCreateQuickDraft() throws InterruptedException
	{
		// Start Browser
		  driver = BrowserFactory.startBrowser();
		  
		  LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);  
		  loginPage.login();
		   
		  QuickDraftCreationPage quickDraftCreationPagee = PageFactory.initElements(driver, QuickDraftCreationPage.class);
		  quickDraftCreationPagee.quickDraftCreationPage();
		  
		  Thread.sleep(3000);
		  driver.close();
		  driver.quit();
	}

}
