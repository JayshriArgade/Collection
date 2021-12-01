package CollectionSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) 
	{
		TreeSet set = new TreeSet();
		
		set.add('F');
		set.add('A');
		set.add('S');
		set.add('B');
		set.add('Z');
		set.add('C');
		
		System.out.println(set);
		
		System.out.println("Size method = "+set.size());
		
		System.out.println("Ceiling method = "+set.ceiling('B'));
		
		System.out.println("Contains method = "+set.contains('X'));
		
		System.out.println("Set in Descending order = "+set.descendingSet());
		
		System.out.println("Floor method = "+set.floor('S'));
		
		System.out.println("Higher method = "+set.higher('B'));
		
		System.out.println("Poll last method = "+set.pollLast());
		
		System.out.println("Printed using Iterator");
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+"    ");
		}

	}

}
