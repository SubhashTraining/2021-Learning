package Recusrsion;

public class ConvertDecimalToBinary {
	
	/*
	 Take decimal number as dividend.

	Divide this number by 2 (2 is base of binary so divisor here).

	Store the remainder in an array (it will be either 0 or 1 because of divisor 2).

	Repeat the above two steps until the number is greater than zero.

	Print the array in reverse order (which will be equivalent binary number of given decimal number). 
	 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		decimalToBinary(8);
		

	}
	
	public static void decimalToBinary(int n)
	{
		
		if(n>0)
		{
			decimalToBinary(n/2);
			System.out.printf("%d",n%2);
		}
		
	}

}
