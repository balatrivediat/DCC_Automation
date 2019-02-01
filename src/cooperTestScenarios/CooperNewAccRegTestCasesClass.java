package cooperTestScenarios;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cooperPageObjects.CooperLoginPageObjectClass;
import cooperPageObjects.CooperNewAccRegPageObjectClass;
import cooperProjectResources.CooperITestListener;
import cooperProjectResources.CooperUtilitiesClass;

public class CooperNewAccRegTestCasesClass extends CooperITestListener {
	
	CooperLoginPageObjectClass loginPgObjCls;
	CooperNewAccRegPageObjectClass newAccRegPgObjCls;
	
	String sExecutionStatusPath = "C:\\Test_Automation\\Working_Dir\\Coopers_Selenium_Dir\\Test_Results_Screens\\Execution_Sheet_Status";
    //String sExecutionStatusFileName = "Test_Execution_Status.xlsx";    	        				        
    String sSheetName = "ExecutionStatus";
    String OutExecutionSheetName;
    
    String getScreenshotFileName = null;
	ExtentReports report;
	ExtentReports extent;
	ExtentTest logger;
	
	@Test(description="New User registration page display validation")
	public void fnValidateNewUserPageTest(Method testMethod) throws InterruptedException {
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		newAccRegPgObjCls = new CooperNewAccRegPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		Assert.assertTrue(loginPgObjCls.isNewUserRegistrationBtnDisplayed(), "New User Button not displayed in Login Screen");
		loginPgObjCls.fnnewUserBtnClick();
		Assert.assertTrue(newAccRegPgObjCls.isEmail_InputDisplayed(), "Email Input not displayed in Login Screen");
		Assert.assertTrue(newAccRegPgObjCls.isVerify_ButtonDisplayed(), "Verify Button not displayed in Login Screen");
		Assert.assertTrue(newAccRegPgObjCls.isAdditionalSetup_LinkDisplayed(), "Additional Set up link not displayed in Login Screen");
		String strTCDescription = "New User Page display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);		
	}
	
	@Test(description="Email Textbox display validation on DCC New user registration page")
	public void fnValidateNewUserEmailInput(Method testMethod) throws InterruptedException {       					        
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		newAccRegPgObjCls = new CooperNewAccRegPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		Assert.assertTrue(loginPgObjCls.isNewUserRegistrationBtnDisplayed(), "New User Button not displayed in Login Screen");
		loginPgObjCls.fnnewUserBtnClick();
		Assert.assertTrue(newAccRegPgObjCls.isEmail_InputDisplayed(), "Email Input not displayed in Login Screen");
		Assert.assertTrue(newAccRegPgObjCls.isVerify_ButtonDisplayed(), "Verify Button not displayed in Login Screen");
		Assert.assertTrue(newAccRegPgObjCls.isAdditionalSetup_LinkDisplayed(), "Additional Set up link not displayed in Login Screen");
		String strTCDescription = "New User Email Input display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Verify display validation on DCC New user registration page")
	public void fnValidateNewUserVerifyButton(Method testMethod) throws InterruptedException {       					        
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		newAccRegPgObjCls = new CooperNewAccRegPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		Assert.assertTrue(loginPgObjCls.isNewUserRegistrationBtnDisplayed(), "New User Button not displayed in Login Screen");
		loginPgObjCls.fnnewUserBtnClick();
		Assert.assertTrue(newAccRegPgObjCls.isEmail_InputDisplayed(), "Email Input not displayed in Login Screen");
		Assert.assertTrue(newAccRegPgObjCls.isVerify_ButtonDisplayed(), "Verify Button not displayed in Login Screen");
		Assert.assertTrue(newAccRegPgObjCls.isAdditionalSetup_LinkDisplayed(), "Additional Set up link not displayed in Login Screen");
		String strTCDescription = "New User Verify Button display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Additional Setup link display validation on DCC New user registration page")
	public void fnValidateNewUserAdditionalSetUp(Method testMethod) throws InterruptedException {       					        
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		newAccRegPgObjCls = new CooperNewAccRegPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		Assert.assertTrue(loginPgObjCls.isNewUserRegistrationBtnDisplayed(), "New User Button not displayed in Login Screen");
		loginPgObjCls.fnnewUserBtnClick();
		Assert.assertTrue(newAccRegPgObjCls.isEmail_InputDisplayed(), "Email Input not displayed in Login Screen");
		Assert.assertTrue(newAccRegPgObjCls.isVerify_ButtonDisplayed(), "Verify Button not displayed in Login Screen");
		Assert.assertTrue(newAccRegPgObjCls.isAdditionalSetup_LinkDisplayed(), "Additional Set up link not displayed in Login Screen");
		String strTCDescription = "New User Additional Set up link display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}

	@Test(description="Note text display validation on DCC New user registration page")
	public void fnValidateNewUserNotesText(Method testMethod) throws InterruptedException {  		        
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		newAccRegPgObjCls = new CooperNewAccRegPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		Assert.assertTrue(loginPgObjCls.isNewUserRegistrationBtnDisplayed(), "New User Button not displayed in Login Screen");
		loginPgObjCls.fnnewUserBtnClick();
		Assert.assertTrue(newAccRegPgObjCls.isEmail_InputDisplayed(), "Email Input not displayed in Login Screen");
		Assert.assertTrue(newAccRegPgObjCls.isVerify_ButtonDisplayed(), "Verify Button not displayed in Login Screen");
		Assert.assertTrue(newAccRegPgObjCls.isNotesText_LabelDisplayed(), "Notes Text not displayed in Login Screen");
		String strTCDescription = "New User Notes Text display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Note label display validation on DCC New user registration page")
	public void fnValidateNewUserNotesLabel(Method testMethod) throws InterruptedException {	  
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		newAccRegPgObjCls = new CooperNewAccRegPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		Assert.assertTrue(loginPgObjCls.isNewUserRegistrationBtnDisplayed(), "New User Button not displayed in Login Screen");
		loginPgObjCls.fnnewUserBtnClick();
		Assert.assertTrue(newAccRegPgObjCls.isEmail_InputDisplayed(), "Email Input not displayed in Login Screen");
		Assert.assertTrue(newAccRegPgObjCls.isVerify_ButtonDisplayed(), "Verify Button not displayed in Login Screen");
		Assert.assertTrue(newAccRegPgObjCls.isNotes_LabelDisplayed(), "Notes Label not displayed in Login Screen");
		String strTCDescription = "New User Notes Label display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Emerson logo display validation on DCC New user registration page")
	public void fnValidateEmersonLogoDisplay(Method testMethod) throws InterruptedException {	  
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		newAccRegPgObjCls = new CooperNewAccRegPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		Assert.assertTrue(loginPgObjCls.isNewUserRegistrationBtnDisplayed(), "New User Button not displayed in Login Screen");
		loginPgObjCls.fnnewUserBtnClick();
		Assert.assertTrue(newAccRegPgObjCls.isEmersonLogoDisplayed(), "Emerson logo not displayed on DCC New user registration page");
		String strTCDescription = "Emerson logo display validation on DCC New user registration page";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Cooper Atkins logo display validation on DCC New user registration page")
	public void fnValidateCooperAtkinsLogoDisplay(Method testMethod) throws InterruptedException {	  
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		newAccRegPgObjCls = new CooperNewAccRegPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		Assert.assertTrue(loginPgObjCls.isNewUserRegistrationBtnDisplayed(), "New User Button not displayed in Login Screen");
		loginPgObjCls.fnnewUserBtnClick();
		Assert.assertTrue(newAccRegPgObjCls.isCooperAtkinsLogoDisplayed(), "Cooper Atkins logo not displayed on DCC New user registration page");
		String strTCDescription = "Cooper Atkins logo display validation on DCC New user registration page";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
}
