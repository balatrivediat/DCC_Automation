package cooperProjectResources;

import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class CooperITestListener extends CooperUtilitiesClass implements ITestListener {
	
	protected static ExtentReports reports;
	protected static ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("on test start");
		test = reports.startTest(result.getMethod().getMethodName());
		System.out.println("Test case in progress : " + result.getMethod().getMethodName());
		test.log(LogStatus.INFO, result.getMethod().getMethodName() + " test is started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("on test success");
		test.log(LogStatus.PASS, result.getMethod().getMethodName() + " test is passed");
		String screenshotPath;
		try {
			screenshotPath = CooperProjectResources.getScreenshot(webDriver, result.getName());
			test.log(LogStatus.PASS, test.addScreenCapture(screenshotPath));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("on test failure");
		test.log(LogStatus.FAIL, result.getMethod().getMethodName() + " test is failed");
		String screenshotPath;
		try {
			screenshotPath = CooperProjectResources.getScreenshot(webDriver, result.getName());
			test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("on test skipped");
		test.log(LogStatus.SKIP, result.getMethod().getMethodName() + " test is skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("on test success within percentage");
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("on start");
		//chromeDriver = new ChromeDriver(); // Set the drivers path in environment variables to avoid code(System.setProperty())
		reports = new ExtentReports (System.getProperty("user.dir") +"/test-output/Test_Automation_Execution_Report.html", true);
		reports
		        .addSystemInfo("Host Name", "Test Automation Team")
		        .addSystemInfo("Environment", "Cooper QA")
		        .addSystemInfo("User Name", "Balaraju Doosa");
        //loading the external xml file (i.e., extent-config.xml) which was placed under the base directory
        //You could find the xml file below. Create xml file in your project and copy past the code mentioned below
        reports.loadConfig(new File(System.getProperty("user.dir")+"\\src\\extent-config.xml"));
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("on finish");
		// chromeDriver.close();
		reports.endTest(test);
		reports.flush();
	}

}
