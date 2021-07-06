package StringQuestions;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LargestAndSmallestWorkString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Integer> words = new TreeMap<>();
		String input = "j jhfk sh hgsd jsdh jhsjsdk";
		
		for(String s: input.split(" "))
		{
			
			words.put(s,s.length());
			
		}
		
		//words.entrySet().stream().sorted((e1,e2)->e1.getValue().compareTo(e2.getValue()).map(Map.Entry::getValue).collect(Collectors.toList());
		words.entrySet().stream().sorted((e1,e2)->e1.getValue().compareTo(e2.getValue())).forEach(entry -> System.out.println(entry.getKey()+":"+entry.getValue()));
	}

}
