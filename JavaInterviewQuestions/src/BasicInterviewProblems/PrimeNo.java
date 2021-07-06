package BasicInterviewProblems;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		primeNoBetween(0,20);

	}
	
	public static void primeNoBetween(int Start, int Stop)
	{
		boolean flag;
		for(int j=Start;j<=Stop;j++)
		{
			flag=true;
			if(j>1)
			{
			 
				for(int i=2;i<=Math.sqrt(j);i++)
				{
					if(j%i==0)
					{
						flag=false;break;
					}
				}
				if(flag==true) {System.out.print(j+" ");}
							
			}
		}
		
		
		
		
		
	}

}
