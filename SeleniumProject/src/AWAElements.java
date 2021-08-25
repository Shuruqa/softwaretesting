import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AWAElements {

	public static void main(String[] args) {
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		System.setProperty("webdriver.gecko.driver", "C:/Users/ASUS/Downloads/geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
		capabilities.setCapability("marionette",true);  
		WebDriver driver= new FirefoxDriver(capabilities); 
		
		 // launch amazon website and direct it to the Base URL
       driver.navigate().to("https://www.amazon.com/");
       
       //maximize the browser 
       driver.manage().window().maximize();
       
      
       //used web elements with id locator
       driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watches\n");
       driver.findElement(By.id("nav-search-submit-button")).click();
  
       //scroll down 
       JavascriptExecutor js =(JavascriptExecutor)driver; 
       js.executeScript("scrollBy(0, 5000)");
       
       //used web element with link & partial link text locator 
       driver.findElement(By.linkText("Visit the help section")).click();
       driver.findElement(By.partialLinkText("Placing")).click();
       
       //used web element with Xpath locator to send values to search input
       driver.findElement(By.xpath("//input[@id='helpsearch']")).sendKeys("Availability Estimate Definitions"); // 
    
		
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
