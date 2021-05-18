package PracticeExercies.Numbers.Collections.List.List2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Theatre {
	
	private String Name;
	private List<Seats> seats = new ArrayList<>();
	private int rows ;
	private int seatsPerRow;
	private float price;
	
	public Theatre(String Name, int Rows, int SeatsPerRow)
	{
		this.Name=Name;
		this.rows= Rows;
		this.seatsPerRow=SeatsPerRow;
		
		int rows = 'A'+(Rows-1);//when we add A we are adding 1 more row to rows so Row-1
		for(char row='A'; row<=rows;row++ ){
			for(int j=1;j<=SeatsPerRow;j++)
			{
				this.seats.add(new Seats(String.format(row+"%02d",j)));
			}
		}
		
		printSeats(Rows, SeatsPerRow);
		
			
	}
	

	
	
	public void sortSeats()
	{
		
		for(int i=0;i<=seats.size()-1;i++)
		{
			for(int j=i+1;j<seats.size();j++)
			{
				if(seats.get(i).getSeatNo().compareTo(seats.get(j).getSeatNo())>0)
				{
					Collections.swap(seats, i, j);
				}
					
			}
			
		}
		Iterator<Seats> itr= seats.iterator();
		System.out.println();
		while(itr.hasNext())
		{
			Seats seat = itr.next();
			//System.out.println(seats.indexOf(seat));
			if((seats.indexOf(seat)%(seatsPerRow))==0 && seats.indexOf(seat)!=0)
			{
				System.out.println();
			}
			
			String availability = (seat.isReserved()?"(NA) ":"(A) ");
			System.out.print(seat.getSeatNo()+availability);
			
			
		}
		
	}
	
	
	public void shuffle()
	{
		Collections.shuffle(seats);
		Iterator<Seats> itr= seats.iterator();
		System.out.println();
		while(itr.hasNext())
		{
			Seats seat = itr.next();
			//System.out.println(seats.indexOf(seat));
			if((seats.indexOf(seat)%(seatsPerRow))==0 && seats.indexOf(seat)!=0)
			{
				System.out.println();
			}
			
			String availability = (seat.isReserved()?"(NA) ":"(A) ");
			System.out.print(seat.getSeatNo()+availability);
			
			
		}
		
		
	
		
	}
	
	public void printSeats(int rows, int noOfSeats)
	{
		
		int Rows = 'A'+(rows-1);
		for(char row = 'A'; row<=Rows; row++)
		{
			System.out.println();
			for (int j=1; j<=noOfSeats;j++)
			{
				String seatNo = String.format(row+"%02d",j);
				Seats seat = searchSeat(seatNo);
				String availability = (seat.isReserved()? "(NA) ":"(A) ");
				System.out.print(seatNo+availability);
			}
		}
		
		
		
	}
	
	
	public Seats searchSeat(String seatNo)
	{
		
		int low =0;
		int high = this.seats.size()-1;
		while(low<=high)
		{
			int mid = (low+high)/2;
			Seats seat = seats.get(mid);
			int diff = seat.getSeatNo().compareTo(seatNo);
			if(diff==0)
			{
				return seat;
			}
			else if(diff>0){
				high=mid-1;
				
			}
			else {
				low=mid+1;
			}
		}
		return null;
		
	}
	
	
	public boolean reserveSeat(String seatNo)
	{
		
		
		return true;
	}
	
	public List<Seats> getSeats()
	{
		return new ArrayList<>(seats);
	}
	

}
