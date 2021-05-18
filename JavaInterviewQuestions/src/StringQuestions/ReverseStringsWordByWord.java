package StringQuestions;

import java.util.Scanner;

public class ReverseStringsWordByWord {
	
	
	public static void main(String args[])
	{
		
		Scanner in =new Scanner(System.in);
		
		String str=in.nextLine();
		
		String[] inputString = str.split(" ");
		
		int i=0;
		int j=inputString.length-1;
		while(i<j)
		{
			String temp = inputString[i];
			inputString[i]=inputString[j];
			inputString[j]=temp;
			
			i++;j--;
			
		}
		
		for(String s:inputString)
		{
			System.out.print(s+" ");
		}
		
		
		
		
		
	}

}
