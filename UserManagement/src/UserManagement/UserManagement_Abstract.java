package UserManagement;

//import java.util.Date;

abstract class UserManagement_Abstract {

		// TODO Auto-generated method stub
		public String Name;
		public String email;
		public String DOB;
		public String payment;
		public String address;
		public String account_type;
		public int age;
		public String membership;
		public boolean code;
		public int weight;

		
		abstract void view_info();
		abstract void agePass();
		abstract void payment_type();
		abstract void payment_type(String payment);
		abstract void payment_type(String payment, boolean code);


	}


