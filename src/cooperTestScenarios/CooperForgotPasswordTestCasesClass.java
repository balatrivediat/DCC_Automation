package cooperTestScenarios;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cooperPageObjects.CooperForgotPasswordPageObjectClass;
import cooperPageObjects.CooperLoginPageObjectClass;
import cooperProjectResources.CooperITestListener;
import cooperProjectResources.CooperUtilitiesClass;

public class CooperForgotPasswordTestCasesClass extends CooperITestListener {
	
	CooperLoginPageObjectClass loginPgObjCls;
	CooperForgotPasswordPageObjectClass forgotPassPgObjCls;
	
public static FileInputStream fis;
	
	String sExecutionStatusPath = "C:\\Test_Automation\\Working_Dir\\Coopers_Selenium_Dir\\Test_Results_Screens\\Execution_Sheet_Status";
    //String sExecutionStatusFileName = "Test_Execution_Status.xlsx";    	        				        
    String sSheetName = "ExecutionStatus";
    String OutExecutionSheetName;
    
    String getScreenshotFileName = null;
	ExtentReports report;
	ExtentReports extent;
	ExtentTest logger;
	
	@Test(description="DCC Forgot password page display validation")
	public void fnValidateForgotPasswordPageTest(Method testMethod) throws InterruptedException {	     
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		forgotPassPgObjCls = new CooperForgotPasswordPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		Assert.assertTrue(loginPgObjCls.isForgotPwdLinkDisplayed(), "Forgot Password Link not displayed in Login Screen");
		loginPgObjCls.fnforgotPasswordLnkClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(forgotPassPgObjCls.isEmail_InputDisplayed(), "Forgot Email Text Box not displayed in Forgot Password Screen");
		Assert.assertTrue(forgotPassPgObjCls.isSendPassword_ButtonDisplayed(), "Send Password Button not displayed in Forgot Password Screen");
		Assert.assertTrue(forgotPassPgObjCls.isCancel_ButtonDisplayed(), "Cancel Button not displayed in Forgot Password Screen");
		String strTCDescription = "Forgot Password Page display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Emerson Logo display validation on DCC Forgot Password page")
	public void fnValidateForgotPassEmersonLogo(Method testMethod) throws InterruptedException {	     
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		forgotPassPgObjCls = new CooperForgotPasswordPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		Assert.assertTrue(loginPgObjCls.isForgotPwdLinkDisplayed(), "Forgot Password Link not displayed in Login Screen");
		loginPgObjCls.fnforgotPasswordLnkClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(forgotPassPgObjCls.isEmersonLogoDisplayed(), "Emerson logo not displayed on Forgot Password Screen");
		String strTCDescription = "Emerson logo display and validation on Forgot password screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Cooper Atkins Logo display validation on DCC Forgot Password page")
	public void fnValidateForgotPassCooperAtkinsLogo(Method testMethod) throws InterruptedException {	     
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		forgotPassPgObjCls = new CooperForgotPasswordPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		Assert.assertTrue(loginPgObjCls.isForgotPwdLinkDisplayed(), "Forgot Password Link not displayed in Login Screen");
		loginPgObjCls.fnforgotPasswordLnkClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(forgotPassPgObjCls.isCooperAtkinsLogoDisp(), "Cooper Atkins logo not displayed on Forgot Password Screen");
		String strTCDescription = "Cooper Atkins logo display and validation on Forgot password screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}

	@Test(description="Forgot Email Textbox display validation on DCC Forgot Password page")
	public void fnValidateForgotPwdEmailTxtBx(Method testMethod) throws InterruptedException {	    
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		forgotPassPgObjCls = new CooperForgotPasswordPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		Assert.assertTrue(loginPgObjCls.isForgotPwdLinkDisplayed(), "Forgot Password Link not displayed in Login Screen");
		loginPgObjCls.fnforgotPasswordLnkClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(forgotPassPgObjCls.isEmail_InputDisplayed(), "Forgot Email Text Box not displayed in Forgot Password Screen");
		Assert.assertTrue(forgotPassPgObjCls.isSendPassword_ButtonDisplayed(), "Send Password Button not displayed in Forgot Password Screen");
		Assert.assertTrue(forgotPassPgObjCls.isCancel_ButtonDisplayed(), "Cancel Button not displayed in Forgot Password Screen");
		String strTCDescription = "Forgot Email Text Box display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);		
	}
	
	@Test(description="Send Password button display validation on DCC Forgot Password page")
	public void fnValidateSendPasswordButton(Method testMethod) throws InterruptedException {	
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		forgotPassPgObjCls = new CooperForgotPasswordPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		Assert.assertTrue(loginPgObjCls.isForgotPwdLinkDisplayed(), "Forgot Password Link not displayed in Login Screen");
		loginPgObjCls.fnforgotPasswordLnkClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(forgotPassPgObjCls.isEmail_InputDisplayed(), "Forgot Email Text Box not displayed in Forgot Password Screen");
		Assert.assertTrue(forgotPassPgObjCls.isSendPassword_ButtonDisplayed(), "Send Password Button not displayed in Forgot Password Screen");
		Assert.assertTrue(forgotPassPgObjCls.isCancel_ButtonDisplayed(), "Cancel Button not displayed in Forgot Password Screen");
		String strTCDescription = "Send Password Button display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Forgot Password Cancel button display validation on DCC Forgot Password page")
	public void fnValidateForgotPWDCancelButton(Method testMethod) throws InterruptedException {	        
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		forgotPassPgObjCls = new CooperForgotPasswordPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		Assert.assertTrue(loginPgObjCls.isForgotPwdLinkDisplayed(), "Forgot Password Link not displayed in Login Screen");
		loginPgObjCls.fnforgotPasswordLnkClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(forgotPassPgObjCls.isEmail_InputDisplayed(), "Forgot Email Text Box not displayed in Forgot Password Screen");
		Assert.assertTrue(forgotPassPgObjCls.isSendPassword_ButtonDisplayed(), "Send Password Button not displayed in Forgot Password Screen");
		Assert.assertTrue(forgotPassPgObjCls.isCancel_ButtonDisplayed(), "Cancel Button not displayed in Forgot Password Screen");
		String strTCDescription = "Forgot PWD Cancel Button display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);		
	}
}
