package Serialization;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		
		
		String jsonString = new String(Files.readAllBytes(Paths.get("C:\\Subhash\\Java WorkSpace2\\Java Dummy WorkSpace For Practice\\testonly\\src\\Serialization\\JSON1.txt")));
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		Company company = gson.fromJson(jsonString,Company.class);
			
		
		Employee[] employees = company.getEmployee();
		for(Employee employee: employees)
		{
			System.out.println(employee.toString());
		}
		
		String jsonObject = gson.toJson(company);//String would be json Format Only
		System.out.println("***********************");
		System.out.println(jsonObject);
		
		//Serialization
		
		SerializationUtil.Serialize(employees,"C:\\Subhash\\Java WorkSpace2\\Java Dummy WorkSpace For Practice\\testonly\\src\\Serialization\\employee.ser");
		
		Employee[] employees1 = (Employee[]) SerializationUtil.deSerialize("C:\\Subhash\\Java WorkSpace2\\Java Dummy WorkSpace For Practice\\testonly\\src\\Serialization\\employee.ser");
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		

	}

}
