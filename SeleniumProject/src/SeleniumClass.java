import org.openqa.selenium.WebDriver;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.chrome.ChromeDriver;
 

public class SeleniumClass {
	
	 public static void main(String[] args) {

			//comment the above 2 lines and uncomment below 2 lines to use Chrome
		 	System.setProperty("webdriver.chrome.driver", "C:/Users/ASUS/Downloads/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	    	
	        String baseUrl = "https://www.codingdojo.com/";
	       // String WrongTitle = "Learning Platform";
	        String expectedTitle ="Coding Bootcamp - Learn Coding & Data Science | Coding Dojo";
	        String actualTitle = "";

	        // launch google chrome and direct it to the Base URL
	        driver.get(baseUrl);

	        // get the actual value of the title
	        actualTitle = driver.getTitle();
	        

	        /*
	         * compare the actual title of the page with the expected one and print
	         * the result as "Passed" or "Failed"
	         */
	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
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
