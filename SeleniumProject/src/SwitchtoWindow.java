import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SwitchtoWindow {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/ASUS/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Step 1: Navigate to your favorite website   
		driver.navigate().to("http://www.google.com/"); 
		//Maximize the window 
		driver.manage().window().maximize(); 
	
		//Step 2: Open a new tab window 
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
		WebElement link=driver.findElement(By.linkText("Gmail")); 
		System.out.println("link"+link.getText());
		Thread.sleep(5000);
		link.sendKeys(selectLinkOpeninNewTab);
		
		driver.close();

		//Step 2: Open a private incognito window 
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);

		ChromeDriver Idriver = new ChromeDriver(options);
		Idriver.get("http://www.soundcloud.com");
		Thread.sleep(4000);
		Idriver.close();
		


		//Step 3: Mirror the same steps for IE,Firefox and Chrome

	}

}
