import geb.spock.GebSpec
import geb.Browser;
import geb.*

System.setProperty("webdriver.chrome.driver", "C:/Users/ASUS/Downloads/chromedriver.exe");

Browser.drive {

	go "https://learn.codingdojo.com/signin"
	
	//verify if we are on the correct page
	assert title=="Learning Platform"
	
	//enter a value into the search field
	$("input",name:"email").value("user1@example.com")
	
	 //Enter codingdojo.com into the search field
    $("input",name:"password").value("goodpassword")
	
	//Click on the search button
	$("button.btn.btn-primary.login_btn").click()
	
	//Wait for the change to results page to happen
	waitFor{ def errormsg = $("p.error_message_for_login")}
	sleep(5000)

}


