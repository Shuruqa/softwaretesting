package groovypack

class duplicatechar {

	static void main (arg) {

		//The duplicated String
		String  a= "ZZZZebbbbrrrrraaaa";
		//to return String into sequence of characters
		char[] arr=a.toCharArray();

		//create an empty a string builder
		StringBuilder stb= new StringBuilder();

		//1- The outer loop will iterate through the array from 0 to length of the array
		for(int i=0; i<arr.length;i++) {
			boolean flag= false;

			//2- The inner loop will compare the selected element with the rest of the elements of the array
			for(int j= i+1; j< arr.length; j++) {

				//3-If a match is found which means the duplicate element is found then, display the element.
				if(arr[i] == arr[j]) {
					flag = true;
					break;
				}
			}
			//4-check if flag is not true, then append the unduplicated characters
			if(!flag) {
				//append() methods that add a value at the end of the string.
				stb.append(arr[i]);

			}
		}

		println("The new string is = "+stb);

	}
}
