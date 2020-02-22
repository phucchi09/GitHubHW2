package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class QuickDraftCreationPage
{
	WebDriver driver;
	
	// Every Page must have a constructor to invite the driver
	public QuickDraftCreationPage(WebDriver driver)
    {
		this.driver = driver;
    }	
	
	// Element Library
	@FindBy(how = How.ID, using="title")WebElement QuickDraftTitle;	
	@FindBy(how = How.ID, using="content")WebElement QuickDraftContent;
    @FindBy(how = How.ID, using="save-post")WebElement QuickDraftSave;		
	    
    public void quickDraftCreationPage()
    {
    	QuickDraftTitle.sendKeys("JunuMidTermTest");
    	QuickDraftContent.sendKeys("Working on MidTerm Exam");
    	QuickDraftSave.click();
    }
		
    
	
}
