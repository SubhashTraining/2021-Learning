package PracticeExercies.Numbers.Collections.List.List2;

public class Seats implements Comparable<Seats> {
	

	private String SeatNo;
	private boolean isReserved;
	
	public Seats(String SeatNo)
	{
		
		this.SeatNo= SeatNo;
		this.isReserved=false;
		
	}
	
	public boolean reserveSeat(String SeatNo)
	{
		
		if(isReserved)
		{
			return false;
		}
		else
			isReserved =true;
			return true;
		
	}

	@Override
	public int compareTo(Seats o) {
		// TODO Auto-generated method stub
		
		return this.SeatNo.compareTo(o.SeatNo);
			
	}

	public String getSeatNo() {
		return SeatNo;
	}

	public boolean isReserved() {
		return isReserved;
	}
	
	
	
	

}
