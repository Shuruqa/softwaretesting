import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Deque<Integer> dequeueList = new LinkedList<Integer>();
	       dequeueList.add(6);
	       dequeueList.add(7);
	       dequeueList.add(1);
	       dequeueList.add(5);
	       dequeueList.add(9);	        
	       dequeueList.add(8);	
	       dequeueList.add(2);
	       
	       for (int i = 0; i < dequeueList.size(); i++) { 
	    	    
	            System.out.print(((List<Integer>) dequeueList).get(i) + " "); 
	        } 
	       
	    
	        System.out.println(); 
	       
	       
	        System.out.println("The deque is...."+dequeueList);
	        System.out.println("The deque using standard iterator...."+dequeueList);
	        System.out.println("The using peek, the element at the head is : "+dequeueList.peek());
	        System.out.println("The deque after peek: "+dequeueList);
	        System.out.println("using pop, the element removed from the head : "+dequeueList.pop());
	        System.out.println("The deque after pop: "+dequeueList);
	        System.out.println("Dose the deque has an element 8? : "+dequeueList.contains(8));
	        dequeueList.removeLast();
	        dequeueList.removeFirst();
	        System.out.println("The deque after removing the first and last element : "+dequeueList);
	        

	}

}
