package cooperProjectResources;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class CooperWebElementHighlighterClass extends CooperProjectResources {
	
	public static void highlightWebElement(WebElement elementName) {
		JavascriptExecutor jse = (JavascriptExecutor) webDriver; 
		jse.executeScript("arguments[0].style.border='3px solid red'", elementName); 
	}

}
