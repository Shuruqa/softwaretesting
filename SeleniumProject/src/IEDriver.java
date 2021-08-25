import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class IEDriver {

	public static void main(String[] args) {
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
	 	System.setProperty("webdriver.ie.driver", "C:/Users/ASUS/Downloads/IEDriverServer_Win32_3.150.1/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();

        // launch google chrome and direct it to the Base URL
        driver.navigate().to("https://www.google.com/");

        
        //maximize the browser 
       driver.manage().window().maximize();

        // get the actual value of the title
       WebElement element = driver.findElement(By.name("q"));
       element.sendKeys("javatpoint tutorials\n"); // send also a "\n"
       element.submit();
       
        
        try {
        	
            Thread.sleep(10*500);
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
       
        //close browser
        driver.close();
        
	}

}
