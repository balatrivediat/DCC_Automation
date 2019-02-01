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

public class CooperHACCPPageObjectClass extends CooperProjectResources {
	
	@FindBy(xpath="//canvas[@class='chartjs-render-monitor']")
	WebElement HACCP_Homepage_Graphs;
	
	@FindBy(xpath="//a[contains(text(),'HACCP')]")
	WebElement HACCP_Link;
	
	@FindBy(xpath="//a[contains(text(),'Notifeye')]")
	WebElement Notifeye_Link;
	
	@FindBy(xpath="//a[text()='Home']")
	WebElement Home_Link;
	
	@FindBy(xpath="//img[@id='logo']")
	WebElement HomePageLogo_Img;
	
	@FindBy(xpath="//div[contains(text(),'Alerts')]")
	WebElement Alerts_Tiles;
	
	@FindBy(xpath="//div[contains(text(),' Missed Communications')]")
	WebElement MissCommunications_Tiles;
	
	@FindBy(xpath="//h3[text()='Current Locations']")
	WebElement currentLocations_Lbl;
	
    @FindBy(xpath="//div[contains(text(),'Low Signal')]")
    WebElement LowSignal_Tiles;
	
    @FindBy(xpath="//a/div/span[1]")
    WebElement UserNameAccount_Lnk;
   
    @FindBy(xpath="//h5[text()='Menus']")
    WebElement HomeHACCPMenus_Lbl;
    
    @FindBy(xpath="//h5[text()='Checklists']")
    WebElement HACCPSubChecklists_Lbl;
    
    @FindBy(xpath="//p[contains(text(),'Failed Temperatures')]")
    WebElement HomeHACCPFailedTemperatures_Txt;
    
    @FindBy(xpath="//p[contains(text(),'Pending Menus')]")
    WebElement HomeHACCPPendingMenus_Txt;
    
    @FindBy(xpath="//p[contains(text(),'Not in Compliance Tasks')]")
    WebElement HomeHACCPNot_Compliance_Tasks_Txt;
    
    @FindBy(xpath="//p[contains(text(),'Pending Checklists')]")
    WebElement HomeHACCP_Pending_Checklists_Txt;
    
    @FindBy(xpath="//a[text()='My Profile']")
	WebElement My_Profile_Lnk;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement Logout_Lnk;
	
	// New Changes Starts Here 
	 
	@FindBy(xpath="//a[contains(text(),'Location Summary')]")
	WebElement LocationSummary_Lnk;
	 
	@FindBy(xpath="//a[contains(text(),'Hierarchy View')]")
	WebElement HierarchyView_Lnk;
	 
	@FindBy(xpath="//a[text()='Map View']")
	WebElement Mapview_Lnk;
		
	@FindBy(xpath="//a[text()='List View']")
	WebElement Listview_Lnk;
	 
	@FindBy(xpath="//a[text()='Root']")
	WebElement RootHierarchy_Lnk;
	 
	@FindBy(xpath="//h2[text()='Corporate']")
	WebElement Corporate_Text;
	
	@FindBy(xpath="//img[@class='tile-svg-icon']")
	WebElement LocationIcon_Img;
	 
	@FindBy(xpath="//span[contains(text(),'Alerts')]")
	WebElement Alerts_text;	 
	 
	 @FindBy(xpath="//span[contains(text(),'Missed Communications')]")
	 WebElement MissedCommunications_text;
	 
	 @FindBy(xpath="//span[contains(text(),'Low Battery')]")
	 WebElement LowBattery_text;
	 
	 @FindBy(xpath="//span[contains(text(),'Failed Temperatures')]")
	 WebElement FailedTemperatures_text;
	 
	 @FindBy(xpath="//span[contains(text(),'Failed Checklists')]")
	 WebElement FailedChecklists_text;
	 
	 @FindBy(xpath="//span[text()='Site Name']")
	 WebElement SiteName_text;
	 
	 @FindBy(xpath="//span[text()='Summary']")
	 WebElement Summary_text;
	 
	 @FindBy(xpath="//span[text()='Address']")
	 WebElement Address_text;
	 
	 @FindBy(xpath="//div[@class='page-count']")
	 WebElement rowCountLocation_lbl;	
	 

	 @FindBy(xpath="//b[text()='Location Name']")
	 WebElement LocationNameTableColumn;
	    
	 @FindBy(xpath="//th[text()='Address']")
	 WebElement LocationAddressTableColumn;
		   
	 @FindBy(xpath="//tbody")
	 WebElement LocationsTable;
	    	 
	    
	 //New Changes Completed
	 
	 @FindBy(xpath="//li[@role='tab']/a[text()='My Profile']")
	 WebElement MyProfile_Btn;
	 
	 @FindBy(xpath="//div[@class='x_content']")
	 WebElement MapConent_Image;
	 
	 @FindBy(xpath="//table[contains(@class,'table table-striped')]")
	 WebElement ListViewTable_Content;	
	 
	@FindBy(xpath="//a[text()='Users']")
	WebElement Users_Btn;
		
	@FindBy(xpath="//a[text()='Notifications']")
	WebElement Notifications_Btn;
	
	@FindBy(xpath="//button[@tooltip='Edit Account']")
	WebElement Edit_Account_Img;
			
	@FindBy(xpath="//i[@class='fa fa-credit-card']")
	WebElement renewcontract_Img;
				
	@FindBy(xpath="//div[@class='network-container']")
	WebElement NetworkLocNames_ChkBox;
	 
	@FindBy(xpath="//div[contains(@class,'paymentHistory')]")
	WebElement PaymentHistory_Table;
	 
	@FindBy(xpath="//div[contains(@class,'myProfile')]/descendant::span[contains(text(),'Is Administrator')]")
	WebElement IsAdministrator_Lbl;

	@FindBy(xpath="//div[contains(@class,'myProfile')]/descendant::span[contains(text(),'Maintenance Notification')]")
	WebElement MaintenanceNotification_Lbl;

	@FindBy(xpath="//div[contains(@class,'myProfile')]/descendant::span[contains(text(),'System Notifications')]")
	WebElement SystemNotifications_Lbl;
	
	@FindBy(xpath="//a[text()='Sensors']")
	WebElement Sensors_Btn;

    @FindBy(xpath="//a[text()='Gateways']")
	WebElement Gateways_Btn;

    @FindBy(xpath="//a[text()='Device Management']")
	WebElement Device_Management_Btn;

    @FindBy(xpath="//button[text()='Compare Sensors']")
	WebElement Compare_Sensors_Btn;

    @FindBy(xpath="//button[text()='Edit Location']")
	WebElement Edit_Location_Btn;

    @FindBy(xpath="//button[text()='Add Location']")
	WebElement Add_Location_Btn;
        
    @FindBy(xpath="//h4[contains(text(),'Add Location')]")
	WebElement Add_Location_HeaderName;
           
   	@FindBy(xpath="//input[@name='filter_name']")
	WebElement FilterName_Input;

	@FindBy(xpath="//select[@name='filter_by_type']")
	WebElement FilterType_DrpDwn;

	@FindBy(xpath="//select[@name='filter_by_status']")
	WebElement FilterStatus_DrpDwn;

	@FindBy(xpath="//div[@class='row sensor-summary-info']/descendant::div[@class='form-group ss-location']")
	WebElement AllLocation_DrpDwn;
	
    @FindBy(xpath="//a[contains(text(),'Reports')]")
    WebElement Reports_Btn;

    @FindBy(xpath="//a[contains(text(),'Hierarchy')]")
    WebElement Hierarchy_Btn;

	@FindBy(xpath="//a[contains(text(),'Menus')]")
	WebElement Menus_Btn;

	@FindBy(xpath="//a[contains(text(),'Handhelds')]")
	WebElement Handhelds_Btn;

	@FindBy(xpath="//a[contains(text(),'Checklists')]")
	WebElement Checklists_Btn;

	@FindBy(xpath="//input[@value='checklist']")
	WebElement Checklist_RdoBtn;
	
	
	@FindBy(xpath="//div/input[@value='menu']")
	WebElement Menu_RdoBtn;
	
	@FindBy(xpath="//input[@placement='position']")
	WebElement position_Input;
	
	@FindBy(xpath="//select[@id='groupByMenu']")
	WebElement groupByMenu_DrpDwn;
	
	@FindBy(xpath="//select[@id='questionTypeMenu']")
	WebElement questionTypeMenu_DrpDwn;
	
	@FindBy(xpath="//select[@id='favorites']")
	WebElement favorites_DrpDwn;
	
	@FindBy(xpath="//label[contains(text(),'Save as Favorite')]")
	WebElement SaveAsFavorites_Label;	
	
	@FindBy(xpath="//button[text()='Run Report']")
	WebElement RunReport_Btn;
	
	@FindBy(xpath="//label[@for='cb1']")
	WebElement ShowAll_Slider;
	
	@FindBy(xpath="//button[contains(text(),'Hide Criteria')]")
	WebElement HideCriteria_Btn;
	
	@FindBy(xpath="//label[text()='Show Columns']")
	WebElement ShowColumns_Label;
	
	@FindBy(xpath="//button[contains(text(),'Corporate')]")
	WebElement Corporate_Button;
	
	@FindBy(xpath="//h1[contains(text(),'Corporate')]")
	WebElement Corporate_Header;
	
	@FindBy(xpath="//input[@placeholder='Filter Checklist']")
	WebElement Filter_Checklist_Input;
	
	@FindBy(xpath="//button[contains(.,'Checklist')]")
	WebElement AddChecklist_Btn;
	
	@FindBy(xpath="//span[contains(text(),'Checklist Name')]")
	WebElement ChecklistName_TbClmn;
	
	@FindBy(xpath="//span[contains(text(),'Menus')]")
	WebElement Menus_RadioBtn;
	
	@FindBy(xpath="//span[contains(text(),'Corrective Actions')]")
	WebElement CorrectiveActions_RadioBtn;

	@FindBy(xpath="//button[contains(.,'Add Menu')]")
	WebElement AddMenu_Btn;

	@FindBy(xpath="//input[@placeholder='Type to filter the Menu']")
	WebElement TypeFilterMenu_TxtBx;

	@FindBy(xpath="//span[contains(text(),'Menu Name')]")
	WebElement MenuNameTbClmName;
	
	@FindBy(xpath="//tab[@class='tab-content']/descendant::div/input[@placeholder='Filter']")
	WebElement Filter_Input;

	@FindBy(xpath="//tab[@class='tab-content']/descendant::label[contains(.,'Corporate')]")
	WebElement Corporate_DrillDwn;

	@FindBy(xpath="//tab[@class='tab-content']/descendant::div[contains(@class,'treeview-container')]")
	WebElement treeView_DrillDwn;

	@FindBy(xpath="//form/descendant::input[@value='handheld']")
	WebElement handheld_RadioBtn;

	@FindBy(xpath="//form/descendant::input[@value='user']")
	WebElement user_RadioBtn;

	@FindBy(xpath="//button[text()='Add']")
	WebElement Add_Btn;

    @FindBy(xpath="//button[contains(text(),'Global Settings')]")
	WebElement GlobalSettings_Btn;

    @FindBy(xpath="//button[contains(text(),'Move Handheld Device')]")
	WebElement MoveHandheldDevice_Btn;

    @FindBy(xpath="//input[@placeholder='Type to filter the devices']")
	WebElement TypeFilterDevices_Input;

	@FindBy(xpath="//span[text()='Device ID']")
	WebElement DeviceID_TBClmnName;
	
	@FindBy(xpath="//ngx-datatable[@class='bootstrap ngx-datatable fixed-header selectable checkbox-selection']//span[@class='datatable-header-cell-label draggable'][contains(text(),'Site Name')]")
	WebElement SiteName_TBClmnName;
	
	@FindBy(xpath="//span[contains(text(),'Disabled / Enabled')]")
	WebElement DisabledEnabled_TBClmnName;
	
	@FindBy(xpath="//ngx-datatable[@class='bootstrap ngx-datatable fixed-header selectable checkbox-selection']//span[@class='datatable-header-cell-label draggable'][contains(text(),'Actions')]")
	WebElement Actions_TBClmnName;
	
	@FindBy(xpath="//h4[text()='Edit Account']")
	WebElement EditAccount_HeaderName;

	@FindBy(xpath="//input[@formcontrolname='companyName']")
	WebElement companyName_TxtBx;
	
	@FindBy(xpath="//input[@formcontrolname='accountID']")
	WebElement accountID_TxtBx;
	
	@FindBy(xpath="//h3[contains(text(),'Renewal Information')]")
	WebElement RenewalInformation_HeaderName;

	@FindBy(xpath="//h3[text()='Hosting Fee']")
		WebElement HostingFee_HeaderName;
	
	@FindBy(xpath="//h3[contains(text(),'Payment Methods')]")
		WebElement PaymentMethods_HeaderName;
	
	@FindBy(xpath="//b[contains(text(),'Invoice ID')]")
	WebElement InvoiceID_HeaderName;
	
    @FindBy(xpath="//input[@placeholder='Email']")
	WebElement Email_Input;

    @FindBy(xpath="//button[text()='Send Password']")
	WebElement SendPassword_Button;

    @FindBy(xpath="//button[text()='Cancel']")
	WebElement Cancel_Button;
    
    @FindBy(xpath="//button[contains(text(),'Verify')]")
	WebElement Verify_Button;

    @FindBy(xpath="//b[text()='Note:']")
	WebElement Notes_Label;

    @FindBy(xpath="//p[contains(text(),'Use the link sent')]")
	WebElement NotesText_Label;

    @FindBy(xpath="//a[contains(text(),'Additional Setup')]")
	WebElement AdditionalSetup_Link;
    
    @FindBy(xpath="//h3[text()='Compare Sensors']")
	WebElement CompareSensors_Button;

    @FindBy(xpath="//button[contains(.,'Add')]/i")
	WebElement Add_Button;

    @FindBy(xpath="//form/input[@value='sensor']")
	WebElement Sensor_Input;

    @FindBy(xpath="//form/input[@value='gateway']")
	WebElement Gateway_Input;

    @FindBy(xpath="//button[contains(.,'Edit')]/i")
	WebElement DeviceMgmtEdit_Button;

    @FindBy(xpath="//button[contains(.,'Remove')]")
	WebElement DeviceMgmtRemove_Button;

    @FindBy(xpath="//button[contains(.,'Move')]/i")
	WebElement DeviceMgmtMove_Button;

    @FindBy(xpath="//button[contains(.,'Reset')]/i")
	WebElement DeviceMgmtReset_Button;

    @FindBy(xpath="//h4[contains(text(),'Edit Location')]")
	WebElement EditLocation_Header;

    @FindBy(xpath="//modal[@title='Edit Location']/descendant::input[@placeholder='Network Name']")
	WebElement EditLocation_NetWorkName_TxtBx;

    @FindBy(xpath="//modal[@title='Edit Location']/descendant::button[contains(text(),'Copy Account Address')]")
	WebElement EditLocation_Copy_Account_Address_Button;

    @FindBy(xpath="//modal[@title='Edit Location']/descendant::select[@formcontrolname='country']")
	WebElement EditLocation_Country_Select;

    @FindBy(xpath="//modal[@title='Edit Location']/descendant::input[@name='street']")
	WebElement EditLocation_Street_Input;
	

    @FindBy(xpath="//modal[@title='Edit Location']/descendant::input[@name='housenumber']")
	WebElement EditLocation_HouseNumber_Input;

    @FindBy(xpath="//modal[@title='Edit Location']/descendant::input[@name='city']")
	WebElement EditLocation_City_Input;

    @FindBy(xpath="//modal[@title='Edit Location']/descendant::select[@formcontrolname='state']")
	WebElement EditLocation_State_SelectDrpDwn;

    @FindBy(xpath="//modal[@title='Edit Location']/descendant::input[@name='zipcode']")
	WebElement EditLocation_ZipCode_Input;

    @FindBy(xpath="//modal[@title='Edit Location']/descendant::button[contains(text(),'Close')]")
	WebElement EditLocation_Close_Button;

    @FindBy(xpath="//modal[@title='Edit Location']/descendant::button[@class='close']")
	WebElement EditLocation_CloseX_Button;


    @FindBy(xpath="//button[contains(text(),'Add User')]")
	WebElement Add_User_Btn;

@FindBy(xpath="//span[contains(text(),'Name')]")
	WebElement Users_Name_TbClmnName;

@FindBy(xpath="//button[contains(.,'Add Notification')]")
	WebElement AddNotification_Btn;

	@FindBy(xpath="//button[text()='Sensor Reading Notification']")
	WebElement Sensor_Reading_Notification_Btn;

        @FindBy(xpath="//button[text()='Battery Notification']")
	WebElement BatteryNotification_Btn;


       @FindBy(xpath="//button[text()='Inactivity Notification']")
	WebElement InactivityNotification_Btn;

       @FindBy(xpath="//button[text()='Advanced Notification']")
	WebElement AdvancedNotification_Btn;

       @FindBy(xpath="//label[text()='Type of Sensor Reading Notification']")
	WebElement TypeSensorReadingNotification_Label;

       @FindBy(xpath="//select[@name='sensor-reading']")
	WebElement SensorReading_Select;

       @FindBy(xpath="//input[@id='notification-name']")
	WebElement NotificationName_Input;

       @FindBy(xpath="//input[@id='notification-text']")
	WebElement NotificationText_Input;

       @FindBy(xpath="//input[@name='compareValue']")
	WebElement CompareValue_Input;

       @FindBy(xpath="//input[@name='strSnoozeAlertValue']")
	WebElement SnoozeAlertValue_Input;

       @FindBy(xpath="//label[text()='Independently']")
	WebElement Independently_Button;

       @FindBy(xpath="//label[text()='Jointly']")
	WebElement Jointly_Button;

       @FindBy(xpath="//label[text()='Notification is active:']")
	WebElement NotificationActive_Label;

       @FindBy(xpath="//button[contains(text(),'Next')]")
	WebElement Next_Button;

       @FindBy(xpath="//label[text()='Type of Advanced Notification']")
	WebElement TypeAdvancedNotification_Label;


       @FindBy(xpath="//select[@name='sensor-reading']")
	WebElement sensor_reading_Select;
    
       @FindBy(xpath="//table[contains(@class,'light-theme')]")
		WebElement DeviceManagement_TableName;

       @FindBy(xpath="//input[@value='checklist']")
		WebElement Checklists_RadioBtn;
       
       @FindBy(xpath="//div[@class='col-xs-12 col-md-10']//input[@value='menu']")
		WebElement Menus_RadioButton;

    @FindBy(xpath="//app-reports-checklist-criteria//label[@class='control-label col-sm-2'][contains(text(),'Select Date')]")
    WebElement SelectDate_Label;

    @FindBy(xpath="//button[@type='submit'][contains(text(),'Run Report')]")
    WebElement RunReport_Button;
    
    @FindBy(xpath="//app-reports-checklist-criteria//app-datepicker//div[@class='input-group']")
    WebElement SelectDate_TextBox;
    
    @FindBy(xpath="//app-reports-checklist-criteria//label[@class='control-label col-sm-2'][contains(text(),'Group By')]")
    WebElement GroupBy_Label;
    
    @FindBy(xpath="//app-reports-checklist-criteria//select[@id='groupByMenu']")
    WebElement GroupBy_Dropdown;
    
    @FindBy(xpath="//label[contains(text(),'Select Question Type')]")
    WebElement SelQuestionType_Label;
    
    @FindBy(xpath="//select[@id='questionTypeMenu']")
    WebElement AllQuestionsType_Dropdown;
    
    @FindBy(xpath="//label[contains(text(),'Show All Readings Out of Range')]")
    WebElement AllReadings_Label;
    
    @FindBy(xpath="//label[@class='tgl-btn']")
    WebElement AllReadings_Select;
    
    @FindBy(xpath="//app-reports-checklist-criteria//label[@class='control-label col-sm-2'][contains(text(),'Show Columns')]")
    WebElement ShowColumns_Label1;
    
    @FindBy(xpath="//div[@class='col-md-4 col-sm-10']//div[@class='badges']")
    WebElement AllColumns_Chkbox;
    
    @FindBy(xpath="//div//app-reports-checklist-criteria//div[@class='col-sm-offset-2 col-sm-10']//div[1]")
    WebElement QuestionType_Chkbox;
    
    @FindBy(xpath="//div//app-reports-checklist-criteria//div[@class='col-sm-offset-2 col-sm-10']//div[2]")
    WebElement MinMax_Chkbox;
    
    @FindBy(xpath="//div//app-reports-checklist-criteria//div[@class='col-sm-offset-2 col-sm-10']//div[3]")
    WebElement Answer_Chkbox;
    
    @FindBy(xpath="//div//app-reports-checklist-criteria//div[@class='col-sm-offset-2 col-sm-10']//div[4]")
    WebElement CorrectiveAction_Chkbox;
    
    @FindBy(xpath="//div//app-reports-checklist-criteria//div[@class='col-sm-offset-2 col-sm-10']//div[5]")
    WebElement RecordTimestamp_Chkbox;
    
    @FindBy(xpath="//app-reports-checklist-criteria//label[@class='control-label col-sm-2'][contains(text(),'Save as Favorite')]")
    WebElement SaveAsFavourite_Label;
    
    @FindBy(xpath="//app-reports-checklist-criteria//div[@class='input-group mb-3']//input[@type='text']")
    WebElement SaveAsFavourite_Textbox;
    
    @FindBy(xpath="//app-reports-checklist-criteria//div[@class='input-group mb-3']//span[@class='input-group-addon']")
    WebElement SaveAsFavourite_PlusBtn;
    
    @FindBy(xpath="//label[contains(text(),'Favourites')]")
    WebElement Favourites_Label;
    
    @FindBy(xpath="//app-reports-checklist-criteria//select[@id='favorites']")
    WebElement Favourites_Dropdown;
    
    @FindBy(xpath="//app-reports-checklist-criteria//i[@class='fa fa-times']")
    WebElement Favourites_Img;
    
    @FindBy(xpath="//button[@class='btn btn-primary']")
    WebElement PDF_Button;
    
    @FindBy(xpath="//app-reports-menu-criteria//label[@class='control-label col-sm-2'][contains(text(),'Select Date')]")
    WebElement Menus_SelectDate_Label;
    
    @FindBy(xpath="//button[@type='button'][contains(text(),'Run Report')]")
    WebElement Menus_RunReport_Btn;
    
    @FindBy(xpath="//app-reports-menu-criteria//app-datepicker//input[@type='text']")
    WebElement Menus_SelectDate_TxtBx;
    
    @FindBy(xpath="//app-reports-menu-criteria//label[@class='control-label col-sm-2'][contains(text(),'Group By')]")
    WebElement Menus_GroupBy_Label;
    
    @FindBy(xpath="//app-reports-menu-criteria//select[@id='groupByMenu']")
    WebElement Menus_GroupBy_Date;
    
    @FindBy(xpath="//label[contains(text(),'Select Reading')]")
    WebElement Menus_SelReading_Label;
    
    @FindBy(xpath="//select[@id='readingMenu']")
    WebElement Menus_DispAllRecs_Dropdown;
    
    @FindBy(xpath="//app-reports-menu-criteria//label[@class='control-label col-sm-2'][contains(text(),'Show Columns')]")
    WebElement Menus_ShowCols_Label;
    
    @FindBy(xpath="//div[@class='col-sm-10']//div[@class='badges']")
    WebElement Menus_AllCols_ChkBx;
    
    @FindBy(xpath="//div//app-reports-menu-criteria//div[@class='col-sm-offset-2 col-sm-10']//div[1]")
    WebElement Menus_MinMax_ChkBx;
    
    @FindBy(xpath="//div//app-reports-menu-criteria//div[@class='col-sm-offset-2 col-sm-10']//div[2]")
    WebElement Menus_Temp_ChkBx;
    
    @FindBy(xpath="//div//app-reports-menu-criteria//div[@class='col-sm-offset-2 col-sm-10']//div[3]")
    WebElement Menus_CorrectiveAction_ChkBx;
    
    @FindBy(xpath="//div//app-reports-menu-criteria//div[@class='col-sm-offset-2 col-sm-10']//div[4]")
    WebElement Menus_RecordTS_ChkBx;
    
    @FindBy(xpath="//app-reports-menu-criteria//label[@class='control-label col-sm-2'][contains(text(),'Save as Favorite')]")
    WebElement Menus_SaveAsFav_Label;
    
    @FindBy(xpath="//app-reports-menu-criteria//div[@class='input-group mb-3']//input[@type='text']")
    WebElement Menus_SaveAsFav_TxtBx;
    
    @FindBy(xpath="//app-reports-menu-criteria//div[@class='input-group mb-3']//span[@class='input-group-addon']")
    WebElement Menus_SaveAsFav_PlusBtn;
    
    @FindBy(xpath="//label[contains(text(),'Favorites')]")
    WebElement Menus_Favourites_Label;
    
    @FindBy(xpath="//app-reports-menu-criteria//select[@id='favorites']")
    WebElement Menus_Favourites_Dropdown;
    
    @FindBy(xpath="//body[@class='nav-sm']/app-root[@ng-version='5.2.5']/div[@class='container body']/div[@class='main_container']/app-haccp/app-layout/div[@class='right_col']/div[@class='row']/div[@class='tabs_container']/tabs/tab[@class='tab-content']/div[@class='tab-panel']/div[@class='row']/div[@class='col-md-12 col-sm-12']/app-reports/div/div[@class='row']/app-reports-menu-criteria/div[@class='col-lg-12 col-md-12 col-xs-12']/div[@class='form-horizontal']/div[@class='form-group']/div[@class='col-sm-10 col-md-4']/div[@class='input-group']/span[1]")
    WebElement Menus_Favourites_CrossBtn;
    
    @FindBy(xpath="//button[contains(text(),'Show Criteria')]")
    WebElement Menus_ShowCriteria_Btn;
    
    @FindBy(xpath="//button[@class='btn btn-primary']")
    WebElement Menus_PDF_Btn;
    
    @FindBy(xpath="//input[@placeholder='Filter Checklist']")
    WebElement FilterChklist_TextBox;
    
    @FindBy(xpath="//div[contains(@class,'form-inline')]//button[contains(@type,'submit')]")
    WebElement AddCheckList_Button;
    
    @FindBy(xpath="//datatable-header-cell[contains(@title,'Checklist Name')]")
    WebElement ChecklistName_TblHeader;
    
    @FindBy(xpath="//div[contains(@class,'visible')]//datatable-header-cell[contains(@title,'Site Name')]")
    WebElement SiteName_TblHeader;
    
    @FindBy(xpath="//div[contains(@class,'visible')]//datatable-header-cell[contains(@title,'Actions')]")
    WebElement Actions_TblHeader;
    
    @FindBy(xpath="//ngx-datatable[@class='bootstrap ngx-datatable fixed-header selectable checkbox-selection']")
    WebElement Users_Table;
    
    @FindBy(xpath="//input[@placeholder='Type to filter the users']")
    WebElement FilterUsers_TextBox;
    
    @FindBy(xpath="//div[@class='col-md-6 col-lg-6 col-sm-12 col-xs-12 m-b-md']//button[2]")
    WebElement AddUsers_Button;
    
    @FindBy(xpath="//div[@class='col-md-6 col-lg-6 col-sm-12 col-xs-12 m-b-md']//button[1]")
    WebElement ExportUsers_Button;
    
    @FindBy(xpath="//span[contains(text(),'Username')]")
    WebElement Username_TblHdr;
    
    @FindBy(xpath="//datatable-header-cell[@title='Site']//span[@class='datatable-header-cell-label draggable'][contains(text(),'Site')]")
    WebElement Sitename_TblHdr;
    
    @FindBy(xpath="//span[contains(text(),'Permission Level')]")
    WebElement PermissionLevel_TblHdr;
    
    @FindBy(xpath="//ngx-datatable[@class='bootstrap ngx-datatable fixed-header selectable checkbox-selection']//span[@class='datatable-header-cell-label draggable'][contains(text(),'Actions')]")
    WebElement Actions_TblHdr;

    @FindBy(xpath="//div[contains(@class,'col-md-12 col-lg-12 col-sm-12')]//app-datatable//div//div[contains(@class,'visible')]//span[contains(@class,'datatable-header-cell-label draggable')][contains(text(),'Site')]")
    WebElement MenusMenusSite_TblHdr;
    
    @FindBy(xpath="//div[contains(@class,'col-md-12 col-lg-12 col-sm-12')]//app-datatable//div//div[contains(@class,'visible')]//span[contains(@class,'datatable-header-cell-label draggable')][contains(text(),'Actions')]")
    WebElement MenusMenusActions_TblHdr;
    
    @FindBy(xpath="//input[contains(@placeholder,'Filter Corrective Action')]")
    WebElement FilterCorrActions_TextBox;
    
    @FindBy(xpath="//div[@class='form-inline']//button[2]")
    WebElement ExportCorrActions_Button;
    
    @FindBy(xpath="//app-menus//div[contains(@class,'form-inline')]//button[1]")
    WebElement AddCorrActions_Button;
    
    @FindBy(xpath="//div[contains(@class,'col-md-12 col-lg-12 col-sm-12')]//app-datatable//div//ngx-datatable[contains(@class,'bootstrap ngx-datatable fixed-header selectable checkbox-selection')]")
    WebElement CorrectiveActions_Table;
    
    @FindBy(xpath="//datatable-scroller[contains(@class,'datatable-scroll')]//datatable-row-wrapper[1]//datatable-body-row[1]//div[2]//datatable-body-cell[1]//div[1]//label[1]//input[1]")
    WebElement CorrActionName_Chkbox;
    
    
	public CooperHACCPPageObjectClass(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	

	public boolean isAddLocationHeaderNameDisplayed() {		
		return this.Add_Location_HeaderName.isDisplayed();
	}
	
	
	public boolean isVerify_ButtonDisplayed() {		
		return new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.Verify_Button)).isDisplayed();
	}
	
	public boolean isCompareSensors_ButtonDisplayed() {		
		return new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.CompareSensors_Button)).isDisplayed();
	}


	public boolean isDeviceManagementTableNameDisplayed() {		
		
		return this.DeviceManagement_TableName.isDisplayed();
	}
	
	public boolean isAddButtonDisplayed() {		
		return new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.Add_Button)).isDisplayed();
	}
	
	public boolean isSensorInputDisplayed() {		
		
		return this.Sensor_Input.isDisplayed();
	}
	
	public boolean isGatewayInputDisplayed() {		
		
		return this.Gateway_Input.isDisplayed();
	}
	
	public boolean isDeviceEditButtonDisplayed() {		
		
		return this.DeviceMgmtEdit_Button.isDisplayed();
	}

	public boolean isDeviceRemoveButtonDisplayed() {		
		
		return this.DeviceMgmtRemove_Button.isDisplayed();
	}


	
	public boolean isDeviceMoveButtonDisplayed() {		
		
		return this.DeviceMgmtMove_Button.isDisplayed();
	}


	
	public boolean isDeviceresetButtonDisplayed() {		
		
		return this.DeviceMgmtReset_Button.isDisplayed();
	}

	public boolean isEditLocationHeaderDisplayed() {		
		
		return this.EditLocation_Header.isDisplayed();
	}

	public boolean isEditLocation_NetWorkName_TxtBxDisplayed() {		
		
		return this.EditLocation_NetWorkName_TxtBx.isDisplayed();
	}

	public boolean isEditLocation_CopyAccountAddressButtonBxDisplayed() {		
		return new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.EditLocation_Copy_Account_Address_Button)).isDisplayed();
	}

	public boolean isEditLocation_Country_SelectDrpDwnDisplayed() {		
		
		return this.EditLocation_Country_Select.isDisplayed();
	}
	
	public boolean isEditLocation_Street_InputDisplayed() {		
		
		return this.EditLocation_Street_Input.isDisplayed();
	}


	
	public boolean isEditLocation_HouseNumber_InputDisplayed() {		
		
		return this.EditLocation_HouseNumber_Input.isDisplayed();
	}


	
	public boolean isEditLocation_City_InputDisplayed() {		
		
		return this.EditLocation_City_Input.isDisplayed();
	}


	
	public boolean isEditLocation_State_SelectDrpDwnDisplayed() {		
		
		return this.EditLocation_State_SelectDrpDwn.isDisplayed();
	}


	
	public boolean isEditLocation_ZipCode_InputDisplayed() {		
		
		return this.EditLocation_ZipCode_Input.isDisplayed();
	}


	
	public boolean isEditLocation_Close_ButtonDisplayed() {		
		return new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.EditLocation_Close_Button)).isDisplayed();
	}


	
	public boolean isEditLocation_CloseX_ButtonDisplayed() {		
		
		return this.EditLocation_CloseX_Button.isDisplayed();
	}


	public boolean isAddUserButtonDisplayed() {		
		return new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.Add_User_Btn)).isDisplayed();
	}

	
	public boolean isUsers_Name_TbClmnNameDisplayed() {		
		
		return this.Users_Name_TbClmnName.isDisplayed();
	}
	
	public boolean isAddNotification_BtnDisplayed() {		
		return new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.AddNotification_Btn)).isDisplayed();
	}


	
	public boolean isSensorReadingNotificationBtnDisplayed() {		
		return new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.Sensor_Reading_Notification_Btn)).isDisplayed();
	}


	
	public boolean isBatteryNotificationBtnDisplayed() {		
		return new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.BatteryNotification_Btn)).isDisplayed();
	}

	
	public boolean isInactivityNotificationBtnDisplayed() {		
		return new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.InactivityNotification_Btn)).isDisplayed();
	}


	
	public boolean isAdvancedNotificationBtnDisplayed() {		
		return new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.AdvancedNotification_Btn)).isDisplayed();
	}



	
	public boolean isTypeSensorReadingNotification_LabelDisplayed() {		
		
		return this.TypeSensorReadingNotification_Label.isDisplayed();
	}


	
	public boolean isSensorReading_SelectDisplayed() {		
		
		return this.SensorReading_Select.isDisplayed();
	}




	
	public boolean isNotificationName_InputDisplayed() {		
		
		return this.NotificationName_Input.isDisplayed();
	}


	
	public boolean isNotificationText_InputDisplayed() {		
		
		return this.NotificationText_Input.isDisplayed();
	}
	
	public boolean isCompareValue_InputDisplayed() {		
		
		return this.CompareValue_Input.isDisplayed();
	}


	
	public boolean isSnoozeAlertValue_InputDisplayed() {		
		
		return this.SnoozeAlertValue_Input.isDisplayed();
	}


	
	public boolean isIndependently_ButtonDisplayed() {		
		
		return this.Independently_Button.isDisplayed();
	}


	
	public boolean isJointly_ButtonDisplayed() {		
		
		return this.Jointly_Button.isDisplayed();
	}


	
	public boolean isNotificationActive_LabelDisplayed() {		
		
		return this.NotificationActive_Label.isDisplayed();
	}


	
	public boolean isNext_ButtonDisplayed() {		
		
		return this.Next_Button.isDisplayed();
	}


	
	public boolean isCancel_ButtonDisplayed() {		
		
		return this.Cancel_Button.isDisplayed();
	}


	
	public boolean isTypeAdvancedNotification_LabelDisplayed() {		
		
		return this.TypeAdvancedNotification_Label.isDisplayed();
	}


	
	public boolean issensor_reading_SelectDisplayed() {		
		
		return this.sensor_reading_Select.isDisplayed();
	}
	
	
	public boolean isNotesText_LabelDisplayed() {		
		
		return this.NotesText_Label.isDisplayed();
	}
	
	public boolean isAdditionalSetup_LinkDisplayed() {		
		
		return this.AdditionalSetup_Link.isDisplayed();
	}

	public boolean isNotes_LabelDisplayed() {		
		
		return this.Notes_Label.isDisplayed();
	}
	
	public boolean isEmail_InputDisplayed() {		
		
		return this.Email_Input.isDisplayed();
	}
	
	public boolean isSendPassword_ButtonDisplayed() {		
		
		return this.SendPassword_Button.isDisplayed();
	}
	

	public boolean isRenewalInformation_HeaderNameDisplayed() {		
		
		return this.RenewalInformation_HeaderName.isDisplayed();
	}
	
	public boolean isHostingFee_HeaderNameDisplayed() {		
		
		return this.HostingFee_HeaderName.isDisplayed();
	}
	
	public boolean isPaymentMethods_HeaderNameDisplayed() {		
		
		return this.PaymentMethods_HeaderName.isDisplayed();
	}
	
	public boolean isInvoiceID_HeaderNameDisplayed() {		
		
		return this.InvoiceID_HeaderName.isDisplayed();
	}
	
	public boolean isFilterInputDisplayed() {		
		
		return this.Filter_Input.isDisplayed();
	}
	
	public boolean isEditAccount_HeaderNameDisplayed() {		
		
		return this.EditAccount_HeaderName.isDisplayed();
	}
	
	public boolean iscompanyName_TxtBxDisplayed() {		
		
		return this.companyName_TxtBx.isDisplayed();
	}
	
	public boolean isaccountID_TxtBxDisplayed() {		
		
		return this.accountID_TxtBx.isDisplayed();
	}

	public boolean isCorporateDrillDwnDisplayed() {		
		
		return this.Corporate_DrillDwn.isDisplayed();
	}

	public boolean istreeView_DrillDwnDisplayed() {		
		
		return this.treeView_DrillDwn.isDisplayed();
	}
	
	public boolean ishandheld_RadioBtnDisplayed() {		
		
		return this.handheld_RadioBtn.isDisplayed();
	}

	public boolean isuser_RadioBtnDisplayed() {		
		
		return this.user_RadioBtn.isDisplayed();
	}

	public boolean isAddBtnDisplayed() {		
		return new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.Add_Btn)).isDisplayed();
	}       

	public boolean isGlobalSettingsBtnDisplayed() {		
		
		return this.GlobalSettings_Btn.isDisplayed();
	}   

	public boolean isMoveHandheldDeviceBtnDisplayed() {		
		
		return this.MoveHandheldDevice_Btn.isDisplayed();
	}

	public boolean isTypeFilterDevicesInputDisplayed() {		
		
		return this.TypeFilterDevices_Input.isDisplayed();
	}

	public boolean isDeviceIDTBClmnNameDisplayed() {		
		
		return this.DeviceID_TBClmnName.isDisplayed();
	}
	
	public boolean isMenusRadioBtnDisplayed() {		
		try
		{
			if(this.Menus_RadioBtn.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isChecklistsRadioBtnDisplayed() {		
		try
		{
			if(this.Checklists_RadioBtn.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isMenusRadioButtonDisplayed() {		
		try
		{
			if(this.Menus_RadioButton.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isCorrectiveActionsRadioBtnDisplayed() {		
		
		return this.CorrectiveActions_RadioBtn.isDisplayed();
	}

	public boolean isAddMenuBtnDisplayed() {		
		return new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.AddMenu_Btn)).isDisplayed();
	}

	public boolean isTypeFilterMenuTxtBxDisplayed() {		
		
		return this.TypeFilterMenu_TxtBx.isDisplayed();
	}

	public boolean isMenuNameTbClmNameDisplayed() {		
		
		return this.MenuNameTbClmName.isDisplayed();
	}
	
	public boolean isFilterChecklistInputkDisplayed() {		
		
		return this.Filter_Checklist_Input.isDisplayed();
	}

	public boolean isAddChecklistBtnDisplayed() {		
		return new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.AddChecklist_Btn)).isDisplayed();
	}

	public boolean isChecklistNameTbClmnDisplayed() {		
		
		return this.ChecklistName_TbClmn.isDisplayed();
	}
	
	public boolean isChecklistRdoBtnDisplayed() {		
		
		return this.Checklist_RdoBtn.isDisplayed();
	}
	
	public boolean isMenuRdoBtnDisplayed() {		
		
		return this.Menu_RdoBtn.isDisplayed();
	}
	
	public boolean ispositionInputDisplayed() {		
		
		return this.position_Input.isDisplayed();
	}
	
	public boolean isgroupByMenuDrpDwnDisplayed() {		
		
		return this.groupByMenu_DrpDwn.isDisplayed();
	}
	
	public boolean isquestionTypeMenuDrpDwnDisplayed() {		
		
		return this.questionTypeMenu_DrpDwn.isDisplayed();
	}
	
	public boolean isSaveAsFavorites_LabelDisplayed() {		
		
		return this.SaveAsFavorites_Label.isDisplayed();
	}
	
	public boolean isfavoritesDrpDwnDisplayed() {		
		
		return this.favorites_DrpDwn.isDisplayed();
	}
	
	public boolean isRunReportBtnDisplayed() {		
		
		return this.RunReport_Btn.isDisplayed();
	}
	
	public boolean isShowAllSliderDisplayed() {		
		
		return this.ShowAll_Slider.isDisplayed();
	}
	
	public boolean isHideCriteriaBtnDisplayed() {		
		
		return this.HideCriteria_Btn.isDisplayed();
	}
	
//	public boolean isShowColumnsLabelDisplayed() {		
//		
//		return this.ShowColumns_Label.isDisplayed();
//	}
	
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
		catch(NoSuchElementException e) {
			//log 4j
			return false;
		}
	}
	
	public boolean isCorporateHeaderDisplayed() {		
		try {
			if(this.Corporate_Header.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isReportsBtnDisplayed() {
		try
		{
			if(new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.Reports_Btn)).isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isChecklistsBtnDisplayed() {
		try
		{
			if(new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.Checklists_Btn)).isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public void CheckListsBtnClick() {
		JavascriptExecutor jse = (JavascriptExecutor) webDriver;  
		jse.executeScript("arguments[0].click();", this.Checklists_Btn);
	}
	
	public boolean isHierarchyBtnDisplayed() {
		try
		{
			if(new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.Hierarchy_Btn)).isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isMenusBtnDisplayed() {		
		try
		{
			if(new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.Menus_Btn)).isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}

	public boolean isHandheldsBtnDisplayed() {		
		try
		{
			if(new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.Handhelds_Btn)).isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}

	public boolean isSensorsBtnDisplayed() {		
		return new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.Sensors_Btn)).isDisplayed();
	}
	
	public boolean isGatewaysBtnDisplayed() {		
		return new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.Gateways_Btn)).isDisplayed();
	}
	
	public boolean isDeviceManagementBtnDisplayed() {		
		
		return this.Device_Management_Btn.isDisplayed();
	}
	
	public boolean isCompareSensorsBtnDisplayed() {		
		return new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.Compare_Sensors_Btn)).isDisplayed();
	}
	
	public boolean isEditLocationBtnDisplayed() {		
		
		return this.Edit_Location_Btn.isDisplayed();
	}
	
	public boolean isAddLocationBtnDisplayed() {		
		
		return this.Add_Location_Btn.isDisplayed();
	}
	
	public boolean isFilterNameInputDisplayed() {		
		
		return this.FilterName_Input.isDisplayed();
	}
	
	public boolean isFilterByTypeDrpDwnDisplayed() {		
		
		return this.FilterType_DrpDwn.isDisplayed();
	}
	
	public boolean isFilterStatusDrpDwnDisplayed() {		
		
		return this.FilterStatus_DrpDwn.isDisplayed();
	}
	
	public boolean isAllLocation_DrpDwnDisplayed() {		
		
		return this.AllLocation_DrpDwn.isDisplayed();
	}
	
	public boolean isIsAdministratorLblDisplayed() {		
		
		return this.IsAdministrator_Lbl.isDisplayed();
	}

	public boolean isMaintenanceNotification_LblDisplayed() {		
		
		return this.MaintenanceNotification_Lbl.isDisplayed();
	}

	public boolean isSystemNotificationsLblDisplayed() {		
		
		return this.SystemNotifications_Lbl.isDisplayed();
	}
	
	public boolean isPaymentHistoryTableDisplayed() {		
		
		return this.PaymentHistory_Table.isDisplayed();
	}
	
	public boolean iscreditcardImgDisplayed() {		
		
		return this.renewcontract_Img.isDisplayed();
	}
	
	public boolean isNetworkLocNamesChkBoxDisplayed() {		
		
		return this.NetworkLocNames_ChkBox.isDisplayed();
	}
	
	public boolean isEditAccountImgDisplayed() {		
		
		return this.Edit_Account_Img.isDisplayed();
	}
	
	public boolean isNotificationsBtnDisplayed() {		
		
		return this.Notifications_Btn.isDisplayed();
	}

	public boolean isUsersBtnDisplayed() {		
		
		return this.Users_Btn.isDisplayed();
	}
	
	public boolean isMyProfileBtnDisplayed() {		
		return new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.MyProfile_Btn)).isDisplayed();
	}
	
	public boolean isLogoutLnkDisplayed() {		
		return new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.Logout_Lnk)).isDisplayed();
	}
	
	public boolean isMyProfileLnkDisplayed() {		
		return new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.My_Profile_Lnk)).isDisplayed();
	}
	
	public boolean isListViewTableDisplayed() {		
		
		return this.ListViewTable_Content.isDisplayed();
	}
	
	public boolean isMapContentImgDisplayed() {		
		
		return this.MapConent_Image.isDisplayed();
	}
	
	public boolean isLocationNameTableColumnDisplayed() {		
		
		return this.LocationNameTableColumn.isDisplayed();
	}
	
	public boolean isLocationAddressTableColumnDisplayed() {		
		
		return this.LocationAddressTableColumn.isDisplayed();
	}
	
	public boolean isLocationsTableDisplayed() {		
		
		return this.LocationsTable.isDisplayed();
	}
	
	public boolean isHomeHACCPMenus_LblDisplayed() {		
		
		return this.HomeHACCPMenus_Lbl.isDisplayed();
	}
	
	public boolean isHACCPSubChecklists_LblDisplayed() {		
		
		return this.HACCPSubChecklists_Lbl.isDisplayed();
	}
	
	public boolean isHomeHACCPFailedTemperatures_TxtDisplayed() {		
		
		return this.HomeHACCPFailedTemperatures_Txt.isDisplayed();
	}
	
	public boolean isHomeHACCPPendingMenus_TxtDisplayed() {		
		
		return this.HomeHACCPPendingMenus_Txt.isDisplayed();
	}
	
	public boolean isHomeHACCPNotComplianceTasksTxtDisplayed() {		
		
		return this.HomeHACCPNot_Compliance_Tasks_Txt.isDisplayed();
	}
	
	public boolean isHomeHACCPPendingChecklistsTxtDisplayed() {		
		
		return this.HomeHACCP_Pending_Checklists_Txt.isDisplayed();
	}
	
	public boolean isUserNameAccountLnkDisplayed() {		
		
		return this.UserNameAccount_Lnk.isDisplayed();
	}

	public boolean isMapviewLnkDisplayed() {		
		
		return this.Mapview_Lnk.isDisplayed();
	}

	public boolean isListviewLnkDisplayed() {		
		
		return this.Listview_Lnk.isDisplayed();
	}
	
	
	public boolean isHomeAppLogoDisplayed() {		
		
		return this.HomePageLogo_Img.isDisplayed();
	}
	
	public boolean isCurrentLocationLblDisplayed() {		
		
		return this.currentLocations_Lbl.isDisplayed();
	}

	public boolean isAlertsTilesDisplayed() {		
		
		return this.Alerts_Tiles.isDisplayed();
	}

	public boolean isMissCommunicationsTilesDisplayed() {		
		
		return this.MissCommunications_Tiles.isDisplayed();
	}
	
	
	public boolean isHomeLinkDisplayed() {		
		return new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.Home_Link)).isDisplayed();
	}
	
	
	public boolean isHACCPLinkDisplayed() {		
		return new WebDriverWait(webDriver, 100, 1500).until(ExpectedConditions.elementToBeClickable(this.HACCP_Link)).isDisplayed();
	}
	
	public boolean isNotifeyeLinkDisplayed() {		
		return new WebDriverWait(webDriver, 100, 1500).until(ExpectedConditions.elementToBeClickable(this.Notifeye_Link)).isDisplayed();
	}
	
	public boolean isHACCP_Homepage_GraphsDisplayed() {		
		
		return this.HACCP_Homepage_Graphs.isDisplayed();
	}
	
	
	public void fnUserccountLnkClick() {		
		UserNameAccount_Lnk.click(); 
	}
	
	public void fnMyProfileLnkClick() {		
		My_Profile_Lnk.click(); 
	}
	
	public void fnLogoutLnkClick() {		
		Logout_Lnk.click(); 
	}
	
	public void fnMapViewLnkClick() {		
		Mapview_Lnk.click(); 
	}
	
	public void fnListViewLnkClick() {		
		Listview_Lnk.click(); 
	}
	
	public void fnNotifeyeLinkClick() {		
		Notifeye_Link.click(); 
	}
	
	public void fnHACCPLinkClick() {		
		HACCP_Link.click(); 
	}
	
	public void fnHACCPChecklistsBtnClick() {		
		Checklists_Btn.click(); 
	}
	
	public void fnHACCPMenusBtnClick() {		 
		// Menus_Btn.click(); 
			
		JavascriptExecutor jse = (JavascriptExecutor) webDriver;  
		jse.executeScript("arguments[0].click();", this.Menus_Btn);
	}
	
	public void fnHACCPHandheldsBtnClick() {		
		Handhelds_Btn.click(); 
	}
	
	public void fnHACCPHierarchyBtnClick() {		
		Hierarchy_Btn.click(); 
	}
	
	public void fnDeviceManagementBtnClick() {		
		Device_Management_Btn.click(); 
	}
	
	public void fnSensor_Reading_Notification_BtnClick() {		
		Sensor_Reading_Notification_Btn.click(); 
	}


	public void fnBatteryNotification_BtnClick() {		
			BatteryNotification_Btn.click(); 
		}
	
	public void fnInactivityNotification_BtnClick() {		
			InactivityNotification_Btn.click(); 
		}
	
//	public void fnNotification_BtnClick() {		
//			Notification_Btn.click(); 
//		}
	
	
	public void fnEdit_Location_BtnClick() {		
			Edit_Location_Btn.click(); 
		}
	
	public void fnAdd_Location_BtnClick() {		
			Add_Location_Btn.click(); 
		}
	
	public void fnUsers_BtnClick() {		
			Users_Btn.click(); 
		}
	
	public void fnAdd_User_BtnClick() {		
			Add_User_Btn.click(); 
		}
	
	public void fnNotifications_BtnClick() {		
			Notifications_Btn.click(); 
		}
	
	public void fnAddNotification_BtnClick() {		
			AddNotification_Btn.click(); 
		}
	
	public void fnEdit_Account_ImgClick() {		
			Edit_Account_Img.click(); 
		}
	
	
	public void fnrenewcontract_ImgClick() {		
			renewcontract_Img.click(); 
		}
	
	
	public void fnEditLocationBtnClick() {		
		Edit_Location_Btn.click(); 
	}
	
	public void fnAddLocationBtnBtnClick() {		
		Add_Location_Btn.click(); 
	}
	
	
	public void fnSensorReadingNotificationBtnClick(){		
		Sensor_Reading_Notification_Btn.click();	
	}
	
	public void fnBatteryNotificationBtnClick(){		
		BatteryNotification_Btn.click();	
	}
	
	public void fnInactivityNotificationBtnClick(){		
		InactivityNotification_Btn.click();	
	}
	
	public void fnAdvancedNotificationBtnClick(){		
		AdvancedNotification_Btn.click();	
	}
		
	public boolean isSelectDateLabelDisplayed() {
		try {
			if(this.SelectDate_Label.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}

	public boolean isSelectDateTextBoxDisplayed() {
		try {
			if(this.SelectDate_TextBox.isDisplayed()) {
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isChkListsRunReportBtnDisplayed() {
		try {
			// if(this.Menus_RunReport_Btn.isDisplayed()) {
			if(new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.RunReport_Button)).isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isMenusRunReportBtnDisplayed() {
		try {
			// if(this.Menus_RunReport_Btn.isDisplayed()) {
			if(new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.Menus_RunReport_Btn)).isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isGroupByLabelDisplayed() {
		try {
			if(this.GroupBy_Label.isDisplayed()) {
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isGroupByDropdownDisplayed() {
		try {
			if(this.GroupBy_Dropdown.isDisplayed()) {
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isSelQuestionTypeLabelDisplayed() {
		try {
			if(this.SelQuestionType_Label.isDisplayed()) {
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isAllQuestionsTypeDropdownDisplayed() {
		try {
			if(this.AllQuestionsType_Dropdown.isDisplayed()) {
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isAllReadingsLabelDisplayed() {
		try {
			if(this.AllReadings_Label.isDisplayed()) {
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isAllReadingsSelectDisplayed() {
		try {
			if(this.AllReadings_Select.isDisplayed()) {
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isShowColumnsLabelDisplayed() {
		try {
			if(this.ShowColumns_Label1.isDisplayed()) {
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isAllColumnsCheckBoxDisplayed() {
		try {
			if(this.AllColumns_Chkbox.isDisplayed()) {
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isQuestionTypeCheckBoxDisplayed() {
		try {
			if(this.QuestionType_Chkbox.isDisplayed()) {
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isMinMaxCheckBoxDisplayed() {
		try {
			if(this.MinMax_Chkbox.isDisplayed()) {
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isAnswerCheckBoxDisplayed() {
		try {
			if(this.Answer_Chkbox.isDisplayed()) {
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isCorrectiveActionCheckBoxDisplayed() {
		try {
			if(this.CorrectiveAction_Chkbox.isDisplayed()) {
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isRecordTimeStampCheckBoxDisplayed() {
		try {
			if(this.RecordTimestamp_Chkbox.isDisplayed()) {
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isSaveAsFavouriteLabelDisplayed() {
		try {
			if(this.SaveAsFavourite_Label.isDisplayed()) {
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isSaveAsFavouriteTextBoxDisplayed() {
		try {
			if(this.SaveAsFavourite_Textbox.isDisplayed()) {
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isSaveAsFavouritePlusBtnDisplayed() {
		try {
			if(this.SaveAsFavourite_PlusBtn.isDisplayed()) {
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isFavouritesLabelDisplayed() {
		try {
			if(this.Favourites_Label.isDisplayed()) {
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isFavouritesDropdownDisplayed() {
		try {
			if(this.Favourites_Dropdown.isDisplayed()) {
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isFavouritesImageDisplayed() {
		try {
			if(this.Favourites_Img.isDisplayed()) {
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public void fnHideCriteriaBtnClick() {
		//this.HideCriteria_Btn.click();
		JavascriptExecutor jse = (JavascriptExecutor) webDriver;  
		jse.executeScript("arguments[0].click();", this.HideCriteria_Btn);
	}
	
	public boolean isPDFButtonDisplayed() {
		try {
			if(this.PDF_Button.isDisplayed()) {
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public void fnMenusRBClick() {
//		if(new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.Menus_RadioButton)).isDisplayed())
//		{
//			this.Menus_RadioButton.click();
//		}
		JavascriptExecutor jse = (JavascriptExecutor) webDriver;
		jse.executeScript("arguments[0].click();", this.Menus_RadioButton);
	}
	
	public boolean isMenusSelectDateLabelDisplayed() {
		try {
			if(new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.Menus_SelectDate_Label)).isDisplayed()) {
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isMenusSelectDateTxtBxDisplayed() {
		try {
			if(this.Menus_SelectDate_TxtBx.isDisplayed())
			{
				return true;
			}
			else {
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isMenusGroupByLabelDisplayed() {
		try {
			if(this.Menus_GroupBy_Label.isDisplayed())
			{
				return true;
			}
			else {
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isMenusGroupByDateDisplayed() {
		try {
			if(this.Menus_GroupBy_Date.isDisplayed())
			{
				return true;
			}
			else {
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isMenusSelReadingLabelDisplayed() {
		try {
			if(this.Menus_SelReading_Label.isDisplayed())
			{
				return true;
			}
			else {
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isMenusDispAllRecsDDDisplayed() {
		try {
			if(this.Menus_DispAllRecs_Dropdown.isDisplayed())
			{
				return true;
			}
			else {
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isMenusShowColsLabelDisplayed() {
		try {
			if(this.Menus_ShowCols_Label.isDisplayed())
			{
				return true;
			}
			else {
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isMenusAllColsChkBxDisplayed() {
		try {
			if(this.Menus_AllCols_ChkBx.isDisplayed())
			{
				return true;
			}
			else {
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isMenusMinMaxChkBxDisplayed() {
		try {
			if(this.Menus_MinMax_ChkBx.isDisplayed())
			{
				return true;
			}
			else {
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isMenusTempChkBxDisplayed() {
		try {
			if(this.Menus_Temp_ChkBx.isDisplayed())
			{
				return true;
			}
			else {
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isMenusCorrActionChkBxDisplayed() {
		try {
			if(this.Menus_CorrectiveAction_ChkBx.isDisplayed())
			{
				return true;
			}
			else {
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isMenusRecordTSChkBxDisplayed() {
		try {
			if(this.Menus_RecordTS_ChkBx.isDisplayed())
			{
				return true;
			}
			else {
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isMenusSaveAsFavLabelDisplayed() {
		try {
			if(this.Menus_SaveAsFav_Label.isDisplayed())
			{
				return true;
			}
			else {
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isMenusSaveAsFavTxtBxDisplayed() {
		try {
			if(this.Menus_SaveAsFav_TxtBx.isDisplayed())
			{
				return true;
			}
			else {
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isMenusSaveAsFavPlusBtnDisplayed() {
		try {
			if(this.Menus_SaveAsFav_PlusBtn.isDisplayed())
			{
				return true;
			}
			else {
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isMenusFavouritesLabelDisplayed() {
		try {
			if(this.Menus_Favourites_Label.isDisplayed())
			{
				return true;
			}
			else {
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isMenusFavouritesDropdownDisplayed() {
		try {
			if(this.Menus_Favourites_Dropdown.isDisplayed())
			{
				return true;
			}
			else {
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isMenusShowCriteriaBtnDisplayed() {
		try {
			if(this.Menus_ShowCriteria_Btn.isDisplayed())
			{
				return true;
			}
			else {
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isMenusPDFBtnDisplayed() {
		try {
			if(this.Menus_PDF_Btn.isDisplayed())
			{
				return true;
			}
			else {
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isFilterChklistTxtBxDisp() {
		try {
			if(this.FilterChklist_TextBox.isDisplayed())
			{
				return true;
			}
			else {
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isAddCheckListButtonDisp() {
		try {
			if(this.AddCheckList_Button.isDisplayed())
			{
				return true;
			}
			else {
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isChkListNameTblHeaderDisp() {
		try {
			if(this.ChecklistName_TblHeader.isDisplayed())
			{
				return true;
			}
			else {
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isSiteNameTblHeaderDisp() {
		try {
			if(this.SiteName_TblHeader.isDisplayed())
			{
				return true;
			}
			else {
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isActionsTblHeaderDisp() {
		try {
			if(this.Actions_TblHeader.isDisplayed())
			{
				return true;
			}
			else {
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isSiteNameTBClmnNameDisplayed() {		
		try
		{
			if(this.SiteName_TBClmnName.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isDisabledEnabledTBClmnNameDisplayed() {		
		try
		{
			if(this.DisabledEnabled_TBClmnName.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isActionsTBClmnNameDisplayed() {		
		try
		{
			if(this.Actions_TBClmnName.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public void fnUsersRadioBtnClick() {
		this.user_RadioBtn.click();
	}
	
	public boolean isFilterUsersTextBxDisplayed() {		
		try
		{
			if(this.FilterUsers_TextBox.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isAddUsersBtnDisplayed() {		
		try
		{
			if(this.AddUsers_Button.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isExportUsersBtnDisplayed() {		
		try
		{
			if(this.ExportUsers_Button.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isUsersTableDisplayed() {		
		try
		{
			if(this.Users_Table.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isUserNameTblHdrDisplayed() {		
		try
		{
			if(new WebDriverWait(webDriver, 500, 1500).until(ExpectedConditions.elementToBeClickable(this.Username_TblHdr)).isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isSiteNameTblHdrDisplayed() {		
		try
		{
			if(new WebDriverWait(webDriver, 500, 1500).until(ExpectedConditions.elementToBeClickable(this.Sitename_TblHdr)).isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isPermissionLevelTblHdrDisplayed() {		
		try
		{
			if(new WebDriverWait(webDriver, 500, 1500).until(ExpectedConditions.elementToBeClickable(this.PermissionLevel_TblHdr)).isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isActionsTblHdrDisplayed() {		
		try
		{
			if(new WebDriverWait(webDriver, 500, 1500).until(ExpectedConditions.elementToBeClickable(this.Actions_TblHdr)).isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isMenusMenusSiteTblHdrDisplayed() {		
		try
		{
			if(new WebDriverWait(webDriver, 500, 1500).until(ExpectedConditions.elementToBeClickable(this.MenusMenusSite_TblHdr)).isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isMenusMenusActionsTblHdrDisplayed() {		
		try
		{
			if(new WebDriverWait(webDriver, 500, 1500).until(ExpectedConditions.elementToBeClickable(this.MenusMenusActions_TblHdr)).isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public void fnCorrectiveActionsRBClick()
	{
		//this.CorrectiveActions_RadioBtn.click();
		JavascriptExecutor jse = (JavascriptExecutor) webDriver;  
		jse.executeScript("arguments[0].click();", this.CorrectiveActions_RadioBtn);
	}
	
	public boolean isFilterCorrActionsTextBoxDisplayed() {		
		try
		{
			if(new WebDriverWait(webDriver, 500, 1500).until(ExpectedConditions.elementToBeClickable(this.FilterCorrActions_TextBox)).isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isExportCorrActionsButtonDisplayed() {		
		try
		{
			if(new WebDriverWait(webDriver, 500, 1500).until(ExpectedConditions.elementToBeClickable(this.ExportCorrActions_Button)).isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isAddCorrActionsButtonDisplayed() {		
		try
		{
			if(new WebDriverWait(webDriver, 500, 1500).until(ExpectedConditions.elementToBeClickable(this.AddCorrActions_Button)).isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isCorrectiveActionsTableDisplayed() {		
		try
		{
			if(new WebDriverWait(webDriver, 500, 1500).until(ExpectedConditions.elementToBeClickable(this.CorrectiveActions_Table)).isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public boolean isCorrActionNameChkBoxDisp() {		
		try
		{
			if(new WebDriverWait(webDriver, 500, 1500).until(ExpectedConditions.elementToBeClickable(this.CorrActionName_Chkbox)).isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
	
	public void fnSelectCorrActionNameChkBx() {
		// this.CorrActionName_Chkbox.click();
		JavascriptExecutor jse = (JavascriptExecutor) webDriver;
		jse.executeScript("arguments[0].click();", this.CorrActionName_Chkbox);
	}
	
	public boolean isExportUsersBtnEnabled() {		
		try
		{
			if(this.ExportUsers_Button.isEnabled())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e) {
			// log4j
			return false;
		}
	}
}
