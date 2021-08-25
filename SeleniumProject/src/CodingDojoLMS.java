import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CodingDojoLMS {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/ASUS/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Step 1: Use the table below from the given url to retrieve data
		driver.navigate().to("https://www.codingdojo.com/"); 
		
		//Step 2: Enter the credentials of the username using CSS Selector with inner text method
		driver.findElement(By.xpath("//li[@class='programs_menu']//a[text()='Dojo Difference']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[@class='programs_menu']//div[@class='dropdown_menu']//a[text()='Financing 101']")).click();
		
		Thread.sleep(5000);
		
//		//Step 2: Use the table below from the given url to retrieve data
//		driver.navigate().to("https://www.codingdojo.com/"); 
//		
//		//basic type of absolute xpath 
//		//WebElement btn1= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/a[2]")); 
//		WebElement btn1= driver.findElement(By.xpath("//div[@class='cta_btns']/a[contains(@class,'cta_blue_btn apply_btn_nav')]"));
//		btn1.click();
//		Thread.sleep(3000);
//
//		//Example for 'Preceding' axes method-Optional #1
//		WebElement searchbtn= driver.findElement(By.xpath("//*[contains(text(), 'Corporate Training & Talent Placement')]"));
//		searchbtn.click();
//		Thread.sleep(3000);
		
		driver.close();

	}

}
