package BasicInterviewProblems;

public class Fibnocci {
	
	
	public static void main (String agrs[])
	{
		
	 for(int i=0;i<=10;i++)
	 {
		 System.out.printf(fibnocci(i)+" ");
	 }
	 System.out.println();
	 for(int i=0;i<=10;i++)
	 {
		 
		 System.out.printf(fibnocciNonRecurssion(i)+" ");
	 }
	}
	
	public static int fibnocci(int  n)
	{
		
		if(n==1 || n==0)
		{
			return 1;
		}
		else
		{
			return fibnocci(n-1)+fibnocci(n-2);
			
			
		}
	
		
		
	}
	
	public static int fibnocciNonRecurssion(int n)
	{
		
		
		
		
		if(n==1 || n==0)
		return 1;

		else {
			int n1=1, n2=1, n3=0;
			for(int i=2;i<=n;i++)
			{
				n3=n2+n1;
				n1=n2;
				n2=n3;
				
			}
			return n3;
			
			
			
		}
		
		
	}

}
