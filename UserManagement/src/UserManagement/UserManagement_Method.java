package UserManagement;

public class UserManagement_Method extends UserManagement_Abstract {

	@Override
	public void view_info() {
		System.out.println("The User Name: "+Name);
		System.out.println("The User Email: "+email);
		System.out.println("The User Date of Birth: "+DOB);
		System.out.println("The User Payment Type: "+payment);
		System.out.println("The User Address: "+address);
		System.out.println("The User Account Type: "+account_type);
		System.out.println("The User Age: "+age);
		System.out.println("The User Weight: "+(double)weight);
	
	}
	
	public void agePass() {
		if(age<20) {
			
			System.out.println("The user is considered underage ");
			
		}else {
			System.out.println("The user is not considered underage");
		}
		
	}
	
	public void payment_type() {
		
		System.out.println("Memebership is  "+membership);
		
	}
	@Override 
	public void payment_type(String payment) {
	
		System.out.println("Payment has done using "+payment);
		
	}
	
	@Override 
	public void payment_type(String payment, boolean code) {
		if(payment!=null) {
			
			System.out.println("Since your payment is done using "+payment +" you got 15% offer");
			
		}
		
		
	}
}
