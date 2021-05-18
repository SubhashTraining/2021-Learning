package PracticeExercies.Numbers.JSON.JSON2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonWriter;

/*
 	Writes a JSON (RFC 7159) encoded value to a stream, one token at a time. 
 	The stream includes both literal values (strings, numbers, booleans and nulls) as well as the begin and end delimiters of objects
 	and arrays.
 	
	Encoding JSON
	To encode your data as JSON, create a new JsonWriter. Each JSON document must contain one top-level array or object. 
	Call methods on the writer as you walk the structure's contents, nesting arrays and objects as necessary:
	To write arrays, first call beginArray(). Write each of the array's elements with the appropriate value(java.lang.String) methods
	or by nesting other arrays and objects. Finally close the array using endArray().
	To write objects, first call beginObject().
	Write each of the object's properties by alternating calls to name(java.lang.String) with the property's value. Write property values with the appropriate value(java.lang.String) method or by nesting other objects or arrays. Finally close the object using endObject().
 */


public class ObjectToJsonMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		 String sep = File.separator;
		 String FileData = new String(Files.readAllBytes(Paths.get("src"+sep+"PracticeExercies"+sep+"Numbers"+sep+"JSON"+sep+"JSON2"+sep+"json1.json")));
		 Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		 Employee[] employees = gson.fromJson(FileData,Employee[].class);
		
		
		try(FileOutputStream fos = new FileOutputStream("src"+sep+"PracticeExercies"+sep+"Numbers"+sep+"JSON"+sep+"JSON2"+sep+"json2.json");
			OutputStreamWriter osw = new OutputStreamWriter(fos);JsonWriter writer = new JsonWriter(osw))
		{
			writer.setIndent("  ");
			writeEmployeesArray(writer,employees);
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
	}
	public static void writeEmployeesArray(JsonWriter writer, Employee[] employees) throws IOException
	{
		
		writer.beginArray();
		
		for(Employee employee:employees)
		{
			writeEmployee(writer,employee);
		}
		
		
		writer.endArray();
		
		
	}
	
	
	public static void writeEmployee(JsonWriter writer,Employee employee) throws IOException
	{
		
		writer.beginObject();
		writer.name("empID").value(employee.getEmployeeId());
		writer.name("name").value(employee.getName());
		writer.name("permanent").value(employee.isPermenant());
		if(employee.getAddress()!=null)
		{
			writer.name("address");
			writeEmployeeAddress(writer,employee.getAddress());
		}
		else{
			writer.name("address").nullValue();// Null Value
		}
		
		
		if(employee.getPhoneNumbers()!=null)
		{
			writer.name("PhoneNumbers");
			writeEmployeePhoneNo(writer,employee.getPhoneNumbers());
		}
		else{
			writer.name("PhoneNumbers").nullValue();
		}
		
		writer.name("role").value(employee.getRole());
		if(employee.getCities()!=null)
		{
			writer.name("cities");
			writeEmployeeCities(writer,employee.getCities());
		}
		else
		{
			writer.name("cities").nullValue();
		}
		
		if(employee.getProperties()!=null)
		{
			writer.name("Propeties");
			writerEmployeeProperties(writer,employee.getProperties());
		}
		else
		{
			writer.name("Propeties").nullValue();
		}
		
		
		
		writer.endObject();
	}
	
	public static void writerEmployeeProperties(JsonWriter writer, Map<String,String> properties) throws IOException
	{
		
		writer.beginObject();
		
		for(Map.Entry<String,String> entry:properties.entrySet())
		{
			writer.name(entry.getKey()).value(entry.getValue());
			
		}
		
		writer.endObject();
		
		
	}
	
	
	
	public static void writeEmployeeCities(JsonWriter writer, List<String> cities) throws IOException
	{
		writer.beginArray();
		
		for(String city:cities)
		{
			writer.value(city);
		}
		
		writer.endArray();
		
	}
	
	public static void writeEmployeePhoneNo(JsonWriter writer, Long[] phoneNumbers) throws IOException
	{
		
		writer.beginArray();
		
		for(Long phone: phoneNumbers)
		{
			writer.value(phone);
		}
		writer.endArray();
		
		
		
	}
	

	public static void writeEmployeeAddress(JsonWriter writer,Address address) throws IOException
	{
		
		
		writer.beginObject();
		
		writer.name("street").value(address.getStreet());
		writer.name("city").value(address.getCity());
		writer.name("zipcode").value(address.getZipCode());
		writer.endObject();
		
		
	}
		
}
	