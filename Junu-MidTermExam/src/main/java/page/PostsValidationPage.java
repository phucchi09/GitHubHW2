package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PostsValidationPage extends BasePage
{
	
	WebDriver driver;
	
	// Every Page must have a constructor to invite the driver
	public PostsValidationPage(WebDriver driver) 
	 {
		this.driver = driver;
	 }

	// Element Library
	//Xpath =  //div[@class = "draft-title" ]//descendant::a
	//@FindBy(how = How.XPATH, using="//div[@class = 'draft-title' ]//descendant::a")WebElement TitleName;
	@FindBy(how = How.XPATH, using="//a[@aria-label='“JunuMidTermTest” (Edit)']")WebElement TitleName;
	//String QDTitleName1 = TitleName+ ""; not going to work 
	
	
	public void waitForPage()
    {
      waitForElement(TitleName, driver); 
    } 
	
	
	/////////////////// Example //////////////
    /*  Converting WebElement to String
	//WebElement msg=driver.findElement(By.xpath(".//*[@id='message23']"));
	//String quickdraftText=TitleName.getText();	
	if (msg.isEnabled() && text.contains("Registration completed successfully"))
	{ 
	    System.out.println("Successfully completed");
	}else{
	    System.out.println("Please enter all details");
	}
	*/
	 
	public void QDTitlefound()
	{
		if(TitleName.isDisplayed())
		{
			System.out.println("Title Match---> Test Passed.");
		 }
		 
		else
		
		{
			System.out.println("Title MIsmatched----> Test Failed.");
		}
	}
	
	public String getQDTitle()
	  {
		String quickdraftText=TitleName.getText();
	    return quickdraftText;
	  }
	
}
