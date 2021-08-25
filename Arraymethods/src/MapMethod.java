import java.util.HashMap;
import java.util.Map;

public class MapMethod {

	public static void main(String[] args) {
		
		//adding element to a map 
		Map<String, Integer> hashmap= new HashMap<>();
		hashmap.put("Daisy",14);
		hashmap.put("Ayan",12);
		hashmap.put("Zara",8);
		hashmap.put("Mahnaz",31);
		hashmap.put("Mahnaz",31);
		hashmap.put("",null);
		
		System.out.println("the Map elements : "+hashmap);
		hashmap.replace("Mahnaz", 31);
		System.out.println("the value of  : "+	hashmap.replace("Mahnaz", 31));
		
	}

}
