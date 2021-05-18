package StringQuestions;

import java.util.Arrays;

/*
  	two String is called anagram, if they contains the same characters but on different order 
  	e.g. army and mary, stop and pots, etc. Anagrams are actually a mix-up of characters in String.

	
 */

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		
		
		System.out.println(checkAnagaramMethod1("abc","bac"));
		System.out.println(checkAnagaramMethod2("mary","yram"));
		System.out.println(checkAnagaramMethod3("mary","yram"));
	}
	
	
	//Method1- take the given string pick the first letter and remove that letter from the Anagram String. 
	//Remove each letter and finally ehen all letters are removed the string should be empty
	public static boolean checkAnagaramMethod1(String str, String Anagram)
	{
		
		if(str.isEmpty() || str==null ||Anagram.isEmpty() || Anagram==null){
			throw new IllegalArgumentException("One or Both parameters are either empty or null");
		}
		else{
				
			
			for(char c:str.toCharArray())
			{
				int index = Anagram.indexOf(c);
				if(index==-1) return false;
				Anagram = Anagram.substring(0,index)+Anagram.substring(index+1);
				
			}
			return Anagram.isEmpty();
		}
		
		
		
		
	}

	//Method2. Get the  characters as an array and sort it. loop through each characters 
	public static boolean checkAnagaramMethod2(String str, String anagram)
	{
		if(str.isEmpty()||anagram.isEmpty()||str==null||anagram==null)
		{
			throw new IllegalArgumentException("InValid Parameters");
		}
		
		
		
			char[] input = str.toCharArray();
			char[] anagramArray = anagram.toCharArray();
			Arrays.sort(input);
			Arrays.sort(anagramArray);
			//System.out.println(input);
			//System.out.println(anagramArray);
			//return input.equals(anagramArray); This equals will check if == which would work for equals. use Arrays.equals
			return Arrays.equals(input,anagramArray);
				
	}
	
	//Method 3: delete the character from anagram array 
	
	public static boolean checkAnagaramMethod3(String str, String anagram)
	{
		
		
		//If you want to delete the character in between , use string builder
		if(str.isEmpty()||anagram.isEmpty()||str==null||anagram==null)
		{
			throw new IllegalArgumentException("InValid Parameters");
		}
		
		char[] strArray = str.toCharArray();
		StringBuilder anagramSB = new StringBuilder(anagram);
		for(char c: strArray)
		{
			int index = anagramSB.indexOf(""+c);//the argument expects string c is a character so added ""+C. empty string by character
			if(index !=-1)
			{
				anagramSB.deleteCharAt(index);
			}
				
			
		}
		
		return anagramSB.length()==0?true:false;
		
		
		
		
	}
}
