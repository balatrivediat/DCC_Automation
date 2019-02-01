package cooperTestScenarios;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cooperPageObjects.CooperHomePageObjectClass;
import cooperPageObjects.CooperLoginPageObjectClass;
import cooperProjectResources.CooperITestListener;
import cooperProjectResources.CooperUtilitiesClass;

public class CooperLoginScreenTestCasesClass extends CooperITestListener {
	
	CooperLoginPageObjectClass loginPgObjCls;
	CooperHomePageObjectClass homePgObjCls;
	
	public static FileInputStream fis;
	
	String sExecutionStatusPath = "C:\\MALLIKARJUN\\SELENIUM\\CooperProject\\test-output";
    // String sExecutionStatusFileName = "Test_Execution_Status.xlsx";    	        				        
    String sSheetName = "ExecutionStatus";
    String OutExecutionSheetName = "Test_Execution_Status.xlsx";
    
    String getScreenshotFileName = null;
	ExtentReports report;
	ExtentReports extent;
	ExtentTest logger;
	
	@Test(description="DCC Login screen display validation")
	public void fnValidateLoginScreenTest(Method testMethod) throws InterruptedException, IOException {			        
		String strTestCaseName = testMethod.getName();
        loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		Thread.sleep(2000);
		String strTCDescription = "Login screen display and validation for Cooper";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Emerson Logo display validation on DCC Login Screen")
	public void fnValidateEmersonLogoImage(Method testMethod) throws InterruptedException, IOException {			        
		String strTestCaseName = testMethod.getName();
        loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		Thread.sleep(2000);
		String strTCDescription = "Emerson Logo display and validation on Cooper login page";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="UserName text box display validation on DCC Login Screen")
	public void fnValidateLoginUserNameTxtBx(Method testMethod) throws InterruptedException, IOException {	    			        
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isUserNameTxtBoxDisplayed(), "User Name text box not displayed in Login Screen");
		Thread.sleep(2000);
		String strTCDescription = "UserName text box display and validation on Cooper Login Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Password text box display validation on DCC Login Screen")
	public void fnValidateLoginPasswordTxtBx(Method testMethod) throws InterruptedException {			        
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isPasswordTxtBoxDisplayed(), "Password text box not displayed in Login Screen");
		Thread.sleep(2000);
		String strTCDescription = "Password text box display and validation on Cooper Login Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Login button display validation on DCC Login Screen")
	public void fnValidateLoginLoginButton(Method testMethod) throws InterruptedException {	       			        
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isLoginButtonDisplayed(), "Login Button not displayed in Login Screen");
		Thread.sleep(2000);
		String strTCDescription = "Login Button display and validation on Cooper Login Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="New Account registration button display validation on DCC Login Screen")
	public void fnValidateNewAccRegistrationButton(Method testMethod) throws InterruptedException {	       			        
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isNewUserRegistrationBtnDisplayed(), "New Account Registration Button not displayed in Login Screen");
		Thread.sleep(2000);
		String strTCDescription = "New Account registration Button display and validation on Cooper Login Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Forgot Password link display validation on DCC Login Screen")
	public void fnValidateForgotPasswordLnk(Method testMethod) throws InterruptedException {	       			        
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isForgotPwdLinkDisplayed(), "Forgot password link not displayed in Login Screen");
		Thread.sleep(2000);
		String strTCDescription = "Forgot password link display and validation on Cooper Login Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Cooper Atkins Logo display validation on DCC Login Screen")
	public void fnValidateAtkinLogoImage(Method testMethod) throws InterruptedException {	       			        
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isCooperAtkinsLogoDisplayed(), "Cooper Atkins Logo not displayed in Login Screen");
		Thread.sleep(2000);
		String strTCDescription = "Cooper Atkins Logo display and validation on Cooper Login Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Language Dropdown display validation on DCC Login Screen")
	public void fnValidateLanguageDrpdwn(Method testMethod) throws InterruptedException {	       			        
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isLanguageDropdownDisplayed(), "Language Dropdown not displayed in Login Screen");
		Thread.sleep(2000);
		String strTCDescription = "Language Dropdown display and validation on Cooper Login Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
//	@BeforeTest
//	public void fnMoveFiles() throws IOException {
//		File destinationFolder = new File("C:\\MALLIKARJUN\\SELENIUM\\CooperProject\\Test_Results_Screens\\Results_Backup");
//	    File sourceFolder = new File("C:\\MALLIKARJUN\\SELENIUM\\CooperProject\\Test_Results_Screens\\Screenshots");
//	    File sExcelsourceFolder = new File("C:\\MALLIKARJUN\\SELENIUM\\CooperProject\\Test_Results_Screens\\Test_Execution_Results_Sheet");
//	    if (!destinationFolder.exists())
//	    {
//	        destinationFolder.mkdirs();
//	    }
//	    // Check whether source exists and it is folder.
//	    if (sourceFolder.exists() && sourceFolder.isDirectory())
//	    {
//	        // Get list of the files and iterate over them
//	        File[] listOfFiles = sourceFolder.listFiles();
//	        if (listOfFiles != null)
//	        {
//	            for (File child : listOfFiles )
//	            {
//	                // Move files to destination folder
//	                child.renameTo(new File(destinationFolder + "\\" + child.getName()));
//	                child.delete();
//	            }
//	            // Add if you want to delete the source folder 
////	            sourceFolder.delete();
//	        }
//	    }
//	    else
//	    {
//	        System.out.println(sourceFolder + " Folder does not exists");
//	    }
//	    
//	 // Check weather source exists and it is folder.
//	    if (sExcelsourceFolder.exists() && sExcelsourceFolder.isDirectory())
//	    {
//	        // Get list of the files and iterate over them
//	        File[] listOfFiles = sExcelsourceFolder.listFiles();
//	        if (listOfFiles != null)
//	        {
//	            for (File child : listOfFiles )
//	            {
//	                // Move files to destination folder
//	                child.renameTo(new File(destinationFolder + "\\" + child.getName()));
//	                child.delete();
//	            }
//	            // Add if you want to delete the source folder 
////	            sourceFolder.delete();
//	        }
//	    }
//	    else
//	    {
//	        System.out.println(sExcelsourceFolder + " Folder does not exists");
//	    }
//	}
}
