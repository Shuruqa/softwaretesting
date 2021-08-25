package groovypack

class OddEven {

	static void main(args) {

		Scanner reader = new Scanner(System.in);  // Create a Scanner object
		println("Enter The Number :");
		def num = reader.nextLine();
		def innum = num.toInteger()

		if(innum % 2 == 0) {

			println("The number "+innum+" is even");
		}else {

			println("The number " +innum+" is odd" );
		}

	}
}
