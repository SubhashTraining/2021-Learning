package StringQuestions;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factoral(10));
	}
	
	public static long factoral(long n)
	{
		
		if(n==0)
			return 1;
		else
			return n*(factoral(n-1));
	}

}
