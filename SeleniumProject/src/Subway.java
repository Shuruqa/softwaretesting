import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Subway {

	public static void main(String[] args) {
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		System.setProperty("webdriver.gecko.driver", "C:/Users/ASUS/Downloads/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		 // launch amazon website and direct it to the Base URL
		driver.navigate().to("https://order.subway.com/menu");
       
       //maximize the browser 
		driver.manage().window().maximize();
       
       //close the popup window
		WebElement closebtn = driver.findElement(By.xpath("//div[contains(@class,'abs-pos cross-btn UP-CLOSE-POPUP cursor-pointer')]"));
		closebtn.click();
     
     	//to switch to the main content 
     	driver.switchTo().defaultContent();
       
     	//used web elements with xpath locator
     	driver.findElement(By.id("google_pickup_location_2")).sendKeys("Fanateer Beach Jubail, Al Jubail Saudi Arabia\n");
     	driver.findElement(By.xpath("//div[@class='locate-me-btn-container up-locateme-set-location']")).click();

		
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
