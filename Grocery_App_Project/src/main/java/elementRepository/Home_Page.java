package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class Home_Page {

	GeneralUtilities g=new GeneralUtilities();
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
		return g.getElementText(user);
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

	return g.getElementText(user);
	}

	public void clickManageLocations() {
	g.clickOnElement(locationclick);
	}

	public void clickManageSliders() {
	g.clickOnElement(sliderClick);
	}

	public void clickManageOders()
	{
	g.clickOnElement(manageOrders);
	}

	public void clickPushNotification()
	{
	g.clickOnElement(clickPushNotifications);
	}

	public void clickAdminUsers()
	{
	g.clickOnElement(clickAdminUsers);
	}

	public void clickManageProducts()
	{
	g.clickOnElement(manageProducts);
	}

	public void clickManageDeliveryBoy()
	{
	g.clickOnElement(manageDeliveryBoy);
	}
	}





