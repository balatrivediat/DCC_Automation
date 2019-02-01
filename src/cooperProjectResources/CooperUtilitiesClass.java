package cooperProjectResources;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class CooperUtilitiesClass extends CooperProjectResources {
	
	@BeforeMethod
	public void openDriver() throws IOException, InterruptedException {
		webDriver = CooperProjectResources.Browsersetup("Windows", "Chrome", CooperReadFromExcel.getAppURL(1, 0));
		webDriver.manage().window().maximize();
	}

	@AfterMethod
	public void finalizeTest() {
		if(webDriver!=null) {
			System.out.println("Closing All System Config Files and Releasing Driver");
			System.out.println("******************************************************************************************");
			webDriver.close();
			webDriver.quit();
		}	
	}
}
