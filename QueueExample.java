package CollectionQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args)
	{
		Queue queue = new PriorityQueue();
		
		queue.add(23);
		queue.offer(12);
		queue.add(44);
		queue.add(53);
		queue.offer(22);
		queue.add(44);
		
		System.out.println("Queue before operation = "+queue);
		
		System.out.println("Peek method = "+queue.peek());
		System.out.println("Queue after operation = "+queue);
		
		System.out.println("Poll method = "+queue.poll());
		System.out.println("Queue after operation = "+queue);
		
		System.out.println("Remove method = "+queue.remove());
		System.out.println("Queue after operation = "+queue);
		
		Integer i = 44;
		System.out.println("Remove method = "+queue.remove(i));
		System.out.println("Queue after operation = "+queue);
		
		System.out.println("Remove all method = ");
		queue.removeAll(queue);
		System.out.println("Queue after operation = "+queue);
	}

}
