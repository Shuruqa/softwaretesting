import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;
import java.util.ListIterator;
import java.util.Iterator;

public class ListMethod {

    public static void main(String[] args) {

       ArrayList<Integer> arrayList = new ArrayList<>();
       //List<String> linkedList = new LinkedList<>();
       //List<String> vectorList = new Vector<>();
       //List<String> stackList = new Stack<>();
         arrayList.add(1);
         arrayList.add(2);
         arrayList.add(3);
         arrayList.add(4);
         arrayList.add(4);
        
   
        System.out.println("The list is...."+arrayList);
        arrayList.remove(3);
        System.out.println(arrayList);
        //System.out.println("The removed value is...."+arrayList.remove(3));
        
        for(Integer val:arrayList) {
        	System.out.print(val);
        }

      
     }

   }