package CollectionQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeueExample {

	public static void main(String[] args)
	{
		Deque queue = new ArrayDeque<>();
        
		queue.add(23);
		queue.offer(12);
		queue.add(44);
		queue.add(53);
		queue.offer(22);
		queue.add(44);
		queue.add('A');
		
		System.out.println("Queue before operation = "+queue);
		
		System.out.println("AddFirst method = ");
		queue.addFirst("First");
		queue.offerFirst(1);
		System.out.println("Queue after operation = "+queue);
		
		System.out.println("AddLast method = ");
		queue.addLast("Last");
		queue.offerLast(50);
		System.out.println("Queue after operation = "+queue);
		
		System.out.println("Queue values in reverse order");
		Iterator itr = queue.descendingIterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+"  ");
		}
		System.out.println();
		
		System.out.println("First element = "+queue.getFirst());
		System.out.println("Last element = "+queue.getLast());
		
		System.out.println("Peek first method = "+queue.peekFirst());
		System.out.println("Peek last method = "+queue.peekLast());
		System.out.println("Queue after operation = "+queue);
		
		System.out.println("Poll first method = "+queue.pollFirst());
		System.out.println("Poll last method = "+queue.pollLast());
		System.out.println("Queue after operation = "+queue);
		
		System.out.println("Pop method = "+queue.pop());
		System.out.println("Remove first method = "+queue.removeFirst());
		System.out.println("Remove last method = "+queue.removeLast());
		System.out.println("Queue after operation = "+queue);
		
		System.out.println("Push method = ");
		queue.push(200);
		System.out.println("Queue after operation = "+queue);
	}

}
