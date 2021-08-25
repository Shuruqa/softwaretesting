import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Iterables;

public class WebCrawler {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/ASUS/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Step 1: Use the table below from the given url to retrieve data
		driver.navigate().to("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-safari-driver"); 
		Thread.sleep(5000);


		//Step 3: Use WebElement for Table
		WebElement table  = driver.findElement(By.xpath("//div[@id='snippets']"));

		//Get all web elements by tag name 'tr'
		List<WebElement> main_table = table.findElements(By.tagName("tbody"));
		
		for(WebElement mt:main_table) {
			for(WebElement subt:mt.findElements(By.tagName("tr"))) {
				List<WebElement> attributes= subt.findElements(By.tagName("a"));
				
				// Find each relevant web element that contains required information
				WebElement version = attributes.get(0);
				WebElement repository = attributes.get(1);
				WebElement usages = attributes.get(2);
				WebElement date = Iterables.getLast(subt.findElements(By.tagName("td")));
				System.out.println("Version    : " + version.getText());
				System.out.println("Repository : " + repository.getText());
				System.out.println("Usages     : " + usages.getText());
				System.out.println("Date       : " + date.getText());
				System.out.println("------------------------------");
			}
			
		}
//		List<WebElement> rowVals = table.findElements(By.tagName("tr"));
//		
//
//		//Get the number of rows and column 
//		int row_num= driver.findElements(By.tagName("tr")).size();
//
//		//Get Column Header values from first row
//		List<WebElement> colHeader = rowVals.get(0).findElements(By.tagName("th"));
//		
//
//		int column_num= driver.findElements(By.tagName("td")).size();
//
//		System.out.println("Total number of rows = " + row_num);
//		System.out.println("Total number of columns = " + column_num);
//
//
//		//Iterate through each header values and print them 
//		System.out.println("Header values:");
//		for(int i=0; i<colHeader.size(); i++) {
//			System.out.println(colHeader.get(i).getText());			
//		}
//
//		System.out.println("---------------");
//		//Loop through the remaining rows
//		for(int i= 1; i<row_num; i++) {
//			//get each row's column values by tag name
//			List<WebElement> colVals = rowVals.get(i).findElements(By.tagName("td"));
//			//loop through the column
//			for(int j=0; j<column_num; j++) {
//
//				System.out.println(colVals.get(j).getText());
//			}
//
//			//Just a separator for each row
//			System.out.println("---------------");
//
//		}
//
//		//print the table content to console 
//		for(int i=2; i<=6; i++) {
//			for(int j=1; j<=4; j++){
//				System.out.println(driver.findElement(By.xpath("//table[@class='grid versions']/tbody/tr[" + i +"]/td[" + j + "]")).getText() + "\t");
//			}
//			System.out.println("");
//		}
		Thread.sleep(5000);
		driver.close();


	}

}
