import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class GenymotionTest {

	AndroidDriver driver;
	@BeforeTest
	public void brfore() throws MalformedURLException
	{
		//DesiredCapabilities capabilities = new DesiredCapabilities();
		final File appDir = new File("/Users/jcrodriguez/Downloads");
		final File app = new File(appDir, "app-debug.apk");
		
		final DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
	/*	capabilities.setCapability("udid", "IPADDRESS:1001"); //Give Device ID of your mobile phone
		capabilities.setCapability("deviceName", "Android Emulator");
		capabilities.setCapability("platformName", "Andriod");
		capabilities.setCapability("platformVersion", "10");

		capabilities.setCapability("appPackage", "com.android.calculator2");
		// capabilities.setCapability("appPackage", "com.android.launcher3");
		// This package name of your app (you can get it from apk info app)
		capabilities.setCapability("appActivity", "com.android.calculator2.Calculator"); 
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);*/

	}
	@Test
	public void testCal() throws Exception {
		// locate the Text on the calculator by using By.id()
		WebElement seven = driver.findElement(By.id("com.android.calculator2:id/digit_7"));
		seven.click();
		WebElement multiplyBy = driver.findElement(By.id("com.android.calculator2:id/op_mul"));
		multiplyBy.click();
		WebElement five = driver.findElement(By.id("com.android.calculator2:id/digit_5"));
		five.click();
		//        WebElement equals = driver.findElement(By.id("com.google.android.calculator:id/eq"));
		//        equals.click();

		// locate the edit box
		WebElement results = driver.findElement(By.id("com.android.calculator2:id/result"));

		//this needs fixing
		if (results.getText().equals("35")) {
			System.out.println("Test Passed...");
		} else {
			System.out.println("Test Failed...");
		}
	}

	@AfterClass
	public void teardown() {
		// close the app
		driver.quit();
	}


}
