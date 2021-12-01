package CollectionList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		
		list.add("Ram");
		list.add("Sham");
		list.add(3);
		list.add(2.31);
		list.add('A');
		list.add(null);
		
		System.out.println(list);
		
		System.out.println("Contains method = "+list.contains(4));
		
		System.out.println("Element method = "+list.element());
		
		System.out.println("Get method = "+list.get(4));
		System.out.println("Get first method = "+list.getFirst());
		System.out.println("Get last method = "+list.getLast());
		
		System.out.println("Peek method = "+list.peek());
		
		System.out.println("Poll first method = "+list.pollFirst());
		System.out.println(list);
		
		System.out.println("Offer last method = "+list.offerLast("Ram"));
		System.out.println(list);
		
		System.out.println("Remove method = "+list.remove(2));
		
		System.out.println("Printed using Iterator");
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+"   ");
		}
		System.out.println();
		System.out.println();
        
	}

}
