import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

//import io.appium.java_client.remote.MobileCapabilityType;

public class Calculator {
	WebDriver driver;

	@BeforeClass
	public void setUp() throws MalformedURLException {
		// Set up desired capabilities and pass the Android app-activity and app-package
		// to Appium
		DesiredCapabilities capabilities = new DesiredCapabilities();

		//capabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\ASUS\\AndroidStudioProjects" );
		capabilities.setCapability("deviceName", "sdk_gphone_x86");
		//        capabilities.setCapability("udid", "emulator-5554");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "7");


		capabilities.setCapability("appPackage", "com.android.calculator2");
		// capabilities.setCapability("appPackage", "com.android.launcher3");
		// This package name of your app (you can get it from apk info app)
		capabilities.setCapability("appActivity", "com.android.calculator2.Calculator"); // This is Launcher activity of
		// your app (you can get it
		// from apk info app)
		//Create RemoteWebDriver instance and connect to the Appium server
		// It will launch the Calculator App in Android Device using the configurations
		// specified in Desired Capabilities
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
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

