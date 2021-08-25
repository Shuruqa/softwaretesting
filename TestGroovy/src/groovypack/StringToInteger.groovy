package groovypack

class StringToInteger {

	static void main(args) {
		
		Scanner reader = new Scanner(System.in);  // Create a Scanner object
		println("Enter The String Number :");
		def num = reader.nextLine();

		
		//Evaluating the expression value
		switch(num.toLowerCase()) {
		   //There is case statement defined for 4 cases
		   // Each case statement section has a break condition to exit the loop
		   case "one":
			  println("The value of one is 1");
			  break;
		   case "two":
			  println("The value of two is 2");
			  break;
		   case "three":
			  println("The value of three is 3");
			  break;
		   case "four":
			  println("The value of four is 4");
			  break;
		   case "Five":
			  println("The value of five is 5");
			  break;
			  case "Five":
			  println("The value of five is 5");
			  break;
		   default:
			  println("The value is unknown");
			  break;
		

		
		}
		
	}
}
