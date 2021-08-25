import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;


import org.openqa.selenium.interactions.touch.TouchActions;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
@Test
public class TouchActionAssign {


AppiumDriver driver;

	@BeforeClass
	public void setUp() throws MalformedURLException {
		
		// Set up desired capabilities and pass the Android app-activity and app-package
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("deviceName", "sdk_gphone_x86");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "7");

		capabilities.setCapability("appPackage", "com.google.android.googlequicksearchbox");
		capabilities.setCapability("appActivity", "com.google.android.googlequicksearchbox.SearchActivity"); // This is Launcher activity of

		driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}
	
@Test
	public void test() throws Exception {

	Thread.sleep(2000);
    // get page bottom coordinates
    int pressX = driver.manage().window().getSize().width / 2;
    int topY = driver.manage().window().getSize().height / 8;

    Thread.sleep(3000);
    
    //find contacts by xpath and click
    driver.findElementById("/hierarchy/android.widget."
            + "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget."
            + "FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout").click();Thread.sleep(3000);
    
		    //define element at top of page by xpath (contact)
		    By from = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget."
		            + "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view."
		            + "ViewGroup[2]/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget."
		            + "FrameLayout[1]/android.widget.LinearLayout/android.widget.TextView");
		    
		    //desired contact at bottom of page
		    WebElement to = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget."
		            + "LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[2]/android.widget.FrameLayout[2]/android."
		            + "widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[10]/android.widget.LinearLayout/android.widget.TextView");
		    
		    
		    TouchAction touchAction = new TouchAction(driver);

		    //scrolls to bottom of page
		    touchAction.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(driver.findElement(from))))
		    .moveTo(PointOption.point(pressX, topY)).release().perform();
		    Thread.sleep(4000);
		    
		    //choose contact
		    to.click();Thread.sleep(2000);
		    
	
	}

	@AfterClass
	public void teardown() {
		// close the app
		driver.quit();
	}
}
