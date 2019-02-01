package cooperProjectResources;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class ParseXMLClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String tcTotal = null;
		 String tcPass = null;
		 String tcFail = null;
		 String tcSkip = null;
		 String suiteStartTime = null;
		 String suiteEndTime = null;
		 String totalExecutionTime = null;
		 List<List<String>> testCasesResultsList;
		 NodeList inputTCsList;
		 
		 if(new File("C:\\MALLIKARJUN\\SELENIUM\\CooperProject\\test-output", "testng-results.xml").exists()) {
			 System.out.println("***************** YES *******************");
			
			 DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			 DocumentBuilder builder = factory.newDocumentBuilder();
			 
			 Document testNGInputXML = builder.parse(new File("C:\\MALLIKARJUN\\SELENIUM\\CooperProject", "Cooper_testng.xml"));
			 testNGInputXML.getDocumentElement().normalize();
			 
			 inputTCsList = testNGInputXML.getElementsByTagName("include");
//			 if(inputTCsList != null && inputTCsList.getLength() != 0)
//			 {
//				 for(int m=0; m<inputTCsList.getLength(); m++) {
//					 System.out.println("********** " + inputTCsList.item(m).getAttributes().getNamedItem("name").getNodeValue());
//				 }
//			 }

			 Document testNGOutputXML = builder.parse(new File("C:\\MALLIKARJUN\\SELENIUM\\CooperProject\\test-output", "testng-results.xml"));
			 testNGOutputXML.getDocumentElement().normalize();
			  
			 //Here comes the root node
			 Element root = testNGOutputXML.getDocumentElement();
//			 System.out.println(root.getNodeName());
//			 System.out.println(root.getAttribute("passed"));
//			 System.out.println(root.getAttribute("total"));
//			 System.out.println(root.getAttribute("failed"));
			 
			 tcTotal = root.getAttribute("total");
			 tcPass = root.getAttribute("passed");
			 tcFail = root.getAttribute("failed");
			 tcSkip = root.getAttribute("skipped");
 		 
			 //System.out.println("Root node : " + root.getNodeName());
			 
			 NodeList suiteList = testNGOutputXML.getElementsByTagName("suite");
			 
			 if(suiteList != null && suiteList.getLength() != 0)
			 {
				 //System.out.println("Suite List size : " + suiteList.getLength());
				 suiteStartTime = suiteList.item(0).getAttributes().getNamedItem("started-at").getNodeValue();
				 //System.out.println("suiteStartTime : " + suiteStartTime);
				 suiteEndTime = suiteList.item(0).getAttributes().getNamedItem("finished-at").getNodeValue();
				 //System.out.println("suiteEndTime : " + suiteEndTime);
				 totalExecutionTime = suiteList.item(0).getAttributes().getNamedItem("duration-ms").getNodeValue();
				 //System.out.println("totalExecutionTime : " + totalExecutionTime);
			 }
			 
			 NodeList classList = testNGOutputXML.getElementsByTagName("class");
			 
			 testCasesResultsList = new ArrayList<List<String>>();
			 
			 if(classList != null && classList.getLength() != 0)
			 {
				 //System.out.println("Class List length : " + classList.getLength());
				 for(int i=0; i<classList.getLength(); i++)
				 {
					 NodeList testMethodList = classList.item(i).getChildNodes();
					 if(testMethodList != null && testMethodList.getLength() != 0) 
					 {
						 //System.out.println("TestMethod size in Class #" + i + " : " + testMethodList.getLength());
						 for(int j=0; j<testMethodList.getLength(); j++)
						 {
							 if(testMethodList.item(j).getNodeName().equalsIgnoreCase("test-method"))
							 {
								 //System.out.println("TestMethod Name in Class #" + j + " : " + testMethodList.item(j).getNodeName());
								 String testName = testMethodList.item(j).getAttributes().getNamedItem("name").getNodeValue();
								 //System.out.println("Test Name : " + testName);
								 if(inputTCsList != null && inputTCsList.getLength() != 0)
								 {
									 for(int m=0; m<inputTCsList.getLength(); m++) {
										 if(testName != null & testName.equalsIgnoreCase(inputTCsList.item(m).getAttributes().getNamedItem("name").getNodeValue()))
										 {
//											 System.out.println("*******************************");
//											 System.out.println("Test Name : " + testName);
//											 System.out.println(testMethodList.item(j).getAttributes().getNamedItem("started-at").getNodeValue());
//											 System.out.println(testMethodList.item(j).getAttributes().getNamedItem("finished-at").getNodeValue());
//											 System.out.println(testMethodList.item(j).getAttributes().getNamedItem("duration-ms").getNodeValue());
//											 System.out.println(testMethodList.item(j).getAttributes().getNamedItem("status").getNodeValue());
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
				 buildReportAndSend(tcTotal, tcPass, tcFail, tcSkip, suiteStartTime, suiteEndTime, totalExecutionTime, testCasesResultsList);
			 }
		 }
		 else {
			 System.out.println("***************** NO TESTNG-RESULTS.XML FOUND IN THE DIRECTORY! PLEASE TRY AGAIN *******************");
		 }
	}
	
	public static void buildReportAndSend(String tcTotal, String tcPass, String tcFail, String tcSkip, 
			 String suiteStartTime, String suiteEndTime, String totalExecutionTime, List<List<String>> testCasesResultsList) {
		String host = "smtp.office365.com";
		String port = "587";
		String mailFrom = "bala@trivediat.com";
		String password = "Deeva2014";
	
		// outgoing message information
		String mailTo = "mallikarjun1219@gmail.com";
		String subject = "DCC - Automation Execution Report";
	
		String reportBody = "<html><head>"
	       + "<title>Cooper Project</title>"
	       + "</head>"+"<LINK REL='stylesheet' HREF='stylesheet/fac_css.css' TYPE='text/css'>"
	       + "<body>"
	       + "<p align= \"left\">Hi All,<br/>Please find the Automation Execution status report below.</p>"
	   	+ "<table border=\"0\" style=\"table-layout: fixed;\">"
			+ "<tr><td bgcolor=\"#4682B4\" style=\"color: white\" width=\"56%\"><b>Total no. of Test cases Executed</b></td><td bgcolor=\"#4682B4\" style=\"color: white\" width=\"44%\"><b>" + tcTotal + "</b></td></tr>"
		    + "<tr><td bgcolor=\"#DA70D6\" style=\"color: white\" width=\"56%\"><b>Total no. of Test cases Passed</b></td><td bgcolor=\"#DA70D6\" style=\"color: white\" width=\"44%\"><b>" + tcPass + "</b></td></tr>"
		    + "<tr><td bgcolor=\"#4682B4\" style=\"color: white\" width=\"56%\"><b>Total no. of Test cases Failed</b></td><td bgcolor=\"#4682B4\" style=\"color: white\" width=\"44%\"><b>" + tcFail + "</b></td></tr>"
		    + "<tr><td bgcolor=\"#DA70D6\" style=\"color: white\" width=\"56%\"><b>Total no. of Test cases Skipped</b></td><td bgcolor=\"#DA70D6\" style=\"color: white\" width=\"44%\"><b>" + tcSkip + "</b></td></tr>"
		    + "<tr><td bgcolor=\"#4682B4\" style=\"color: white\" width=\"56%\"><b>Test Suite Start Time</b></td><td bgcolor=\"#4682B4\" style=\"color: white\" width=\"44%\"><b>" + suiteStartTime + "</b></td></tr>"
		    + "<tr><td bgcolor=\"#DA70D6\" style=\"color: white\" width=\"56%\"><b>Test Suite End Time</b></td><td bgcolor=\"#DA70D6\" style=\"color: white\" width=\"44%\"><b>" + suiteEndTime + "</b></td></tr>"
		    + "<tr><td bgcolor=\"#4682B4\" style=\"color: white\" width=\"56%\"><b>Total Execution Time (in ms)</b></td><td bgcolor=\"#4682B4\" style=\"color: white\" width=\"44%\"><b>" + totalExecutionTime + "</b></td></tr>"
		    + "</table>"
			+ "<p align=\"left\">Detailed test results can be found in the table below:</p>"
			+ "<table border=\"0\" style=\"table-layout: fixed; width: 100%\">"
			+ "<tr>"
			+ "<td bgcolor=\"#4682B4\" style=\"color: white\" width=\"22%\"><b>Test Case Name</b></td>"
			+ "<td bgcolor=\"#4682B4\" style=\"color: white\" width=\"35%\"><b>Test Case Description</b></td>"
			+ "<td bgcolor=\"#4682B4\" style=\"color: white\" width=\"14%\"><b>Test Start Time</b></td>"
			+ "<td bgcolor=\"#4682B4\" style=\"color: white\" width=\"14%\"><b>Test End Time</b></td>"
			+ "<td bgcolor=\"#4682B4\" style=\"color: white\" width=\"9%\"><b>Execution Duration (in ms)</b></td>"
			+ "<td bgcolor=\"#4682B4\" style=\"color: white\" width=\"6%\"><b>Execution Status</b></td>"
			+ "</tr>";
	   	
	   	for(int i=0; i < testCasesResultsList.size(); i++) {
	   		reportBody = reportBody
					+ "<tr>"
					+ "<td bgcolor=\"#00FFFF\" style=\"color: #4B0082\"><b>" + testCasesResultsList.get(i).get(0) + "</b></td>"
					+ "<td bgcolor=\"#00FFFF\" style=\"color: #4B0082\"><b>" + testCasesResultsList.get(i).get(1) + "</b></td>"
					+ "<td bgcolor=\"#00FFFF\" style=\"color: #4B0082\"><b>" + testCasesResultsList.get(i).get(2) + "</b></td>"
					+ "<td bgcolor=\"#00FFFF\" style=\"color: #4B0082\"><b>" + testCasesResultsList.get(i).get(3) + "</b></td>"
					+ "<td bgcolor=\"#00FFFF\" style=\"color: #4B0082\"><b>" + testCasesResultsList.get(i).get(4) + "</b></td>"
					+ "<td bgcolor=\"#00FFFF\" style=\"color: #4B0082\"><b>" + testCasesResultsList.get(i).get(5) + "</b></td>"
					+ "</tr>";		
	   	}	
	
	   reportBody = reportBody 
			   + "</table>"
			   + "<p align= \"left\"><br/>Thanks & Regards,<br/>DCC Automation Team.</p>"
			   + "</body></html>";
	   
	   Properties properties = new Properties();
	   properties.put("mail.smtp.host", host);
	   properties.put("mail.smtp.port", port);
	   properties.put("mail.smtp.auth", "true");
	   properties.put("mail.smtp.starttls.enable", "true");
	
	   // creates a new session with an authenticator
	   Authenticator auth = new Authenticator() {
	       public PasswordAuthentication getPasswordAuthentication() {
	           return new PasswordAuthentication(mailFrom, password);
	       }
	   };
	
	   Session session = Session.getInstance(properties, auth);
	
	   // creates a new e-mail message
	   Message msg = new MimeMessage(session);
	
	   try {
			msg.setFrom(new InternetAddress(mailFrom));
	       InternetAddress[] toAddresses = { new InternetAddress(mailTo) };
	       msg.setRecipients(Message.RecipientType.TO, toAddresses);
	       msg.setSubject(subject);
	       msg.setSentDate(new Date());
	       Multipart mp = new MimeMultipart();
	       MimeBodyPart htmlPart = new MimeBodyPart();
	       htmlPart.setContent(reportBody, "text/html");
	       mp.addBodyPart(htmlPart);
	       msg.setContent(mp);
	               
	       // sends the e-mail
	       Transport.send(msg);
	       System.out.println("**********************************************");
	       System.out.println("Email Sent Successfully!");
	       System.out.println("**********************************************");
	   } catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
