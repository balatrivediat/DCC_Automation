package cooperPageObjects;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cooperProjectResources.CooperReadFromExcel;
import cooperProjectResources.CooperWebElementHighlighterClass;

public class CooperLoginPageObjectClass {
	
	// CooperProjectResources cooperProjRes = new CooperProjectResources();
	
	@FindBy(xpath="//img[@alt='Emerson logo']")
	WebElement appl_Emerson_Logo_Img;
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement userName_TxtBx;	

	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password_TxtBx;
			
	@FindBy(xpath="//button[text()='Login']")
	WebElement login_Btn;
	
	@FindBy(xpath="//button[text()='New Account Registration']")
	WebElement newUser_Btn;
	
	@FindBy(xpath="//a[contains(text(),'Forgot Password')]")
	WebElement forgotPassword_Lnk;
	
	@FindBy(xpath="//img[@alt='Cooper Atkins logo']")
	WebElement appl_Atkins_Logo_Img;
	
	@FindBy(xpath="//select[@name='language']")
	WebElement language_DrpDwn;
	
	public CooperLoginPageObjectClass(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	
	public boolean isappl_Emerson_Logo_ImgDisplayed() {
		try {
			if(this.appl_Emerson_Logo_Img.isDisplayed())
			{
				// CooperWebElementHighlighterClass.highlightWebElement(this.appl_Emerson_Logo_Img);
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
	
	public boolean isUserNameTxtBoxDisplayed() {
		try {
			if(this.userName_TxtBx.isDisplayed())
			{
				CooperWebElementHighlighterClass.highlightWebElement(this.userName_TxtBx);
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
	
	public void enterUserName() {
		try {
			this.userName_TxtBx.click();
			this.userName_TxtBx.sendKeys(CooperReadFromExcel.getUsername(1, 1));		
		}
		catch(NoSuchElementException e) {
			e.printStackTrace();
			// implement log4j
		}
		catch(IOException ioException)
		{
			ioException.printStackTrace();
		}
	} 
	
	public boolean isPasswordTxtBoxDisplayed() {
		try {
			if(this.password_TxtBx.isDisplayed())
			{
				CooperWebElementHighlighterClass.highlightWebElement(this.password_TxtBx);
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
	
	public void enterPassword() {
		try {
			this.password_TxtBx.click();
			this.password_TxtBx.sendKeys(CooperReadFromExcel.getPassword(1, 2));		
		}
		catch(NoSuchElementException e) {
			e.printStackTrace();
			// implement log4j
		}
		catch(IOException ioException)
		{
			ioException.printStackTrace();
		}
	}
	
	public boolean isLoginButtonDisplayed() {
		try {
			if(this.login_Btn.isDisplayed())
			{
				CooperWebElementHighlighterClass.highlightWebElement(this.login_Btn);
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
	
	public void clickLoginButton() {
		this.login_Btn.submit();
	}
	
	public boolean isNewUserRegistrationBtnDisplayed() {
		try {
			if(this.newUser_Btn.isDisplayed())
			{
				CooperWebElementHighlighterClass.highlightWebElement(this.newUser_Btn);
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
	
	public void fnnewUserBtnClick() {
		this.newUser_Btn.click();
	}
	
	public boolean isForgotPwdLinkDisplayed() {
		try {
			if(this.forgotPassword_Lnk.isDisplayed())
			{
				CooperWebElementHighlighterClass.highlightWebElement(this.forgotPassword_Lnk);
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
	
	public void fnforgotPasswordLnkClick()
	{
		forgotPassword_Lnk.click();
	}
	
	public boolean isCooperAtkinsLogoDisplayed() {
		try {
			if(this.appl_Atkins_Logo_Img.isDisplayed())
			{
				CooperWebElementHighlighterClass.highlightWebElement(this.appl_Atkins_Logo_Img);
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
	
	public boolean isLanguageDropdownDisplayed() {
		try {
			if(this.language_DrpDwn.isDisplayed())
			{
				CooperWebElementHighlighterClass.highlightWebElement(this.language_DrpDwn);
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
	
//	@FindBy(xpath="//input[@placeholder='Username']")
//	WebElement username_TextBox;
//	
//	@FindBy(xpath="//input[@placeholder='Password']")
//	WebElement password_TextBox;
//	
//	@FindBy(xpath="//button[@type='submit']")
//	WebElement login_Button;
//	
//	@FindBy(xpath="//i[@class='fa fa-caret-down']")
//	WebElement email_dropdown;
//	
//	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-usermenu pull-right']//li[2]//a[1]")
//	WebElement logout_link;
//	
//	@FindBy(xpath="//h3[contains(text(),'Invalid Login')]")
//	WebElement invalidLogin_Text;
//	
//	public CooperLoginPageObjectClass(WebDriver chromeDriver) {
//		PageFactory.initElements(chromeDriver, this);
//	}
//	
//	public boolean isUsernameTextBoxDisplayed() {
//		try {
//			if(this.username_TextBox.isDisplayed()) 
//			{
//				return true;
//			}
//			else
//			{
//				return false;
//			}
//		}
//		catch(NoSuchElementException e) {
//			// e.printStackTrace();
//			// implement log4j
//			return false;
//		}
////		LoginPageObjectClass loginPgObj = new LoginPageObjectClass(chromeDriver);
////		return loginPgObj.username_TextBox.isDisplayed();
//	}
//	
//	public boolean isUsernameTextBoxEnabled() {
//		try {
//			if(this.username_TextBox.isEnabled())
//			{
//				return true;
//			}
//			else
//			{
//				return false;
//			}
//		}
//		catch(NoSuchElementException e) {
//			// e.printStackTrace();
//			// implement log4j
//			return false;
//		}
////		LoginPageObjectClass loginPgObj = new LoginPageObjectClass(chromeDriver);
////		return loginPgObj.username_TextBox.isEnabled();
//	}
//	
//	public void enterUserName() {
//		try {
//			this.username_TextBox.click();
//			this.username_TextBox.sendKeys(CooperReadFromExcel.getUsername(1, 1));		
//		}
//		catch(NoSuchElementException e) {
//			e.printStackTrace();
//			// implement log4j
//		}
//		catch(IOException ioException)
//		{
//			ioException.printStackTrace();
//		}
//	}
//	
//	public boolean isPasswordTextBoxDisplayed() {
//		try {
//			if(this.password_TextBox.isDisplayed()) 
//			{
//				return true;
//			}
//			else
//			{
//				return false;
//			}
//		}
//		catch(NoSuchElementException e) {
//			// e.printStackTrace();
//			// implement log4j
//			return false;
//		}
////		LoginPageObjectClass loginPgObj = new LoginPageObjectClass(chromeDriver);
////		return loginPgObj.password_TextBox.isDisplayed();
//	}
//	
//	public boolean isPasswordTextBoxEnabled() {
//		try {
//			if(this.password_TextBox.isEnabled()) 
//			{
//				return true;
//			}
//			else
//			{
//				return false;
//			}
//		}
//		catch(NoSuchElementException e) {
//			// e.printStackTrace();
//			// implement log4j
//			return false;
//		}
////		LoginPageObjectClass loginPgObj = new LoginPageObjectClass(chromeDriver);
////		return loginPgObj.password_TextBox.isEnabled();
//	}
//	
//	public void enterPassword() {
//		try {
//			this.password_TextBox.click();
//			this.password_TextBox.sendKeys(CooperReadFromExcel.getPassword(1, 2));
//		}
//		catch(NoSuchElementException e) {
//			e.printStackTrace();
//			// implement log4j
//		}
//		catch(IOException ioException)
//		{
//			ioException.printStackTrace();
//		}
//	}
//
//	public boolean isLoginButtonDisplayed() {
//		try {
//			if(this.login_Button.isDisplayed())
//			{
//				return true;
//			}
//			else
//			{
//				return false;
//			}
//		}
//		catch(NoSuchElementException e) {
//			// e.printStackTrace();
//			// implement log4j
//			return false;
//		} 
////		LoginPageObjectClass loginPgObj = new LoginPageObjectClass(chromeDriver);
////		return loginPgObj.login_Button.isDisplayed();
//	}
//	
//	public boolean isLoginButtonEnabled() {
//		try
//		{
//			if(this.login_Button.isEnabled())
//			{
//				return true;
//			}
//			else
//			{
//				return false;
//			}
//		}
//		catch(NoSuchElementException e) {
//			// e.printStackTrace();
//			// implement log4j
//			return false;
//		}
////		LoginPageObjectClass loginPgObj = new LoginPageObjectClass(chromeDriver);
////		return loginPgObj.login_Button.isDisplayed();
//	}
//	
//	public void clickLoginButton() {
//		try {
//			this.login_Button.submit();
//		}
//		catch(NoSuchElementException e) {
//			e.printStackTrace();
//			// implement log4j
//		}
//	}
//	
//	public boolean isEmailDropDownDisplayed() {
//		try {
//			if(this.email_dropdown.isDisplayed())
//			{
//				return true;
//			}
//			else
//			{
//				return false;
//			}
//		}
//		catch(NoSuchElementException e) {
//			// e.printStackTrace();
//			// implement log4j
//			return false;
//		}
////		LoginPageObjectClass loginPgObj = new LoginPageObjectClass(chromeDriver);
////		return loginPgObj.email_dropdown.isDisplayed();
//	}
//	
//	public void clickEmailDropDown() {
//		try 
//		{
//			this.email_dropdown.click();
//		}
//		catch(NoSuchElementException e) {
//			e.printStackTrace();
//			// implement log4j
//		}
//	}
//	
//	public boolean isLogoutLinkDisplayed() {
//		try {
//			if(this.logout_link.isDisplayed())
//			{
//				return true;
//			}
//			else
//			{
//				return false;
//			}
//		}
//		catch(NoSuchElementException e) {
//			// e.printStackTrace();
//			// implement log4j
//			return false;
//		}
////		LoginPageObjectClass loginPgObj = new LoginPageObjectClass(chromeDriver);
////		return loginPgObj.logout_link.isDisplayed();
//	}
//	
//	public void clickLogoutLink(WebDriver chromeDriver) {
//		try {
//			highlightWebElement(chromeDriver, this.logout_link);
//			this.logout_link.click();
//		}
//		catch(NoSuchElementException e)
//		{
//			e.printStackTrace();
//		}
//	}
//	
//	public boolean isInvalidLoginTextDisplayed(WebDriver chromeDriver) {
//		CooperLoginPageObjectClass loginPgObj = new CooperLoginPageObjectClass(chromeDriver);
//		return loginPgObj.invalidLogin_Text.isDisplayed();
//	}
//	
//	public void highlightWebElement(WebDriver chromeDriver, WebElement elementName) {
//		JavascriptExecutor jse = (JavascriptExecutor) chromeDriver; // need to implement this in separate class & method
//		jse.executeScript("arguments[0].style.border='3px solid red'", elementName); // need to implement this in separate class & method
//	}
	
}
