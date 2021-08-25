import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class SDAWeb {

	public static void main(String[] args) {
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		System.setProperty("webdriver.gecko.driver", "C:/Users/ASUS/Downloads/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		/*System.setProperty("webdriver.chrome.driver", "C:/Users/ASUS/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		
		/*System.setProperty("webdriver.ie.driver", "C:/Users/ASUS/Downloads/IEDriverServer_Win32_3.150.1/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();*/
    	
        String baseUrl = "https://sda.edu.sa/";
        String expectedTitle ="الأكاديمية السعودية الرقمية";
        String actualTitle = "";

        // launch google chrome and direct it to the Base URL
        driver.get(baseUrl);
        
        //scroll down 
        JavascriptExecutor js =(JavascriptExecutor)driver; 
        js.executeScript("scrollBy(0, 5000)");

        // get the actual value of the title
        actualTitle = driver.getTitle();
        
        //compare the actual title of the page with the expected one and print
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
            System.out.println("The actual Title is= "+expectedTitle);

        } else {
            System.out.println("Test Failed!! Sorry The Title is in Arabic");
            System.out.println("The actual Title is= "+expectedTitle);

        }
          
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
