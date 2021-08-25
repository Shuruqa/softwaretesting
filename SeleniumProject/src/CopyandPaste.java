import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyandPaste {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/ASUS/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Step 1: Use the table below from the given url to retrieve data
		driver.navigate().to("https://www.dropbox.com/register"); 
		Thread.sleep(5000);

		WebElement locOfOrder = driver.findElement(By.cssSelector("input[id^='fname']"));
		locOfOrder.sendKeys("MayaAngelou@gmail.com");
		
		Actions act = new Actions(driver);
		act.moveToElement(locOfOrder).doubleClick().build().perform();
		// catch here is double click on the text will by default select the text 
		// now apply copy command 
		driver.findElement(By.cssSelector("input[id^='fname']")).sendKeys(Keys.chord(Keys.CONTROL,"a"));
		driver.findElement(By.cssSelector("input[id^='fname']")).sendKeys(Keys.chord(Keys.CONTROL,"c"));// now apply the command to paste
		WebElement a= driver.findElement (By.cssSelector("input[id^='lname']"));
		a.sendKeys(Keys.chord(Keys.CONTROL, "v"));
		String alerttext2=a.getAttribute("value");
		System.out.println("The email is="+alerttext2);

		Thread.sleep(5000);
		driver.close();
	}

}
