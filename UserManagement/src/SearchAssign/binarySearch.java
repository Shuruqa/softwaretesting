package SearchAssign;

public class binarySearch{
  
	 public static void main(String args[]){  
	        int arr[] = {10,20,30,40,50};  
	        int key = 10;  
	        int last=arr.length-1; 
	       	        
	        bi_Search(arr,0,last,key); //or it could be first=0
	        System.out.println("We found: "+key);

	       
	 } 
	 
	 public static void  bi_Search(int arr[], int first, int last, int key){  
		   
			//mid= (10/50)/2 = 30
			int mid = (first + last)/2;  

			for(int i=0; i<=arr.length;i++) {
 
			      if ( arr[mid] < key ){  
			         
			    	  first = mid + 1;     
			      
			      }else if ( arr[mid] == key ){  
			        System.out.println("Element is found at index: " + mid);  
			        break;  
			      
			      }else{  
			         last = mid - 1;  
			      }  
			      mid = (first + last)/2;  

				
			}
			
			   if ( first > last ){  
			      System.out.println("Element is not found!");  
			   }  
			 }
	}  
