import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetAssign {

	public static void main(String[] args) {
		
		//adding element to a Set 
		Set<String> hashSet = new HashSet<>(Arrays.asList("Saudi Arabia", "USA", "South Africa"));
		
		System.out.println("the HashSet elements : "+hashSet);
		System.out.println("the contain USA or Not? "+hashSet.contains("USA"));
		hashSet.remove("South Africa");
		System.out.println("the list after removing South Africa: "+hashSet);
		System.out.println("Iterating over list "+hashSet);
		 
		for(String val:hashSet) {
	        	System.out.print(val+"\n");
	        }

		
	}

}
