import geb.spock.GebSpec
import geb.Browser;
import geb.*

System.setProperty("webdriver.chrome.driver", "C:/Users/ASUS/Downloads/chromedriver.exe");

Browser.drive {

	def browser = new Browser()
	go "https://google.com/"

	//verify if we are on the correct page
	assert title=="Google"
	sleep(3000)
	
	//enter a value into the search field
	$("input",name:"q").value("codingdojo.com")
	
	//the div for html and we use . to class object
	$("div.FPdoLc input.gNO89b").click()
	sleep(3000)

	assert title.startsWith("The Book Of Geb")
	


}