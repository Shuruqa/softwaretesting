import java.util.ArrayList;
import java.util.Iterator;

public class IteratorCheck {

	public static void main(String[] args) {
		 // ArrayList is a class in collections framework
		   //ArrayList<Datatype(class)>
		    ArrayList<String> names = new ArrayList<String>();
		    names.add("Amsha");
		    names.add("Shuruq");
		    names.add("Waad");
		   
		    System.out.println("The names are ...");
		    
		    Iterator<String> iteratorList = names.iterator();
		    while(iteratorList.hasNext()) {
		    	 System.out.println(iteratorList.next()+"");
		    }
		    // Loop through the collection
		    System.out.println("The names in the list are: "+names);
		   
	}

}
