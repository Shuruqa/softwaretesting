import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Amazon_xpath {

	//private static final TimeUnit SECONDS = null;

	public static void main(String[] args) throws InterruptedException{
		
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		System.setProperty("webdriver.gecko.driver", "C:/Users/ASUS/Downloads/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		// launch amazon website and direct it to the Base URL
		driver.navigate().to("https://www.amazon.com/");

		//maximize the browser 
		driver.manage().window().maximize();

		//Example for XPath using ID Locator
		driver.findElement(By.xpath("//div[@class='nav-left']/a[@id='nav-hamburger-menu']")).click();
		Thread.sleep(3000); //wait for 3 seconds

		
		//Example for XPath using close the popup window 
		WebElement closebtn = driver.findElement(By.xpath("//div[contains(@class,'nav-sprite hmenu-close-icon')]"));
		closebtn.click();

		
		//Example for XPath using LinkText Locator
		driver.findElement(By.xpath("//td[@class='navFooterDescItem']/a[@class='nav_a']")).click();
		Thread.sleep(3000); //wait for 3 seconds
		
		

		try {
			Thread.sleep(10000);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}

		//close firefox
		driver.close();


	}

}
