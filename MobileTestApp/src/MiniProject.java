import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.openqa.selenium.remote.RemoteWebDriver;
import com.google.common.collect.ImmutableMap;


public class MiniProject {
	WebDriver driver;
	//AndroidDriver driver;
	@BeforeClass
	public void setUp() throws MalformedURLException{

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "192.168.100.71:5555");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("browserstack.appium_version", "4.3");
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		capabilities.setCapability("automationName", "UiAutomator2");



		//		capabilities.setCapability("appPackage", "com.google.android.googlequicksearchbox");
		//		capabilities.setCapability("appActivity", "com.google.android.googlequicksearchbox.SearchActivity"); // This is Launcher activity of

		//needed to launch chrome websites with this driver setup (AndroidDriver)
		capabilities.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));

		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

	}

	@Test
	public void SearchTest() throws Exception {

		Thread.sleep(3000);
		driver.get("https://www.noon.com/saudi-en/");Thread.sleep(8000);
		/*
		WebElement prog_cont = driver.findElement(By.id("com.google.android.googlequicksearchbox:id/progress_container"));
		prog_cont.click(); Thread.sleep(30000);

		WebElement accept_btn= driver.findElement(By.id("com.google.android.googlequicksearchbox:id/accept_button"));
		accept_btn.click(); Thread.sleep(30000);

		WebElement accept_btn1= driver.findElement(By.xpath("com.google.android.googlequicksearchbox:id/accept_button"));
		accept_btn1.click(); Thread.sleep(30000);

		WebElement accept_btn2= driver.findElement(By.id("com.google.android.googlequicksearchbox:id/cards_view"));
		accept_btn2.click(); Thread.sleep(30000);

		WebElement accept_btn3= driver.findElement(By.id("com.google.android.googlequicksearchbox:id/cards_view"));
		accept_btn3.sendKeys("Twitter Search");	Thread.sleep(30000);


//category
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//[@id=\"__next\"]/div/nav/a[2]"))).click();
//Electronics
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Electronics']"))).click();
//Gaming
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Gaming']"))).click();
//PS5 Consoles
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'video-games')]"))).click();
//pick an item
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("productBox-N42587741A"))).click();
//add to cart
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='cart-button']"))).click();
//Continue Shopping'
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Continue Shopping']"))).click();
//category BACK
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//[@id=\"next\"]/div/nav/a[2]"))).click();
// -------------------------------------------

//beauty
WebElement beauty=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Beauty & Personal Care']")));
((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", beauty);
beauty.click();
//Bath & Body
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Bath & Body']"))).click();
//pick an item
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@title='Now Foods Sweet Almond Oil 118ml ']"))).click();;
//add to cart
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='hp0ehb-1 KWRMQ']"))).click();
//Continue Shopping'
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Continue Shopping']"))).click();
//category BACK
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"next\"]/div/nav/a[2]"))).click();

// -------------------------------------------

//Electronics
WebElement Grocery =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Grocery']")));
((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Grocery);
Grocery.click();

Show less
10:57 AM


10:57 AM


//Bath & Body
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Beverages']"))).click();
//pick an item
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@title='Capo Espresso Decaffeinato Compatible With Nespresso Machines 50 g 10 Capsules Decaffeinato ']"))).click();;
//add to cart
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='cart-button']"))).click();
//Continue Shopping'
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Continue Shopping']"))).click();
//category BACK
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div/nav/a[2]"))).click();

//-------------------------------------------

//Back to School
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Back to School']"))).click();
//backpacks
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='/fashion/luggage-and-bags/backpacks-22161']"))).click();
//pick sporty bags
WebElement SpBag =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='/sporty-backpack-bts-FA_03']")));
((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SpBag);
SpBag.click();
//pick an item
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@title='adidas Star Wars Backpack Olive ']"))).click();;
//add to cart
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='cart-button']"))).click();
//Checkout
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Checkout']"))).click();

//---------------------------------

//Buy
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='ripple']"))).click();
//Email
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']"))).sendKeys("put your email");
//Password
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']"))).sendKeys("password");
//Signin
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("submitLoginFormBtn"))).click();
//Continue
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='Continue']"))).click();
//Add a New Card
//WebElement card =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='Add a New Card']")));
//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", card);
//card.click();
//Card Number
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ccNumber"))).sendKeys("12222222");
//cardExpiryMonth
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='cardExpiryMonth']"))).sendKeys("04");;
//cardExpiryYear
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='cardExpiryYear']"))).sendKeys("26");
//Add a New Card
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']"))).sendKeys("300");
//Add a New Card
WebElement Error=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Invalid card number']")));
System.out.println(Error.getText());
}}
		 */


	}

	@AfterClass
	public void teardown() {
		// close the app
		driver.quit();
	}
}

/* 
{
	  "deviceName": "sdk_gphone_x86",
	  "platformName": "Android",
	  "platformVersion": "7",
	  "appPackage": "com.google.android.googlequicksearchbox",
	  "appActivity": "com.google.android.googlequicksearchbox.SearchActivity"
	}
 */


