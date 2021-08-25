import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;


public class AppiumServer {

	AndroidDriver<MobileElement> driver;
	AppiumDriverLocalService appiumService;
	String appiumUrl;

	@BeforeTest
	public void setUpAndStartServer() throws MalformedURLException{
		
		appiumService = AppiumDriverLocalService.buildDefaultService();
		appiumService.start();
		appiumUrl = appiumService.getUrl().toString();
		System.out.println("Appium Service URL Address : - "+ appiumUrl);

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "sdk_gphone_x86");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "7");
		capabilities.setCapability("appPackage", "com.android.calculator2");
		capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

		driver = new AndroidDriver<MobileElement>(new URL(appiumUrl), capabilities);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test
	public void Sum() {
		System.out.println("Calculate sum of two numbers");
		MobileElement oneBtn=driver.findElement(By.id("com.android.calculator2:id/digit_7"));
		oneBtn.click();
		MobileElement plusBtn=driver.findElement(By.id("com.android.calculator2:id/op_mul"));
		plusBtn.click();
		MobileElement fiveBtn=driver.findElement(By.id("com.android.calculator2:id/digit_5"));
		fiveBtn.click();
		MobileElement equalToBtn=driver.findElement(By.id("com.android.calculator2:id/result"));
		equalToBtn.click();
	}

	@AfterTest
	public void End() {
		System.out.println("Stop driver");
		driver.quit();
		System.out.println("Stop appium service");
		appiumService.stop();
	}

}


