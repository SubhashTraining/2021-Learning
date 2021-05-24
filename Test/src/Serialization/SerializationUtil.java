package Serialization;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationUtil {
	
	
	
	public static void Serialize(Object[] object , String Path) throws FileNotFoundException
	{
		try(ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(Path)))){
			
			oos.writeObject(object);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Object deSerialize(String path) throws ClassNotFoundException
	{
		
		Object obj =null;
		try(ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(path)))){
			
			obj = ois.readObject();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return obj;
	}
	
	

}
