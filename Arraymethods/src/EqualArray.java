import java.util.Arrays;

public class EqualArray {

	public static void main(String[] args) {
		int array1[]= new int[] {1,2,3,4,5,6};
		int array2[]= new int[] {4,5,6,7,8,9};
		
		boolean comp= Arrays.equals(array1, array2);
		System.out.println("array1 and array 2 equal: "+comp);
	}

}
