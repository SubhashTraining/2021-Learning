package PracticeExercies.Numbers.Collections.Queue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;

public class queue {

	public static void main(String[] args) {
			
		// TODO Auto-generated method stub
		
		//Queue Implementation - PriorityQueue and LinkedList
		
		
		Queue<Integer> queue = new PriorityQueue<Integer>(5);
		Queue<Integer> queue1 = new LinkedList<>();
		
		//Priority Queue. Elements are ordered by natural ordering or sometimes by the comparator provided at construction time
		
		queue.add(5);
		queue.clear();
		
		
		queue.add(5);
		queue.add(10);
		queue.add(15);
		queue.add(20);
		queue.add(25);
		queue.add(30);
		queue.offer(35);//returns false when the elements is not inserted
		System.out.println(queue);//[5, 10, 15, 20, 25, 30, 35]
		
		
		System.out.println(queue.peek());//returns the head element 5
		System.out.println(queue.poll());//returns the head element and removes it from the queue - 5
		System.out.println(queue.peek());//10
		
		System.out.println(queue);//[10, 20, 15, 30, 25]
		
		queue.remove(30);
		System.out.println(queue);//[10, 20, 15, 25]. Cant specify the value in poll(only deletes the head)
		queue.remove();
		System.out.println(queue);//[15, 20, 25] removes the head

		int headElement = queue.peek();
		System.out.println(headElement);//15
		
		Iterator<Integer> itr = queue.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		//using comparator
		@SuppressWarnings("unused")
		Queue<String> queue3 = new PriorityQueue<>(new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
			
			
			
		});
		
		
		 queue1.forEach(i->{
			 System.out.println(i);
		 });
		
		Object obj = queue.toArray();
		//(or)
		Integer[] integerArray = queue.toArray(new Integer[queue.size()]);
		//Here the integerArray size is unknown, the queue can only be convereted if the integerArray is of same size and type.
		//So we can either conver the queue to Array and assign it as a single object
		// or return a new of the same size as the queue
		
		
		List<Integer> list = queue.stream().collect(Collectors.toList());
		//Stream map and Flat Map
		
		List<Integer> newList = queue.stream().map(i->i+100).collect(Collectors.toList());
		newList.forEach(input->System.out.println(input));
		
		
		//LinkedList Implemenetaton of Queue
		
		Queue<String> lQueue = new LinkedList<>();
		lQueue.add("Subhash");
		lQueue.add("Sanajay");
		lQueue.add("Suganya");
		lQueue.add("Buddha");
		lQueue.add("God");
		lQueue.add("Peace");
		
		System.out.println(lQueue);//[Subhash, Sanajay, Suganya, Buddha, God, Peace]
		
		lQueue.peek();
		System.out.println(lQueue.contains("Subhash"));//true
		lQueue.forEach(item->System.out.println(item+" foreach text Added"));
		
		System.out.println(lQueue.equals(queue));//false
		
		lQueue.remove("God");
		lQueue.remove();//reomove head Element
		lQueue.offer("God");
		
		String[] stringArray = lQueue.stream().toArray(String[]::new);
		Integer[] stringLength = lQueue.stream().map(input->input.length()).toArray(Integer[]::new);
		Arrays.asList(stringLength).forEach(i->System.out.println(+i));
		
		
		Iterator<String> itr1 = lQueue.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
	
		
		
		
		
		
		
	}

}
