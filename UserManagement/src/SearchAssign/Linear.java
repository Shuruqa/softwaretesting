package SearchAssign;

import java.util.Arrays;

public class Linear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,756};
		int key=756;
		
		int x =linearSearch(arr,key);
		System.out.println(Arrays.toString(arr));
		System.out.println("We found: "+key);
		System.out.println("The fibonacci "+fib(6));
		
	}
	//0,1,1,2,3,5,5,13,21,34
	public static int fib(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1 || n==2) {
			return 1;
		}
		return fib(n-1)+ fib(n-2);
		
	}
	
	private static int linearSearch(int arr[], int key) {
		for(int i=0; i<=arr.length;i++) {
			
			if(arr[i]==key) {
				return arr[i];
				
			}
		}
		return 0;
	}

}
