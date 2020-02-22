package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class QuickDraftLocatorPage extends BasePage
{
   WebDriver driver;
	
	// Every Page must have a constructor to invite the driver
	public QuickDraftLocatorPage(WebDriver driver)
    {
		this.driver = driver;
    }
	
	@FindBy(how = How.XPATH, using = "//h2[@class='hndle ui-sortable-handle']//descendant::span[text()='Quick Draft']")WebElement QuickDrafText;	

	public void waitForPage()
	 {
		waitForElement(QuickDrafText, driver);
	 }
}
