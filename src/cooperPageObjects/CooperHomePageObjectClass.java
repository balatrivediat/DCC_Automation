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

public class CooperHomePageObjectClass extends CooperProjectResources {
	
	@FindBy(xpath="//img[@id='logo']")
	WebElement cooper_logo;
	
	@FindBy(xpath="//a[contains(text(),'HACCP')]")
	WebElement HACCP_Link;
	
	@FindBy(xpath="//a[contains(text(),'NotifEye')]")
	WebElement Notifeye_Link;
	
	@FindBy(xpath="//canvas[@class='chartjs-render-monitor']")
	WebElement HACCP_Homepage_Graphs;
	
	@FindBy(xpath="//a/div/span[1]")
	WebElement UserNameAccount_Lnk;
	
	@FindBy(xpath="//a[contains(text(),'My Profile')]")
	WebElement My_Profile_Lnk;
	
	@FindBy(xpath="//li[@class='tabs active']//a[contains(text(),'My Profile')]")
	WebElement MyProfile_Btn;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement Logout_Lnk;
	
	@FindBy(xpath="//select[@name='language']")
	WebElement language_DrpDwn;
	
	@FindBy(xpath="//p[contains(text(),'Pending Menus')]")
	WebElement PendingMenus_Txt;
	
	@FindBy(xpath="//p[contains(text(),'Not in Compliance Tasks')]")
	WebElement HomeHACCPNot_Compliance_Tasks_Txt;
	
	@FindBy(xpath="//p[contains(text(),'Pending Checklists')]")
	WebElement PendingChecklists_Txt;
	
	@FindBy(xpath="//b[text()='Location Name']")
	 WebElement LocationNameTableColumn;
	
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
	 	    
	@FindBy(xpath="//th[text()='Address']")
	WebElement LocationAddressTableColumn;
		   
	@FindBy(xpath="//tbody")
	WebElement LocationsTable;
	 
	@FindBy(xpath="//div[contains(text(),'Alerts')]")
	WebElement Alerts_Tiles;
	
	@FindBy(xpath="//div[contains(text(),'Missed Communications')]")
	WebElement MissCommunications_Tiles;
	
	@FindBy(xpath="//div[contains(text(),'Low Battery')]")
	WebElement LowBattery_Tiles;
	
	@FindBy(xpath="//a[text()='Home']")
	WebElement Home_Link;
	
	@FindBy(xpath="//img[@id='logo']")
	WebElement HomePageLogo_Img;
	
	@FindBy(xpath="//a[contains(text(),'Dashboard')]")
	WebElement Dashboard_button;
	
	@FindBy(xpath="//canvas[@class='chartjs-render-monitor']")
	WebElement PercentFail_graph;
	
	@FindBy(xpath="//h5[contains(text(), 'Menus')]")
	WebElement Menus_text;
	
	@FindBy(xpath="//p[contains(text(),'0/0 Failed Temperatures')]")
	WebElement FailedTemps_text;
	
	@FindBy(xpath="//h5[contains(text(),'Checklists')]")
	WebElement Checklists_text;
	
	@FindBy(xpath="//p[contains(text(),'0/0 Not in Compliance Tasks')]")
	WebElement NotinCompliance_text;
	
	@FindBy(xpath="//a[contains(text(),'Location Summary')]")
	WebElement LocationSummary_Btn;
	
	@FindBy(xpath="//a[contains(text(), 'Root')]")
	WebElement Root_Link;
	
	@FindBy(xpath="//h2[contains(text(), 'Corporate')]")
	WebElement Corporate_label;
	
	@FindBy(xpath="//span[contains(text(),': Alerts')]")
	WebElement LocSummary_AlertsText;
	
	@FindBy(xpath="//span[contains(text(),': Missed Communications')]")
	WebElement LocSummary_MissCommText;
	
	@FindBy(xpath="//span[contains(text(),': Low Battery')]")
	WebElement LocSummary_LowBatteryText;
	
	@FindBy(xpath="//span[contains(text(),': Failed Temperatures')]")
	WebElement LocSummary_FailedTempsText;
	
	@FindBy(xpath="//span[contains(text(),': Failed Checklists')]")
	WebElement LocSummary_FailedChklistsText;
	
	@FindBy(xpath="//a[contains(text(),'Hierarchy View')]")
	WebElement LocSummary_HierarchyViewLink;
	
	@FindBy(xpath="//a[contains(text(),'List View')]")
	WebElement LocSummary_ListViewLink;
	
	@FindBy(xpath="//a[contains(text(),'Map View')]")
	WebElement LocSummary_MapViewLink;
	
	@FindBy(xpath="//ngx-datatable[@class='bootstrap ngx-datatable fixed-header']")
	WebElement LocSummary_ListViewTable;
	
	@FindBy(xpath="//div[@class='col-md-12 col-sm-12 col-xs-12']")
	WebElement LocSummary_MapView;
	
	@FindBy(xpath="//div[contains(@class,'widget-panel widget-style-2 bg-pink')]//i[contains(@class,'fa-bell')]")
	WebElement bell_Image;
	
	public CooperHomePageObjectClass(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	
	public boolean isLowBatteryTilesDisplayed() {
		try {
			if(new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.LowBattery_Tiles)).isDisplayed())
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
	
	public boolean isHACCPLinkDisplayed() {		
		try {
			if(new WebDriverWait(webDriver, 100, 1500).until(ExpectedConditions.elementToBeClickable(this.HACCP_Link)).isDisplayed())
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
	
	public boolean isNotifeyeLinkDisplayed() {		
		try {
			if(new WebDriverWait(webDriver, 100, 1500).until(ExpectedConditions.elementToBeClickable(this.Notifeye_Link)).isDisplayed())
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
	
	public void NotifeyeLinkClick() {
//		WebDriverWait wait = new WebDriverWait(webDriver, 100, 1500);
//		wait.until(ExpectedConditions.elementToBeClickable(this.Notifeye_Link)).isDisplayed();
//		Notifeye_Link.click();
		JavascriptExecutor jse = (JavascriptExecutor) webDriver;  
		jse.executeScript("arguments[0].click();", this.Notifeye_Link);
	}
	
	public boolean isHACCP_Homepage_GraphsDisplayed() {		
		try {
			if(new WebDriverWait(webDriver, 100, 1500).until(ExpectedConditions.elementToBeClickable(this.HACCP_Homepage_Graphs)).isDisplayed())
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
	
	public boolean isUserNameAccountLnkDisplayed() {
		try {
			if(new WebDriverWait(webDriver, 100, 1500).until(ExpectedConditions.elementToBeClickable(this.UserNameAccount_Lnk)).isDisplayed())
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
	
	public void fnUserccountLnkClick() {
		WebDriverWait wait = new WebDriverWait(webDriver, 1000, 5000);
		wait.until(ExpectedConditions.elementToBeClickable(this.UserNameAccount_Lnk)).isDisplayed();
		this.UserNameAccount_Lnk.click(); 
	}
	
	public boolean isMyProfileLnkDisplayed() {		
		try
		{
			if(new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.My_Profile_Lnk)).isDisplayed())
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
	
	public void fnMyProfileLnkClick() {		
		WebDriverWait wait = new WebDriverWait(webDriver, 1000, 5000);
		wait.until(ExpectedConditions.elementToBeClickable(this.My_Profile_Lnk)).isDisplayed();
		this.My_Profile_Lnk.click(); 
	}
	
	public boolean isMyProfileBtnDisplayed() {		
		try
		{
			if(new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.MyProfile_Btn)).isDisplayed())
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
	
	public boolean isLogoutLnkDisplayed() {		
		try
		{
			if(new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.Logout_Lnk)).isDisplayed())
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
	
	public void fnLogoutLnkClick() {
		WebDriverWait wait = new WebDriverWait(webDriver, 1000, 5000);
		wait.until(ExpectedConditions.elementToBeClickable(this.Logout_Lnk)).isDisplayed();
		this.Logout_Lnk.click();
	}
	
	public boolean isLanguageDropDownDisplayed() {		
		try
		{
			if(new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.language_DrpDwn)).isDisplayed())
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
	
	public boolean isPendingMenus_TxtDisplayed() {
		try
		{
			if(new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.PendingMenus_Txt)).isDisplayed())
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
	
	public boolean isHomeHACCPNotComplianceTasksTxtDisplayed() {		
		try
		{
			if(new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.HomeHACCPNot_Compliance_Tasks_Txt)).isDisplayed())
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
	
	public boolean isPendingChecklists_TxtDisplayed() {		
		try
		{
			if(new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.PendingChecklists_Txt)).isDisplayed())
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
	
	public boolean isLocationNameTableColumnDisplayed() {
		try
		{
			if(this.LocationNameTableColumn.isDisplayed())
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
	
	public boolean isMapviewLnkDisplayed() {		
		try
		{
			if(this.Mapview_Lnk.isDisplayed())
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
	
	public boolean isAlertsTilesDisplayed() {		
		try
		{
			if(this.Alerts_Tiles.isDisplayed())
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
	
	public boolean isMisCommunicationsTilesDisplayed() {		
		try
		{
			if(this.MissCommunications_Tiles.isDisplayed())
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
	
	public boolean isHomeLinkDisplayed() {
		try
		{
			if(new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.Home_Link)).isDisplayed())
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
	
	public boolean isHomeAppLogoDisplayed() {		
		try
		{
			if(new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.HomePageLogo_Img)).isDisplayed())
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
	
	public boolean isDashboardButtonDisplayed() {		
		try
		{
			if(new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.Dashboard_button)).isDisplayed())
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
	
	public boolean isFailPercentGraphDisplayed() {		
		try
		{
			if(this.PercentFail_graph.isDisplayed())
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
	
	public boolean isMenusTextDisplayed() {		
		try
		{
			if(this.Menus_text.isDisplayed())
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
	
	public boolean isFailedTempsTextDisplayed() {		
		try
		{
			if(this.FailedTemps_text.isDisplayed())
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
	
	public boolean isChecklistsTextDisplayed() {		
		try
		{
			if(this.Checklists_text.isDisplayed())
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
	
	public boolean isNotinComplianceTxtDisplayed() {		
		try
		{
			if(this.NotinCompliance_text.isDisplayed())
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
	
	public boolean isLocationSummaryBtnDisplayed() {		
		try
		{
			if(new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.LocationSummary_Btn)).isDisplayed())
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
	
	public void locationSummaryBtnClick() {
		WebDriverWait wait = new WebDriverWait(webDriver, 1000, 5000);
		wait.until(ExpectedConditions.elementToBeClickable(this.LocationSummary_Btn));
		this.LocationSummary_Btn.click();
	}
	
	public boolean isRootLinkDisplayed() {		
		try
		{
			if(new WebDriverWait(webDriver, 1000, 5000).until(ExpectedConditions.elementToBeClickable(this.Root_Link)).isDisplayed()) {
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
	
	public boolean isCorporateLabelDisplayed() {		
		try
		{
			if(this.Corporate_label.isDisplayed())
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
	
	public boolean isLocSummaryAlertsTextDisplayed() {		
		try
		{
			if(this.LocSummary_AlertsText.isDisplayed())
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
	
	public boolean isLocSummaryMisCommTextDisplayed() {		
		try
		{
			if(this.LocSummary_MissCommText.isDisplayed())
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
	
	public boolean isLocSummaryLowBatteryTextDisplayed() {		
		try
		{
			if(this.LocSummary_LowBatteryText.isDisplayed())
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
	
	public boolean isLocSummaryFailedTempsTextDisplayed() {		
		try
		{
			if(this.LocSummary_FailedTempsText.isDisplayed())
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
	
	public boolean isLocSumFailedChklistsTextDisp() {		
		try
		{
			if(this.LocSummary_FailedChklistsText.isDisplayed())
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
	
	public boolean isLocSumHierarchyViewLinkDisp() {		
		try
		{
			if(this.LocSummary_HierarchyViewLink.isDisplayed())
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
	
	public boolean isLocSumListViewLinkDisp() {		
		try
		{
			if(this.LocSummary_ListViewLink.isDisplayed())
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
	
	public boolean isLocSumMapViewLinkDisp() {		
		try
		{
			if(this.LocSummary_MapViewLink.isDisplayed())
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
	
	public void clickHierarchyViewLink() {
		this.HierarchyView_Lnk.click();
	}
	
	public void clickListViewLink() {
		this.Listview_Lnk.click();
	}
	
	public void clickMapViewLink() {
		this.Mapview_Lnk.click();
	}
	
	public boolean isListViewTableDisplayed() {		
		try
		{
			if(this.LocSummary_ListViewTable.isDisplayed())
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
	
	public boolean isMapViewDisplayed() {		
		try
		{
			if(this.LocSummary_MapView.isDisplayed())
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
	
	public void clickDashboardButton () {
		WebDriverWait wait = new WebDriverWait(webDriver, 1000, 5000);
		wait.until(ExpectedConditions.elementToBeClickable(this.Dashboard_button));
		this.Dashboard_button.click();
	}
	
	public boolean isBellImageDisplayed() {		
		try
		{
			if(this.bell_Image.isDisplayed())
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
}
