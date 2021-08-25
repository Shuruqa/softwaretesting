import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Iterator;


public class SortedSetMethod {

	public static void main(String[] args) {

		//adding element to a map 
		SortedSet<String> sortedset= new TreeSet<>();
		sortedset.add("a");
		sortedset.add("b");
		sortedset.add("c");
	
	
		Iterator iterator = sortedset.iterator();
	      while(iterator.hasNext()) {
	      Object name = iterator.next();
	      System.out.println(name);
	      }
		

	}

}
