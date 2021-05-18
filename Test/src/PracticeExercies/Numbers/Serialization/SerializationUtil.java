package PracticeExercies.Numbers.Serialization;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationUtil {


	
	public static void serialize(Object obj, String fileName) 
	{
		
		try(BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(fileName));
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			oos.writeObject(obj);
					
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static Object deSerialize(String fileName)
	{
		
		Object obj = null;
		try(BufferedInputStream fis = new BufferedInputStream(new FileInputStream(fileName));
				ObjectInputStream ois = new ObjectInputStream(fis))
		{
					
					 obj= ois.readObject();
					
					
					
				
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		return obj;
	}
	
	

}
