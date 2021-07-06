package StringQuestions;

public class SumOfNaturalNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sumOfNaturalNos(100));
			
			
			
		
		

	}
	
	public static int sumOfNaturalNos(int n)
	{
		
		if(n==0) return 0;
		else {
			return n+sumOfNaturalNos(n-1);
			
		}
		
		
	}

}
