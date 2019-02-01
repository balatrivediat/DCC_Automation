package cooperPageObjects;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cooperProjectResources.CooperProjectResources;

public class CooperForgotPasswordPageObjectClass extends CooperProjectResources {
	
	@FindBy(xpath="//input[@placeholder='Email']")
	WebElement Email_Input;
	
	@FindBy(xpath="//button[text()='Send Password']")
	WebElement SendPassword_Button;

    @FindBy(xpath="//button[text()='Cancel']")
	WebElement Cancel_Button;
    
    @FindBy(xpath="//img[@class = 'login-logo']")
	WebElement Emerson_logo;
    
    @FindBy(xpath="//img[contains(@class,'login-logo-bottom')]")
	WebElement CooperAtkins_logo;
      
	public CooperForgotPasswordPageObjectClass(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	
	public boolean isEmail_InputDisplayed() {		
		try
		{
			if(this.Email_Input.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// e.printStackTrace();
			// implement log4j
			return false;
		}
	}

	public boolean isSendPassword_ButtonDisplayed() {		
		try
		{
			if(this.SendPassword_Button.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// e.printStackTrace();
			// implement log4j
			return false;
		}
	}
	
	public boolean isCancel_ButtonDisplayed() {		
		try
		{
			if(this.Cancel_Button.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// e.printStackTrace();
			// implement log4j
			return false;
		}
	}
	
	public boolean isEmersonLogoDisplayed() {
		try
		{
			if(this.Emerson_logo.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// e.printStackTrace();
			// implement log4j
			return false;
		}
	}
	
	public boolean isCooperAtkinsLogoDisp() {
		try
		{
			if(this.CooperAtkins_logo.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// e.printStackTrace();
			// implement log4j
			return false;
		}
	}
}
