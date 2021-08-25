package UserManagement;

public class NewUser {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UserManagement_Method u1=new UserManagement_Method();
		UserManagement_Method u2=new UserManagement_Method();
		UserManagement_Method u3=new UserManagement_Method();
		
		//first user information
		u1.Name="Shuruq Alyami";
		u1.email="shuruq.alyami@gmail.com";
		u1.DOB="11/29/1993";
		u1.payment="Credit Card";
		u1.address="Jubail";
		u1.account_type="Private";
		u1.age=27;
		u1.weight=50;
		u1.membership="Premuim";
		
		
		//first user calling method
		u1.view_info();
		u1.agePass();
		u1.payment_type();
		u1.payment_type(u1.payment);
		u1.payment_type(u1.payment,false);

		
		System.out.println("\n \n");
		
		//second user information
		u2.Name="Waad AlFahad";
		u2.email="waad.alfahad@gmail.com";
		u2.DOB="2/3/1997";
		u2.payment="Cash";
		u2.address="Riyadh";
		u2.account_type="Public";
		u2.age=19;
		u2.membership="Premuim";
		
		//second user calling method
		u2.view_info();
		u2.agePass();
		u2.payment_type();
		u2.payment_type(u2.payment);
		u2.payment_type(u2.payment,true);

		
		System.out.println("\n \n");
		
		//third user information
		u3.Name="Amsha AlFahad";
		u3.email="Amsha.alfahad@gmail.com";
		u3.DOB="2/3/1997";
		u3.payment="Cash";
		u3.address="Riyadh";
		u3.account_type="Public";
		u3.age=20;
		u3.membership="Premuim";
				
		//third user calling method
		u3.view_info();
		u3.agePass();
		u3.payment_type();
		u3.payment_type(u3.payment);
		u3.payment_type(u3.payment,true);


		
	}
	
} 
