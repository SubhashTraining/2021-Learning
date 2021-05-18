package Recusrsion;

import java.util.Scanner;

////https://javarevisited.blogspot.com/2015/08/how-to-find-all-permutations-of-string-java-example.html#axzz6tclHFrkb
public class Permutation_Char_Strings {
	
	
	public static void main(String[] args)
	{
		
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		
		
		stringPerumutations(input);
		
		
		
	}
	
	public static void stringPerumutations(String input)
	{
		stringPerumutations("",input);
	}

	
	public static void stringPerumutations(String StaticValue,String word)
	{
		
		//System.out.println(word.length());
		if(word.isEmpty())
		{
			System.out.println(StaticValue);
		}
		
		
		else
		{
			for(int i=0;i<word.length();i++)
			{
				//System.out.println(i+" "+StaticValue+word.charAt(i)+" - "+word.substring(0,i)+word.substring(i+1));
				stringPerumutations(StaticValue+word.charAt(i),word.substring(0,i)+word.substring(i+1));
				
				
				
			}
		}
		
	}
	
}
