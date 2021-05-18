package Collections1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;



public class Theatre {
	
	private String theatreName;
	public List<Seats> seats= new ArrayList<>();;
	
	 public static final Comparator<Seats> PRICE_ORDER = new Comparator<Seats>(){
		
		@Override
		public int compare(Seats seat1, Seats seat2)
		{
			if(seat1.getPrice()>seat2.getPrice())
			{
				return 1;
			}
			else if (seat1.getPrice()<seat2.getPrice())
			{
				return -1;
			}
			else return 0;
		
			}
		
	};
	
	public Theatre(String theatreName,int noOfRows, int noOfSeats)
	{
		this.theatreName=theatreName;
		int rows = 'A'+(noOfRows-1);
		for(char row='A'; row <=rows;row++)
		{
			for(int seatNo=1;seatNo<=noOfSeats;seatNo++)
			{
				Seats seat = new Seats(row+String.format("%02d", seatNo),12.45+seatNo);
				this.seats.add(seat);
			}
		}
		
	}
	
	public String getTheatreName() {
		return theatreName;
	}

	
	
	
	public boolean isReservedSeat(String seatNo){
		
		Seats requestedSeat = null;
		
		for(Seats seat : this.seats)
		{
			if(seat.getSeatNo().equals(seatNo))
			{
				requestedSeat=seat;
				break;
					
			}
		}
		if(requestedSeat==null)
		{
			System.out.printf(" %n There is no such Seat %s ", seatNo);
			return false;
		}
		else
		{
			return requestedSeat.isOccupied();
		}
	}
	
	
	public List<Seats> getSeats()
	{
		
		return this.seats;
	}
	

	public class Seats implements Comparable<Seats>{
		
		private String seatNo;
		private Boolean occupied;
		private double price;
		
		public Seats(String seatNo, double price)
		{
			this.seatNo=seatNo;
			occupied=false;
			this.price=price;
		}
		
		public boolean setPrice(double price)
		{
			this.price= price;
			return true;
		}

		public String getSeatNo() {
			return seatNo;
		}

		@Override
		public int compareTo(Seats seat) {
			return this.seatNo.compareToIgnoreCase(seat.seatNo);
		}

		public Boolean isOccupied() {
			return occupied;
		}
		public double getPrice()
		{
			return this.price;
		}
		
		public boolean reserve()
		{
			if(!this.occupied)
			{
				this.occupied=true;
				System.out.println("Seat "+this.seatNo+ "is Reserved");
				return true;
			}
			else
			{
				return false;
			}
		}
		
		public boolean cancelReservation()
		{
			if(this.occupied)
			{
				this.occupied=false;
				System.out.println("Seat "+this.seatNo+ "is Cancelled");
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
	}
	
	
}
