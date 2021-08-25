import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyWebPage {

	public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "C:/Users/ASUS/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// launch amazon website and direct it to the Base URL
		driver.navigate().to("https://runtimewarriors.000webhostapp.com/Login.html");

		//maximize the browser 
		driver.manage().window().maximize();

		//Filling the Text Field 
		WebElement textField=driver.findElement(By.name("fname"));
		textField.sendKeys("Shuruq");
		//Simulates the Enter key
		textField.sendKeys(Keys.RETURN);
		//or 
		//textField.submit();
		Thread.sleep(3000);

		driver.navigate().to("https://runtimewarriors.000webhostapp.com/Login.html");
		//Get Attribute 
		WebElement disabledtextField=driver.findElement(By.name("lname")); 
		String typeValue=disabledtextField.getAttribute("value"); 
		System.out.println("Value of type attribute: "+typeValue);
		Thread.sleep(3000);


		//Verifying Whether a button is enabled or disabled
		driver.navigate().to("https://runtimewarriors.000webhostapp.com/index.html");

		//scroll down 
		JavascriptExecutor js =(JavascriptExecutor)driver; 
		js.executeScript("scrollBy(0, 400)");

		// Check that “Google Search box” is enabled or not. If Search box is enabled, it will return true. 
		WebElement searchBox = driver.findElement(By.xpath("//div[@class='w3-container w3-white']/button[contains(@class,"
				+ "'w3-button w3-black w3-margin-bottom')]")); 
		
		if(searchBox.isEnabled()) 
		{ 
			System.out.println("Search box is enabled. Return:"+searchBox.isEnabled());
			searchBox.click();
		} 
		else 
		{ 
			System.out.println("Search box is disabled. Return: " +searchBox.isEnabled()); 
			searchBox.click();
		} 
		
		WebElement closebtn= driver.findElement(By.xpath("//div[@id='ticketModal']/"
				+ "div[@class='w3-modal-content w3-animate-top w3-card-4']"
				+ "//button[@class='w3-button w3-red w3-section']"));
		closebtn.click();
		Thread.sleep(3000);
		

		// Check that “Google Search box” is enabled or not. If Search box is enabled, it will return true. 
		WebElement searchBox1 = driver.findElement(By.xpath("//div[@class='w3-col m6']//"
				+ "button[@class='w3-button w3-black w3-section w3-right']")); 

		if(searchBox1.isEnabled()) 
		{ 
			System.out.println("Search box is enabled. Return:"+searchBox1.isEnabled());
			searchBox1.click();
		} 
		else 
		{ 
			System.out.println("Search box is disabled. Return: " +searchBox1.isEnabled()); 
			searchBox1.click();
		} 
		Thread.sleep(3000);

		//close firefox
		driver.close();

	}



}


