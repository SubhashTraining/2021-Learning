package PracticeExercies.Numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class arraysExample {
	
	public static void main(String[] args){
		
		
		String[] stringArray = new String[100]; // all strings are initialized to null (int  - 0, boolean - false, object - null)
		int[] nos = {5,6,7,8};
		int[] copiesNos = Arrays.copyOf(nos, 5);// if new size is less than original the remaining will be truncated else will be with 0's
		
		
		//List<Integer> intList = Arrays.asList(nos); - cannot convert int[] to List<Integer>
		List<String> strings = Stream.of("how", "to", "do", "in", "java")
                .collect(Collectors.toList());
		/* Compilation Error !!
		   IntStream.of(1,2,3,4,5).collect(Collectors.toList()); */ //so we need to box the elements into their wrapper class
		
		
		
		List<Integer> intList = Arrays.stream(nos).boxed().collect(Collectors.toList());
		List<Integer> intList1 = IntStream.of(nos).boxed().collect(Collectors.toList());
		
		Integer[] integerArray = Arrays.stream(nos).boxed().toArray(Integer[]::new);
		Integer[] integerArray1 = IntStream.of(nos).boxed().toArray(Integer[]::new);
		
		List<String> stringlist	= Stream.of("Subhash","is","a","goodBoy").collect(Collectors.toList());
		List<String> stringlist2= Stream.of("Subhash","Suganya","Sanjay").collect(Collectors.toList());
		
		
		// Similaly LongStream.of().boxed().Collect(Collectors.toList());
		// Similaly DoubleStream.of().boxed().Collect(Collectors.toList());
	
		
		String[] stringarray = {"Subhash","Suganya","Sanjay"};
		String[] stringarray1 = {"Subhash","Suganya","Sanjay"};
		List<String> stringList = new ArrayList<>();
		Collections.addAll(stringList, stringarray);
		
		
		Arrays.sort(stringarray);
		Collections.sort(Arrays.asList(stringarray)); //cannot us Collections.sort(String[])
		Arrays.equals(stringarray1, stringarray);
		
		String[] stringarray3= "Subhash is a good boy".split(" ");
		for(String string: stringarray3)
		{  
			System.out.println(string);
		}
		
		
		
		
			
			
		
		
		
		
		}
		
		
		
		
		
	}


