package StringQuestions;
import java.util.HashMap;
import java.util.Map;

//find duplicate characters in a string






public class StringDuplicates {
	
	public static void main(String[] args)
	{
		
		
		findDuplicates("Programming");
		findDuplicates("Java");
		
		
	}
	
	public static void findDuplicates(String str)
	{
		
		if(str == null || str.isEmpty())
		{
		System.out.println("Ïnvalid Inputs");
		
		}
		else
		{
		char[] character = str.toCharArray();
		
		Map<Character,Integer> duplicates  = new HashMap<>();
		for(char c:character)
		{
			
			if(duplicates.containsKey(c))
			{
				duplicates.put(c,duplicates.get(c)+1);
			}
			else
			{
				duplicates.put(c, 1);
			}
			
		}
		
		
		duplicates.forEach((k,v)->System.out.println(k+"-"+v));
		
					
		}
			
		
	}
}
