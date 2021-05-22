package Recusrsion;


/*
 	First two numbers of series are always 1 and 1, third number becomes 1 + 1 = 2, 
 	subsequently fourth number becomes 2 + 1 = 3
 	So a Fibonacci series looks like 1, 1, 2, 3, 5, 8, 11, 19, and so on, as shown in the image as well.
 	
 	so it the sum of fibnocii for the previous two positions

 */


import java.util.Scanner;

public class FibnociiSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("\nEnter the limit:\n");
		int input = in.nextInt();
		System.out.println("\n");
		for(int i=1;i<=input;i++)
		{
			int no = getFibnoci(i);
			System.out.print(no+" ");
		}
		

	}
	
	public static int getFibnoci(int input)
	{
		
		
		if(input==0 || input ==1)
			return 1;
		else
		{
			return getFibnoci(input-1)+getFibnoci(input-2);
		}
		
		
	}

}



