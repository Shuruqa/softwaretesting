import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FireFoxDriver {	
	public static void main(String[] args) {

		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.gecko.driver", "C:/Users/ASUS/Downloads/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();


		String baseUrl = "https://www.codingdojo.com/";
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

		//close firefox browser
		driver.close();

	}

}

