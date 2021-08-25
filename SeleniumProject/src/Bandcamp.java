import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bandcamp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:/Users/ASUS/Downloads/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		// launch amazon website and direct it to the Base URL
		driver.navigate().to("https://bandcamp.com/login");

		//maximize the browser 
		driver.manage().window().maximize();
		
		//Xpath for webelement with same attribute(eg; Name or ID)
		driver.findElement(By.xpath("//input[@id='username-field'] | //input[@id='password-field']")).sendKeys("shuruq@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password-field\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);


		//close firefox
		driver.close();


	}

}
