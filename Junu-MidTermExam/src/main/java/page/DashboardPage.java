package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage extends BasePage
{
	WebDriver driver;
	// Every Page must have a constructor to invite the driver
	public DashboardPage(WebDriver driver) 
	 {
		this.driver = driver;
	  }
	
	
	// Element Library
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Dashboard')]")WebElement DashboardLink;
	
	 public void waitForPage()
      {
        waitForElement(DashboardLink, driver); 
      } 
	 
}
