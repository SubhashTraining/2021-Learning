package StringQuestions;

public class GenerateRandomNos {
	
	
	public static void main(String agrs[])
	{
		
		{  
			int min = 200;  
			int max = 400;  
			//Generate random double value from 200 to 400   
			System.out.println("Random value of type double between "+min+" to "+max+ ":");  
			System.out.println(Math.random());
			System.out.println(Math.random()*(max-min+1));
			double a =  Math.random()*(max-min+1)+min;   
			System.out.println(a);  
			//Generate random int value from 200 to 400   
			System.out.println("Random value of type int between "+min+" to "+max+ ":");  
			int b = (int)(Math.random()*(max-min+1)+min);  
			System.out.println(b);  
			}  
		
		
		
	}

}
