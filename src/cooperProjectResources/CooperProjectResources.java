package cooperProjectResources;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
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

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


public class CooperProjectResources {
	
	public static WebDriver webDriver;
	
	public static DesiredCapabilities caps = new DesiredCapabilities();
	
	public static WebDriver Browsersetup(String platform, String browser, String url) {
		 
		 if(browser.equalsIgnoreCase("Chrome")){
			   System.setProperty("webdriver.chrome.driver", "C:\\Test_Automation\\Working_Dir\\Support_Exe\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				caps.setBrowserName("chrome");
				caps.setCapability(ChromeOptions.CAPABILITY, options);
				webDriver = new ChromeDriver(); 				
		  }
		 webDriver.get(url);
		 return webDriver;
	 }
	
	public static String captureScreenShot(WebDriver ldriver, String TestCaseName, String screenshotName){
		// Take screenshot and store as a file format 
		String getScreenshotName = null;
		File src=((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE); 
		final SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		String strGetTimeStamp = sdf.format(timestamp);
		try {
		// now copy the  screenshot to desired location using copyFile method	
		//String FullAddress=System.getProperty("user.dir")+"/"+ "/Test_Results/Screenshots/"+screenshotName+".png";
		getScreenshotName = "C:\\Test_Automation\\Working_Dir\\Coopers_Selenium_Dir\\CooperProject2019Screenshots\\"+TestCaseName+"_"+strGetTimeStamp+".png";
		FileUtils.copyFile(src, new File(getScreenshotName)); 
		} catch (IOException e){
		 System.out.println(e.getMessage());
		}
		return getScreenshotName;
	}

	//This method is to capture the screenshot and return the path of the screenshot.
	 public static String getScreenshot(WebDriver driver, String screenshotName) throws Exception {
		 String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		 TakesScreenshot ts = (TakesScreenshot) driver;
		 File source = ts.getScreenshotAs(OutputType.FILE);
		 //after execution, you could see a folder "FailedTestsScreenshots" under src folder
		 String destination = System.getProperty("user.dir") + "/TestData_Auto/Results_Temp/"+screenshotName+"_"+dateName+".png";
		 File finalDestination = new File(destination);
		 FileUtils.copyFile(source, finalDestination);
		 return destination;
	 } 
	 
	public static void buildReportAndSend(String tcTotal, String tcPass, String tcFail, String tcSkip, 
			 String suiteStartTime, String suiteEndTime, String totalExecutionTime, List<List<String>> testCasesResultsList) {
		String host = "smtp.office365.com";
		String port = "587";
		String mailFrom = "bala@trivediat.com";
		String password = "Deeva2014";
	
		// outgoing message information
		String mailTo = "bala@trivediat.com";
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
