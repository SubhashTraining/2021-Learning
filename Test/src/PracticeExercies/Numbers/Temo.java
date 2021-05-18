package PracticeExercies.Numbers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Temo {

	public static void main(String[] args)
	{
		
		
		List<Integer> list = Arrays.asList(1,4,5,67,33,22);
		int[] intArray = {2,45,54,223,44};
		
		
		
		int[] i = list.stream().mapToInt((Integer a)-> a.intValue()).toArray();
		
		List<Integer> intList = Arrays.stream(intArray).boxed().collect(Collectors.toList());
		List<Integer> inList2= Arrays.stream(intArray).boxed().collect(Collectors.toList());
		
		Integer[] integerArray = IntStream.of(intArray).boxed().toArray(Integer[]::new);
		Integer[] integerArray2 = IntStream.of(intArray).boxed().toArray(Integer[]::new);
		
		
		
		
		
		
	}
	
	
}
