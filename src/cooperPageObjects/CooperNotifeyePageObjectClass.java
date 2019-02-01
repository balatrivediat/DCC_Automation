package cooperPageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cooperProjectResources.CooperProjectResources;

public class CooperNotifeyePageObjectClass extends CooperProjectResources {
	
	@FindBy(xpath="//span[contains(text(), 'All Locations')]")
	WebElement allLocations_Label;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/div[1]/div[1]/app-sensor-summary[1]/app-layout[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/select[1]")
	WebElement allLocations_DropDown;
	
	@FindBy(xpath="//a[contains(text(),'Sensors')]")
	WebElement sensors_button;
	
	@FindBy(xpath="//div[contains(text(),'Temp 1')]")
	WebElement temp1_text;
	
	@FindBy(xpath="//span[contains(text(), 'Gateways')]")
	WebElement gateways_label;
	
	@FindBy(xpath="//span[contains(text(), 'Sensors')]")
	WebElement sensors_label;
	
	@FindBy(xpath="//button[contains(text(),'Compare Sensors')]")
	WebElement compare_sensors_button;
	
	@FindBy(xpath="//input[@placeholder='Filter By Sensor Name']")
	WebElement filterBySensorName_TxtBx;
	
	@FindBy(xpath="//select[@name='filter_by_type']")
	WebElement filterByType_DropDown;
	
	@FindBy(xpath="//select[@name='filter_by_status']")
	WebElement filterByStatus_DropDown;
	
	@FindBy(xpath="//a[contains(text(),'Gateways')]")
	WebElement gateways_Button;
	
	@FindBy(xpath="//a[contains(text(),'Device Management')]")
	WebElement deviceMgmt_Button;
	
	@FindBy(xpath="//input[contains(@value,'sensor')]")
	WebElement sensor_radioButton;
	
	@FindBy(xpath="//input[@value='gateway']")
	WebElement gateway_radioButton;
	
	@FindBy(xpath="//table[contains(@class,'table table-striped light-theme table-sensor-summary')]")
	WebElement sensorSummary_Table;
	
	@FindBy(xpath="//button[contains(@value,'Edit')]")
	WebElement edit_Button;
	
	@FindBy(xpath="//div//button[2]")
	WebElement remove_Button;
	
	@FindBy(xpath="//div//button[3]")
	WebElement move_Button;
	
	@FindBy(xpath="//div//button[4]")
	WebElement add_Button;
	
	@FindBy(xpath="//div//button[5]")
	WebElement reset_Button;
	
	@FindBy(xpath="//i[contains(@class, 'fa fa-plus')]")
	WebElement plus_Image;
	
	@FindBy(xpath="//i[contains(@class, 'fa fa-edit')]")
	WebElement edit_Image;
	
	@FindBy(xpath="//i[contains(@class, 'fa fa-trash')]")
	WebElement trash_Image;
	
	@FindBy(xpath="//i[contains(@class,'fa fa-arrows-alt')]")
	WebElement arrows_Alt_Image;
	
	@FindBy(xpath="//i[contains(@class,'fa fa-history')]")
	WebElement history_Image;
	
	@FindBy(xpath="//input[contains(@name,'allSensor')]")
	WebElement allSensors_SelBox;
	
	@FindBy(xpath="//th[contains(text(),'Sensor Id')]")
	WebElement sensorId_TH;
	
	@FindBy(xpath="//th[contains(@class,'col-md-3')]")
	WebElement sensorName_TH;
	
	@FindBy(xpath="//th[contains(text(),'Heartbeat')]")
	WebElement heartBeat_TH;
	
	@FindBy(xpath="//th[contains(text(),'Scale')]")
	WebElement scale_TH;
	
	@FindBy(xpath="//th[contains(text(),'Min/Max')]")
	WebElement minMax_TH;
	
	@FindBy(xpath="//label[contains(text(),'Sensor Name')]")
	WebElement sensorName_Label;
	
	@FindBy(xpath="//label[contains(text(),'Sensor Id')]")
	WebElement sensorID_Label;
	
	@FindBy(xpath="//button[contains(@type,'button')][contains(text(),'Add')]")
	WebElement sensorAdd_Add_Button;
	
	@FindBy(xpath="//button[contains(@type,'button')][contains(text(),'Cancel')]")
	WebElement sensorAdd_Cancel_Button;
	
	@FindBy(xpath="//label[contains(text(),'Sensor Code')]")
	WebElement sensorCode_Label;
	
	@FindBy(xpath="//label[contains(text(),'Min Threshold')]")
	WebElement minThreshold_Label;
	
	@FindBy(xpath="//label[contains(@for,'nId')][contains(text(),'Select Network Location')]")
	WebElement selNetworkLoc_Label;
	
	@FindBy(xpath="//label[contains(text(),'Heartbeat')]")
	WebElement heartbeat_Label;
	
	@FindBy(xpath="//label[contains(text(),'Max Threshold')]")
	WebElement maxThreshold_Label;
	
	@FindBy(xpath="//tbody//tr[1]//td[3]//input[1]")
	WebElement sensorName_TextBox;
	
	@FindBy(xpath="//tbody//tr[1]//td[4]//select[1]")
	WebElement heartbeat_Dropdown;
	
	@FindBy(xpath="//tbody//tr[1]//td[5]//select[1]")
	WebElement scale_Dropdown;
	
	@FindBy(xpath="//tbody//tr[1]//td[6]//div[1]//div[1]//input[1]")
	WebElement minMax_Dropdown;
	
	@FindBy(xpath="//tab[contains(@class,'tab-content device-management-container')]/descendant::h4[contains(text(), 'Move Gateway Details')]")
	WebElement movGatewayDetails_Label;
	
	@FindBy(xpath="//div[@id='myModal']//i[contains(@class,'fa fa-times')]")
	WebElement moveCancel_Link;
	
	@FindBy(xpath="//label[contains(@class,'control-label col-form-label')]")
	WebElement selNwLoc_label;
	
	@FindBy(xpath="//select[contains(@class,'form-control ng-pristine ng-valid ng-touched')]")
	WebElement allLocs_DropDown;
	
	@FindBy(xpath="//th[contains(@class,'col-md-2')]")
	WebElement name_TableHeader;
	
	@FindBy(xpath="//div[@id='myModal']//div[contains(@class,'modal-footer')]//button[contains(@type,'button')]")
	WebElement saveButton;
	
	@FindBy(xpath="//span[@class='ssCard-name']")
	WebElement Corporate_Label_NotifeyeHome;
	
	@FindBy(xpath="//button[contains(text(),'Corporate')]")
	WebElement Corporate_Button;
	
	@FindBy(xpath="//th[contains(text(),'Logging Interval')]")
	WebElement LoggingInterval_TableHeader;
	
	@FindBy(xpath="//label[contains(text(),'Logging Interval')]")
	WebElement LoggingInterval_Label;
	
	@FindBy(xpath="//th[contains(text(),'Gateway ID')]")
	WebElement GatewayID_TableHeader;
	
	@FindBy(xpath="//th[contains(text(),'Gateway Name')]")
	WebElement GatewayName_TableHeader;
	
	@FindBy(xpath="//th[contains(text(),'Missed Communication Check Interval')]")
	WebElement MCCI_TableHeader;
	
	@FindBy(xpath="//form[@class='ng-pristine ng-valid ng-touched']")
	WebElement devMgmt_WebForm;
	
	public CooperNotifeyePageObjectClass(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	
	public boolean isMCCITableHeaderDisp() {
		try {
			if(this.MCCI_TableHeader.isDisplayed())
			{
				return true;
			}
			else {
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isGatewayIDTableHeaderDisp() {
		try {
			if(this.GatewayID_TableHeader.isDisplayed())
			{
				return true;
			}
			else {
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isGatewayNameTableHeaderDisp() {
		try {
			if(this.GatewayName_TableHeader.isDisplayed())
			{
				return true;
			}
			else {
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isLoggingIntervalLabelDisplayed() {
		try {
			if(this.LoggingInterval_Label.isDisplayed())
			{
				return true;
			}
			else {
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isLoggingIntervalTHDisplayed() {
		try {
			if(this.LoggingInterval_TableHeader.isDisplayed())
			{
				return true;
			}
			else {
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isCorporateButtonDisplayed() {
		try {
			if(this.Corporate_Button.isDisplayed())
			{
				return true;
			}
			else {
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isCorporateLblDispOnNotifeyeHome() {
		try {
			if(this.Corporate_Label_NotifeyeHome.isDisplayed())
			{
				return true;
			}
			else {
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isAllLocsLabelDisplayed() {
		try {
			if(this.allLocations_Label.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isAllLocsDropDownDisplayed() {
		System.out.println("Inside All Locs Drop down");
		try {
			// if(this.allLocations_DropDown.isDisplayed())
			if(new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.visibilityOf(this.allLocations_DropDown)).isDisplayed())
			{
				System.out.println("Insite If");
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean isSensorsButtonDisplayed()
	{
		try {
			if(this.sensors_button.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isTemp1TextDisplayed()
	{
		try {
			if(this.temp1_text.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isGatewaysLabelDisplayed()
	{
		try {
			if(this.gateways_label.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isSensorsLabelDisplayed()
	{
		try {
			if(this.sensors_label.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isCompareSensorsButtonDisplayed()
	{
		try {
			if(this.compare_sensors_button.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isFilterBySensorNameTxtBxDisplayed()
	{
		try {
			if(this.filterBySensorName_TxtBx.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isFilterByTypeDropDownDisplayed()
	{
		try {
			if(this.filterByType_DropDown.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isFilterByStatusDropDownDisplayed()
	{
		try {
			if(this.filterByStatus_DropDown.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isGatewaysButtonDisplayed()
	{
		try {
			if(this.gateways_Button.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isDeviceMgmtButtonDisplayed()
	{
		try {
			if(new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.deviceMgmt_Button)).isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public void clickDeviceMgmtButton() {
		JavascriptExecutor jse = (JavascriptExecutor) webDriver;  
		jse.executeScript("arguments[0].click();", this.deviceMgmt_Button);
		
		// this.deviceMgmt_Button.click();
	}
	
	public boolean issensorRBDisplayed()
	{
		try {
			if(this.sensor_radioButton.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isgatewayRBButtonDisplayed()
	{
		try {
			if(this.gateway_radioButton.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isSensorSummaryTableDisplayed()
	{
		try {
			if(this.sensorSummary_Table.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public void clickSensorRB() {
		this.sensor_radioButton.click();
	}
	
	public boolean isEditButtonDisplayed()
	{
		try {
			if(this.edit_Button.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isRemoveButtonDisplayed()
	{
		try {
			if(this.remove_Button.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isMoveButtonDisplayed()
	{
		try {
			if(this.move_Button.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isAddButtonDisplayed()
	{
		try {
			//if(this.add_Button.isDisplayed())
			if(new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.add_Button)).isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isResetButtonDisplayed()
	{
		try {
			if(this.reset_Button.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isPlusImageDisplayed()
	{
		try {
			if(this.plus_Image.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isEditImageDisplayed()
	{
		try {
			if(this.edit_Image.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isTrashImageDisplayed()
	{
		try {
			if(this.trash_Image.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isArrowsAltImageDisplayed()
	{
		try {
			if(this.arrows_Alt_Image.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isHistoryImageDisplayed()
	{
		try {
			if(this.history_Image.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isAllSensorsSelBxDisplayed()
	{
		try {
			if(this.allSensors_SelBox.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isSensorIdTHDisplayed()
	{
		try {
			if(this.sensorId_TH.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isSensorNameTHDisplayed()
	{
		try {
			if(this.sensorName_TH.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isHeartBeatTHDisplayed()
	{
		try {
			if(this.heartBeat_TH.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isScaleTHDisplayed()
	{
		try {
			if(this.scale_TH.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isMinMaxTHDisplayed()
	{
		try {
			if(this.minMax_TH.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public void clickAddButton() {
		// this.add_Button.click();
//		System.out.println("Inside Click Add Button.....");
//		JavascriptExecutor jse = (JavascriptExecutor) webDriver;  
//		jse.executeScript("arguments[0].click();", this.add_Button);
//		try {
//			Robot robot = new Robot();
//			robot.delay(3000);
//			robot.mouseMove(1312, 208);
//			robot.delay(1500);
//			robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//			robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//			
//		} catch (AWTException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		this.plus_Image.click();
	}
	
	public boolean isSensorNameLabelDisplayed()
	{
		try {
			if(this.sensorName_Label.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isSensorIDLabelDisplayed()
	{
		try {
			if(this.sensorID_Label.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isSensorAddAddButtonDisplayed()
	{
		try {
			if(this.sensorAdd_Add_Button.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isSensorAddCancelButtonDisplayed()
	{
		try {
			if(this.sensorAdd_Cancel_Button.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isSensorCodeLabelDisplayed()
	{
		try {
			if(this.sensorCode_Label.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isMinThresholdLabelDisplayed()
	{
		try {
			if(this.minThreshold_Label.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isMaxThresholdLabelDisplayed()
	{
		try {
			if(this.maxThreshold_Label.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isSelNetworkLocLabelDisplayed()
	{
		try {
			if(this.selNetworkLoc_Label.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isHeartbeatLabelDisplayed()
	{
		try {
			if(this.heartbeat_Label.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public void selectAllSensorsSelBx()
	{
		this.allSensors_SelBox.click();
	}
	
	public boolean isEditButtonEnabled()
	{
		try {
			if(this.edit_Button.isDisplayed() && this.edit_Button.isEnabled())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public void clickEditSensorsButton()
	{
		this.edit_Button.click();
	}
	
	public boolean isSensorNameTBDisplayed()
	{
		try {
			if(this.sensorName_TextBox.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isHeartbeatDDDisplayed()
	{
		try {
			if(this.heartbeat_Dropdown.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isScaleDDDisplayed()
	{
		try {
			if(this.scale_Dropdown.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isMinMaxDDDisplayed()
	{
		try {
			if(this.minMax_Dropdown.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isResetButtonEnabled()
	{
		try {
			if(this.reset_Button.isDisplayed() && this.reset_Button.isEnabled())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public void clickResetButton()
	{
		this.reset_Button.click();
	}
	
	public boolean isSensorNameTBNotVisible()
	{
		//System.out.println("1");
		try {
			if(this.sensorName_TextBox.isDisplayed())
			{
				//System.out.println("2");
				return false;
			}
			else
			{
				//System.out.println("3");
				return true;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isHeartbeatDDNotVisible()
	{
		try {
			if(this.heartbeat_Dropdown.isDisplayed())
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isScaleDDNotVisible()
	{
		try {
			if(this.scale_Dropdown.isDisplayed())
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isMinMaxDDNotVisible()
	{
		try {
			if(this.minMax_Dropdown.isDisplayed())
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isMoveButtonEnabled()
	{
		try {
			if(this.move_Button.isDisplayed() && this.move_Button.isEnabled())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public void clickMoveButton() {
		this.move_Button.click();
	}
	
	public boolean isMoveGatewayDetailsLabelDisp()
	{
		try
		{
			if(this.movGatewayDetails_Label.isDisplayed())
			{
				return true;
			}
			else
			{
				// System.out.println("Label : " + movGatewayDetails_Label.getText());
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public void clickGatewayRB() {
		//this.gateway_radioButton.click();
		System.out.println("4");
		JavascriptExecutor jse = (JavascriptExecutor) webDriver;  
		System.out.println("5");
		jse.executeScript("arguments[0].click();", this.gateway_radioButton);
		System.out.println("6");
//		
//		try {
//			
//			webDriver.switchTo().frame(devMgmt_WebForm);
//			this.gateway_radioButton.click();
//			
//		}
//		catch (NoSuchElementException e) {
//			e.printStackTrace();
//		}
//		finally {
//			webDriver.switchTo().parentFrame();
//		}
	}
	
	public void clickSensorsButton()
	{
		this.sensors_button.click();
	}
	
	public boolean moveCancelLink()
	{
		try
		{
			if(this.moveCancel_Link.isDisplayed())
			{
				return true;
			}
			else
			{
				// System.out.println("Label : " + movGatewayDetails_Label.getText());
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isSelectNetworkLocLabelDisp()
	{
		try
		{
			if(this.selNwLoc_label.isDisplayed())
			{
				return true;
			}
			else
			{
				// System.out.println("Label : " + movGatewayDetails_Label.getText());
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isAllLocsDropDownDisp()
	{
		try
		{
			if(this.allLocs_DropDown.isDisplayed())
			{
				return true;
			}
			else
			{
				// System.out.println("Label : " + movGatewayDetails_Label.getText());
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isNameTHDisplayed()
	{
		try
		{
			if(this.name_TableHeader.isDisplayed())
			{
				return true;
			}
			else
			{
				// System.out.println("Label : " + movGatewayDetails_Label.getText());
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isSaveButtonDisplayed()
	{
		try
		{
			if(this.saveButton.isDisplayed())
			{
				return true;
			}
			else
			{
				// System.out.println("Label : " + movGatewayDetails_Label.getText());
				return false;
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
}
