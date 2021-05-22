package Recusrsion;

import java.util.Scanner;

public class BinaryToDecimalNonRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		for(int i=0;i<=5;i++){
			
			System.out.println("\nEnter the Binary digits: \n");
			binaryToDecimal(in.next());
			
		}
		
	}
	
	public static void binaryToDecimal(String binary)
	{
		System.out.println(binary.length());
		Integer[] intarray = new Integer[binary.length()];
		
		for(int i=0;i<binary.length();i++)
		{
			
			intarray[i]= Integer.parseInt(Character.toString(binary.charAt(i)));
		}
		System.out.println(intarray.length);
		
		int decimal =0;
		int twoPower=0;
		
		for(int i = intarray.length-1;i>=0;i--)
		{
			decimal = decimal+(int)(intarray[i]*Math.pow(2, twoPower));
			twoPower++;
		}
		
		System.out.println("The decimal equivalent of "+binary+" is ="+decimal);
		
	}
	

}
