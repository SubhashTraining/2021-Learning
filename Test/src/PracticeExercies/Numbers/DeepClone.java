package PracticeExercies.Numbers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DeepClone implements Cloneable {
	
	private String Name;
	LocalDate date = LocalDate.now().plusDays(21);
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		DeepClone clonedObject = (DeepClone) super.clone();
		clonedObject.date=date;
		clonedObject.dtf=dtf;
		return clonedObject;
	}
	
	/*
	 	LocalDate date = LocalDate.now();
  		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
  		String text = date.format(formatter);
  		LocalDate parsedDate = LocalDate.parse(text, formatter);
	 */
	

}
