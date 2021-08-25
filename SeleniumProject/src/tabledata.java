import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Iterables;
public class tabledata {

	public static void main(String[] args) throws InterruptedException {
		// System Property for Chrome Driver
		System.setProperty("webdriver.chrome.driver", "C:/Users/ASUS/Downloads/chromedriver.exe");

		// Instantiate a ChromeDriver class.
		WebDriver driver=new ChromeDriver();

		//Launch the website
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-safari-driver");

		// Find the table element using xpath
		WebElement table = driver.findElement(By.xpath("//*[@id=\"snippets\"]/div/div"));

		// Go through each major version
		List<org.openqa.selenium.WebElement> mainVersions = table.findElements(By.tagName("tbody"));

		for(WebElement mver: mainVersions) {
			for(WebElement ver: mver.findElements(By.tagName("tr"))) {
				// Get all anchor tags
				List<org.openqa.selenium.WebElement> attributes = ver.findElements(By.tagName("a"));

				// Find each relevant web element that contains required information
				WebElement version = attributes.get(0);
				WebElement repository = attributes.get(1);
				WebElement usages = attributes.get(2);
				WebElement date = Iterables.getLast(ver.findElements(By.tagName("td")));
				System.out.println("Version    : " + version.getText());
				System.out.println("Repository : " + repository.getText());
				System.out.println("Usages     : " + usages.getText());
				System.out.println("Date       : " + date.getText());
				System.out.println("------------------------------");

			}

		}

		// Close driver
		driver.quit();
	}


}


