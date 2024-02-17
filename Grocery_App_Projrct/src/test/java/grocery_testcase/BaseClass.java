package grocery_testcase;

import org.testng.annotations.Test;

import utilities.ScreenShotCaptureUtilities;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class BaseClass {
	WebDriver driver;
public static Properties properties;

public static void readFromProperties() throws IOException {
	properties = new Properties();
	//fileinputsream used to read data/write from external files	 in byte format used in java
	FileInputStream ip = new FileInputStream(
	System.getProperty("user.dir") + "//src//main//resources//config.properties");
	properties.load(ip);
}
	@BeforeMethod(alwaysRun = true)
	@Parameters("browser")
	public void beforeMethod(String browser) throws IOException {
		readFromProperties();
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		
		driver = new ChromeDriver();
		driver.get(properties.getProperty("baseUrl"));
		driver.get("https://groceryapp.uniqassosiates.com/admin/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
	
	}

	@AfterMethod
	public void afterMethod(ITestResult itResult) throws IOException {
		if(itResult.getStatus()==ITestResult.FAILURE)
		{
			ScreenShotCaptureUtilities sc=new ScreenShotCaptureUtilities();
			sc.captureFailureScreenShot(driver, itResult.getName());
		}
		driver.close();
	}

}

