package RestAssured.Project1;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class Rest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//RestAssured.baseURI = "https://reqres.in";
		//RestAssured.useRelaxedHTTPSValidation();
		
		Response response = RestAssured.given().get("https://reqres.in/api/users?page=2");
		String jsonResponse=response.getBody().asPrettyString();
		System.out.println(jsonResponse);
		
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		Book book = gson.fromJson(jsonResponse, Book.class);
		//System.out.println("*****************************");
		//System.out.println(book.toString());
		
		
		
		String sep = File.separator;
		String FilePath ="C:"+sep+"Users"+sep+"778294"+sep+"workspace"+sep+"RestAssured"+sep+"src"+sep+"RestAssured"+sep+"Project1"+sep+"Object.ser";
		
		
		
		
		//Serialize this object. To enable serialization all the Poja classes and Composition classes should implement Serializable interface 
		SerializeJsonResonse(book,FilePath);
		
		Book newBook = (Book)deSerializeObject(FilePath);
		System.out.println("___________________________________");
		//Check this code//We are converting newBook object to Json
		System.out.println(gson.toJson(newBook));
		
		try(
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:"+sep+"Users"+sep+"778294"+sep+"workspace"+sep+"RestAssured"+sep+"src"+sep+"RestAssured"+sep+"Project1"+sep+"Output.json")))
		{
			
			bw.write(gson.toJson(newBook));
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void SerializeJsonResonse(Object object, String FilePath)
	{
		
		
		
		try(BufferedOutputStream bis = new BufferedOutputStream(new FileOutputStream(FilePath));
			ObjectOutputStream oos = new ObjectOutputStream(bis))
		{
			oos.reset();
			oos.writeObject(object);
								
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public static Object deSerializeObject(String FilePath)
	{
		Object obj=null;
		
		try(ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(FilePath))))
		{
			
			try {
				obj = ois.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return obj;
		
	}

}
