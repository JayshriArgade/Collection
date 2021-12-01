package CollectionSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args)
	{
		HashSet set = new HashSet();
		
		set.add(12);
		set.add('A');
		set.add(45);
		set.add('B');
		set.add(34);
		set.add('C');
		
		System.out.println(set);
		
		System.out.println("Size method = "+set.size());
		
		System.out.println("Contains method = "+set.contains('B'));
		
		System.out.println("Remove method = "+set.remove(12));
		System.out.println(set);
		
		System.out.println("Printed using Iterator");
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
