package StringQuestions;

public class AlternatePrimeNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int counter=0;
		boolean flag= true;
		int num =1;
		while(counter<10)
		{
			flag=true;
			num =num+1;
			for(int i=2;i<=Math.sqrt(num);i++)
			{
				
				if(num%i==0)
				{
					flag=false;
				}
				
				
			}
			
			if(flag==true) {
				counter++;
				if(counter%2==0)
					System.out.print(num+" ");
			}
			
			
			
		}
		

	}

}
