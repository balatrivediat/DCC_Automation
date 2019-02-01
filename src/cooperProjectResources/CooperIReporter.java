package cooperProjectResources;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.xml.XmlSuite;

public class CooperIReporter implements IReporter {

	String emailReportBody;
	int totalTestCasesRun = 0;
	int totalTestCasesPassed = 0;
	int totalTestCasesFailed = 0;
	int totalTestCasesSkipped = 0;
	List<List<String>> passedTCsList = null;
	List<List<String>> failedTCsList = null;
	List<List<String>> skippedTCsList = null;
	
	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		// TODO Auto-generated method stub
		for(ISuite suite : suites) {
			Map<String, ISuiteResult> suiteResults = suite.getResults();
			for(ISuiteResult sr : suiteResults.values()) {
				ITestContext tc = sr.getTestContext();
				totalTestCasesPassed = tc.getPassedTests().getAllResults().size();
				totalTestCasesFailed = tc.getFailedTests().getAllResults().size();
				totalTestCasesSkipped = tc.getSkippedTests().getAllResults().size();
				totalTestCasesRun = totalTestCasesPassed + totalTestCasesFailed + totalTestCasesSkipped;
			}
			Set<String> keys = suiteResults.keySet();
			for(String key : keys) {
				ITestContext context = suiteResults.get(key).getTestContext();
				
				IResultMap passedResultsMap = context.getPassedTests();
				Collection<ITestNGMethod> passedMethods = passedResultsMap.getAllMethods();
				
				IResultMap failedResultsMap = context.getFailedTests();
				Collection<ITestNGMethod> failedMethods = failedResultsMap.getAllMethods();
				
				IResultMap skippedResultsMap = context.getSkippedTests();
				Collection<ITestNGMethod> skippedMethods = skippedResultsMap.getAllMethods();
				
	            passedTCsList = new ArrayList<List<String>>();
	            	            
	            for (ITestNGMethod iTestNGMethod : passedMethods) { 
	            	List<String> tempList = new ArrayList<>();
	            	tempList.add(iTestNGMethod.getMethodName());
	            	tempList.add(iTestNGMethod.getDescription());
	            	tempList.add("Pass");
	            	passedTCsList.add(tempList);
	            }
	            
	            failedTCsList = new ArrayList<List<String>>();
	            
	            for (ITestNGMethod iTestNGMethod : failedMethods) { 
	            	List<String> tempList = new ArrayList<>();
	            	tempList.add(iTestNGMethod.getMethodName());
	            	tempList.add(iTestNGMethod.getDescription());
	            	tempList.add("Fail");
	            	failedTCsList.add(tempList);
	            }
	            
	            skippedTCsList = new ArrayList<List<String>>();
	            
	            for (ITestNGMethod iTestNGMethod : skippedMethods) { 
	            	List<String> tempList = new ArrayList<>();
	            	tempList.add(iTestNGMethod.getMethodName());
	            	tempList.add(iTestNGMethod.getDescription());
	            	tempList.add("Skip");
	            	skippedTCsList.add(tempList);
	            }
			}
		}
	}
	
	
	public void prepareAndSendReport() {
		System.out.println("Total No. of Test Cases = " + totalTestCasesRun);
		System.out.println("Total No. of Test Cases Passed = " + totalTestCasesPassed);
		System.out.println("Total No. of Test Cases Failed = " + totalTestCasesFailed);
		System.out.println("Total No. of Test Cases Skipped = " + totalTestCasesSkipped);
	}
}
