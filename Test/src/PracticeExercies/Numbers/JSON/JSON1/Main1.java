package PracticeExercies.Numbers.JSON.JSON1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main1 {
	
	
	public static void main(String args[]) throws IOException
	{
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		String sep = File.separator;
		
		String jsontoString = new String(Files.readAllBytes(Paths.get("src"+sep+"PracticeExercies"+sep+"Numbers"+sep+"JSON"+sep+"JSON1"+sep+"json2.json")));
		
		Company company = gson.fromJson(jsontoString, Company.class);
		
		//Employee[] employees =gson.fromJson(jsontoString, Employee[].class);
		//note that the class is also written as Employee[].class
		Employee[] employees = company.getEmployee();
		System.out.println(Arrays.toString(employees));
		
	}

}
