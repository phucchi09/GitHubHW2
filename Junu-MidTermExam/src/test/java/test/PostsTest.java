package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import page.PostsPage;
import page.QuickDraftCreationPage;
import util.BrowserFactory;

public class PostsTest
{
	WebDriver driver;
	  
	  @Test
	  public void postsTest() throws InterruptedException
	  {		  
		  // Start Browser
		  driver = BrowserFactory.startBrowser();
		  
		  LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);  
		  loginPage.login();
		   
		  QuickDraftCreationPage quickDraftCreationPagee = PageFactory.initElements(driver, QuickDraftCreationPage.class);
		  quickDraftCreationPagee.quickDraftCreationPage();
		  
		  Thread.sleep(3000);
		  PostsPage postsPage = PageFactory.initElements(driver, PostsPage.class);  
		  postsPage.clickOnPosts();	
		  
		  Thread.sleep(3000);
		  postsPage.clickOnAllPosts();
		  postsPage.waitForPage();
				 
		  Thread.sleep(3000);
		  driver.close();
		  driver.quit();		  
		  
	  }
	
}
