import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SetInterface {

	public static void main(String[] args) {
		Integer array[]= {34,22,10,60,30};
		
		 Set<Integer> hashSet= new HashSet<>(Arrays.asList(array));
	     //Set <String> linkedHashSet = new LinkedHashSet<>();
	     //Set<String>  treeSet= new TreeSet<>();
		 hashSet.add(34);
		 hashSet.add(22);
		 hashSet.add(10);
	      

	       
		System.out.println("The hashset :"+ hashSet);
		ArrayList<Integer> arrlist = new ArrayList<Integer>(hashSet);
		Collections.sort(arrlist);
		System.out.println("Sorted Hashset: "+arrlist);
		System.out.println("First Elecment: "+arrlist.get(0));
		System.out.println("Last element: "+arrlist.get(4));
		
	  
	        

	}
	
	
	

}
