import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aramco {

	public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "C:/Users/ASUS/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// launch amazon website and direct it to the Base URL
		driver.navigate().to("https://www.aramco.com/");

		//maximize the browser 
		driver.manage().window().maximize();

		//close the popup window
		WebElement closebtn = driver.findElement(By.xpath("//div[@class='cookie-policy__wrapper']/a[contains(@class,'cta cta__primary cookie-policy__cta')]"));
		closebtn.click();
		Thread.sleep(3000);

		//Example for 'Preceding' axes method-Optional #1
		WebElement searchbtn= driver.findElement(By.xpath("//*[contains(text(), 'TERMS AND CONDITIONS')]//preceding::a[1]"));
		searchbtn.click();
		Thread.sleep(3000);

		//Example for 'Preceding' axes method-Optional #2
		WebElement btn = driver.findElement(By.xpath("//li[@class='footer__link-divider']/a[contains(text(),'SITEMAP')]//preceding::a[1]"));
		btn.click();
		Thread.sleep(3000);

		//Example for 'Preceding' axes method-Optional #3
		WebElement btn3= driver.findElement(By.xpath("//*[contains(text(), 'SCAM AND FRAUD ALERT')]//preceding::a[1]"));
		btn3.click();
		Thread.sleep(3000);


		driver.navigate().to("https://login.aramco.com/vpn/tmindex.html");


		//Example for 'Following' axes method-Required
		WebElement btn4= driver.findElement(By.xpath("//*[@id='Enter user name']//following::input[1]"));
		btn4.sendKeys("ShuruqAlyami");
		Thread.sleep(3000);

	
		//Example for 'Following' axes method-Required
		WebElement btn5= driver.findElement(By.xpath("//*[@id='footer__links-container-13']//parent::ul//li[3]"));
		btn5.click();
		Thread.sleep(3000);



		//close firefox
		driver.close();

	}

}
