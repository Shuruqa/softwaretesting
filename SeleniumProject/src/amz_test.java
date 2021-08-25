import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class amz_test {

	public static void main(String[] args) {
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		System.setProperty("webdriver.gecko.driver", "C:/Users/ASUS/Downloads/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		// launch amazon website and direct it to the Base URL
		driver.navigate().to("https://amazon.com");

		//maximize the browser 
		driver.manage().window().maximize();

		//Xpath for webelement with same attribute(eg; Name or ID)
		driver.findElement(By.xpath("//*[contains(text(), 'Gift Cards')]")).click();
		
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
