import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagramLogin {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/ASUS/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Step 1: Goto instagram.com and Login Page
		driver.navigate().to("https://www.instagram.com/"); 
		Thread.sleep(5000);

		
		//Step 2: Enter the credentials of the username using CSS Selector with inner text method
		driver.findElement(By.cssSelector("div._9GP1n input[name*='user']")).sendKeys("shuruqybdu");
		driver.findElement(By.cssSelector("div._9GP1n input[name*='passwo']")).sendKeys("3281711",Keys.ENTER);
		
		Thread.sleep(5000);
		driver.close();


	
	
	}

}
