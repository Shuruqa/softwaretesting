package groovypack

class Checkpalindrome1 {

	static void main(args) {

		def org_num=12321
		def remainder
		def reverse_num= 0
		def temporary_num = org_num


		//loop through the numbers

		while(temporary_num >0) {
			remainder= temporary_num % 10
			reverse_num= (reverse_num * 10) + remainder
			temporary_num=temporary_num.intdiv(10)

		}

		//Compare the two strings
		if(org_num==reverse_num) {
			System.out.println("The given Number is Palindrome");

		}else {

			System.out.println("The given Number is Not Palindrome");

		}




	}
}
