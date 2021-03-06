package Collections1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args)
	{
		
		Theatre Olympian = new Theatre("Olympia",6,7);
		List<Theatre.Seats> seatsCopy = new ArrayList<>(Olympian.getSeats());
		
		Collections.shuffle(seatsCopy);
		printSeats(seatsCopy);
		
		sortSeats(seatsCopy);//bubble sort
		printSeats(seatsCopy);
		Collections.shuffle(seatsCopy);
		Collections.sort(seatsCopy, Theatre.PRICE_ORDER);
		printSeats(seatsCopy);
		
	}
	
	public static void printSeats(List<Theatre.Seats> seats)
	{
		
		for(Theatre.Seats s : seats)
		{
			System.out.print(s.getSeatNo());
		
		}
		System.out.println();
		System.out.println("___________________________________________________");
	}
	
	public static void sortSeats(List<? extends Theatre.Seats> seats)
	{
		
		
		for(int i=0;i<seats.size()-1;i++)
		{
			for(int j=i+1;j<seats.size();j++)
			{
				if(seats.get(i).compareTo(seats.get(j)) >0)
				{
					Collections.swap(seats, i, j);
				}
				
			}
		}
		
		
		
	}

}
