package beltexam;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.*;


@Test
public class Error_messages {

	public void theform_table() throws InterruptedException{

		//create the web driver for chrom 
		System.setProperty("webdriver.chrome.driver","C:/Users/ASUS/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// launch the legalzoom website and direct it to the Base URL
		driver.navigate().to("https://www.legalzoom.com/");

		//maximize the browser 
		//driver.manage().window().maximize();

		//click the will and trust button
		driver.findElement(By.xpath("//div[@class='mb-4 mb-md-4 col-md-12 col-xl-4']//*[contains(text(),'Wills and trusts')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class='d-flex flex-column flex-fill']//a[@href='/personal/estate-planning/living-trust-overview.html']")).click();
		Thread.sleep(2000);

		//go to the process of Estate Plan Bundle
		driver.findElement(By.xpath("//div[@id='collapse1623152761138-3']//div[@class='d-table-cell align-middle']/"
				+ "/a[@href='/LZWeb/preprocess/preprocess.aspx?iProcess=149&isGuest=1&BundleQ2=lt']")).click();		
		Thread.sleep(2000);


		driver.navigate().to("https://www.legalzoom.com/LZWeb/Checkout/SelectPackage3.aspx?TIMESTRING=jzCIERi9cm4Vv9Gjo%2bt0Xw%3d%3d&iQ=670&iP=0&dtNow=112&BundleQ2=lt");
		//Step of Your personalized estate plan
		driver.findElement(By.xpath("//*[@id=\"ep-state-select\"]//option[@value='Alabama']")).click();
		driver.findElement(By.xpath("//*[contains(text(),'One person')]")).click();
		Thread.sleep(5000);
		//scroll down 
		JavascriptExecutor js =(JavascriptExecutor)driver; 
		js.executeScript("scrollBy(0, 5000)");

		driver.findElement(By.xpath("//*[@id=\"btnCheckout\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='proPrintFooter']//input[@class='button-No button no-thanks']")).click();
		Thread.sleep(3000);



		//Fill out the form of Complete your order 
		driver.findElement(By.xpath("//*[@id=\"ctl00_cphMainContent_txt_ContactInfo_FName\"]")).sendKeys("shuruq");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ctl00_cphMainContent_txt_ContactInfo_LName\"]")).sendKeys("alyami");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#ctl00_cphMainContent_txt_ContactInfo_EmailAddress")).sendKeys("shrooq.alyami@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ctl00_cphMainContent_txt_ContactInfo_PhoneNumber\"]")).sendKeys("(987)-654-3234");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"ctl00_cphMainContent_txt_ContactInfo_Street1\"]")).sendKeys("Mark Ave");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ctl00_cphMainContent_txt_ContactInfo_Street2\"]")).sendKeys("Mark Street 1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ctl00_cphMainContent_txt_ContactInfo_ZipCode\"]")).sendKeys("87654");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ctl00_cphMainContent_txt_ContactInfo_City\"]")).sendKeys("Birmingham");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ctl00_cphMainContent_ddl_ContactInfo_State\"]//option[@value='51']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ctl00_cphMainContent_txt_PaymentInfo_FName\"]")).sendKeys("Shuruq");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ctl00_cphMainContent_txt_PaymentInfo_LName\"]")).sendKeys("Alyami");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"ctl00_cphMainContent_txt_CC_Number\"]")).sendKeys("88888888888888888888");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ctl00_cphMainContent_ddl_CC_ExpirationMonth\"]//option[@value='1']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"ctl00_cphMainContent_ddl_CC_ExpirationYear\"]//option[@value='2024']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"ctl00_cphMainContent_txt_CC_ZipCode\"]")).sendKeys("87896");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"ctl00_cphMainContent_txt_CC_SecurityCode\"]")).sendKeys("232");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//label[@for='ctl00_cphMainContent_ChkEPBundle']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"ctl00_cphMainContent_imgbtn_CheckOut\"]")).click();
		Thread.sleep(5000);

		//expected error message is 
		String message= "Invalid Credit Card Number";

		//use web element to find the error message place
		WebElement text= driver.findElement(By.xpath("//div[@class='error-text']//span[@id='ctl00_cphMainContent_cv_txt_CC_Number']"));
		String verfiy= text.getText();
		
		//print the error message
		System.out.println("The Error messeage is= "+message);

		//verify the test
		Assert.assertEquals(message,verfiy);  
		Thread.sleep(3000);

		driver.close();


	}


}
