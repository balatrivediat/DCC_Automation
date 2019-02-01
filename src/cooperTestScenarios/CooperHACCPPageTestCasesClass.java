package cooperTestScenarios;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cooperPageObjects.CooperHACCPPageObjectClass;
import cooperPageObjects.CooperHomePageObjectClass;
import cooperPageObjects.CooperLoginPageObjectClass;
import cooperProjectResources.CooperITestListener;
import cooperProjectResources.CooperUtilitiesClass;

public class CooperHACCPPageTestCasesClass extends CooperITestListener {

	CooperHomePageObjectClass homePgObjCls;
	CooperLoginPageObjectClass loginPgObjCls;
	CooperHACCPPageObjectClass HACCPPgObjCls;
	public static FileInputStream fis;
	
	String sExecutionStatusPath = "C:\\Test_Automation\\Working_Dir\\Coopers_Selenium_Dir\\Test_Results_Screens\\Execution_Sheet_Status";
    //String sExecutionStatusFileName = "Test_Execution_Status.xlsx";    	        				        
    String sSheetName = "ExecutionStatus";
    String OutExecutionSheetName;
    
    String getScreenshotFileName = null;
	ExtentReports report;
	ExtentReports extent;
	ExtentTest logger;
	
	@Test(description="HACCP Page Display validation")
	public void fnValidateHACCPPageTest(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isChecklistsBtnDisplayed(), "Checklists button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMenusBtnDisplayed(), "Menus button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isHandheldsBtnDisplayed(), "Handhelds button not displayed in HACCP Screen");
		//Assert.assertTrue(HACCPPgObjCls.isHierarchyBtnDisplayed(), "Hierarchy Button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isCorporateButtonDisplayed(), "Corporate Button not displayed in HACCP Screen");
		String strTCDescription = "HACCP Screen display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Corporate Header display validation")
	public void fnValidateHACCPCorpHeader(Method testMethod) throws InterruptedException, IOException {	
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Label not displayed in HACCP Screen");
		String strTCDescription = "Corporate Header display and validation on HACCP Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Corporate Dropdown button display validation")
	public void fnValidateHACCPPageCorporateBtn(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isCorporateButtonDisplayed(), "Corporate Button not displayed in HACCP Screen");
		String strTCDescription = "Corporate dropdown button display and validation on HACCP screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Corporate Dropdown button display validation")
	public void fnValidateHACCPReportsBtn(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		String strTCDescription = "Reports button display and validation on HACCP Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Checklists button display validation")
	public void fnValidateHACCPCheckListsBtn(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isChecklistsBtnDisplayed(), "Checklists button not displayed in HACCP Screen");
		String strTCDescription = "Checklists button display and validation on HACCP Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Menus button display validation")
	public void fnValidateHACCPMenusBtn(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isMenusBtnDisplayed(), "Menus button not displayed in HACCP Screen");
		String strTCDescription = "Menus button display and validation on HACCP Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Handhelds button display validation")
	public void fnValidateHACCPHandheldsBtn(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isHandheldsBtnDisplayed(), "Handhelds button not displayed in HACCP Screen");
		String strTCDescription = "Handhelds button display and validation on HACCP Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Hierarchy button display validation")
	public void fnValidateHACCPHierarchyBtn(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isHierarchyBtnDisplayed(), "Hierarchy Button not displayed in HACCP Screen");
		String strTCDescription = "Hierarchy button display and validation on HACCP Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Corporate Button button display validation")
	public void fnValidateHACCPCorporateBtn(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isCorporateButtonDisplayed(), "Corporate Button not displayed in HACCP Screen");
		String strTCDescription = "Corporate Button display and validation on HACCP Screen";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Reports Screen display validation")
	public void fnValidateHACCPReportsPage(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isChecklistsRadioBtnDisplayed(), "Checklists radio button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMenusRadioButtonDisplayed(), "Menus radio button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isHideCriteriaBtnDisplayed(), "Hide criteria button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isSelectDateLabelDisplayed(), "Select Date label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isChkListsRunReportBtnDisplayed(), "Run Report button not displayed in HACCP Screen");
		String strTCDescription = "Reports Screen display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Checklists radio button display validation")
	public void fnValidateHACCPReportsChklistsRB(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isChecklistsRadioBtnDisplayed(), "Checklists radio button not displayed in HACCP Screen");
		String strTCDescription = "Checklists radio button display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Menus radio button display validation")
	public void fnValidateHACCPMenusRB(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isMenusRadioButtonDisplayed(), "Menus radio button not displayed in HACCP Screen");
		String strTCDescription = "Menus radio button display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Select Date label display validation")
	public void fnValHACCPReportsChklistsSelectDateLabel(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isSelectDateLabelDisplayed(), "Select Date label not displayed in HACCP Screen");
		String strTCDescription = "Select Date label display and validation on HACCP -> Reports -> Checklists";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Reports Screen display validation")
	public void fnValHACCPReportsChklistsSelectDateTextBx(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isSelectDateLabelDisplayed(), "Select Date label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isSelectDateTextBoxDisplayed(), "Select Date Text box not displayed in HACCP Screen");
		String strTCDescription = "Reports Screen display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Group by label display validation under HACCP -> Reports -> Checklists")
	public void fnValHACCPReportsChklistsGroupByLabel(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isGroupByLabelDisplayed(), "Group By label not displayed in HACCP Screen");
		String strTCDescription = "Group by label display and validation under HACCP -> Reports -> Checklists";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Group by dropdown display validation under HACCP -> Reports -> Checklists")
	public void fnValHACCPReportsChklistsGroupByDropDown(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isGroupByLabelDisplayed(), "Group By label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isGroupByDropdownDisplayed(), "Group By drop down not displayed in HACCP Screen");
		String strTCDescription = "Group by dropdown display and validation under HACCP -> Reports -> Checklists";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Select Date Label display validation under HACCP -> Reports -> Checklists")
	public void fnValHACCPReportsSelDateLabel(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isSelectDateLabelDisplayed(), "Select date label not displayed in HACCP Screen");
		String strTCDescription = "Select Date Label display and validation under HACCP -> Reports -> Checklists";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Select Date Text Box display validation under HACCP -> Reports -> Checklists")
	public void fnValHACCPReportsSelDateDropdown(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isSelectDateLabelDisplayed(), "Select date label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isSelectDateTextBoxDisplayed(), "Select date text box not displayed in HACCP Screen");
		String strTCDescription = "Select Date Text Box display and validation under HACCP -> Reports -> Checklists";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - All readings label display validation under HACCP -> Reports -> Checklists")
	public void fnValHACCPReportsAllReadingsLabel(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isAllReadingsLabelDisplayed(), "All readings label not displayed in HACCP Screen");
		String strTCDescription = "All readings label display and validation under HACCP -> Reports -> Checklists";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - All readings select display validation under HACCP -> Reports -> Checklists")
	public void fnValHACCPReportsAllReadingsSelect(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isAllReadingsLabelDisplayed(), "All readings label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isAllReadingsSelectDisplayed(), "All readings select not displayed in HACCP Screen");
		String strTCDescription = "All readings select display and validation under HACCP -> Reports -> Checklists";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Show columns label display validation under HACCP -> Reports -> Checklists")
	public void fnValHACCPReportsShowColumnsLabel(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isShowColumnsLabelDisplayed(), "Show columns label not displayed in HACCP Screen");
		String strTCDescription = "Show columns label display and validation under HACCP -> Reports -> Checklists";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - All readings checkbox display validation under HACCP -> Reports -> Checklists")
	public void fnValHACCPReportsAllColumnsCheckBox(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isShowColumnsLabelDisplayed(), "Show columns label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isAllColumnsCheckBoxDisplayed(), "All readings label not displayed in HACCP Screen");
		String strTCDescription = "All readings checkbox display and validation under HACCP -> Reports -> Checklists";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - All readings select display validation under HACCP -> Reports -> Checklists")
	public void fnValHACCPReportsQuestionTypeCheckBox(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isShowColumnsLabelDisplayed(), "Show columns label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isQuestionTypeCheckBoxDisplayed(), "Question type checkbox not displayed in HACCP Screen");
		String strTCDescription = "All readings select display and validation under HACCP -> Reports -> Checklists";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Min/Max checkbox display and validation under HACCP -> Reports -> Checklists")
	public void fnValHACCPReportsMinMaxCheckBox(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isShowColumnsLabelDisplayed(), "Show columns label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMinMaxCheckBoxDisplayed(), "Min/Max checkbox not displayed in HACCP Screen");
		String strTCDescription = "Min/Max checkbox display and validation under HACCP -> Reports -> Checklists";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Answer checkbox display and validation under HACCP -> Reports -> Checklists")
	public void fnValHACCPReportsAnswerCheckBox(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isShowColumnsLabelDisplayed(), "Show columns label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isAnswerCheckBoxDisplayed(), "Answer checkbox not displayed in HACCP Screen");
		String strTCDescription = "Answer checkbox display and validation under HACCP -> Reports -> Checklists";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Corrective Action checkbox display validation under HACCP -> Reports -> Checklists")
	public void fnValHACCPReportsCorrActionCheckBox(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isShowColumnsLabelDisplayed(), "Show columns label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isCorrectiveActionCheckBoxDisplayed(), "Corrective Action checkbox not displayed in HACCP Screen");
		String strTCDescription = "Corrective Action checkbox display and validation under HACCP -> Reports -> Checklists";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Record Timestamp checkbox display validation under HACCP -> Reports -> Checklists")
	public void fnValHACCPReportsRecordTSCheckBox(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isShowColumnsLabelDisplayed(), "Show columns label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isRecordTimeStampCheckBoxDisplayed(), "Record Timestamp checkbox not displayed in HACCP Screen");
		String strTCDescription = "Record Timestamp checkbox display and validation under HACCP -> Reports -> Checklists";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Save as Favourites label display validation under HACCP -> Reports -> Checklists")
	public void fnValHACCPReportsSaveAsFavLabel(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isSaveAsFavouriteLabelDisplayed(), "Save as Favourites label not displayed in HACCP Screen");
		String strTCDescription = "Save as Favourites label display and validation under HACCP -> Reports -> Checklists";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Save as Favourites text box display validation under HACCP -> Reports -> Checklists")
	public void fnValHACCPReportsSaveAsFavTextBox(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isSaveAsFavouriteLabelDisplayed(), "Save as Favourites label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isSaveAsFavouriteTextBoxDisplayed(), "Save as Favourites text box not displayed in HACCP Screen");
		String strTCDescription = "Save as Favourites text box display and validation under HACCP -> Reports -> Checklists";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Save as Favourites plus button display validation under HACCP -> Reports -> Checklists")
	public void fnValHACCPReportsSaveAsFavPlusBtn(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isSaveAsFavouriteLabelDisplayed(), "Save as Favourites label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isSaveAsFavouritePlusBtnDisplayed(), "Save as Favourites plus button not displayed in HACCP Screen");
		String strTCDescription = "Save as Favourites plus button display and validation under HACCP -> Reports -> Checklists";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Favourites label display validation under HACCP -> Reports -> Checklists")
	public void fnValHACCPReportsFavouritesLabel(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isFavouritesLabelDisplayed(), "Favourites label not displayed in HACCP Screen");
		String strTCDescription = "Favourites label display and validation under HACCP -> Reports -> Checklists";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Favourites dropdown display validation under HACCP -> Reports -> Checklists")
	public void fnValHACCPReportsFavouritesDropdown(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isFavouritesLabelDisplayed(), "Favourites label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isFavouritesDropdownDisplayed(), "Favourites Dropdown not displayed in HACCP Screen");
		String strTCDescription = "Favourites dropdown display and validation under HACCP -> Reports -> Checklists";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Favourites image display validation under HACCP -> Reports -> Checklists")
	public void fnValHACCPReportsFavouritesImage(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isFavouritesLabelDisplayed(), "Favourites label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isFavouritesImageDisplayed(), "Favourites Image not displayed in HACCP Screen");
		String strTCDescription = "Favourites image display and validation under HACCP -> Reports -> Checklists";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Run report button display validation under HACCP -> Reports -> Checklists")
	public void fnValHACCPReportsRunReportBtn(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isChkListsRunReportBtnDisplayed(), "Run Report button not displayed in HACCP Screen");
		String strTCDescription = "Run Report button display and validation under HACCP -> Reports -> Checklists";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Hide criteria button display validation under HACCP -> Reports -> Checklists")
	public void fnValHACCPReportsHideCriteriaBtn(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isHideCriteriaBtnDisplayed(), "Hide criteria button not displayed in HACCP Screen");
		String strTCDescription = "Hide criteria button display and validation under HACCP -> Reports";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Download PDF button display validation under HACCP -> Reports -> Checklists")
	public void fnValHACCPReportsShowCriteriaBtn(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		HACCPPgObjCls.fnHideCriteriaBtnClick();
		Assert.assertTrue(HACCPPgObjCls.isPDFButtonDisplayed(), "Download PDF button not displayed in HACCP Screen");
		String strTCDescription = "Download PDF button display and validation under HACCP -> Reports -> Show Criteria";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Menus radio button click and validation under HACCP -> Reports -> Checklists")
	public void fnValidateHACCPMenusRadioBtn(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isChecklistsRadioBtnDisplayed(), "Checklists radio button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMenusRadioButtonDisplayed(), "Menus radio button not displayed in HACCP Screen");
		HACCPPgObjCls.fnMenusRBClick();
		Assert.assertTrue(HACCPPgObjCls.isHideCriteriaBtnDisplayed(), "Hide criteria button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMenusSelectDateLabelDisplayed(), "Select Date label under Menus not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMenusRunReportBtnDisplayed(), "Run report button under Menus not displayed in HACCP Screen");
		String strTCDescription = "Menus radio button click display and validation under HACCP -> Reports -> Menus";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Hide criteria button display and validation under HACCP -> Reports -> Checklists")
	public void fnValHACCPReportsMenusHideCriteriaBtn(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isChecklistsRadioBtnDisplayed(), "Checklists radio button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMenusRadioButtonDisplayed(), "Menus radio button not displayed in HACCP Screen");
		HACCPPgObjCls.fnMenusRBClick();
		Assert.assertTrue(HACCPPgObjCls.isHideCriteriaBtnDisplayed(), "Hide criteria button not displayed in HACCP Screen");
		String strTCDescription = "Hide criteria button display and validation under HACCP -> Reports -> Menus";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Hide criteria button display and validation under HACCP -> Reports -> Checklists")
	public void fnValHACCPReportsMenusSelectDatelabel(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isChecklistsRadioBtnDisplayed(), "Checklists radio button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMenusRadioButtonDisplayed(), "Menus radio button not displayed in HACCP Screen");
		HACCPPgObjCls.fnMenusRBClick();
		Assert.assertTrue(HACCPPgObjCls.isMenusSelectDateLabelDisplayed(), "Select Date label under Menus not displayed in HACCP Screen");
		String strTCDescription = "Select Date label display and validation under HACCP -> Reports -> Menus";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Select Date text box display and validation under HACCP -> Reports -> Menus")
	public void fnValHACCPReportsMenusSelectDateTxtBx(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isChecklistsRadioBtnDisplayed(), "Checklists radio button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMenusRadioButtonDisplayed(), "Menus radio button not displayed in HACCP Screen");
		HACCPPgObjCls.fnMenusRBClick();
		Assert.assertTrue(HACCPPgObjCls.isMenusSelectDateLabelDisplayed(), "Select Date label under Menus not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMenusSelectDateTxtBxDisplayed(), "Select Date Text box under Menus not displayed in HACCP Screen");
		String strTCDescription = "Select Date text box display and validation under HACCP -> Reports -> Menus";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Group By label display and validation under HACCP -> Reports -> Menus")
	public void fnValHACCPReportsMenusGroupByLabel(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isChecklistsRadioBtnDisplayed(), "Checklists radio button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMenusRadioButtonDisplayed(), "Menus radio button not displayed in HACCP Screen");
		HACCPPgObjCls.fnMenusRBClick();
		Assert.assertTrue(HACCPPgObjCls.isMenusGroupByLabelDisplayed(), "Group By label under Menus not displayed in HACCP Screen");
		String strTCDescription = "Group By label display and validation under HACCP -> Reports -> Menus";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Group By Date display and validation under HACCP -> Reports -> Menus")
	public void fnValHACCPReportsMenusGroupByDate(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isChecklistsRadioBtnDisplayed(), "Checklists radio button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMenusRadioButtonDisplayed(), "Menus radio button not displayed in HACCP Screen");
		HACCPPgObjCls.fnMenusRBClick();
		Assert.assertTrue(HACCPPgObjCls.isMenusGroupByLabelDisplayed(), "Group By label under Menus not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMenusGroupByDateDisplayed(), "Group By Date under Menus not displayed in HACCP Screen");
		String strTCDescription = "Group By Date display and validation under HACCP -> Reports -> Menus";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Select Reading label display and validation under HACCP -> Reports -> Menus")
	public void fnValHACCPReportsMenusSelReadingLabel(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isChecklistsRadioBtnDisplayed(), "Checklists radio button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMenusRadioButtonDisplayed(), "Menus radio button not displayed in HACCP Screen");
		HACCPPgObjCls.fnMenusRBClick();
		Assert.assertTrue(HACCPPgObjCls.isMenusSelReadingLabelDisplayed(), "Select Reading label under Menus not displayed in HACCP Screen");
		String strTCDescription = "Select Reading label display and validation under HACCP -> Reports -> Menus";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Display All Records drop down display and validation under HACCP -> Reports -> Menus")
	public void fnValHACCPReportsMenusDispAllRecsDD(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isChecklistsRadioBtnDisplayed(), "Checklists radio button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMenusRadioButtonDisplayed(), "Menus radio button not displayed in HACCP Screen");
		HACCPPgObjCls.fnMenusRBClick();
		Assert.assertTrue(HACCPPgObjCls.isMenusSelReadingLabelDisplayed(), "Select Reading label under Menus not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMenusDispAllRecsDDDisplayed(), "Display all records drop down under Menus not displayed in HACCP Screen");
		String strTCDescription = "Display all records drop down display and validation under HACCP -> Reports -> Menus";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Select Columns label display and validation under HACCP -> Reports -> Menus")
	public void fnValHACCPReportsMenusShowColsLabel(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isChecklistsRadioBtnDisplayed(), "Checklists radio button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMenusRadioButtonDisplayed(), "Menus radio button not displayed in HACCP Screen");
		HACCPPgObjCls.fnMenusRBClick();
		Assert.assertTrue(HACCPPgObjCls.isMenusShowColsLabelDisplayed(), "Show Columns label under Menus not displayed in HACCP Screen");
		String strTCDescription = "Show columns label display and validation under HACCP -> Reports -> Menus";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - All Columns checkbox display and validation under HACCP -> Reports -> Menus")
	public void fnValHACCPReportsMenusAllColsChkBx(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isChecklistsRadioBtnDisplayed(), "Checklists radio button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMenusRadioButtonDisplayed(), "Menus radio button not displayed in HACCP Screen");
		HACCPPgObjCls.fnMenusRBClick();
		Assert.assertTrue(HACCPPgObjCls.isMenusShowColsLabelDisplayed(), "Show Columns label under Menus not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMenusAllColsChkBxDisplayed(), "All Columns checkbox under Menus not displayed in HACCP Screen");
		String strTCDescription = "All Columns checkbox display and validation under HACCP -> Reports -> Menus";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Min/Max checkbox display and validation under HACCP -> Reports -> Menus")
	public void fnValHACCPReportsMenusMinMaxChkBx(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isChecklistsRadioBtnDisplayed(), "Checklists radio button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMenusRadioButtonDisplayed(), "Menus radio button not displayed in HACCP Screen");
		HACCPPgObjCls.fnMenusRBClick();
		Assert.assertTrue(HACCPPgObjCls.isMenusShowColsLabelDisplayed(), "Show Columns label under Menus not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMenusMinMaxChkBxDisplayed(), "Min/Max checkbox under Menus not displayed in HACCP Screen");
		String strTCDescription = "Min/Max checkbox display and validation under HACCP -> Reports -> Menus";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Temperature checkbox display and validation under HACCP -> Reports -> Menus")
	public void fnValHACCPReportsMenusTempChkBx(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isChecklistsRadioBtnDisplayed(), "Checklists radio button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMenusRadioButtonDisplayed(), "Menus radio button not displayed in HACCP Screen");
		HACCPPgObjCls.fnMenusRBClick();
		Assert.assertTrue(HACCPPgObjCls.isMenusShowColsLabelDisplayed(), "Show Columns label under Menus not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMenusTempChkBxDisplayed(), "Temperature checkbox under Menus not displayed in HACCP Screen");
		String strTCDescription = "Temperature checkbox display and validation under HACCP -> Reports -> Menus";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Corrective Action checkbox display and validation under HACCP -> Reports -> Menus")
	public void fnValHACCPReportsMenusCorrActionChkBx(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isChecklistsRadioBtnDisplayed(), "Checklists radio button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMenusRadioButtonDisplayed(), "Menus radio button not displayed in HACCP Screen");
		HACCPPgObjCls.fnMenusRBClick();
		Assert.assertTrue(HACCPPgObjCls.isMenusShowColsLabelDisplayed(), "Show Columns label under Menus not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMenusCorrActionChkBxDisplayed(), "Corrective Action checkbox under Menus not displayed in HACCP Screen");
		String strTCDescription = "Corrective Action checkbox display and validation under HACCP -> Reports -> Menus";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Record Timestamp checkbox display and validation under HACCP -> Reports -> Menus")
	public void fnValHACCPReportsMenusRecordTSChkBx(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isChecklistsRadioBtnDisplayed(), "Checklists radio button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMenusRadioButtonDisplayed(), "Menus radio button not displayed in HACCP Screen");
		HACCPPgObjCls.fnMenusRBClick();
		Assert.assertTrue(HACCPPgObjCls.isMenusShowColsLabelDisplayed(), "Show Columns label under Menus not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMenusRecordTSChkBxDisplayed(), "Record Timestamp checkbox under Menus not displayed in HACCP Screen");
		String strTCDescription = "Record Timestamp checkbox display and validation under HACCP -> Reports -> Menus";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Save as Favourites label display and validation under HACCP -> Reports -> Menus")
	public void fnValHACCPReportsMenusSaveAsFavLabel(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isChecklistsRadioBtnDisplayed(), "Checklists radio button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMenusRadioButtonDisplayed(), "Menus radio button not displayed in HACCP Screen");
		HACCPPgObjCls.fnMenusRBClick();
		Assert.assertTrue(HACCPPgObjCls.isMenusSaveAsFavLabelDisplayed(), "Save as Favourite label under Menus not displayed in HACCP Screen");
		String strTCDescription = "Save as Favourite label display and validation under HACCP -> Reports -> Menus";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Save as Favourites Text Box display and validation under HACCP -> Reports -> Menus")
	public void fnValHACCPReportsMenusSaveAsFavTxtBx(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isChecklistsRadioBtnDisplayed(), "Checklists radio button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMenusRadioButtonDisplayed(), "Menus radio button not displayed in HACCP Screen");
		HACCPPgObjCls.fnMenusRBClick();
		Assert.assertTrue(HACCPPgObjCls.isMenusSaveAsFavLabelDisplayed(), "Save as Favourite label under Menus not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMenusSaveAsFavTxtBxDisplayed(), "Save as Favourite Text Box under Menus not displayed in HACCP Screen");
		String strTCDescription = "Save as Favourite Text Box display and validation under HACCP -> Reports -> Menus";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Save as Favourites Plus Button display and validation under HACCP -> Reports -> Menus")
	public void fnValHACCPReportsMenusSaveAsFavPlusBtn(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isChecklistsRadioBtnDisplayed(), "Checklists radio button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMenusRadioButtonDisplayed(), "Menus radio button not displayed in HACCP Screen");
		HACCPPgObjCls.fnMenusRBClick();
		Assert.assertTrue(HACCPPgObjCls.isMenusSaveAsFavLabelDisplayed(), "Save as Favourite label under Menus not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMenusSaveAsFavTxtBxDisplayed(), "Save as Favourite Text Box under Menus not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMenusSaveAsFavPlusBtnDisplayed(), "Save as Favourite Plus Button under Menus not displayed in HACCP Screen");
		String strTCDescription = "Save as Favourite Plus Button display and validation under HACCP -> Reports -> Menus";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Favourites label display and validation under HACCP -> Reports -> Menus")
	public void fnValHACCPReportsMenusFavsLabel(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isChecklistsRadioBtnDisplayed(), "Checklists radio button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMenusRadioButtonDisplayed(), "Menus radio button not displayed in HACCP Screen");
		HACCPPgObjCls.fnMenusRBClick();
		Assert.assertTrue(HACCPPgObjCls.isMenusFavouritesLabelDisplayed(), "Favourites label under Menus not displayed in HACCP Screen");
		String strTCDescription = "Favourites label display and validation under HACCP -> Reports -> Menus";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Favourites dropdown display and validation under HACCP -> Reports -> Menus")
	public void fnValHACCPReportsMenusFavsDropdown(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isChecklistsRadioBtnDisplayed(), "Checklists radio button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMenusRadioButtonDisplayed(), "Menus radio button not displayed in HACCP Screen");
		HACCPPgObjCls.fnMenusRBClick();
		Assert.assertTrue(HACCPPgObjCls.isMenusFavouritesLabelDisplayed(), "Favourites label under Menus not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMenusFavouritesDropdownDisplayed(), "Favourites dropdown under Menus not displayed in HACCP Screen");
		String strTCDescription = "Favourites dropdown display and validation under HACCP -> Reports -> Menus";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Run Report button display and validation under HACCP -> Reports -> Menus")
	public void fnValHACCPReportsMenusRunReportBtn(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isChecklistsRadioBtnDisplayed(), "Checklists radio button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMenusRadioButtonDisplayed(), "Menus radio button not displayed in HACCP Screen");
		HACCPPgObjCls.fnMenusRBClick();
		Assert.assertTrue(HACCPPgObjCls.isMenusRunReportBtnDisplayed(), "Run report button under Menus not displayed in HACCP Screen");
		String strTCDescription = "Run Report button display and validation under HACCP -> Reports -> Menus";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Download PDF button display and validation under HACCP -> Reports -> Menus")
	public void fnValHACCPReportsMenusShowCriteriaBtn(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);	
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMenusRadioButtonDisplayed(), "Menus radio button not displayed in HACCP Screen");
		HACCPPgObjCls.fnMenusRBClick();
		Assert.assertTrue(HACCPPgObjCls.isHideCriteriaBtnDisplayed(), "Hide criteria button not displayed in HACCP Screen");
		HACCPPgObjCls.fnHideCriteriaBtnClick();
		Assert.assertTrue(HACCPPgObjCls.isMenusPDFBtnDisplayed(), "Download PDF button not displayed in HACCP Screen");
		String strTCDescription = "Download PDF button display and validation under HACCP -> Reports -> Menus";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Checklists page display and validation under HACCP -> Checklists")
	public void fnValidateHACCPChkListsPage(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isChecklistsBtnDisplayed(), "Checklists button not displayed in HACCP Screen");
		HACCPPgObjCls.CheckListsBtnClick();
		Assert.assertTrue(HACCPPgObjCls.isFilterChklistTxtBxDisp(), "Filter Checklist test box not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isAddCheckListButtonDisp(), "Add Checklist test box not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isChkListNameTblHeaderDisp(), "Check list name table header not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isSiteNameTblHeaderDisp(), "Site name table header not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isActionsTblHeaderDisp(), "Actions table header not displayed in HACCP Screen");
		String strTCDescription = "Checklists page display and validation under HACCP -> Checklists";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Save as Favourites label display and validation under HACCP -> Checklists")
	public void fnValHACCPChkListsFilterChkListsTxtBx(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isChecklistsBtnDisplayed(), "Checklists button not displayed in HACCP Screen");
		HACCPPgObjCls.CheckListsBtnClick();
		Assert.assertTrue(HACCPPgObjCls.isFilterChklistTxtBxDisp(), "Filter Checklist text box not displayed in HACCP Screen");
		String strTCDescription = "Filter Checklist text box display and validation under HACCP -> Checklists";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Add Checklist text box display and validation under HACCP -> Checklists")
	public void fnValHACCPChkListsAddChklistBtn(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isChecklistsBtnDisplayed(), "Checklists button not displayed in HACCP Screen");
		HACCPPgObjCls.CheckListsBtnClick();
		Assert.assertTrue(HACCPPgObjCls.isAddCheckListButtonDisp(), "Add Checklist text box not displayed in HACCP Screen");
		String strTCDescription = "Add Checklist text box display and validation under HACCP -> Checklists";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Check list name table header display and validation under HACCP -> Checklists")
	public void fnValHACCPChkListsChkListNameTblHeader(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isChecklistsBtnDisplayed(), "Checklists button not displayed in HACCP Screen");
		HACCPPgObjCls.CheckListsBtnClick();
		Assert.assertTrue(HACCPPgObjCls.isFilterChklistTxtBxDisp(), "Filter Checklist test box not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isAddCheckListButtonDisp(), "Add Checklist test box not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isChkListNameTblHeaderDisp(), "Check list name table header not displayed in HACCP Screen");
		String strTCDescription = "Check list name table header display and validation under HACCP -> Checklists";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Site name table header display and validation under HACCP -> Checklists")
	public void fnValHACCPChkListsSiteNameTblHeader(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isChecklistsBtnDisplayed(), "Checklists button not displayed in HACCP Screen");
		HACCPPgObjCls.CheckListsBtnClick();
		Assert.assertTrue(HACCPPgObjCls.isFilterChklistTxtBxDisp(), "Filter Checklist test box not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isAddCheckListButtonDisp(), "Add Checklist test box not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isSiteNameTblHeaderDisp(), "Site name table header not displayed in HACCP Screen");
		String strTCDescription = "Site name table header display and validation under HACCP -> Checklists";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Actions table header display and validation under HACCP -> Checklists")
	public void fnValidateHACCPActionsTblHeader(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Label not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isChecklistsBtnDisplayed(), "Checklists button not displayed in HACCP Screen");
		HACCPPgObjCls.CheckListsBtnClick();
		Assert.assertTrue(HACCPPgObjCls.isFilterChklistTxtBxDisp(), "Filter Checklist test box not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isAddCheckListButtonDisp(), "Add Checklist test box not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isActionsTblHeaderDisp(), "Actions table header not displayed in HACCP Screen");
		String strTCDescription = "Actions table header display and validation under HACCP -> Checklists";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	
	
	
	
	
	
	
	
	
// *******************************************************************************************************************************	
// *******************************************************************************************************************************
// *******************************************************************************************************************************
	
//	@Test
//	public void fnValidateHACCPFailedTempTxt() throws InterruptedException, IOException {	
//		        			        
//		//String strTestCaseName = testMethod.getName();
//		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
//		homePgObjCls = new CooperHomePageObjectClass(webDriver);
//		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
//		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
//		loginPgObjCls.enterUserName();
//		loginPgObjCls.enterPassword();
//		loginPgObjCls.clickLoginButton();
//		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
//		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
//		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
//		Assert.assertTrue(HACCPPgObjCls.isHomeHACCPFailedTemperatures_TxtDisplayed(), "HACCPFailedTempTxt not displayed in Dashboard Screen");
//		String strTCDescription = "HACCP Failed Temperature Txt display and validation";
//		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTCDescription, strTCDescription);
//		test.log(LogStatus.INFO, strTCDescription);	
//			
//	}
	
//	@Test
//	public void fnValidateHACCPMenusLabel() throws InterruptedException, IOException {	
//	        			        
//		//String strTestCaseName = testMethod.getName();
//		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
//		homePgObjCls = new CooperHomePageObjectClass(webDriver);
//		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
//		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
//		loginPgObjCls.enterUserName();
//		loginPgObjCls.enterPassword();
//		loginPgObjCls.clickLoginButton();
//		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
//		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
//		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
//		Assert.assertTrue(HACCPPgObjCls.isHomeHACCPMenus_LblDisplayed(), "HACCP Menus Label not displayed in Dashboard Screen");
//		String strTCDescription = "HACCP Menus Label display and validation";
//		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTCDescription, strTCDescription);
//		test.log(LogStatus.INFO, strTCDescription);	
//			
//	}
	
//	@Test
//	public void fnValidateHACCPLink() throws InterruptedException, IOException {	
//		        
//		//String strTestCaseName = testMethod.getName();
//				loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
//				homePgObjCls = new CooperHomePageObjectClass(webDriver);
//				HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
//				Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
//				loginPgObjCls.enterUserName();
//				loginPgObjCls.enterPassword();
//				loginPgObjCls.clickLoginButton();
//				webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
//				Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
//				Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
//			String strTCDescription = "HACCP Link display and validation";
//			getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTCDescription, strTCDescription);
//			test.log(LogStatus.INFO, strTCDescription);	
//			
//	}
	
//	@Test
//	public void fnValidateHACCPChecklistsLabel() throws InterruptedException, IOException {	
//	        
//		//String strTestCaseName = testMethod.getName();
//		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
//		homePgObjCls = new CooperHomePageObjectClass(webDriver);
//		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
//		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
//		loginPgObjCls.enterUserName();
//		loginPgObjCls.enterPassword();
//		loginPgObjCls.clickLoginButton();
//		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
//		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
//		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
//		Assert.assertTrue(HACCPPgObjCls.isHACCPSubChecklists_LblDisplayed(), "HACCP Checklists Label not displayed in Dashboard Screen");						String strTCDescription = "HACCP Checklists Label display and validation";
//		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTCDescription, strTCDescription);
//		test.log(LogStatus.INFO, strTCDescription);	
//			
//	}
	
	@Test(description="HACCP Page - Handhelds page display validation")
	public void fnValidateHACCPHandheldsPageTest(Method testMethod) throws InterruptedException, IOException {				
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Header Label not displayed in HACCP Screen");
		HACCPPgObjCls.fnHACCPHandheldsBtnClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(HACCPPgObjCls.isAddBtnDisplayed(), "Add Handhelds button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isGlobalSettingsBtnDisplayed(), "GlobalSettings Button not displayed in HACCP Screen");				
		String strTCDescription = "HACCP Handhelds Page display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);	     
	}
	
	@Test(description="HACCP Page - HACCP handheld radio button display and validation")
	public void fnValidateHACCPhandheldradiobutton(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Header Label not displayed in HACCP Screen");
		HACCPPgObjCls.fnHACCPHandheldsBtnClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(HACCPPgObjCls.isAddBtnDisplayed(), "Add Handhelds button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.ishandheld_RadioBtnDisplayed(), "handheld radio button not displayed in HACCP Screen");				
		String strTCDescription = "HACCP handheld radio button display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - HACCP User radio button display and validation")
	public void fnValidateHACCPUserradiobutton(Method testMethod) throws InterruptedException, IOException {	
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Header Label not displayed in HACCP Screen");
		HACCPPgObjCls.fnHACCPHandheldsBtnClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(HACCPPgObjCls.isAddBtnDisplayed(), "Add Handhelds button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isuser_RadioBtnDisplayed(), "User radio button not displayed in HACCP Screen");				
		String strTCDescription = "HACCP User radio button display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);	
	}
	
	@Test(description="HACCP Page - Add Handhelds button display and validation")
	public void fnValidateHACCPAddHandheldsbutton(Method testMethod) throws InterruptedException, IOException {	  
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Header Label not displayed in HACCP Screen");
		HACCPPgObjCls.fnHACCPHandheldsBtnClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(HACCPPgObjCls.isAddBtnDisplayed(), "Add Handhelds button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isuser_RadioBtnDisplayed(), "User radio button not displayed in HACCP Screen");				
		String strTCDescription = "Add Handhelds button display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - HACCP GlobalSettings Button display and validation")
	public void fnValidateHACCPGlobalSettingsButton(Method testMethod) throws InterruptedException, IOException {	        
			String strTestCaseName = testMethod.getName();
			loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
			homePgObjCls = new CooperHomePageObjectClass(webDriver);
			HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
			Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
			loginPgObjCls.enterUserName();
			loginPgObjCls.enterPassword();
			loginPgObjCls.clickLoginButton();
			webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
			Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
			Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
			Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
			HACCPPgObjCls.fnHACCPLinkClick();
			Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
			Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Header Label not displayed in HACCP Screen");
			HACCPPgObjCls.fnHACCPHandheldsBtnClick();
			webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
			Assert.assertTrue(HACCPPgObjCls.isAddBtnDisplayed(), "Add Handhelds button not displayed in HACCP Screen");
			Assert.assertTrue(HACCPPgObjCls.isGlobalSettingsBtnDisplayed(), "GlobalSettings Button not displayed in HACCP Screen");				
			String strTCDescription = "HACCP GlobalSettings Button display and validation";
			getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
			test.log(LogStatus.INFO, strTCDescription);	
	}
	
	@Test(description="HACCP Page - Move Handheld Device button display and validation")	
	public void fnValidateHACCPMoveHandheldDeviceButton(Method testMethod) throws InterruptedException, IOException {	
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Header Label not displayed in HACCP Screen");
		HACCPPgObjCls.fnHACCPHandheldsBtnClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(HACCPPgObjCls.isAddBtnDisplayed(), "Add Handhelds button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMoveHandheldDeviceBtnDisplayed(), "Move Handheld Device button not displayed in HACCP Screen");			
		String strTCDescription = "Move Handheld Device button display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Type Filter Devices Input display and validation")
	public void fnValidateHACCPTypeFilterDevicesInput(Method testMethod) throws InterruptedException, IOException {	
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Header Label not displayed in HACCP Screen");
		HACCPPgObjCls.fnHACCPHandheldsBtnClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(HACCPPgObjCls.isAddBtnDisplayed(), "Add Handhelds button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isTypeFilterDevicesInputDisplayed(), "Type Filter Devices Input not displayed in HACCP Screen");			
		String strTCDescription = "Type Filter Devices Input display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);		
	}

	@Test(description="HACCP Page - Device ID Table Column Name display and validation")
	public void fnValidateHACCPDeviceIDTableColumnName(Method testMethod) throws InterruptedException, IOException {	
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Header Label not displayed in HACCP Screen");
		HACCPPgObjCls.fnHACCPHandheldsBtnClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(HACCPPgObjCls.isAddBtnDisplayed(), "Add Handhelds button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isDeviceIDTBClmnNameDisplayed(), "Device ID Table Column Name not displayed in HACCP Screen");		
		String strTCDescription = "Device ID Table Column Name display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Site Name Table Column Name display and validation")
	public void fnValidateHACCPSiteNameTableColumnName(Method testMethod) throws InterruptedException, IOException {	
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Header Label not displayed in HACCP Screen");
		HACCPPgObjCls.fnHACCPHandheldsBtnClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(HACCPPgObjCls.isAddBtnDisplayed(), "Add Handhelds button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isSiteNameTBClmnNameDisplayed(), "Site Name Table Column Name not displayed in HACCP Screen");		
		String strTCDescription = "Site Name Table Column Name display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Disabled / Enabled Table Column Name display and validation")
	public void fnValidateHACCPDisabledEnabledTblColName(Method testMethod) throws InterruptedException, IOException {	
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Header Label not displayed in HACCP Screen");
		HACCPPgObjCls.fnHACCPHandheldsBtnClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(HACCPPgObjCls.isAddBtnDisplayed(), "Add Handhelds button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isDisabledEnabledTBClmnNameDisplayed(), "Disabled / Enabled Table Column Name not displayed in HACCP Screen");		
		String strTCDescription = "Disabled / Enabled Table Column Name display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Actions Table Column Name display and validation")
	public void fnValidateHACCPActionsTblColName(Method testMethod) throws InterruptedException, IOException {	
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Header Label not displayed in HACCP Screen");
		HACCPPgObjCls.fnHACCPHandheldsBtnClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(HACCPPgObjCls.isAddBtnDisplayed(), "Add Handhelds button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isActionsTBClmnNameDisplayed(), "Actions Table Column Name not displayed in HACCP Screen");		
		String strTCDescription = "Actions Table Column Name display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - HACCP Users page display and validation")
	public void fnValidateHACCPUsersPageTest(Method testMethod) throws InterruptedException, IOException {	
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Header Label not displayed in HACCP Screen");
		HACCPPgObjCls.fnHACCPHandheldsBtnClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(HACCPPgObjCls.isuser_RadioBtnDisplayed(), "User radio button not displayed in HACCP Screen");
		HACCPPgObjCls.fnUsersRadioBtnClick();
		Assert.assertTrue(HACCPPgObjCls.isFilterUsersTextBxDisplayed(), "Filter users text box not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isAddUsersBtnDisplayed(), "Add users button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isExportUsersBtnDisplayed(), "Export users button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isUsersTableDisplayed(), "Users table not displayed in HACCP Screen");
		String strTCDescription = "HACCP Users page display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);	
	}
	
	@Test(description="HACCP Page - Filter Users text box display and validation")
	public void fnValidateHACCPUsersFilterUsersTxtBx(Method testMethod) throws InterruptedException, IOException {	
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Header Label not displayed in HACCP Screen");
		HACCPPgObjCls.fnHACCPHandheldsBtnClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(HACCPPgObjCls.isuser_RadioBtnDisplayed(), "User radio button not displayed in HACCP Screen");
		HACCPPgObjCls.fnUsersRadioBtnClick();
		Assert.assertTrue(HACCPPgObjCls.isFilterUsersTextBxDisplayed(), "Filter users text box not displayed in HACCP Screen");
//		Assert.assertTrue(HACCPPgObjCls.isAddUsersBtnDisplayed(), "Add users button not displayed in HACCP Screen");
//		Assert.assertTrue(HACCPPgObjCls.isExportUsersBtnDisplayed(), "Export users button not displayed in HACCP Screen");
//		Assert.assertTrue(HACCPPgObjCls.isUsersTableDisplayed(), "Users table not displayed in HACCP Screen");
		String strTCDescription = "Filter Users text box display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);	
	}
	
	@Test(description="HACCP Page - Add Users button display and validation")
	public void fnValidateHACCPUsersAddUsersBtn(Method testMethod) throws InterruptedException, IOException {	
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Header Label not displayed in HACCP Screen");
		HACCPPgObjCls.fnHACCPHandheldsBtnClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(HACCPPgObjCls.isuser_RadioBtnDisplayed(), "User radio button not displayed in HACCP Screen");
		HACCPPgObjCls.fnUsersRadioBtnClick();
//		Assert.assertTrue(HACCPPgObjCls.isFilterUsersTextBxDisplayed(), "Filter users text box not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isAddUsersBtnDisplayed(), "Add users button not displayed in HACCP Screen");
//		Assert.assertTrue(HACCPPgObjCls.isExportUsersBtnDisplayed(), "Export users button not displayed in HACCP Screen");
//		Assert.assertTrue(HACCPPgObjCls.isUsersTableDisplayed(), "Users table not displayed in HACCP Screen");
		String strTCDescription = "Add Users text box display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);	
	}
	
	@Test(description="HACCP Page - Export Users button display and validation")
	public void fnValidateHACCPUsersExportUsersBtn(Method testMethod) throws InterruptedException, IOException {	
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Header Label not displayed in HACCP Screen");
		HACCPPgObjCls.fnHACCPHandheldsBtnClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(HACCPPgObjCls.isuser_RadioBtnDisplayed(), "User radio button not displayed in HACCP Screen");
		HACCPPgObjCls.fnUsersRadioBtnClick();
//		Assert.assertTrue(HACCPPgObjCls.isFilterUsersTextBxDisplayed(), "Filter users text box not displayed in HACCP Screen");
//		Assert.assertTrue(HACCPPgObjCls.isAddUsersBtnDisplayed(), "Add users button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isExportUsersBtnDisplayed(), "Export users button not displayed in HACCP Screen");
//		Assert.assertTrue(HACCPPgObjCls.isUsersTableDisplayed(), "Users table not displayed in HACCP Screen");
		String strTCDescription = "Export Users button display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);	
	}
	
	@Test(description="HACCP Page - Users table display and validation")
	public void fnValidateHACCPUsersTable(Method testMethod) throws InterruptedException, IOException {	
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Header Label not displayed in HACCP Screen");
		HACCPPgObjCls.fnHACCPHandheldsBtnClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(HACCPPgObjCls.isuser_RadioBtnDisplayed(), "User radio button not displayed in HACCP Screen");
		HACCPPgObjCls.fnUsersRadioBtnClick();
//		Assert.assertTrue(HACCPPgObjCls.isFilterUsersTextBxDisplayed(), "Filter users text box not displayed in HACCP Screen");
//		Assert.assertTrue(HACCPPgObjCls.isAddUsersBtnDisplayed(), "Add users button not displayed in HACCP Screen");
//		Assert.assertTrue(HACCPPgObjCls.isExportUsersBtnDisplayed(), "Export users button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isUsersTableDisplayed(), "Users table not displayed in HACCP Screen");
		String strTCDescription = "Users table display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);	
	}
	
	@Test(description="HACCP Page - Username table header display and validation")
	public void fnValHACCPUsersTableUsernameTblHdr(Method testMethod) throws InterruptedException, IOException {	
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Header Label not displayed in HACCP Screen");
		HACCPPgObjCls.fnHACCPHandheldsBtnClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(HACCPPgObjCls.isuser_RadioBtnDisplayed(), "User radio button not displayed in HACCP Screen");
		HACCPPgObjCls.fnUsersRadioBtnClick();
		Assert.assertTrue(HACCPPgObjCls.isUsersTableDisplayed(), "Users table not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isUserNameTblHdrDisplayed(), "User name table header not displayed in HACCP Screen");
		String strTCDescription = "Username table header display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);	
	}
	
	@Test(description="HACCP Page - Site name table header display and validation")
	public void fnValHACCPUsersTableSitenameTblHdr(Method testMethod) throws InterruptedException, IOException {	
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Header Label not displayed in HACCP Screen");
		HACCPPgObjCls.fnHACCPHandheldsBtnClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(HACCPPgObjCls.isuser_RadioBtnDisplayed(), "User radio button not displayed in HACCP Screen");
		HACCPPgObjCls.fnUsersRadioBtnClick();
		Assert.assertTrue(HACCPPgObjCls.isUsersTableDisplayed(), "Users table not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isSiteNameTblHdrDisplayed(), "Site name table header not displayed in HACCP Screen");
		String strTCDescription = "Site Name table header display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);	
	}
	
	@Test(description="HACCP Page - Permission level table header display and validation")
	public void fnValHACCPUsersTablePermissionLevelTblHdr(Method testMethod) throws InterruptedException, IOException {	
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Header Label not displayed in HACCP Screen");
		HACCPPgObjCls.fnHACCPHandheldsBtnClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(HACCPPgObjCls.isuser_RadioBtnDisplayed(), "User radio button not displayed in HACCP Screen");
		HACCPPgObjCls.fnUsersRadioBtnClick();
		Assert.assertTrue(HACCPPgObjCls.isUsersTableDisplayed(), "Users table not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isPermissionLevelTblHdrDisplayed(), "Permission level table header not displayed in HACCP Screen");
		String strTCDescription = "Permission level table header display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);	
	}
	
	@Test(description="HACCP Page - Actions table header display and validation")
	public void fnValHACCPUsersTableActionsTblHdr(Method testMethod) throws InterruptedException, IOException {	
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Header Label not displayed in HACCP Screen");
		HACCPPgObjCls.fnHACCPHandheldsBtnClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(HACCPPgObjCls.isuser_RadioBtnDisplayed(), "User radio button not displayed in HACCP Screen");
		HACCPPgObjCls.fnUsersRadioBtnClick();
		Assert.assertTrue(HACCPPgObjCls.isUsersTableDisplayed(), "Users table not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isActionsTblHdrDisplayed(), "Actions table header not displayed in HACCP Screen");
		String strTCDescription = "Actions table header display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);	
	}
	
	@Test(description="HACCP Page - HACCP Hierarchy Page display and validation")
	public void fnValidateHACCPHierarchyPageTest(Method testMethod) throws InterruptedException, IOException {	 
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Header Label not displayed in HACCP Screen");
		HACCPPgObjCls.fnHACCPHierarchyBtnClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(HACCPPgObjCls.isCorporateDrillDwnDisplayed(), "Corporate Drill Down not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isFilterInputDisplayed(), "Hierarchy Filter Input Box not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.istreeView_DrillDwnDisplayed(), "Corporate Hierarchy Tree View not displayed in HACCP Screen");		
		String strTCDescription = "HACCP Hierarchy Page display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);	
	}

	@Test(description="HACCP Page - HACCP Hierarchy Corporate Drill Down display and validation")
	public void fnValidateHACCPHierarchyCorporateDrillDown(Method testMethod) throws InterruptedException, IOException {	
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Header Label not displayed in HACCP Screen");
		HACCPPgObjCls.fnHACCPHierarchyBtnClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(HACCPPgObjCls.isCorporateDrillDwnDisplayed(), "Corporate Drill Down not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isFilterInputDisplayed(), "Hierarchy Filter Input Box not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.istreeView_DrillDwnDisplayed(), "Corporate Hierarchy Tree View not displayed in HACCP Screen");			
		String strTCDescription = "HACCP Hierarchy Corporate Drill Down display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);	
	}

	@Test(description="HACCP Page - HACCP Hierarchy Filter Input Box display and validation")
	public void fnValidateHACCPHierarchyFilterInputBox(Method testMethod) throws InterruptedException, IOException {	
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Header Label not displayed in HACCP Screen");
		HACCPPgObjCls.fnHACCPHierarchyBtnClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(HACCPPgObjCls.isCorporateDrillDwnDisplayed(), "Corporate Drill Down not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isFilterInputDisplayed(), "Hierarchy Filter Input Box not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.istreeView_DrillDwnDisplayed(), "Corporate Hierarchy Tree View not displayed in HACCP Screen");			
		String strTCDescription = "HACCP Hierarchy Filter Input Box display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}

	
	@Test(description="HACCP Page - HACCP Hierarchy Corporate Hierarchy Tree View display and validation")
	public void fnValidateHACCPHierarchyCorporateHierarchyTreeView(Method testMethod) throws InterruptedException, IOException {	
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Header Label not displayed in HACCP Screen");
		HACCPPgObjCls.fnHACCPHierarchyBtnClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(HACCPPgObjCls.isCorporateDrillDwnDisplayed(), "Corporate Drill Down not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isFilterInputDisplayed(), "Hierarchy Filter Input Box not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.istreeView_DrillDwnDisplayed(), "Corporate Hierarchy Tree View not displayed in HACCP Screen");			
		String strTCDescription = "HACCP Hierarchy Corporate Hierarchy Tree View display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}

	@Test(description="HACCP Page - HACCP Menus Page display and validation")
	public void fnValidateHACCPMenusPageTest(Method testMethod) throws InterruptedException, IOException {	
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Header Label not displayed in HACCP Screen");
		HACCPPgObjCls.fnHACCPMenusBtnClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(HACCPPgObjCls.isAddMenuBtnDisplayed(), "Add Menu Button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMenuNameTbClmNameDisplayed(), "Menu Name Table Column not displayed in HACCP Screen");		
		String strTCDescription = "HACCP Menus Page display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - HACCP Menu Name Table Column display and validation")
	public void fnValidateHACCPMenuNameTableColumn(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Header Label not displayed in HACCP Screen");
		HACCPPgObjCls.fnHACCPMenusBtnClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(HACCPPgObjCls.isAddMenuBtnDisplayed(), "Add Menu Button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isTypeFilterMenuTxtBxDisplayed(), "Menu Filter Type Input Box not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMenuNameTbClmNameDisplayed(), "Menu Name Table Column not displayed in HACCP Screen");			
		String strTCDescription = "HACCP Menu Name Table Column display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}

	@Test(description="HACCP Page - HACCP Menus Radio Button display and validation")
	public void fnValidateHACCPMenusRadioButton(Method testMethod) throws InterruptedException, IOException {	  
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Header Label not displayed in HACCP Screen");
		HACCPPgObjCls.fnHACCPMenusBtnClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(HACCPPgObjCls.isAddMenuBtnDisplayed(), "Add Menu Button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMenusRadioBtnDisplayed(), "Menus Radio Button not displayed in HACCP Screen");			
		String strTCDescription = "HACCP Menus Radio Button display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);	
	}
							
	@Test(description="HACCP Page - HACCP Corrective Actions Radio Button display and validation")
	public void fnValidateHACCPCorrectiveActionsRadioButton(Method testMethod) throws InterruptedException, IOException {	
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Header Label not displayed in HACCP Screen");
		HACCPPgObjCls.fnHACCPMenusBtnClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(HACCPPgObjCls.isAddMenuBtnDisplayed(), "Add Menu Button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isCorrectiveActionsRadioBtnDisplayed(), "Corrective Actions Radio Button not displayed in HACCP Screen");		
		String strTCDescription = "HACCP Corrective Actions Radio Button display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - HACCP Add Menu Button display and validation")
	public void fnValidateHACCPAddMenuButton(Method testMethod) throws InterruptedException, IOException {	
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Header Label not displayed in HACCP Screen");
		HACCPPgObjCls.fnHACCPMenusBtnClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(HACCPPgObjCls.isAddMenuBtnDisplayed(), "Add Menu Button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isCorrectiveActionsRadioBtnDisplayed(), "Corrective Actions Radio Button not displayed in HACCP Screen");
		String strTCDescription = "HACCP Add Menu Button display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - HACCP Menu Filter Type Input Box display and validation")
	public void fnValidateHACCPMenuFilterTypeInputBox(Method testMethod) throws InterruptedException, IOException {
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Header Label not displayed in HACCP Screen");
		HACCPPgObjCls.fnHACCPMenusBtnClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(HACCPPgObjCls.isAddMenuBtnDisplayed(), "Add Menu Button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isTypeFilterMenuTxtBxDisplayed(), "Menu Filter Type Input Box not displayed in HACCP Screen");
		String strTCDescription = "HACCP Menu Filter Type Input Box display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}

	@Test(description="HACCP Page - HACCP Menus Page display and validation")
	public void fnValHACCPMenusMenusMenuNameTblHdr(Method testMethod) throws InterruptedException, IOException {	
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Header Label not displayed in HACCP Screen");
		HACCPPgObjCls.fnHACCPMenusBtnClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(HACCPPgObjCls.isMenusRadioBtnDisplayed(), "Menus Radio Button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMenuNameTbClmNameDisplayed(), "Menu Name Table Column not displayed in HACCP Screen");		
		String strTCDescription = "HACCP Menus Page display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Menu name table header display and validation")
	public void fnValHACCPMenusMenusSiteTblHdr(Method testMethod) throws InterruptedException, IOException {	
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Header Label not displayed in HACCP Screen");
		HACCPPgObjCls.fnHACCPMenusBtnClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(HACCPPgObjCls.isMenusRadioBtnDisplayed(), "Menus Radio Button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMenusMenusSiteTblHdrDisplayed(), "Menu Name Table Column not displayed in HACCP Screen");		
		String strTCDescription = "HACCP Menus Page - Menu name table header display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Actions table header display and validation")
	public void fnValHACCPMenusMenusActionsTblHdr(Method testMethod) throws InterruptedException, IOException {	
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Header Label not displayed in HACCP Screen");
		HACCPPgObjCls.fnHACCPMenusBtnClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(HACCPPgObjCls.isMenusRadioBtnDisplayed(), "Menus Radio Button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isMenusMenusActionsTblHdrDisplayed(), "Actions Table Column not displayed in HACCP Screen");		
		String strTCDescription = "HACCP Menus Page - Actions table header display and validation";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}

	@Test(description="HACCP Page - Corrective Actions page display and validation under HACCP -> Menus -> Corrective Actions")
	public void fnValHACCPMenusCorrectiveActionsPageTest(Method testMethod) throws InterruptedException, IOException {	
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Header Label not displayed in HACCP Screen");
		HACCPPgObjCls.fnHACCPMenusBtnClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(HACCPPgObjCls.isCorrectiveActionsRadioBtnDisplayed(), "Menu Name Table Column not displayed in HACCP Screen");
		HACCPPgObjCls.fnCorrectiveActionsRBClick();
		Assert.assertTrue(HACCPPgObjCls.isFilterCorrActionsTextBoxDisplayed(), "Filter Corrective Actions text box not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isAddCorrActionsButtonDisplayed(), "Add Corrective Actions button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isCorrectiveActionsTableDisplayed(), "Corrective Actions Table not displayed in HACCP Screen");
		String strTCDescription = "Corrective Actions page display and validation under HACCP -> Menus -> Corrective Actions";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Filter Corrective Actions text box display and validation under HACCP -> Menus -> Corrective Actions")
	public void fnValHACCPMenusCorrActionsFilterTxtBx(Method testMethod) throws InterruptedException, IOException {	
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Header Label not displayed in HACCP Screen");
		HACCPPgObjCls.fnHACCPMenusBtnClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(HACCPPgObjCls.isCorrectiveActionsRadioBtnDisplayed(), "Menu Name Table Column not displayed in HACCP Screen");	
		HACCPPgObjCls.fnCorrectiveActionsRBClick();
		Assert.assertTrue(HACCPPgObjCls.isFilterCorrActionsTextBoxDisplayed(), "Filter Corrective Actions text box not displayed in HACCP Screen");
		String strTCDescription = "Filter Corrective Actions text box display and validation under HACCP -> Menus -> Corrective Actions";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Filter Corrective Actions text box display and validation under HACCP -> Menus -> Corrective Actions")
	public void fnValHACCPMenusCorrActionsExportButton(Method testMethod) throws InterruptedException, IOException {	
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Header Label not displayed in HACCP Screen");
		HACCPPgObjCls.fnHACCPMenusBtnClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(HACCPPgObjCls.isCorrectiveActionsRadioBtnDisplayed(), "Menu Name Table Column not displayed in HACCP Screen");
		HACCPPgObjCls.fnCorrectiveActionsRBClick();
		Assert.assertTrue(HACCPPgObjCls.isCorrActionNameChkBoxDisp(), "Corrective Action Name check box not displayed in HACCP Screen");
		HACCPPgObjCls.fnSelectCorrActionNameChkBx();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(HACCPPgObjCls.isExportCorrActionsButtonDisplayed(), "Export Corrective Actions button not Enabled in HACCP Screen");
		String strTCDescription = "Export Corrective Actions button display and validation under HACCP -> Menus -> Corrective Actions";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Add Corrective Actions button display and validation under HACCP -> Menus -> Corrective Actions")
	public void fnValHACCPMenusCorrActionsAddButton(Method testMethod) throws InterruptedException, IOException {	
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Header Label not displayed in HACCP Screen");
		HACCPPgObjCls.fnHACCPMenusBtnClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(HACCPPgObjCls.isCorrectiveActionsRadioBtnDisplayed(), "Menu Name Table Column not displayed in HACCP Screen");	
		HACCPPgObjCls.fnCorrectiveActionsRBClick();
		Assert.assertTrue(HACCPPgObjCls.isAddCorrActionsButtonDisplayed(), "Add Corrective Actions button not displayed in HACCP Screen");
		String strTCDescription = "Add Corrective Actions button display and validation under HACCP -> Menus -> Corrective Actions";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
	
	@Test(description="HACCP Page - Corrective Actions table display and validation under HACCP -> Menus -> Corrective Actions")
	public void fnValHACCPMenusCorrActionsTable(Method testMethod) throws InterruptedException, IOException {	
		String strTestCaseName = testMethod.getName();
		loginPgObjCls = new CooperLoginPageObjectClass(webDriver);
		homePgObjCls = new CooperHomePageObjectClass(webDriver);
		HACCPPgObjCls = new CooperHACCPPageObjectClass(webDriver);
		Assert.assertTrue(loginPgObjCls.isappl_Emerson_Logo_ImgDisplayed(), "Emerson Logo Image not displayed in Login Screen");
		loginPgObjCls.enterUserName();
		loginPgObjCls.enterPassword();
		loginPgObjCls.clickLoginButton();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(homePgObjCls.isLowBatteryTilesDisplayed(), "Low Battery Tiles not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isHACCPLinkDisplayed(), "HACCP Link not displayed in Dashboard Screen");
		Assert.assertTrue(homePgObjCls.isNotifeyeLinkDisplayed(), "Notifeye Link not displayed in Dashboard Screen");
		HACCPPgObjCls.fnHACCPLinkClick();
		Assert.assertTrue(HACCPPgObjCls.isReportsBtnDisplayed(), "Reports button not displayed in HACCP Screen");
		Assert.assertTrue(HACCPPgObjCls.isCorporateHeaderDisplayed(), "Corporate Header Label not displayed in HACCP Screen");
		HACCPPgObjCls.fnHACCPMenusBtnClick();
		webDriver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Assert.assertTrue(HACCPPgObjCls.isCorrectiveActionsRadioBtnDisplayed(), "Menu Name Table Column not displayed in HACCP Screen");	
		HACCPPgObjCls.fnCorrectiveActionsRBClick();
		Assert.assertTrue(HACCPPgObjCls.isCorrectiveActionsTableDisplayed(), "Corrective Actions Table not displayed in HACCP Screen");
		String strTCDescription = "Corrective Actions table display and validation under HACCP -> Menus -> Corrective Actions";
		getScreenshotFileName = CooperUtilitiesClass.captureScreenShot(webDriver, strTestCaseName, strTestCaseName);
		test.log(LogStatus.INFO, strTCDescription);
	}
}
