package PracticeExercies.Numbers.IO.IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream_2 {
	
	
	//The Java platform stores character values using Unicode conventions.
	//Character stream I/O automatically translates this internal format to and from the local character set.
	//In Western locales, the local character set is usually an 8-bit superset of ASCII.
	
	/*
	 A Unicode set is basically a type of character set where each character corresponds to a specific numeric value 
	 within the given character set. 
	 Typically, every programming language adopts a particular character set to represent and manage its use of characters. 
	 Apart from Unicode, another commonly used character set is ASCII, defined by the International Standard Organization (ISO).
	  At the inception of Java (version 1.0), it did not have character streams; 
	  therefore, all I/O operations were byte oriented.	  
	 */
	
	
	/*
	 the FileOutputStream is meant for reading a raw stream of bytes, such as image data.
	 Similarly, the FileOutputStream object may be used to write a raw byte stream. Under similar circumstances,
	 reading and writing files based on character-oriented stream of data FileReader and FileWriter may be used, 
	 respectively. These classes provide specific methods to manipulate appropriate stream data.
	 */
	
	
	/* there are many byte stream classes that ends with inputStream or OutputStream. 
	 Chracter stream ends with InputReader and OutputReadder  */
	
	
	public static void main(String args[])
	{
		
		
		
		/*	FileReader and Writer can accepts file or path as string as arguments
		 	when we declare the streams inside the try class like below it would automatically close the streams even 
		 	if there is an exception like finally does. but the streams has to implement closable interface */
		
		//Files are created if it does not exist for write
		try(FileWriter fw = new FileWriter("src\\PracticeFiles\\filewriter.txt");
		FileReader fr = new FileReader("src\\PracticeFiles\\filewriter.txt")){
			
			fw.write("Subhash is ");
			fw.close();
			int c;
			System.out.println();
			while((c=fr.read())!=-1)
			{
				System.out.print((char) c);
			}
			
			// FileReader fr1= new FileReader("notavailable.txt"); this will not create a file, as its a read opertaion
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
