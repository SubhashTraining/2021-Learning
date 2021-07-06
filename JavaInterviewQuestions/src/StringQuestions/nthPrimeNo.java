package StringQuestions;

public class nthPrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n=10;
		int counter =0;
		int number = 1;
		int primeNo=0;
		boolean flag =true;
		while(counter <=n)
		{
			
			flag= true;
			number = number+1;
			
			for(int i=2;i<=Math.sqrt(number);i++)
			{
				if(number%i==0)
				{
					flag=false;
				}
			}
			
			if(flag)
			{
				counter++;
				if(counter==10)
				{
					primeNo=number;
				}
			}
		}
		System.out.println(primeNo);
	}

}
