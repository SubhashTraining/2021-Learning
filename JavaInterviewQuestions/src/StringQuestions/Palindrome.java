package StringQuestions;

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(palindrome("Madam".toLowerCase()));
		System.out.println(palindrome2("Madam".toLowerCase()));

	}
	
	public static boolean palindrome(String str)
	{
		
		StringBuilder sb = new StringBuilder(str).reverse();
		char[] reversedString = sb.toString().toCharArray();
		System.out.println(reversedString);
		return Arrays.equals(str.toCharArray(), reversedString);
	}
	
	public static boolean palindrome2(String str)
	{
		
		 int i=0;
		 int j = str.length()-1;
		 char[] strArray = str.toLowerCase().toCharArray();
			
		  while(i<j)
		  {
			  
			  if(!(strArray[i]==strArray[j]))return false;
			  i++;
			  j--;
			  
		  }
		  		
		
		return true;
	}

}
