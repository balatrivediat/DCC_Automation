package cooperTestScenarios;

import cooperPageObjects.CooperLoginPageObjectClass;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cooperPageObjects.CooperHomePageObjectClass;
import cooperProjectResources.CooperITestListener;
import cooperProjectResources.CooperUtilitiesClass;

public class CooperHomePageTestCasesClass extends CooperITestListener {
	
	CooperHomePageObjectClass homePgObjCls;
	CooperLoginPageObjectClass loginPgObjCls;
	
	public static FileInputStream fis;
	
	String sExecutionStatusPath = "C:\\Test_Automation\\Working_Dir\\Coopers_Selenium_Dir\\Test_Results_Screens\\Execution_Sheet_Status";
    //String sExecutionStatusFileName = "Test_Execution_Status.xlsx";    	        				        
    String sSheetName = "ExecutionStatus";
    String OutExecutionSheetName;
    
    String getScreenshotFileName = null;
	ExtentReports report;
	ExtentReports extent;
	ExtentTest logger;

	@Test(description="DCC Login Success and Home page validation")
	public void fnUserLoginSuccessTest(Method testMethod) throws InterruptedException {
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHomeLinkDisplayed(), "Home Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isFailPercentGraphDisplayed(), "Failure Percentage not displayed in Dashboard Screen");
		String strTCDescription = "User Login Success and Dashboard display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTCDescription);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="DCC Home Page - Logo display validation")
	public void fnValidateHomeAppLogoImg(Method testMethod) throws InterruptedException { 		        
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		String strTCDescription = "Home App Logo display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="DCC Home Page - Home link display validation")
	public void fnValidateHomeLink(Method testMethod) throws InterruptedException {	
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHomeLinkDisplayed(), "Home Link not displayed in Dashboard Screen");
		String strTCDescription = "Home Link display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="DCC Home Page - Home link click and home page display validation")
	public void fnValidateHomeLinkClick(Method testMethod) throws InterruptedException {
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHomeLinkDisplayed(), "Home Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isFailPercentGraphDisplayed(), "Failure Percentage not displayed in Dashboard Screen");	
		String strTCDescription = "Home link click and Dashboard display validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTCDescription);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="DCC Home Page - NotifEye link display validation")
	public void fnValidateNotifeyeLink(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHomeLinkDisplayed(), "Home Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		String strTCDescription = "Notifeye Link display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="DCC Home Page - HACCP link display validation")
	public void fnValidateHACCPLink(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHomeLinkDisplayed(), "Home Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		String strTCDescription = "HACCP Link display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="DCC Home Page - Language dropdown display validation")
	public void fnValidateHomeLanguageDrpDwn(Method testMethod) throws InterruptedException {	    
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHomeLinkDisplayed(), "Home Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isLanguageDropDownDisplayed(), "Language Drop Down not displayed in Login Screen");
		String strTCDescription = "Language Drop Down display and validation in Dashboard Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="DCC Home Page - Username dropdown display validation")
	public void fnUserNameAccountLink(Method testMethod) throws InterruptedException {
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHomeLinkDisplayed(), "Home Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isUserNameAccountLnkDisplayed(), "User Name Account not displayed in Dashboard Screen");
		String strTCDescription = "Account username link display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);	
	}
	
	@Test(description="DCC Home Page - My profile link display validation")
	public void fnMyProfileLinkTest(Method testMethod) throws InterruptedException {	
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver); 
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHomeLinkDisplayed(), "Home Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isUserNameAccountLnkDisplayed(), "User Name Account not displayed in Dashboard Screen");
		homePgObjCls.fnUserccountLnkClick();
		Assert.assertTrue(homePgObjCls.isMyProfileLnkDisplayed(), "My Profile Link not displayed in Dashboard Screen");
		String strTCDescription = "My Profile Screen Success display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="DCC Home Page - Logout link display validation")
	public void fnLogoutLinkTest(Method testMethod) throws InterruptedException {	
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHomeLinkDisplayed(), "Home Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isUserNameAccountLnkDisplayed(), "User Name Account not displayed in Dashboard Screen");
		homePgObjCls.fnUserccountLnkClick();
		Assert.assertTrue(homePgObjCls.isLogoutLnkDisplayed(), "Logout Link not displayed in Dashboard Screen");
		String strTCDescription = "Logout link display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);	
	}
	
	@Test(description="DCC Home Page - Logout link click and logout success validation")
	public void fnLogoutLinkClickTest(Method testMethod) throws InterruptedException {	
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHomeLinkDisplayed(), "Home Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isUserNameAccountLnkDisplayed(), "User Name Account not displayed in Dashboard Screen");
		homePgObjCls.fnUserccountLnkClick();
		Assert.assertTrue(homePgObjCls.isLogoutLnkDisplayed(), "Logout Link not displayed in Dashboard Screen");
		homePgObjCls.fnLogoutLnkClick();
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		Assert.assertTrue(loginPgObjCls.isUserNameTxtBoxDisplayed(), "User Name text box not displayed in Login Screen");
		String strTCDescription = "Logout Success and Login Screen display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);	
	}
	
	@Test(description="DCC Home Page - Dashboard button display validation")
	public void fnDashboardButtonTest(Method testMethod) throws InterruptedException {	
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHomeLinkDisplayed(), "Home link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isDashboardButtonDisplayed(), "Dashboard button is not displayed on Dashboard Screen");
		String strTCDescription = "Dashboard button display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);	
	}
	
	@Test(description="DCC Home Page - Alerts Tiles display validation")
	public void fnValidateAlertsTiles(Method testMethod) throws InterruptedException { 
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHomeLinkDisplayed(), "Home link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isAlertsTilesDisplayed(), "Alerts Tiles not displayed in Dashboard Screen");
		String strTCDescription = "Alerts Tiles display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="DCC Home Page - MisCommunications Tiles display validation")
	public void fnValidateMisCommunicationsTiles(Method testMethod) throws InterruptedException {		        
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHomeLinkDisplayed(), "Home link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isMisCommunicationsTilesDisplayed(), "Missed Communications Tiles not displayed on Dashboard Screen");
		String strTCDescription = "MisCommunications Tiles display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="DCC Home Page - Low Battery Tiles display validation")
	public void fnValidateLowBatteryTiles(Method testMethod) throws InterruptedException {		        
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHomeLinkDisplayed(), "Home link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed on Dashboard Screen");
		String strTCDescription = "Low Battery Tiles display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="DCC Home Page - Failure percentage graph display validation")
	public void fnValidateFailPercentGraphTest(Method testMethod) throws InterruptedException {		        
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHomeLinkDisplayed(), "Home link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isFailPercentGraphDisplayed(), "Failure percentage graph not displayed on Dashboard Screen");
		String strTCDescription = "Failure percentage graph display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="DCC Home Page - Menus text display validation")
	public void fnValidateMenusTextTest(Method testMethod) throws InterruptedException {		        
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHomeLinkDisplayed(), "Home link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isMenusTextDisplayed(), "Menus text not displayed on Dashboard Screen");
		String strTCDescription = "Menus text display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="DCC Home Page - Failed temperatures text display validation")
	public void fnValidateFailedTempsTextTest(Method testMethod) throws InterruptedException {		        
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHomeLinkDisplayed(), "Home link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isFailedTempsTextDisplayed(), "Failed Temperatures text not displayed on Dashboard Screen");
		String strTCDescription = "Failed Temperatures text display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="DCC Home Page - Pending Menus label display validation")
	public void fnValidatePendingMenusLabel(Method testMethod) throws InterruptedException {	
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHomeLinkDisplayed(), "Home link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isPendingMenus_TxtDisplayed(), "Pending Menus label not displayed in Dashboard Screen");
		String strTCDescription = "Pending Menus label display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="DCC Home Page - Checklists text display validation")
	public void fnValidateChecklistsText(Method testMethod) throws InterruptedException {	
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHomeLinkDisplayed(), "Home link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isChecklistsTextDisplayed(), "Checklists text not displayed in Dashboard Screen");
		String strTCDescription = "Checklists text display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	
	@Test(description="DCC Home Page - Not in Compliance Tasks text display validation")
	public void fnValidateNotComplianceTaskslabel(Method testMethod) throws InterruptedException {
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHomeLinkDisplayed(), "Home link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotinComplianceTxtDisplayed(), "Not in Compliance Tasks text not displayed in Dashboard Screen");
		String strTCDescription = "Not in Compliance Tasks text display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="DCC Home Page - Pending Checklists label display validation")
	public void fnValidatePendingChecklistsLabel(Method testMethod) throws InterruptedException {
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHomeLinkDisplayed(), "Home link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isPendingChecklists_TxtDisplayed(), "Pending Checklists label not displayed in Dashboard Screen");
		String strTCDescription = "Pending Checklists label display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="DCC Home Page - Dashboard page display validation")
	public void fnDashboardPageTest(Method testMethod) throws InterruptedException {	
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHomeLinkDisplayed(), "Home link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isDashboardButtonDisplayed(), "Dashboard button is not displayed on Dashboard Screen");
		homePgObjCls.clickDashboardButton();
		Assert.assertTrue(homePgObjCls.isAlertsTilesDisplayed(), "Alerts tile is not displayed on Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isMisCommunicationsTilesDisplayed(), "Alerts tile is not displayed on Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Alerts tile is not displayed on Dashboard Screen");
		String strTCDescription = "Dashboard page display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);	
	}
	
	@Test(description="DCC Home Page - Location Summary Button display validation")
	public void fnValidateLocationSummaryButton(Method testMethod) throws InterruptedException {
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHomeLinkDisplayed(), "Home link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isLocationSummaryBtnDisplayed(), "Location Summary Button not displayed in Dashboard Screen");
		String strTCDescription = "Location Summary Button display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="DCC Home Page - Location Summary screen display validation")
	public void fnValidateLocationSummaryPageTest(Method testMethod) throws InterruptedException {
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHomeLinkDisplayed(), "Home link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isLocationSummaryBtnDisplayed(), "Location Summary Button not displayed in Dashboard Screen");
		homePgObjCls.locationSummaryBtnClick();
		Assert.assertTrue(homePgObjCls.isRootLinkDisplayed(), "Root Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isCorporateLabelDisplayed(), "Corporate Label not displayed in Dashboard Screen");
		String strTCDescription = "Location Summary screen display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="DCC Home Page - Root Link display validation")
	public void fnValidateRootLinkDisplay(Method testMethod) throws InterruptedException {
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHomeLinkDisplayed(), "Home link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isLocationSummaryBtnDisplayed(), "Location Summary Button not displayed in Dashboard Screen");
		homePgObjCls.locationSummaryBtnClick();
		Assert.assertTrue(homePgObjCls.isRootLinkDisplayed(), "Root Link not displayed in Dashboard Screen");
		String strTCDescription = "Root Link display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="DCC Home Page - Corporate Label display validation")
	public void fnValidateCorporateLabelDisplay(Method testMethod) throws InterruptedException {
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHomeLinkDisplayed(), "Home link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isLocationSummaryBtnDisplayed(), "Location Summary Button not displayed in Dashboard Screen");
		homePgObjCls.locationSummaryBtnClick();
		Assert.assertTrue(homePgObjCls.isCorporateLabelDisplayed(), "Corporate Label not displayed in Dashboard Screen");
		String strTCDescription = "Corporate Label display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="DCC Home Page - Alerts Text display validation under Location Summary")
	public void fnValidateLocSummaryAlertsText(Method testMethod) throws InterruptedException {
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isLocationSummaryBtnDisplayed(), "Location Summary Button not displayed in Dashboard Screen");
		homePgObjCls.locationSummaryBtnClick();
		Assert.assertTrue(homePgObjCls.isLocSummaryAlertsTextDisplayed(), "Alerts Text not displayed under Location Summary on Dashboard Screen");
		String strTCDescription = "Alerts Text validation under Location Summary on Dashboard Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="DCC Home Page - Missed Communications Text validation under Location Summary on Dashboard Screen")
	public void fnValidateLocSummaryMisCommText(Method testMethod) throws InterruptedException {
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isLocationSummaryBtnDisplayed(), "Location Summary Button not displayed in Dashboard Screen");
		homePgObjCls.locationSummaryBtnClick();
		Assert.assertTrue(homePgObjCls.isLocSummaryMisCommTextDisplayed(), "Missed Communications Text not displayed under Location Summary on Dashboard Screen");
		String strTCDescription = "Missed Communications Text validation under Location Summary on Dashboard Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="DCC Home Page - Low Battery Text validation under Location Summary on Dashboard Screen")
	public void fnValidateLocSummaryLowBatteryText(Method testMethod) throws InterruptedException {
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isLocationSummaryBtnDisplayed(), "Location Summary Button not displayed in Dashboard Screen");
		homePgObjCls.locationSummaryBtnClick();
		Assert.assertTrue(homePgObjCls.isLocSummaryLowBatteryTextDisplayed(), "Low Battery Text not displayed under Location Summary on Dashboard Screen");
		String strTCDescription = "Low Battery Text validation under Location Summary on Dashboard Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="DCC Home Page - Failed Temperatures Text validation under Location Summary on Dashboard Screen")
	public void fnValidateLocSummaryFailedTempsText(Method testMethod) throws InterruptedException {
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isLocationSummaryBtnDisplayed(), "Location Summary Button not displayed in Dashboard Screen");
		homePgObjCls.locationSummaryBtnClick();
		Assert.assertTrue(homePgObjCls.isLocSummaryFailedTempsTextDisplayed(), "Failed Temperatures Text not displayed under Location Summary on Dashboard Screen");
		String strTCDescription = "Failed Temperatures Text validation under Location Summary on Dashboard Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="DCC Home Page - Failed Checklists Text validation under Location Summary on Dashboard Screen")
	public void fnValidateLocSumFailedChklistsText(Method testMethod) throws InterruptedException {
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isLocationSummaryBtnDisplayed(), "Location Summary Button not displayed in Dashboard Screen");
		homePgObjCls.locationSummaryBtnClick();
		Assert.assertTrue(homePgObjCls.isLocSumFailedChklistsTextDisp(), "Failed Checklists Text not displayed under Location Summary on Dashboard Screen");
		String strTCDescription = "Failed Checklists Text validation under Location Summary on Dashboard Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="DCC Home Page - Hierarchy view link validation under Location Summary on Dashboard Screen")
	public void fnValidateLocSumHierarchyViewLink(Method testMethod) throws InterruptedException {
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isLocationSummaryBtnDisplayed(), "Location Summary Button not displayed in Dashboard Screen");
		homePgObjCls.locationSummaryBtnClick();
		Assert.assertTrue(homePgObjCls.isLocSumHierarchyViewLinkDisp(), "Hierarchy view link not displayed under Location Summary on Dashboard Screen");
		String strTCDescription = "Hierarchy view link validation under Location Summary on Dashboard Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="DCC Home Page - List view link validation under Location Summary on Dashboard Screen")
	public void fnValidateLocSumListViewLink(Method testMethod) throws InterruptedException {
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isLocationSummaryBtnDisplayed(), "Location Summary Button not displayed in Dashboard Screen");
		homePgObjCls.locationSummaryBtnClick();
		Assert.assertTrue(homePgObjCls.isLocSumListViewLinkDisp(), "List view link not displayed under Location Summary on Dashboard Screen");
		String strTCDescription = "List view link validation under Location Summary on Dashboard Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="DCC Home Page - Map view link validation under Location Summary on Dashboard Screen")
	public void fnValidateLocSumMapViewLink(Method testMethod) throws InterruptedException {
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isLocationSummaryBtnDisplayed(), "Location Summary Button not displayed in Dashboard Screen");
		homePgObjCls.locationSummaryBtnClick();
		Assert.assertTrue(homePgObjCls.isLocSumMapViewLinkDisp(), "Map view link not displayed under Location Summary on Dashboard Screen");
		String strTCDescription = "Map view link validation under Location Summary on Dashboard Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="DCC Home Page - Hierarchy view page display validation")
	public void fnValidateLocSumHierarchyViewPage(Method testMethod) throws InterruptedException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHomeLinkDisplayed(), "Home link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isLocationSummaryBtnDisplayed(), "Location Summary Button not displayed in Dashboard Screen");
		homePgObjCls.locationSummaryBtnClick();
		Assert.assertTrue(homePgObjCls.isLocSumHierarchyViewLinkDisp(), "Hierarchy view link not displayed under Location Summary on Dashboard Screen");
		homePgObjCls.clickHierarchyViewLink();
		Assert.assertTrue(homePgObjCls.isRootLinkDisplayed(), "Root Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isCorporateLabelDisplayed(), "Corporate Label not displayed in Dashboard Screen");
		String strTCDescription = "Hierarchy View page display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="DCC Home Page - List view page validation under Location Summary on Dashboard Screen")
	public void fnValidateLocSumListViewPage(Method testMethod) throws InterruptedException {
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isLocationSummaryBtnDisplayed(), "Location Summary Button not displayed in Dashboard Screen");
		homePgObjCls.locationSummaryBtnClick();
		Assert.assertTrue(homePgObjCls.isLocSumListViewLinkDisp(), "List view link not displayed under Location Summary on Dashboard Screen");
		homePgObjCls.clickListViewLink();
		Assert.assertTrue(homePgObjCls.isListViewTableDisplayed(), "List view table not displayed under Location Summary on Dashboard Screen");
		String strTCDescription = "List view page validation under Location Summary on Dashboard Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="DCC Home Page - Map view page validation under Location Summary on Dashboard Screen")
	public void fnValidateLocSumMapViewPage(Method testMethod) throws InterruptedException {
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isLocationSummaryBtnDisplayed(), "Location Summary Button not displayed in Dashboard Screen");
		homePgObjCls.locationSummaryBtnClick();
		Assert.assertTrue(homePgObjCls.isLocSumMapViewLinkDisp(), "Map view link not displayed under Location Summary on Dashboard Screen");
		homePgObjCls.clickMapViewLink();
		Assert.assertTrue(homePgObjCls.isMapViewDisplayed(), "Map view not displayed under Location Summary on Dashboard Screen");
		String strTCDescription = "Map view page validation under Location Summary on Dashboard Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="DCC Home Page - Bell image validation under Location Summary on Dashboard Screen")
	public void fnValidateBellImageDisplay(Method testMethod) throws InterruptedException {
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isLocationSummaryBtnDisplayed(), "Location Summary Button not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isBellImageDisplayed(), "Bell image not displayed in Dashboard Screen");
		String strTCDescription = "Bell image validation under Location Summary on Dashboard Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
}
