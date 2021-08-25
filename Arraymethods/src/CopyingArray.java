import java.util.Arrays;

public class CopyingArray {

	public static void main(String[] args) {
		//Scenario 1: copy array using assignment 
		int arr1[] = {1,2,3};
		int arr2[]= arr1;
		
		//test side effect
		arr2[0]++;
		
		System.out.println("Scenario 1: ");
		System.out.println("\nThe a array");  
		System.out.println(Arrays.toString(arr1));
		System.out.println("\nThe b array");  
		System.out.println(Arrays.toString(arr2));
		
		 //Scenario 2: copy array using iterating
		int copy_array1[]= {1,2,3};		int copy_array2[]= new int [copy_array1.length];
		
		for(int i =0; i<copy_array2.length;i++)  
		{   
			copy_array2[i]=copy_array1[i];
		}
		
		//test side effect
		copy_array2[0]++;
		
		System.out.println("\nScenario 2: ");
		System.out.println("\nThe first array");  
		System.out.println(Arrays.toString(copy_array1));
		System.out.println("\nThe second array");  
		System.out.println(Arrays.toString(copy_array2));
		
		 //Scenario 3: Copy array using clone
		int e[] = {1,2,3};
		int f[] =e.clone();
		
		//test side effect 
		f[0]++;
		
		System.out.println("\nScenario 3: ");
		System.out.println("\nThe array e");  
		System.out.println(Arrays.toString(e));
		System.out.println("\nThe array f");  
		System.out.println(Arrays.toString(f));
		
		//Scenario 4: Copy array using arraycopy
		int g[]= {1,2,3};
		int h[]= new int [g.length];
		System.arraycopy(g, 0, h, 0, h.length);
		
		//test side effect
		h[0]++;
		
		System.out.println("\nScenario 4: ");
		System.out.println("\nThe array g");  
		System.out.println(Arrays.toString(g));
		System.out.println("\nThe array h");  
		System.out.println(Arrays.toString(h));

	}

	
}
