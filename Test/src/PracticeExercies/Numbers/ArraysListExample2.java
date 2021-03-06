package PracticeExercies.Numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ArraysListExample2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// TODO Auto-generated method stub
	
	
		List<String> string = new ArrayList( Arrays.asList("A11","A12","A14","b12","B14","B17","B18","C12","C15"));
		
		
		ListIterator<String> itr = string.listIterator();
				
		System.out.println(itr.nextIndex());
		System.out.println(itr.next());
		System.out.println(itr.nextIndex());
		System.out.println(itr.next());
		
		
		/*
		 itr.add("A13");//itr.set("A13") would replace last returned with new Value. itr.add would insert a new item
		 itr.add("A13") "Exception in thread "main" java.lang.UnsupportedOperationException
		
		Arrays.asList returns a List wrapper around an array. This wrapper has a fixed size and is directly backed by the array, and as such calls to set will modify the array, and any other method that modifies the list will throw an UnsupportedOperationException.

		To fix this, you have to create a new modifiable list by copying the wrapper list's contents. This is easy to do by using the ArrayList constructor that takes a Collection:

		Collection c = new ArrayList(Arrays.asList(la));	
		*/
		
		
		itr.add("A13");
		System.out.println(itr.nextIndex());
		System.out.println(itr.next());
		System.out.println(itr.nextIndex());
		itr.remove();
		System.out.println(itr.next());
		
		
		
		
		
}


}
