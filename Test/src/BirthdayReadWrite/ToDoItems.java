package BirthdayReadWrite;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ToDoItems {
	
	private String Description;
	private String ToDo;
	private String birthdate;
	public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-YYYY");
	
	public ToDoItems(String Description, String ToDo, LocalDate birthDate)
	{
		this.Description = Description;
		this.ToDo= ToDo;
		this.birthdate= birthDate.format(dtf);
		
	}

	public void setDescription(String description) {
		Description = description;
	}

	public void setToDo(String toDo) {
		ToDo = toDo;
	}

	public String getDescription() {
		return Description;
	}

	public String getToDo() {
		return ToDo;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate.format(dtf);
	}
	
	
	@Override
	public String toString()
	{
		return this.Description+" "+this.ToDo+" "+this.birthdate;
	}
	

}
