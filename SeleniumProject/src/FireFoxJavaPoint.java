import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;

public class FireFoxJavaPoint {

	public static void main(String[] args) {

		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		System.setProperty("webdriver.gecko.driver", "C:/Users/ASUS/Downloads/geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
		capabilities.setCapability("marionette",true);  
		WebDriver driver= new FirefoxDriver(capabilities); 
		
		 // launch google chrome and direct it to the Base URL
        driver.navigate().to("https://www.javatpoint.com/");

        //maximize the browser 
      //  driver.manage().window().maximize();
        
        // get the actual value of the title
        WebElement element = driver.findElement(By.id("gsc-i-id1"));
        element.sendKeys("Java\n"); // send also a "\n"
        element.submit();
        
        try {
        	
            Thread.sleep(10*1000);
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
       
        //close Google Chrome
        driver.close();
	}

}
