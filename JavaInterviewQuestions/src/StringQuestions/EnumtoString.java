package StringQuestions;

public class EnumtoString {
	
	private enum LOAN{
		
		HOMELOAN{
			@Override
			public String toString(){
				
				return "Always look for Cheaper interest rate";
			}
		},
		
		VEHICLELOAN{
			
			@Override
			public String toString()
			{
				return "Dont opt Vehicle loan";
			}
			
		}
	}
	
	public static void main(String[] args)
	{
		
		//Conver Enum to String
		LOAN homeLoan = LOAN.valueOf("HOMELOAN");
		System.out.println(homeLoan);
		
		//Covert String to enum
		String homeloan = homeLoan.name();
		System.out.println(homeloan);
		
	}
	

}
