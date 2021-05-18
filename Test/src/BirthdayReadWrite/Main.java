package BirthdayReadWrite;

import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Initialize initialize = new Initialize();
		List<ToDoItems> tasks = initialize.getList();
		ToDoData data = ToDoData.getInstance();
		data.setToDoItems(tasks);
		data.saveToDoItemsToFile();
		data.loadToDoItems();

	}

}
