
import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {

	public static void main(String[] args) {
	
		int arr[] = {1,2,3,57,8};
		int n, sum=0; 
		int key=57;
		
		int x =linearSearch(arr,key);
		System.out.println(Arrays.toString(arr));
		System.out.println("We found: "+key);

		
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
