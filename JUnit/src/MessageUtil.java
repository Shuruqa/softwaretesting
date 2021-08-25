
public class MessageUtil {
	
	private String message;
	private String failmessage;                    
 
	
	//constructor 
	//@param message to be printed
	
	public MessageUtil(String message) {
	
		this.message=message;
		
	
		
	}
	
	//print the message
	public String printMessage() {
		System.out.println(message);
		return message;
		
		
	}
	
	public String printfailmessages(String failmessage) {
		System.out.println(failmessage);
		return failmessage;
		
		
	}


}
