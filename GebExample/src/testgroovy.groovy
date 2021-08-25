import geb.*
import geb.spock.GebSpec


System.setProperty("webdriver.chrome.driver", "C:/Users/ASUS/Downloads/chromedriver.exe");



Browser.drive {

	go "http://gebish.org"
	 assert title == "Geb - Very Groovy Browser Automation"
	 $("div.menu a.manuals").click()
	 waitFor { !$("#manuals-menu").hasClass("animating") }
	 $("#manuals-menu a")[0].click()
	 assert title.startsWith("The Book Of Geb")

}