package cooperProjectResources;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class EmailReportClass extends CooperUtilitiesClass {
	
	public static void main(String[] args) throws Exception {
		String tcTotal = null;
		String tcPass = null;
		String tcFail = null;
		String tcSkip = null;
		String suiteStartTime = null;
		String suiteEndTime = null;
		String totalExecutionTime = null;
		List<List<String>> testCasesResultsList;
		NodeList inputTCsList;
		
		File testNGResultsXML = new File("C:\\Test_Automation\\Working_Dir\\Coopers_Selenium_Dir\\CooperProject2019\\test-output\\testng-results.xml");
		
		// System.out.println("File Exists : " + testNGResultsXML.exists());
					 
		if(testNGResultsXML.exists()) 
		{
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			
			Document testNGInputXML = builder.parse(new File("C:\\Test_Automation\\Working_Dir\\Coopers_Selenium_Dir\\CooperProject2019", "Cooper_testng.xml"));
			testNGInputXML.getDocumentElement().normalize();
			inputTCsList = testNGInputXML.getElementsByTagName("include");
			
			 if(inputTCsList != null && inputTCsList.getLength() != 0)
			 {
				 for(int m=0; m<inputTCsList.getLength(); m++) {
					 System.out.println("********** " + inputTCsList.item(m).getAttributes().getNamedItem("name").getNodeValue());
				 }
			 }
			
			Document testNGOutputXML = builder.parse(new File("C:\\Test_Automation\\Working_Dir\\Coopers_Selenium_Dir\\CooperProject2019\\test-output", "testng-results.xml"));
			testNGOutputXML.getDocumentElement().normalize();
			
			Element root = testNGOutputXML.getDocumentElement();
			tcTotal = root.getAttribute("total");
			tcPass = root.getAttribute("passed");
			tcFail = root.getAttribute("failed");
			tcSkip = root.getAttribute("skipped");
		
			NodeList suiteList = testNGOutputXML.getElementsByTagName("suite");
			if(suiteList != null && suiteList.getLength() != 0)
			{
				suiteStartTime = suiteList.item(0).getAttributes().getNamedItem("started-at").getNodeValue();
				suiteEndTime = suiteList.item(0).getAttributes().getNamedItem("finished-at").getNodeValue();
				totalExecutionTime = suiteList.item(0).getAttributes().getNamedItem("duration-ms").getNodeValue();
			}
						 
			NodeList classList = testNGOutputXML.getElementsByTagName("class");
			 
			testCasesResultsList = new ArrayList<List<String>>();
		 
			if(classList != null && classList.getLength() != 0)
			{
				for(int i=0; i<classList.getLength(); i++)
				{
					NodeList testMethodList = classList.item(i).getChildNodes();
					if(testMethodList != null && testMethodList.getLength() != 0) 
					{
						for(int j=0; j<testMethodList.getLength(); j++)
						{
							if(testMethodList.item(j).getNodeName().equalsIgnoreCase("test-method"))
							{
								String testName = testMethodList.item(j).getAttributes().getNamedItem("name").getNodeValue();
								if(inputTCsList != null && inputTCsList.getLength() != 0)
								{
									for(int m=0; m<inputTCsList.getLength(); m++) {
										if(testName != null & testName.equalsIgnoreCase(inputTCsList.item(m).getAttributes().getNamedItem("name").getNodeValue()))
										{
											List<String> tempList = new ArrayList<String>();
											tempList.add(testName);
											tempList.add(testMethodList.item(j).getAttributes().getNamedItem("description").getNodeValue());
											tempList.add(testMethodList.item(j).getAttributes().getNamedItem("started-at").getNodeValue());
											tempList.add(testMethodList.item(j).getAttributes().getNamedItem("finished-at").getNodeValue());
											tempList.add(testMethodList.item(j).getAttributes().getNamedItem("duration-ms").getNodeValue());
											tempList.add(testMethodList.item(j).getAttributes().getNamedItem("status").getNodeValue());
											testCasesResultsList.add(tempList);
										}
									} 
								}
							}
						}
					}
				}
			}
			if(testCasesResultsList != null && testCasesResultsList.size() != 0)
			 {
				 System.out.println("Size of test results List = " + testCasesResultsList.size());
				 for(int i=0; i<testCasesResultsList.size(); i++)
				 {
					 System.out.println("****************************");
					 for(int j=0; j<testCasesResultsList.get(i).size(); j++)
					 {
						 System.out.println(testCasesResultsList.get(i).get(j));
					 }
				 }
			 }
			if(testCasesResultsList != null & testCasesResultsList.size() != 0) {
				CooperProjectResources.buildReportAndSend(tcTotal, tcPass, tcFail, tcSkip, suiteStartTime, suiteEndTime, totalExecutionTime, testCasesResultsList);
			}
		}
		else 
		{
			System.out.println("***************** NO TESTNG-RESULTS.XML FOUND IN THE DIRECTORY! PLEASE TRY AGAIN *******************");
		}
	}
}
