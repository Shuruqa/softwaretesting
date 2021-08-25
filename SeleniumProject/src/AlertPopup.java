import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/ASUS/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Step 1: Use the table below from the given url to retrieve data
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts"); 
		
		WebElement btn=driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		btn.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		String alerttext=btn.getText();
		System.out.println("The First Alert Text is :"+alerttext);
		Thread.sleep(5000);
		
		WebElement btn3=driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		btn3.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		String alerttext3=btn3.getText();
		System.out.println("The Second Alert Text is :"+alerttext3);
		Thread.sleep(5000);

		WebElement btn2=driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		btn2.click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Shuruq Alyami");
		driver.switchTo().alert().accept();
		String alerttext2=btn2.getText();
		System.out.println("The Third Alert Text is :"+alerttext2);
		
		
		Thread.sleep(5000);
		driver.close();

	}

}
