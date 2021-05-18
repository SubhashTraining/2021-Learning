package BirthdayReadWrite;

import java.time.LocalDate;
import java.time.Month;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Initialize {
	private List<ToDoItems> toDoList = new LinkedList<>();
	
	
	public Initialize()
	{
		toDoList.add(new ToDoItems("Sanjay's Birthday","Wish Him Happy Birthday",LocalDate.of(2017,02,01)));
		toDoList.add(new ToDoItems("Subhash's Birthday","Wish Him Happy Birthday",LocalDate.of(1991,Month.APRIL,15)));
		toDoList.add(new ToDoItems("Suganya's Birthday","Wish Him Happy Birthday",LocalDate.of(1987,06,10)));
	}

	
	public List<ToDoItems> getList()
	{
		return Collections.unmodifiableList(toDoList);
	}
}
