package utilities;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtilities
{
	public static final long IMPLICIT_WAIT = 10;
	public static final long PAGE_LOAD_WAIT =  20;
	public static final long EXPLICIT_WAIT = 50;
	public static final long FLUENT_WAIT=30;
	public static final long POLL_WAIT=15;
	
	public void implicitWaits(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
	}
	
	public void  fluentwaitelementtoBeClicked(WebDriver driver,  WebElement target) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(FLUENT_WAIT));	
		wait.until(ExpectedConditions.elementToBeClickable(target));
	}
	public void waitForElement(WebDriver driver, WebElement target) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		wait.until(ExpectedConditions.visibilityOf(target));
	}
	
	public void waitForAlertToBeVisible(WebDriver driver,WebElement element) {
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		    wait.until(ExpectedConditions.alertIsPresent());
}
	public void waitForElementToBeClickable(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
	    wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public void fluentWaitForElementToBeClickable(WebDriver driver,WebElement element)
	{
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
		        .withTimeout(Duration.ofSeconds(FLUENT_WAIT))
		        .pollingEvery(Duration.ofSeconds(POLL_WAIT))
		        .ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public void fluentWaitForAlertIsPresent(WebDriver driver)
	{
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
		        .withTimeout(Duration.ofSeconds(FLUENT_WAIT))
		        .pollingEvery(Duration.ofSeconds(POLL_WAIT))
		        .ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.alertIsPresent());
	}
	public void fluentWaitForVisibilityOfElementLocated(WebDriver driver,By target)
	{
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
		        .withTimeout(Duration.ofSeconds(FLUENT_WAIT))
		        .pollingEvery(Duration.ofSeconds(POLL_WAIT))
		        .ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(target));
	}
	public void fluentWaitForVisibilityOfElement(WebDriver driver,WebElement target)
	{
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
		        .withTimeout(Duration.ofSeconds(FLUENT_WAIT))
		        .pollingEvery(Duration.ofSeconds(POLL_WAIT))
		        .ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.visibilityOf(target));
	}

}
