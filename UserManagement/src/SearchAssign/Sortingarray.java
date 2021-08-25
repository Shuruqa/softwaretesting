
package SearchAssign;


public class Sortingarray {

	public static void main(String args[]){  

		int arr[] = {90,23,101,45,65,23,67,89,34,23};  
		SortingArr sortarray = new SortingArr();  
		sortarray.sort(arr, 0, arr.length-1);  
		  
		System.out.println("\nSorted array");  
		for(int i =0; i<arr.length;i++)  
		{  
		    System.out.println(arr[i]+"");  
		}
	       
	}
	   
	    
	public void sort(int[] arr,int first, int last)  
	    {  
	         if(first < last) {
	        
	         int mid=(first+last)/2;
	         
	        
	         sort(arr, first, mid);
	         sort(arr, mid+1, last);

	         merge(arr, first, mid, last);
	          }
	    } 


	public void merge(int arr[], int first, int mid, int last)  
		{  
		  
		int l = mid - first + 1;  
		int r = last - mid;  
		  
		int LeftArray[] = new int [l];  
		int RightArray[] = new int [r];  
		  
		for (int i=0; i<l; ++i)  
		LeftArray[i] = arr[first + i];  
		  
		for (int j=0; j<r; ++j)  
		RightArray[j] = arr[mid + 1+ j];  
		  
		  
		int i = 0, j = 0;  
		int k = first;  
		while (i<l && j<r)  
		{  
			if (LeftArray[i] <= RightArray[j])  
			{  
				arr[k] = LeftArray[i];  
				i++;  
			}  
			else  
			{  
				arr[k] = RightArray[j];  
				j++;  
			}  
				k++;  
		}  
		
		while (i<l)  
		{  
			arr[k] = LeftArray[i];  
			i++;  
			k++;  
		}  
		  
		while (j<r)  
		{  
			arr[k] = RightArray[j];  
			j++;  
			k++;  
		}  
	}  
		  
	  
}



	

