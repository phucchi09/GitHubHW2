package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.LoginPage;
import page.PostsPage;
import page.PostsValidationPage;
import page.QuickDraftCreationPage;
import util.BrowserFactory;

public class PostsValidationTest
{
	WebDriver driver;
	  
	  @Test
	  public void postsValidationTest() throws InterruptedException
	  {		  
		  // Start Browser
		  driver = BrowserFactory.startBrowser();
		  
		  LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);  
		  loginPage.login();
		   
		  QuickDraftCreationPage quickDraftCreationPagee = PageFactory.initElements(driver, QuickDraftCreationPage.class);
		  quickDraftCreationPagee.quickDraftCreationPage();
		  
		  PostsPage postsPage = PageFactory.initElements(driver, PostsPage.class);  
		  postsPage.clickOnPosts();		
		  
		  Thread.sleep(3000); // just to see the progress in peace 
		  postsPage.clickOnAllPosts();
		  postsPage.waitForPage();
		  
		  PostsValidationPage postsValidation = PageFactory.initElements(driver, PostsValidationPage.class);
		 
		   String expectedQuickdraftTitle = "JunuMidTermTest";
		   // WebElement lai String ma convert garna 
		   String actualQuickdeaftTitle = postsValidation.getQDTitle();
		   //Syntax--> Assert.assertEquals(actual, expected, message);
		   Assert.assertEquals(actualQuickdeaftTitle, expectedQuickdraftTitle, "Wrong QuickDraft Title !");	
		   
		   postsValidation.QDTitlefound();	  
		   driver.close();
		   driver.quit();		  
		  
	  }
}
