import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/ASUS/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Step 1: Use the table below from the given url to retrieve data
		driver.navigate().to("https://stqatools.com/"); 
		
		//Store draggable location into webelement 
		WebElement draggable= driver.findElement(By.id("draggable"));
		
		//using DrageAndDrop method release draggable webelement into offset
		new Actions(driver).dragAndDropBy(draggable, 200, 10).build().perform();
		
		Thread.sleep(5000);
		driver.close();

	}

}
