package PracticeExercies.Numbers.Collections.List.List2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public static void main(String args[])
	{
		
		Theatre LUXE = new Theatre("LUXE-SCREEN1",4,4);
		System.out.println("");
		LUXE.shuffle();
		System.out.println("");
		//Collections.revers();
		LUXE.sortSeats();
		System.out.println("");
		List<Seats> luxeSeats = new ArrayList<>(LUXE.getSeats());
		Seats FirstSeat = Collections.min(luxeSeats);
		Seats LastSeat = Collections.max(luxeSeats);
		
		
	}
	

}
