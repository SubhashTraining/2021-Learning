package StringQuestions;

public class PatternDrawing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int row=6;
		
		for(int i=1;i<=row;i++)
		{
			
			for(int j =1; j<=row-i;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		//Pyramid Star pattern
		System.out.println("________________________________________");
		System.out.println();
		int rows =6;
		for(int i=1;i<=row;i++)
		{
			
			for(int j=1;j<=row-i;j++)
			{
				System.out.print(" ");
			}
			
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			
			
			System.out.println();
			
			
			
		}
		//Pyramid Star pattern
		System.out.println("________________________________________");
		System.out.println();
		//Diamond Shape Pattern
		
		
		row =8;
		for(int i=1;i<=row;i++)
		{
			
			for(int j=1;j<=row-i;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//Reverse Triangle
		int counter =1;
		for(int i=row-1;i>=1;i--)
		{
			
			for(int j=1;j<=counter;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();counter++;
			
		}
		
		
		
		
		
		
		
		System.out.println("________________________________________");
		System.out.println();
		// Right Pascal's Triangle
		row =8;
		
		for(int i=1;i<=row;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");	
			}
				
			System.out.println();
		}
		
		counter=1;
		for(int i=row-1;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
			
		}
		
		System.out.println("________________________________________");
		System.out.println();
		//Reverse Pascal
		
		row=6;
		for(int i=1;i<=row;i++)
		{
			
			for(int j=1;j<=row-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		 counter=1;
		for(int i=row-1;i>=1;i--)
		{
			
			for(int j=1;j<=counter;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				
				System.out.print("*");
				
			}
			System.out.println();counter++;
			
		}

	}
	
	
	
	
	

}
