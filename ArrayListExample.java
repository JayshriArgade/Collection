package CollectionList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		
		list.add("Ram");
		list.add("Sham");
		list.add(3);
		list.add(2.31);
		list.add('A');
		
		System.out.println(list);
		
		System.out.println("Contains method = "+list.contains(3));
		
		System.out.println("Index of method = "+list.indexOf('A'));
		
		System.out.println("Get method = "+list.get(1));
		
		System.out.println("Remove method = "+list.remove(2));
		System.out.println(list);

		System.out.println("Set method = "+list.set(2, "Sarthak"));
		System.out.println(list);
		
		System.out.println("Print using Iterator = ");
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+"  ");
		}
	}

}
