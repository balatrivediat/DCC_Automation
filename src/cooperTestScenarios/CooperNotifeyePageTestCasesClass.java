package cooperTestScenarios;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cooperPageObjects.CooperHomePageObjectClass;
import cooperPageObjects.CooperLoginPageObjectClass;
import cooperPageObjects.CooperNotifeyePageObjectClass;
import cooperProjectResources.CooperITestListener;
import cooperProjectResources.CooperUtilitiesClass;

public class CooperNotifeyePageTestCasesClass extends CooperITestListener {

public static FileInputStream fis;

	CooperNotifeyePageObjectClass notifeyePgObjCls;
	CooperHomePageObjectClass homePgObjCls;
	CooperLoginPageObjectClass loginPgObjCls;

	String sExecutionStatusPath = "C:\\Test_Automation\\Working_Dir\\Coopers_Selenium_Dir\\Test_Results_Screens\\Execution_Sheet_Status";
    //String sExecutionStatusFileName = "Test_Execution_Status.xlsx";    	        				        
    String sSheetName = "ExecutionStatus";
    String OutExecutionSheetName;
    
    String getScreenshotFileName = null;
	ExtentReports report;
	ExtentReports extent;
	ExtentTest logger;
	
	@Test(description="Notifeye page display validation")
	public void fnValidateNotifeyePageTest(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		//Assert.assertTrue(notifeyePgObjCls.isAllLocsLabelDisplayed(), "All Locations text not displayed on Notifeye Screen");
		//webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		//Assert.assertTrue(notifeyePgObjCls.isAllLocsDropDownDisplayed(), "All Locations drop down not displayed on Notifeye Screen");
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(notifeyePgObjCls.isCorporateLblDispOnNotifeyeHome(), "Corporate Label not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isGatewaysLabelDisplayed(), "Gateways Label not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isSensorsLabelDisplayed(), "Sensors Label not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isSensorsButtonDisplayed(), "Sensors Button not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isCorporateButtonDisplayed(), "Corporate Button not displayed on Notifeye Screen");
		//Assert.assertTrue(notifeyePgObjCls.isTemp1TextDisplayed(), "All Locations drop down not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isGatewaysButtonDisplayed(), "Gateways Button not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isCompareSensorsButtonDisplayed(), "Compare Sensors Button not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isFilterBySensorNameTxtBxDisplayed(), "Filter By Sensor Name Text Box not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isFilterByTypeDropDownDisplayed(), "Filter By Sensor Name Drop down not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isFilterByStatusDropDownDisplayed(), "Filter By Status Drop down not displayed on Notifeye Screen");
		String strTCDescription = "Notifeye Page display and validation on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - All Locations Label display validation")
	public void fnValidateAllLocationsLabel(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isAllLocsLabelDisplayed(), "All Locations text not displayed on Notifeye Screen");
		String strTCDescription = "All Locations label display and validation on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - All Locations Dropdown display validation")
	public void fnValidateAllLocationsDrpDown(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isAllLocsDropDownDisplayed(), "All Locations drop down not displayed on Notifeye Screen");
		String strTCDescription = "All Locations label display and validation on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Corporate label display validation")
	public void fnValCorporateLblDispOnNotifeyeHome(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(notifeyePgObjCls.isCorporateLblDispOnNotifeyeHome(), "Corporate label not displayed on Notifeye Screen");
		String strTCDescription = "Corporate label display and validation on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Gateways label display validation")
	public void fnValidateGatewaysLabel(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(notifeyePgObjCls.isGatewaysLabelDisplayed(), "Gateways label not displayed on Notifeye Screen");
		String strTCDescription = "Gateways label display and validation on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
		
	@Test(description="Notifeye page - Sensors label display validation")
	public void fnValidateSensorsLabel(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(notifeyePgObjCls.isSensorsLabelDisplayed(), "Sensors label not displayed on Notifeye Screen");
		String strTCDescription = "Sensors label display and validation on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Corporate Button display validation")
	public void fnValCorporateBtnDispOnNotifeyeHome(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(notifeyePgObjCls.isCorporateButtonDisplayed(), "Corporate Button not displayed on Notifeye Screen");
		String strTCDescription = "Corporate Button display and validation on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Sensors button display validation")
	public void fnValidateSensorsButton(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(notifeyePgObjCls.isSensorsButtonDisplayed(), "Sensors Button not displayed on Notifeye Screen");
		String strTCDescription = "Sensors button display and validation on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Compare sensors button display validation")
	public void fnValidateCompareSensorsButton(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(notifeyePgObjCls.isSensorsButtonDisplayed(), "Sensors Button not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isCompareSensorsButtonDisplayed(), "Compare Sensors Button not displayed on Notifeye Screen");
		String strTCDescription = "Compare Sensors button display and validation on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Filter By Sensor Name Text Box display validation")
	public void fnValidateFilterBySensorNameTxtBx(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(notifeyePgObjCls.isSensorsButtonDisplayed(), "Sensors Button not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isFilterBySensorNameTxtBxDisplayed(), "Filter By Sensor Name Text Box not displayed on Notifeye Screen");
		String strTCDescription = "Filter By Sensor Name Text Box display and validation on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Filter By Type drop down display validation")
	public void fnValidateFilterByTypeDropDown(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(notifeyePgObjCls.isSensorsButtonDisplayed(), "Sensors Button not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isFilterByTypeDropDownDisplayed(), "Filter By Type drop down not displayed on Notifeye Screen");
		String strTCDescription = "Filter By Type drop down display and validation on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Filter By Status drop down display validation")
	public void fnValidateFilterByStatusDropDown(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(notifeyePgObjCls.isSensorsButtonDisplayed(), "Sensors Button not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isFilterByStatusDropDownDisplayed(), "Filter By Status drop down not displayed on Notifeye Screen");
		String strTCDescription = "Filter By Status drop down display and validation on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Home App Logo display validation")
	public void fnValidateHomeLogoInNotifeye(Method testMethod) throws InterruptedException { 		        
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed on Notifeye Screen");
		String strTCDescription = "Home App Logo display and validation on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Home Link display validation")
	public void fnValidateHomeLinkInNotifeye(Method testMethod) throws InterruptedException {	
        String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHomeLinkDisplayed(), "Home Link not displayed on Notifeye Screen");
		String strTCDescription = "Home Link display and validation on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - HACCP Link display validation")
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
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed on Notifeye Screen");
		String strTCDescription = "HACCP Link display and validation on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Language Drop down display validation")
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
		Assert.assertTrue(homePgObjCls.isLanguageDropDownDisplayed(), "Language Drop Down not displayed on Notifeye Screen");
		String strTCDescription = "Language Drop Down display and validation on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Account username link display validation")
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
		Assert.assertTrue(homePgObjCls.isUserNameAccountLnkDisplayed(), "User Name Account not displayed on Notifeye Screen");
		String strTCDescription = "Account username link display and validation on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);	
	}
	
	@Test(description="Notifeye page - Gateways button display validation")
	public void fnValidateGatewaysButton(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(notifeyePgObjCls.isGatewaysButtonDisplayed(), "Gateways Button not displayed on Notifeye Screen");
		String strTCDescription = "Gateways button display and validation on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Device management button display validation")
	public void fnValidateDeviceMgmtButton(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		String strTCDescription = "Device management button display and validation on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Device management page display validation")
	public void fnValidateDeviceMgmtPageTest(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		notifeyePgObjCls.clickDeviceMgmtButton();
		Assert.assertTrue(notifeyePgObjCls.issensorRBDisplayed(), "Sensor radio button not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isgatewayRBButtonDisplayed(), "Gateway radio button not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isSensorSummaryTableDisplayed(), "Sensor summary table not displayed on Notifeye Screen");
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		String strTCDescription = "Device management page display and validation on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Sensor radio button display validation")
	public void fnValidateDeviceMgmtSensorRB(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		notifeyePgObjCls.clickDeviceMgmtButton();
		Assert.assertTrue(notifeyePgObjCls.issensorRBDisplayed(), "Sensor radio button not displayed under Device Management on Notifeye Screen");
		String strTCDescription = "Sensor radio button display and validation under Device Management on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Gateway radio button display validation under Device Management")
	public void fnValidateDeviceMgmtGatewayRB(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		notifeyePgObjCls.clickDeviceMgmtButton();
		Assert.assertTrue(notifeyePgObjCls.isgatewayRBButtonDisplayed(), "Gateway radio button not displayed under Device Management on Notifeye Screen");
		String strTCDescription = "Gateway radio button display and validation under Device Management on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Sensor page summary display validation under Device Management")
	public void fnValidateDevMgmtSensorRBPage(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		notifeyePgObjCls.clickDeviceMgmtButton();
		Assert.assertTrue(notifeyePgObjCls.issensorRBDisplayed(), "Sensor radio button not displayed under Device Management on Notifeye Screen");
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		notifeyePgObjCls.clickSensorRB();
		Assert.assertTrue(notifeyePgObjCls.isSensorSummaryTableDisplayed(), "Sensor summary table not displayed on Notifeye Screen");
		String strTCDescription = "Sensor page summary display and validation under Device Management on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Edit button display validation under Device Management")
	public void fnValidateDevMgmtEditButton(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		notifeyePgObjCls.clickDeviceMgmtButton();
		Assert.assertTrue(notifeyePgObjCls.isEditButtonDisplayed(), "Edit button not displayed under Device Management on Notifeye Screen");
		String strTCDescription = "Edit button display and validation under Device Management on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Edit Image on Edit button display validation under Device Management")
	public void fnValidateDevMgmtEditImage(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		notifeyePgObjCls.clickDeviceMgmtButton();
		Assert.assertTrue(notifeyePgObjCls.isEditButtonDisplayed(), "Edit button not displayed under Device Management on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isEditImageDisplayed(), "Edit Image on Edit button not displayed under Device Management on Notifeye Screen");
		String strTCDescription = "Edit Image on Edit button display and validation under Device Management on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Remove button display validation under Device Management")
	public void fnValidateDevMgmtRemoveButton(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		notifeyePgObjCls.clickDeviceMgmtButton();
		Assert.assertTrue(notifeyePgObjCls.isRemoveButtonDisplayed(), "Remove button not displayed under Device Management on Notifeye Screen");
		String strTCDescription = "Remove button display and validation under Device Management on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Trash image on Remove button display validation under Device Management")
	public void fnValidateDevMgmtTrashImage(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		notifeyePgObjCls.clickDeviceMgmtButton();
		Assert.assertTrue(notifeyePgObjCls.isRemoveButtonDisplayed(), "Remove button not displayed under Device Management on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isTrashImageDisplayed(), "Trash Image on Remove button not displayed under Device Management on Notifeye Screen");
		String strTCDescription = "Trash Image on Remove button display and validation under Device Management on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Move button display validation under Device Management")
	public void fnValidateDevMgmtMoveButton(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		notifeyePgObjCls.clickDeviceMgmtButton();
		Assert.assertTrue(notifeyePgObjCls.isMoveButtonDisplayed(), "Move button not displayed under Device Management on Notifeye Screen");
		String strTCDescription = "Move button display and validation under Device Management on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Arrows Alt Image on Move button display validation under Device Management")
	public void fnValidateDevMgmtArrowsAltImage(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		notifeyePgObjCls.clickDeviceMgmtButton();
		Assert.assertTrue(notifeyePgObjCls.isMoveButtonDisplayed(), "Move button not displayed under Device Management on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isArrowsAltImageDisplayed(), "Arrows Alt Image not displayed on Move button under Device Management on Notifeye Screen");
		String strTCDescription = "Arrows Alt Image on Move button display and validation under Device Management on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Plus Image on Add button display validation under Device Management")
	public void fnValidateDevMgmtPlusImg(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		notifeyePgObjCls.clickDeviceMgmtButton();
		Assert.assertTrue(notifeyePgObjCls.isAddButtonDisplayed(), "Add button not displayed under Device Management on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isPlusImageDisplayed(), "Plus image not displayed on Add button under Device Management on Notifeye Screen");
		String strTCDescription = "Plus image on Add button display and validation under Device Management on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Add button display validation under Device Management")
	public void fnValidateDevMgmtAddButton(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		notifeyePgObjCls.clickDeviceMgmtButton();
		Assert.assertTrue(notifeyePgObjCls.isAddButtonDisplayed(), "Add button not displayed under Device Management on Notifeye Screen");
		String strTCDescription = "Add button display and validation under Device Management on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Reset button display validation under Device Management")
	public void fnValidateDevMgmtResetButton(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		notifeyePgObjCls.clickDeviceMgmtButton();
		Assert.assertTrue(notifeyePgObjCls.isResetButtonDisplayed(), "Reset button not displayed under Device Management on Notifeye Screen");
		String strTCDescription = "Reset button display and validation under Device Management on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - History Image on Reset button display validation under Device Management")
	public void fnValidateDevMgmtHistoryImage(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		notifeyePgObjCls.clickDeviceMgmtButton();
		Assert.assertTrue(notifeyePgObjCls.isResetButtonDisplayed(), "Reset button not displayed under Device Management on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isHistoryImageDisplayed(), "History Image on Reset button not displayed under Device Management on Notifeye Screen");
		String strTCDescription = "History Image on Reset button display and validation under Device Management on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - All Sensors Select Box display validation under Device Management")
	public void fnValidateDeviceMgmtAllSensorsSelBx(Method testMethod) throws InterruptedException {
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		notifeyePgObjCls.clickDeviceMgmtButton();
		Assert.assertTrue(notifeyePgObjCls.issensorRBDisplayed(), "Sensor radio button not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isgatewayRBButtonDisplayed(), "Gateway radio button not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isAllSensorsSelBxDisplayed(), "All Sensors Select Box not displayed under Device Management on Notifeye Screen");
		String strTCDescription = "All Sensors Select Box display and validation under Device Management on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Sensor ID table header display validation under Device Management")
	public void fnValidateDeviceMgmtSensorIdTH(Method testMethod) throws InterruptedException {
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		notifeyePgObjCls.clickDeviceMgmtButton();
		Assert.assertTrue(notifeyePgObjCls.issensorRBDisplayed(), "Sensor radio button not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isgatewayRBButtonDisplayed(), "Gateway radio button not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isSensorSummaryTableDisplayed(), "Sensor summary table not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isSensorIdTHDisplayed(), "Sensor ID table header not displayed under device management on Notifeye Screen");
		String strTCDescription = "Sensor ID table header display and validation under device management on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Sensor Name table header display validation under Device Management")
	public void fnValidateDeviceMgmtSensorNameTH(Method testMethod) throws InterruptedException {
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		notifeyePgObjCls.clickDeviceMgmtButton();
		Assert.assertTrue(notifeyePgObjCls.issensorRBDisplayed(), "Sensor radio button not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isgatewayRBButtonDisplayed(), "Gateway radio button not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isSensorSummaryTableDisplayed(), "Sensor summary table not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isSensorNameTHDisplayed(), "Sensor Name table header not displayed under device management on Notifeye Screen");
		String strTCDescription = "Sensor Name table header display and validation under device management on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Heartbeat table header display validation under Device Management")
	public void fnValidateDeviceMgmtHeartbeatTH(Method testMethod) throws InterruptedException {
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		notifeyePgObjCls.clickDeviceMgmtButton();
		Assert.assertTrue(notifeyePgObjCls.issensorRBDisplayed(), "Sensor radio button not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isgatewayRBButtonDisplayed(), "Gateway radio button not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isSensorSummaryTableDisplayed(), "Sensor summary table not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isHeartBeatTHDisplayed(), "Heartbeat table header not displayed under device management on Notifeye Screen");
		String strTCDescription = "Heartbeat table header display and validation under device management on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Logging Interval table header display validation under Device Management")
	public void fnValidateDeviceMgmtLoggingIntervalTH(Method testMethod) throws InterruptedException {
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		notifeyePgObjCls.clickDeviceMgmtButton();
		Assert.assertTrue(notifeyePgObjCls.issensorRBDisplayed(), "Sensor radio button not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isgatewayRBButtonDisplayed(), "Gateway radio button not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isSensorSummaryTableDisplayed(), "Sensor summary table not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isLoggingIntervalTHDisplayed(), "Logging Interval table header not displayed under device management on Notifeye Screen");
		String strTCDescription = "Logging Interval table header display and validation under device management on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Scale table header display validation under Device Management")
	public void fnValidateDeviceMgmtScaleTH(Method testMethod) throws InterruptedException {
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		notifeyePgObjCls.clickDeviceMgmtButton();
		Assert.assertTrue(notifeyePgObjCls.issensorRBDisplayed(), "Sensor radio button not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isgatewayRBButtonDisplayed(), "Gateway radio button not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isSensorSummaryTableDisplayed(), "Sensor summary table not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isScaleTHDisplayed(), "Scale table header not displayed under device management on Notifeye Screen");
		String strTCDescription = "Scale table header display and validation under device management on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Min/Max table header display validation under Device Management")
	public void fnValidateDeviceMgmtMinMaxTH(Method testMethod) throws InterruptedException {
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		notifeyePgObjCls.clickDeviceMgmtButton();
		Assert.assertTrue(notifeyePgObjCls.issensorRBDisplayed(), "Sensor radio button not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isgatewayRBButtonDisplayed(), "Gateway radio button not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isSensorSummaryTableDisplayed(), "Sensor summary table not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isMinMaxTHDisplayed(), "Min/Max table header not displayed under device management on Notifeye Screen");
		String strTCDescription = "Min/Max table header display and validation under device management on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Sensor add page display validation under Device Management")
	public void fnValidateDevMgmtAddSensorPage(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		notifeyePgObjCls.clickDeviceMgmtButton();
		Assert.assertTrue(notifeyePgObjCls.isAddButtonDisplayed(), "Add button not displayed under Device Management on Notifeye Screen");
		notifeyePgObjCls.clickAddButton();
		Assert.assertTrue(notifeyePgObjCls.isSensorNameLabelDisplayed(), "Sensor Name label not displayed under Device Management on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isSensorIDLabelDisplayed(), "Sensor ID label not displayed under Device Management on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isSensorAddAddButtonDisplayed(), "Sensor Add button not displayed under Device Management on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isSensorAddCancelButtonDisplayed(), "Sensor Cancel button not displayed under Device Management on Notifeye Screen");
		String strTCDescription = "Sensor add page display and validation under Device Management on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Sensor Name label display validation under Device Management")
	public void fnValidateDevMgmtSensorNameLabel(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		notifeyePgObjCls.clickDeviceMgmtButton();
		Assert.assertTrue(notifeyePgObjCls.isAddButtonDisplayed(), "Add button not displayed under Device Management on Notifeye Screen");
		notifeyePgObjCls.clickAddButton();
		Assert.assertTrue(notifeyePgObjCls.isSensorNameLabelDisplayed(), "Sensor Name label not displayed under Device Management on Notifeye Screen");
		String strTCDescription = "Sensor Name label display and validation under Device Management on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Sensor ID label display validation under Device Management")
	public void fnValidateDevMgmtSensorIDLabel(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		notifeyePgObjCls.clickDeviceMgmtButton();
		Assert.assertTrue(notifeyePgObjCls.isAddButtonDisplayed(), "Add button not displayed under Device Management on Notifeye Screen");
		notifeyePgObjCls.clickAddButton();
		Assert.assertTrue(notifeyePgObjCls.isSensorIDLabelDisplayed(), "Sensor ID label not displayed under Device Management on Notifeye Screen");
		String strTCDescription = "Sensor ID label display and validation under Device Management on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}

	@Test(description="Notifeye page - Sensor Add button display validation under Device Management")
	public void fnValidateDevMgmtSensorAddButton(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		notifeyePgObjCls.clickDeviceMgmtButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(notifeyePgObjCls.isAddButtonDisplayed(), "Add button not displayed under Device Management on Notifeye Screen");
		notifeyePgObjCls.clickAddButton();
		Assert.assertTrue(notifeyePgObjCls.isSensorAddAddButtonDisplayed(), "Sensor Add button not displayed under Device Management on Notifeye Screen");
		String strTCDescription = "Sensor Add button display and validation under Device Management on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Sensor Cancel button display validation under Device Management")
	public void fnValidateDevMgmtSensorCancelButton(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		notifeyePgObjCls.clickDeviceMgmtButton();
		Assert.assertTrue(notifeyePgObjCls.isAddButtonDisplayed(), "Add button not displayed under Device Management on Notifeye Screen");
		notifeyePgObjCls.clickAddButton();
		Assert.assertTrue(notifeyePgObjCls.isSensorAddCancelButtonDisplayed(), "Sensor Cancel button not displayed under Device Management on Notifeye Screen");
		String strTCDescription = "Sensor Cancel button display and validation under Device Management on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Sensor Code label display validation under Device Management")
	public void fnValidateDevMgmtSensorCodeLabel(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		notifeyePgObjCls.clickDeviceMgmtButton();
		Assert.assertTrue(notifeyePgObjCls.isAddButtonDisplayed(), "Add button not displayed under Device Management on Notifeye Screen");
		notifeyePgObjCls.clickAddButton();
		Assert.assertTrue(notifeyePgObjCls.isSensorCodeLabelDisplayed(), "Sensor Code label not displayed under Device Management on Notifeye Screen");
		String strTCDescription = "Sensor Code label display and validation under Device Management on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Heartbeat label display validation under Device Management")
	public void fnValidateDevMgmtHeartbeatLabel(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		notifeyePgObjCls.clickDeviceMgmtButton();
		Assert.assertTrue(notifeyePgObjCls.isAddButtonDisplayed(), "Add button not displayed under Device Management on Notifeye Screen");
		notifeyePgObjCls.clickAddButton();
		Assert.assertTrue(notifeyePgObjCls.isHeartbeatLabelDisplayed(), "Heartbeat label not displayed under Device Management on Notifeye Screen");
		String strTCDescription = "Heartbeat label display and validation under Device Management on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Logging Interval label display validation under Device Management")
	public void fnValDevMgmtLoggingIntervalLabel(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		notifeyePgObjCls.clickDeviceMgmtButton();
		Assert.assertTrue(notifeyePgObjCls.isAddButtonDisplayed(), "Add button not displayed under Device Management on Notifeye Screen");
		notifeyePgObjCls.clickAddButton();
		Assert.assertTrue(notifeyePgObjCls.isLoggingIntervalLabelDisplayed(), "Logging Interval label not displayed under Device Management on Notifeye Screen");
		String strTCDescription = "Heartbeat label display and validation under Device Management on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Min Theshold label display validation under Device Management")
	public void fnValidateDevMgmtMinThresholdLabel(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		notifeyePgObjCls.clickDeviceMgmtButton();
		Assert.assertTrue(notifeyePgObjCls.isAddButtonDisplayed(), "Add button not displayed under Device Management on Notifeye Screen");
		notifeyePgObjCls.clickAddButton();
		Assert.assertTrue(notifeyePgObjCls.isMinThresholdLabelDisplayed(), "Min Theshold label not displayed under Device Management on Notifeye Screen");
		String strTCDescription = "Min Theshold label display and validation under Device Management on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Max Theshold label display validation under Device Management")
	public void fnValidateDevMgmtMaxThresholdLabel(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		notifeyePgObjCls.clickDeviceMgmtButton();
		Assert.assertTrue(notifeyePgObjCls.isAddButtonDisplayed(), "Add button not displayed under Device Management on Notifeye Screen");
		notifeyePgObjCls.clickAddButton();
		Assert.assertTrue(notifeyePgObjCls.isMaxThresholdLabelDisplayed(), "Max Theshold label not displayed under Device Management on Notifeye Screen");
		String strTCDescription = "Max Theshold label display and validation under Device Management on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Select network location display validation under Device Management")
	public void fnValidateDevMgmtSelNwLocLabel(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		notifeyePgObjCls.clickDeviceMgmtButton();
		Assert.assertTrue(notifeyePgObjCls.isAddButtonDisplayed(), "Add button not displayed under Device Management on Notifeye Screen");
		notifeyePgObjCls.clickAddButton();
		Assert.assertTrue(notifeyePgObjCls.isSelNetworkLocLabelDisplayed(), "Select network location label not displayed under Device Management on Notifeye Screen");
		String strTCDescription = "Select network location label display and validation under Device Management on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Sensor edit page display validation under Device Management")
	public void fnValidateDevMgmtEditSensorPage(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		notifeyePgObjCls.clickDeviceMgmtButton();
		Assert.assertTrue(notifeyePgObjCls.isEditButtonDisplayed(), "Edit button not displayed under Device Management on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isAllSensorsSelBxDisplayed(), "Edit button not displayed under Device Management on Notifeye Screen");
		notifeyePgObjCls.selectAllSensorsSelBx();
		Assert.assertTrue(notifeyePgObjCls.isEditButtonEnabled(), "Edit button not enabled under Device Management on Notifeye Screen");
		notifeyePgObjCls.clickEditSensorsButton();
		Assert.assertTrue(notifeyePgObjCls.isSensorNameTBDisplayed(), "Sensor name input not displayed on Edit sensor button click under Device Management on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isHeartbeatDDDisplayed(), "Heartbeat dropdown not displayed on Edit sensor button click under Device Management on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isScaleDDDisplayed(), "Scale dropdown not displayed on Edit sensor button click under Device Management on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isMinMaxDDDisplayed(), "Min/Max dropdown not displayed on Edit sensor button click under Device Management on Notifeye Screen");
		String strTCDescription = "Sensor edit page display and validation under Device Management on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Reset button clicking and validation under Device Management")
	public void fnValidateDevMgmtResetButtonClick(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		notifeyePgObjCls.clickDeviceMgmtButton();
		Assert.assertTrue(notifeyePgObjCls.isEditButtonDisplayed(), "Edit button not displayed under Device Management on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isAllSensorsSelBxDisplayed(), "Edit button not displayed under Device Management on Notifeye Screen");
		notifeyePgObjCls.selectAllSensorsSelBx();
		Assert.assertTrue(notifeyePgObjCls.isEditButtonEnabled(), "Edit button not enabled under Device Management on Notifeye Screen");
		notifeyePgObjCls.clickEditSensorsButton();
		Assert.assertTrue(notifeyePgObjCls.isSensorNameTBDisplayed(), "Sensor name input not displayed on Edit sensor button click under Device Management on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isHeartbeatDDDisplayed(), "Heartbeat dropdown not displayed on Edit sensor button click under Device Management on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isScaleDDDisplayed(), "Scale dropdown not displayed on Edit sensor button click under Device Management on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isMinMaxDDDisplayed(), "Min/Max dropdown not displayed on Edit sensor button click under Device Management on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isResetButtonEnabled(), "Reset button not enabled under Device Management on Notifeye Screen");
		notifeyePgObjCls.clickResetButton();
		String strTCDescription = "Reset button clicking and validation under Device Management on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Move button clicking and validation under Device Management")
	public void fnValidateDevMgmtMoveButtonClick(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isAllLocsLabelDisplayed(), "All Locations text not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		notifeyePgObjCls.clickDeviceMgmtButton();
		Assert.assertTrue(notifeyePgObjCls.isEditButtonDisplayed(), "Edit button not displayed under Device Management on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isAllSensorsSelBxDisplayed(), "Edit button not displayed under Device Management on Notifeye Screen");
		notifeyePgObjCls.selectAllSensorsSelBx();
		Assert.assertTrue(notifeyePgObjCls.isMoveButtonEnabled(), "Move button not enabled under Device Management on Notifeye Screen");
		notifeyePgObjCls.clickMoveButton();
		Assert.assertTrue(notifeyePgObjCls.isMoveGatewayDetailsLabelDisp(), "Move Gateway Details Label not displayed under Device Management on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isSelectNetworkLocLabelDisp(), "Select Network Location Label not displayed under Device Management on Notifeye Screen");
		String strTCDescription = "Move button clicking and validation under Device Management on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Gateway radio button clicking and validation under Device Management")
	public void fnValidateDeviceMgmtGatewayRBClick(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		notifeyePgObjCls.clickDeviceMgmtButton();
		System.out.println("1");
		Assert.assertTrue(notifeyePgObjCls.isgatewayRBButtonDisplayed(), "Gateway radio button not displayed under Device Management on Notifeye Screen");
		System.out.println("2");
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		notifeyePgObjCls.clickGatewayRB();
		System.out.println("3");
		//webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(notifeyePgObjCls.isGatewayIDTableHeaderDisp(), "Gateway ID Table header not displayed under Device Management on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isGatewayNameTableHeaderDisp(), "Gateway Name Table header not displayed under Device Management on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isMCCITableHeaderDisp(), "Missed Communication Check Interval Table header not displayed under Device Management on Notifeye Screen");
		String strTCDescription = "Gateway radio button click and validation under Device Management on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}

	@Test(description="Notifeye page - Display and validation under Device Management")
	public void fnValidateSensorsButtonClick(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(notifeyePgObjCls.isSensorsButtonDisplayed(), "Sensors Button not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "All Locations drop down not displayed on Notifeye Screen");
		notifeyePgObjCls.clickDeviceMgmtButton();
		notifeyePgObjCls.clickSensorsButton();
		Assert.assertTrue(notifeyePgObjCls.isFilterBySensorNameTxtBxDisplayed(), "Filter By Sensor Name Text Box not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isFilterByTypeDropDownDisplayed(), "Filter By Type drop down not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isFilterByStatusDropDownDisplayed(), "Filter By Status drop down not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isCompareSensorsButtonDisplayed(), "Compare Sensors Button not displayed on Notifeye Screen");
		String strTCDescription = "Notifeye Page display and validation on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Move Gateway Details label display validation after clicking Move button under Device Management")
	public void fnValDevMgmtMoveBtnMoveGWDetails(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		notifeyePgObjCls.clickDeviceMgmtButton();
		Assert.assertTrue(notifeyePgObjCls.isEditButtonDisplayed(), "Edit button not displayed under Device Management on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isAllSensorsSelBxDisplayed(), "Edit button not displayed under Device Management on Notifeye Screen");
		notifeyePgObjCls.selectAllSensorsSelBx();
		Assert.assertTrue(notifeyePgObjCls.isMoveButtonEnabled(), "Move button not enabled under Device Management on Notifeye Screen");
		notifeyePgObjCls.clickMoveButton();
		Assert.assertTrue(notifeyePgObjCls.isMoveGatewayDetailsLabelDisp(), "Move Gateway Details Label not displayed under Device Management on Notifeye Screen");
		String strTCDescription = "Move Gateway Details label display and validation after clicking Move button under Device Management on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Cancel link display validation after clicking Move button under Device Management")
	public void fnValDevMgmtMoveBtnCancelLink(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isAllLocsLabelDisplayed(), "All Locations text not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		notifeyePgObjCls.clickDeviceMgmtButton();
		Assert.assertTrue(notifeyePgObjCls.isEditButtonDisplayed(), "Edit button not displayed under Device Management on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isAllSensorsSelBxDisplayed(), "Edit button not displayed under Device Management on Notifeye Screen");
		notifeyePgObjCls.selectAllSensorsSelBx();
		Assert.assertTrue(notifeyePgObjCls.isMoveButtonEnabled(), "Move button not enabled under Device Management on Notifeye Screen");
		notifeyePgObjCls.clickMoveButton();
		Assert.assertTrue(notifeyePgObjCls.moveCancelLink(), "Cancel link not displayed under Device Management on Notifeye Screen");
		String strTCDescription = "Cancel link display and validation after clicking Move button under Device Management on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Select Network location label display validation after clicking Move button under Device Management")
	public void fnValDevMgmtMoveBtnSelNwLocLabel(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isAllLocsLabelDisplayed(), "All Locations text not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		notifeyePgObjCls.clickDeviceMgmtButton();
		Assert.assertTrue(notifeyePgObjCls.isEditButtonDisplayed(), "Edit button not displayed under Device Management on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isAllSensorsSelBxDisplayed(), "Edit button not displayed under Device Management on Notifeye Screen");
		notifeyePgObjCls.selectAllSensorsSelBx();
		Assert.assertTrue(notifeyePgObjCls.isMoveButtonEnabled(), "Move button not enabled under Device Management on Notifeye Screen");
		notifeyePgObjCls.clickMoveButton();
		Assert.assertTrue(notifeyePgObjCls.isSelectNetworkLocLabelDisp(), "Select Network location label not displayed after clicking Move button under Device Management on Notifeye Screen");
		String strTCDescription = "Select Network location label display and validation after clicking Move button under Device Management on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - All Locations drop down display validation after clicking Move button under Device Management")
	public void fnValDevMgmtMoveBtnAllLocsDropDown(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isAllLocsLabelDisplayed(), "All Locations text not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		notifeyePgObjCls.clickDeviceMgmtButton();
		Assert.assertTrue(notifeyePgObjCls.isEditButtonDisplayed(), "Edit button not displayed under Device Management on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isAllSensorsSelBxDisplayed(), "Edit button not displayed under Device Management on Notifeye Screen");
		notifeyePgObjCls.selectAllSensorsSelBx();
		Assert.assertTrue(notifeyePgObjCls.isMoveButtonEnabled(), "Move button not enabled under Device Management on Notifeye Screen");
		notifeyePgObjCls.clickMoveButton();
		Assert.assertTrue(notifeyePgObjCls.isAllLocsDropDownDisp(), "All Locations drop down not displayed after clicking Move button under Device Management on Notifeye Screen");
		String strTCDescription = "All Locations drop down display and validation after clicking Move button under Device Management on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Name Table Header display validation after clicking Move button under Device Management")
	public void fnValDevMgmtMoveBtnNameTH(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isAllLocsLabelDisplayed(), "All Locations text not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		notifeyePgObjCls.clickDeviceMgmtButton();
		Assert.assertTrue(notifeyePgObjCls.isEditButtonDisplayed(), "Edit button not displayed under Device Management on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isAllSensorsSelBxDisplayed(), "Edit button not displayed under Device Management on Notifeye Screen");
		notifeyePgObjCls.selectAllSensorsSelBx();
		Assert.assertTrue(notifeyePgObjCls.isMoveButtonEnabled(), "Move button not enabled under Device Management on Notifeye Screen");
		notifeyePgObjCls.clickMoveButton();
		Assert.assertTrue(notifeyePgObjCls.isNameTHDisplayed(), "Name Table Header not displayed after clicking Move button under Device Management on Notifeye Screen");
		String strTCDescription = "Name Table Header display and validation after clicking Move button under Device Management on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="Notifeye page - Save button display validation after clicking Move button under Device Management")
	public void fnValDevMgmtMoveBtnSaveButton(Method testMethod) throws InterruptedException {	    
	    String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		notifeyePgObjCls = new CooperNotifeyePageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isHomeAppLogoDisplayed(), "Home App Logo not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		homePgObjCls.NotifeyeLinkClick();
		Assert.assertTrue(notifeyePgObjCls.isAllLocsLabelDisplayed(), "All Locations text not displayed on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isDeviceMgmtButtonDisplayed(), "Device Management Button not displayed on Notifeye Screen");
		notifeyePgObjCls.clickDeviceMgmtButton();
		Assert.assertTrue(notifeyePgObjCls.isEditButtonDisplayed(), "Edit button not displayed under Device Management on Notifeye Screen");
		Assert.assertTrue(notifeyePgObjCls.isAllSensorsSelBxDisplayed(), "Edit button not displayed under Device Management on Notifeye Screen");
		notifeyePgObjCls.selectAllSensorsSelBx();
		Assert.assertTrue(notifeyePgObjCls.isMoveButtonEnabled(), "Move button not enabled under Device Management on Notifeye Screen");
		notifeyePgObjCls.clickMoveButton();
		Assert.assertTrue(notifeyePgObjCls.isSaveButtonDisplayed(), "Save button not displayed after clicking Move button under Device Management on Notifeye Screen");
		String strTCDescription = "Save button display and validation after clicking Move button under Device Management on Notifeye Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
}
