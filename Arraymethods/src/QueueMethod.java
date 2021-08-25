import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Vector;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.Stack;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.LinkedList;
		
public class QueueMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		       Queue<Integer> queueList = new LinkedList<>();
		       queueList.add(6);
		       queueList.add(1);
		       queueList.add(8);
		       queueList.add(4);
		       queueList.add(7);	        
		   
		        System.out.println("The list is...."+queueList);
		        System.out.println("The removed value is: "+queueList.remove());
		        System.out.println("The queue after deletion: "+queueList);
		        System.out.println("The queue head of queue : "+queueList.element());
		        System.out.println("The Last value of queue : "+((LinkedList<Integer>) queueList).getLast());
		        System.out.println("The size of queue : "+queueList.size());

		      
		
	}

}
