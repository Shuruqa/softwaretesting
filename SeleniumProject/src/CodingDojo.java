import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CodingDojo {

	public static void main(String[] args)  throws InterruptedException{


		System.setProperty("webdriver.gecko.driver", "C:/Users/ASUS/Downloads/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		// launch amazon website and direct it to the Base URL
		driver.navigate().to("https://www.codingdojo.com/");

		//maximize the browser 
		driver.manage().window().maximize();

		//basic type of absolute xpath 
		//WebElement btn1= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/a[2]")); 
		WebElement btn1= driver.findElement(By.xpath("//div[@class='cta_btns']/a[contains(@class,'cta_blue_btn apply_btn_nav')]"));
		btn1.click();
		Thread.sleep(3000);

		//Example for 'Preceding' axes method-Optional #1
		WebElement searchbtn= driver.findElement(By.xpath("//*[contains(text(), 'Corporate Training & Talent Placement')]"));
		searchbtn.click();
		Thread.sleep(3000);


		//close firefox
		driver.close();

	}


}


