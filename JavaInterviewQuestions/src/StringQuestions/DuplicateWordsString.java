package StringQuestions;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordsString {

	public static void main(String args[])
	{
		
		findDuplicateWords("Subhash Subhash is is a good boy");
		
	}
	
	public static void findDuplicateWords(String str)
	{
		
		if(str==null || str.isEmpty())
		{
			System.out.println("Empty String");
		}
		else
		{
			String[] stringArray = str.split(" ");
			
			Map<String,Integer> duplicates = new HashMap<>();
			
			for(String s : stringArray)
			{
				if(duplicates.containsKey(s))
				{
					duplicates.put(s,duplicates.get(s)+1);
				}
				else
				{
					duplicates.put(s,1);
				}
			}
			
			duplicates.forEach((k,v)-> {
				if(v>1) System.out.println(k+"-"+v);
			});
			
			
			
			
		}
	}
}
