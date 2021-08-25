import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;

//import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;


public class SendKeysChrome {
	AppiumDriver driver;

	@BeforeClass
	public void setUp() throws MalformedURLException {
		// Set up desired capabilities and pass the Android app-activity and app-package
		// to Appium
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("deviceName", "sdk_gphone_x86");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "7");

		capabilities.setCapability("appPackage", "com.google.android.googlequicksearchbox");
		capabilities.setCapability("appActivity", "com.google.android.googlequicksearchbox.SearchActivity"); // This is Launcher activity of
	
		driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		
	}

	@Test
	public void testkeys() throws Exception {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.google.android.googlequicksearchbox:id/progress_container"))).click();
		
		// locate the Text on the calculator by using By.id()
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.google.android.googlequicksearchbox:id/accept_button"))).click();
		
		//WebDriverWait wait1 = new WebDriverWait(driver, 11);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.google.android.googlequicksearchbox:id/accept_button"))).click();
//
//		WebDriverWait wait2 = new WebDriverWait(driver, 10);
//		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.google.android.googlequicksearchbox:id/cards_view"))).click();
//				
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.google.android.googlequicksearchbox:id/cards_view"))).sendKeys("Amazon");
//
//		
//

	}

	@AfterClass
	public void teardown() {
		// close the app
		driver.quit();
			}
}

/*{
	  "deviceName": "sdk_gphone_x86",
	  "platformName": "Android",
	  "platformVersion": "7",
	  "appPackage": "com.google.android.googlequicksearchbox",
	  "appActivity": "com.google.android.googlequicksearchbox.SearchActivity"
	}*/

