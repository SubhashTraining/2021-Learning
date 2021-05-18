package PracticeExercies.Numbers.JSON.JSON2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.stream.JsonReader;
/*
 
 	Json Reader:
 	To create a recursive descent parser for your own JSON streams, first create an entry point method that creates a JsonReader.
	Next, create handler methods for each structure in your JSON text. You'll need a method for each object type and for each array type. 
  
  	When a nested object or array is encountered, delegate to the corresponding handler method.
  	
  	When an unknown name is encountered, strict parsers should fail with an exception. Lenient parsers should call skipValue() to recursively skip the value's nested tokens, which may otherwise conflict.

	If a value may be null, you should first check using peek(). Null literals can be consumed using either nextNull() or skipValue().
  
  	An InputStreamReader is a bridge from byte streams to character streams: It reads bytes and decodes them into characters using a 
  	specified charset. The charset that it uses may be specified by name or may be given explicitly, or the platform's default charset 
  	may be accepted.
	Each invocation of one of an InputStreamReader's read() methods may cause one or more bytes to be read from the underlying byte-input 
	stream. To enable the efficient conversion of bytes to characters, more bytes may be read ahead from the underlying stream than a
	re necessary to satisfy the current read operation.

	For top efficiency, consider wrapping an InputStreamReader within a BufferedReader. For example:

 	BufferedReader in
   	= new BufferedReader(new InputStreamReader(System.in));
 
 */
import com.google.gson.stream.JsonToken;



//Parse json using Streaming API
public class readJsonMain {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		
		String sep= File.separator;
		
		try(FileInputStream fis  = new FileInputStream("src"+sep+"PracticeExercies"+sep+"Numbers"+sep+"JSON"+sep+"JSON2"+sep+"json1.json");
		//FileInputStream read file date in bytes
		
		InputStreamReader isr = new InputStreamReader(fis);
		//InputStreamReader reads bytes and converts them into chracters from any stream
		
		//File Reader can only read character streams from file
		FileReader fr = new FileReader("src"+sep+"PracticeExercies"+sep+"Numbers"+sep+"JSON"+sep+"JSON2"+sep+"json1.json");
		
		JsonReader reader1 = new JsonReader(fr);
		JsonReader reader2 = new JsonReader(isr))
		{
			List<Employee> employee = parseEmployeeJson(reader2);
			
			System.out.println(Arrays.toString(employee.toArray()));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}
	
	public static List<Employee> parseEmployeeJson(JsonReader reader) throws IOException
	{
		List<Employee> employees = new ArrayList<>();
		
		//Our json is an array of objects so we will start with array and then we will use the reader to parse objects and so on
		reader.beginArray();
		while(reader.hasNext())
		{
			employees.add(readEmployeeObjects(reader));
		}
		reader.endArray();
		return employees;
		
	}
	
	public static Employee readEmployeeObjects(JsonReader reader) throws IOException
	{
		
		Employee employee=new Employee();
		
		reader.beginObject();
		while(reader.hasNext())
		{
			String name = reader.nextName();
			if(name.equals("empID"))
			{
				employee.setEmployeeId(reader.nextInt());
			}
			if(name.equals("name"))
			{
				employee.setName(reader.nextString());
			}
			if(name.equals("permanent"))
			{
				employee.setPermenant(reader.nextBoolean());
			}
			if(name.equals("address")&& reader.peek()!=JsonToken.NULL)
			{
				Address address = readAddress(reader);
				employee.setAddress(address);
			}
			if(name.equals("phoneNumbers") && reader.peek()!=JsonToken.NULL)
			{
				Long[] phoneNumber =  readPhoneNo(reader);
				employee.setPhoneNumbers(phoneNumber);
			}
			if(name.equals("role"))
			{
				employee.setRole(reader.nextString());
			}
			if(name.equals("cities") && reader.peek()!=JsonToken.NULL)
			{
				employee.setCities(readCities(reader));
			}
			if(name.equals("properties") && reader.peek()!=JsonToken.NULL)
			{
				
				employee.setProperties(readProperties(reader));
			}
			
		}
			
		reader.endObject();
		
		
		
		return employee;
	}
	
	public static Map<String,String> readProperties(JsonReader reader) throws IOException
	{
		Map<String,String> properties = new HashMap<>();
		
		reader.beginObject();
		while(reader.hasNext())
		{
			properties.put(reader.nextName(), reader.nextString());
			
		}
		
		reader.endObject();
		
		return properties;
		
	}
	
	
	
	
	public static List<String> readCities(JsonReader reader) throws IOException
	{
		
		List<String> cities = new ArrayList<>();
		reader.beginArray();
		while(reader.hasNext())
		{
			
			cities.add(reader.nextString());
		}
		
		reader.endArray();
		
		return cities;
	}
	
	
	public static Long[] readPhoneNo(JsonReader reader) throws IOException
	{
		
		List<Long> phoneNumbers= new ArrayList<>();
		
		reader.beginArray();
		while(reader.hasNext())
		{
			phoneNumbers.add((long) reader.nextInt());
			
			
		}
				
		reader.endArray();
		
		Long[] longArray = new Long[phoneNumbers.size()];
		
		
		return  phoneNumbers.toArray(longArray);
		
	}
	
	public static Address readAddress(JsonReader reader) throws IOException
	{
		Address address=new Address();
		reader.beginObject();
		while(reader.hasNext())
		{
			String name = reader.nextName();
			if(name.equals("street"))
			{
				address.setStreet(reader.nextString());
			}
			if(name.equals("city"))
			{
				address.setCity(reader.nextString());
			}
			if(name.equals("zipcode"))
			{
				address.setZipCode(reader.nextInt());
			}
		}
		
		reader.endObject();
		return address;
		
	}
	
}
