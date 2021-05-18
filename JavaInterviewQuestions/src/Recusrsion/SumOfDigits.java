package Recusrsion;

public class SumOfDigits {
	
	public static void main(String[] args)
	{
		
		System.out.println(sumof(30));
	}
	
	public static int sumof(int n)
	{
		return n==0?0:(n%10)+sumof(n/10);
	}
		
	

}

