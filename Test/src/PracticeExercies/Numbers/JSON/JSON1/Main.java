package PracticeExercies.Numbers.JSON.JSON1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Employee emp = createEmployee();
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		String sep = File.separator;
		
		String jsontoString = new String(Files.readAllBytes(Paths.get("src"+sep+"PracticeExercies"+sep+"Numbers"+sep+"JSON"+sep+"JSON1"+sep+"json1.json")));
		
		//create an object from json
		Employee emp1 = gson.fromJson(jsontoString,Employee.class);
		System.out.println(emp1);
		System.out.println("************************");
		//create json from object
		String employeeJson = gson.toJson(emp);
		System.out.println(employeeJson.toString());
		

	}
	
	public static Employee createEmployee()
	{
		
		Employee emp = new Employee(10723213,"Subhash",true,"Team Lead");
		
		Address address= new Address("Bajanai Koil St","Cudallore",123456);
		emp.setAddress(address);
		
		emp.setPhoneNumbers(new Long[]{ 12345698755L,124785963L,(long) 1457896365L});
		
		List<String> cities = new ArrayList<>();
		cities.add("Chennai");
		cities.add("Cudallore");
		emp.setCities(cities);
		
		Map<String,String> properties = new HashMap<>();
		properties.put("age","28 years");
		properties.put("Salary", "1000 Rs");
		emp.setProperties(properties);
		
		return emp;
		
		
	}

}
