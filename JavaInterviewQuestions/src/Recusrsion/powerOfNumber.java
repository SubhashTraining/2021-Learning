package Recusrsion;

public class powerOfNumber {
	
	public static void main(String args[])
	{
		
		
		System.out.println(powerOf(3,4));
		
		
	}
	public static int powerOf(int base, int power)
	{
		if(power ==0)
		{
			return 1;
		}
		else
		{
			return base*powerOf(base,power-1);
		}
	}

}
