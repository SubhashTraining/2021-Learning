package BirthdayReadWrite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ToDoData {
	
	private static ToDoData instance = new ToDoData();
	private static String fileName = "birthday.txt";
	private List<ToDoItems> todoItems ;
	private DateTimeFormatter dateFormatter ;
	
	
	public static ToDoData getInstance()
	{
		return instance;
	}
	
	private ToDoData(){
		
		dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		todoItems= new LinkedList<>();
	}
	
	public void setToDoItems(List<ToDoItems> items)
	{
		this.todoItems=items;
	}
	
	public void loadToDoItems() throws IOException
	{
		Path path = Paths.get("WriteToFile.txt"); // Paths and Path class note it
		
		BufferedReader br = Files.newBufferedReader(path);//File.newBufferedReader
		
		String input;
		try{
			while((input=br.readLine())!=null)
			{
				
				String[] itemPieces = input.split("\t");
				String shortDescription = itemPieces[0];
				String toDoAction = itemPieces[1];
				String birthDate = itemPieces[2];
				System.out.println(birthDate);
				LocalDate date= LocalDate.parse(itemPieces[2],dateFormatter);
				ToDoItems item = new ToDoItems(shortDescription,toDoAction,date);
				System.out.println(item.toString());
				//todoItems.add(item);
			}					
		}finally{
			if(br!=null)
			br.close();
		}
		
	}
	
	public void saveToDoItemsToFile()throws Exception
	{
		Path path = Paths.get("WriteToFile.txt");
		BufferedWriter bw = Files.newBufferedWriter(path);
		try{
			
			Iterator itr = todoItems.iterator();
			while(itr.hasNext())
			{
				ToDoItems item = (ToDoItems) itr.next();
				System.out.println(item.toString());
				String input= String.format("%s\t%s\t%s", item.getDescription(),item.getToDo(),item.getBirthdate());
				bw.write(input);
				bw.newLine();
			}
			
			
		}finally{
			if(bw!=null) bw.close();
		}
		
	}
	
	
	
	
}
