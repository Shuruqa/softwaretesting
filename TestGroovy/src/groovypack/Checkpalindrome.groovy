package groovypack

class Checkpalindrome {
	static void main(String []args) {

		String FirstString="Mom";
		String reverseString="";

		int length=FirstString.length();

		//loop through the characters

		for(int i= length -1; i >= 0; i--) {
			reverseString = reverseString + FirstString.charAt(i);

		}

		//Compare the two strings
		if(FirstString.equalsIgnoreCase(reverseString)) {
			System.out.println("The given String is Palindrome");

		}else {

			System.out.println("The given String is Not Palindrome");

		}


	}
}