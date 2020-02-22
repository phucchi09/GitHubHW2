package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PostsPage extends BasePage
{
	WebDriver driver; 

	// Every Page must have a constructor to invite the driver
	public PostsPage(WebDriver driver) 
	{
	  this.driver = driver;
	}
	
	// Element Library  
	//need to check again    -->  //*[@id="menu-posts"]/a/div[3]
	@FindBy(how = How.XPATH, using = "//*[@id='menu-posts']/a/div[3]")WebElement PostsButton;
	@FindBy(how = How.LINK_TEXT, using = "All Posts")WebElement AllPostsButton;
	
	public void clickOnPosts()
	{
		PostsButton.click();
	}
	public void clickOnAllPosts()
	{
		AllPostsButton.click();
	}
	
	public void waitForPage()
	{
		waitForElement(PostsButton, driver);
	}

}
