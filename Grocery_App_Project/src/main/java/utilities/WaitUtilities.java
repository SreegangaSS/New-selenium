package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtilities {
	public void waitForElementToBePresent(WebDriver driver, String target)

	{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10000));

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(target)));

	}
	

	public void waitForElementToBeClickable(WebDriver driver, String target)

	{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10000));

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(target)));

	}

	public void waitForInvisibilityOfElement(WebDriver driver, String target)

	{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10000));

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(target)));

	}

	public void waitForTextToBePresentInElement(WebDriver driver, String target, String text)

	{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10000));

		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(target), text));

	}

	public void waitForElementToBeSelected(WebDriver driver, String target)

	{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10000));

		wait.until(ExpectedConditions.elementToBeSelected(By.xpath(target)));

	}

}

