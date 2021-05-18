package Recusrsion;

import java.util.Scanner;

public class ReverseStringRecursion {
	
	
	
	
	public static void main(String[] args)
	{
		
		
		Scanner in  = new Scanner(System.in);
		
		//System.out.println("Enter the input String \n");
		//String str = in.nextLine();
	    System.out.println(reverse("good"));
		
	
		
		
	}
	
	public static String reverse(String str)
	{
		
		if(str.length()==1){
			return str;
		}
		else
		{   
			//System.out.println(str.length());
			//System.out.println(str.charAt(str.length()-1) + " - " + str.substring(0,str.length()-1));//sub string does not considers the last character as well s length-1
			return new String(str.charAt(str.length()-1)+reverse(str.substring(0,str.length()-1)));
			
		}
		
		
	}

}
