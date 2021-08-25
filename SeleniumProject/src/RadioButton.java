import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RadioButton {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/ASUS/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Step 1: Navigate to your the website   
		driver.navigate().to("https://www.demoqa.com/radio-button"); 
	
		//Find the webelement(radiobutton) use CSS selector method.
		driver.findElement(By.cssSelector("div.custom-control:nth-child(2) > label:nth-child(2)")).click();
		Thread.sleep(5000);
		
		//Find the webelement(radiobutton) use Radio Group method.
		WebElement radio = driver.findElement(By.xpath("//div[@class='custom-control custom-radio custom-control-inline']/"
				+ "label[contains(text(),'Impressive')]"));
        radio.click();
	
		Thread.sleep(5000);
		driver.close();


	}

}
