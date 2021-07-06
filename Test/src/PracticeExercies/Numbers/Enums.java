package PracticeExercies.Numbers;



/*
 * Enums is a data type that contains fixed set of constants
 * 
 * 
 */
public class Enums{
	
	private enum SEASONS{WINTER,SUMMER,SPRING,AUTUMN};
	
	//Specifying values to ENUMS
	private enum CAR{
		
		HUNDAI_I20(1),FORD(2),BENZ(3);
		
		private int value;
		private CAR(int value)
		{
			this.value=value;
		}
	}
	
	
	private enum Driver{
		FIREFOX("Firefox"),
		CHROME("Chrome"),
		Internet_Explorer("InteretExplorer"),
		Edge("Edge");
		
		private String value;
		private Driver(String value)
		{
			this.value=value;
		}
		
		public String getValue()
		{
			return this.value;
		}
	
	
	};
	
	
	
	
	public static void main(String args[])
	{
		
		
		SEASONS currentSeason = SEASONS.AUTUMN;
		System.out.println(currentSeason.name());//AUTUMN
		System.out.println(currentSeason.toString());//AUTUMN
		System.out.println(currentSeason.name());//AUTUMN
		System.out.println(SEASONS.AUTUMN.ordinal());//3
		System.out.println(SEASONS.valueOf("AUTUMN"));//AUTUMN
		
			
		
		for(CAR car: CAR.values())
		{
			System.out.println(car +":"+car.value);
		}
		
//		HUNDAI_I20:1
//		FORD:2
//		BENZ:3
		
		
		//Switch Statement
		
		Driver driver = Driver.CHROME;
		
		switch(driver)
		{
		
		case FIREFOX:
		{
			System.out.println("Use FireFox Driver");
			System.out.println(driver.getValue());
			break;
		}
			
		case CHROME:
		{
			System.out.println("Use CHROME Driver");
			System.out.println(driver.getValue());
			break;
		}
		
		case Internet_Explorer:
		{
			System.out.println("Use Internet_Explorer Driver");
			System.out.println(driver.getValue());
			break;
		}
		
		case Edge:
		{
			System.out.println("Use Edge Driver");
			System.out.println(driver.getValue());
			break;
		}
		
			
		
		}
		
		
		
		
		
	}
	
	
}

