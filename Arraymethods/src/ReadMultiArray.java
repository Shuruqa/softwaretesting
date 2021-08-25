import java.util.Arrays;
public class ReadMultiArray {

	public static void main(String[] args) {
		int arr1[][]= {{1,2},{3,4}};
		int row=2;
		int column=2;
		int array[][]= new int [row][column];
		
		//printing the multidimension
		for(int i=0; i<3; i++) {
			System.out.println(Arrays.deepToString(arr1));
			System.out.println();
			//System.out.println(Arrays.deepToString(array));
			
		}
		

	}

}
