package cooperPageObjects;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cooperProjectResources.CooperProjectResources;

public class CooperNewAccRegPageObjectClass extends CooperProjectResources {
	
	@FindBy(xpath="//input[@name='email']")
	WebElement Email_Input;
	
	@FindBy(xpath="//button[contains(text(),'Verify')]")
	WebElement Verify_Button;
	
	@FindBy(xpath="//a[contains(text(),'Additional Setup')]")
	WebElement AdditionalSetup_Link;
	
	@FindBy(xpath="//p[contains(text(),'Use the link sent')]")
	WebElement NotesText_Label;
	
	@FindBy(xpath="//b[text()='Note:']")
	WebElement Notes_Label;
	
	@FindBy(xpath="//img[@class='login-logo']")
	WebElement Emerson_Logo;
	
	@FindBy(xpath="//img[@class='login-logo-bottom']")
	WebElement CooperAtkins_Logo;
	
	
	public CooperNewAccRegPageObjectClass(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	
	public boolean isEmail_InputDisplayed() {		
		try
		{
			if(new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.Email_Input)).isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean isVerify_ButtonDisplayed() {		
		try
		{
			if(new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.Verify_Button)).isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isAdditionalSetup_LinkDisplayed() {		
		try
		{
			if(new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.AdditionalSetup_Link)).isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isNotesText_LabelDisplayed() {		
		try
		{
			if(new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.NotesText_Label)).isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isNotes_LabelDisplayed() {		
		try
		{
			if(new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.Notes_Label)).isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isEmersonLogoDisplayed() {		
		try
		{
			if(new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.Emerson_Logo)).isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isCooperAtkinsLogoDisplayed() {		
		try
		{
			if(new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.CooperAtkins_Logo)).isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
}
