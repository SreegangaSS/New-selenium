package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PushNotificationsPage
{
	WebDriver driver;
	public PushNotificationsPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver , this);
		
	}

		@FindBy(xpath = " //p[text()='Push Notifications']//parent::a")WebElement pushnotificationsinfo;
		@FindBy(xpath = "//input[@id='title']")WebElement titlefield;
		@FindBy(xpath = " //input[@id='description']")WebElement descriptionfiled;
		@FindBy(xpath = "//button[@type='submit']")WebElement sendbutton;
		@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")WebElement alertmessage;
		
		public void pushNotificationInfo()
		{
			pushnotificationsinfo.click();
		}
		public void pushNotificationTitle(String title)
		{
			titlefield.sendKeys(title);
		}
		public void pushNotificationDescription(String description)
		{
			descriptionfiled.sendKeys(description);
		}
		public void pushNotificationSendButton()
		{
			sendbutton.click();
		}
		public boolean ispushNotificationDisplayed()
		{
			return alertmessage.isDisplayed();
		}
		
		

}
