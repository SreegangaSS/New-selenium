package element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class Home_Page {
	GeneralUtilities gu=new GeneralUtilities();
	WebDriver driver;
	public Home_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@data-toggle='dropdown']")
	WebElement user;
	

	public String getLoginUser()
	{
		return gu.getElementText(user);
	}
	@FindBy(xpath = "//i[@class='nav-icon fas fa-map-marker']")
	WebElement locationclick;

	@FindBy(xpath = "//i[@class='nav-icon fas fa-window-restore']")
	WebElement sliderClick;

	@FindBy(xpath="//i[@class='nav-icon fas fa-shopping-basket']")
	WebElement manageOrders;

	@FindBy(xpath="//i[@class='nav-icon fas fa-fas fa-bell']")
	WebElement clickPushNotifications;

	@FindBy(xpath="//i[@class='nav-icon fas fa-users']")
	WebElement clickAdminUsers;

	@FindBy(xpath="//i[@class='nav-icon fas fa-tasks']")
	WebElement manageProducts;

	@FindBy(xpath="//i[@class='nav-icon fas fa-user-plus']")
	WebElement manageDeliveryBoy;

	public String getTextLogineduser() {

	return gu.getElementText(user);
	}

	public void clickManageLocations() {
	gu.clickOnElement(locationclick);
	}

	public void clickManageSliders() {
	gu.clickOnElement(sliderClick);
	}

	public void clickManageOders()
	{
	gu.clickOnElement(manageOrders);
	}

	public void clickPushNotification()
	{
	gu.clickOnElement(clickPushNotifications);
	}

	public void clickAdminUsers()
	{
	gu.clickOnElement(clickAdminUsers);
	}

	public void clickManageProducts()
	{
	gu.clickOnElement(manageProducts);
	}

	public void clickManageDeliveryBoy()
	{
	gu.clickOnElement(manageDeliveryBoy);
	}
	}


