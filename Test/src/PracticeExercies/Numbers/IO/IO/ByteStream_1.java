package PracticeExercies.Numbers.IO.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream_1 {
	
	
	public static void main(String args[]) throws IOException
	{
		
		// Programs use byte strams to read and write 8bit bytes.
		//All byte stream classes are descended from InputStream and OutputStream.
		//I/O - Byte Stream - FileInputStream and FileOutputStream.
		//Other kinds of byte streams are used in much the same way; they differ mainly in the way they are constructed.
		
		
		//public abstract class InputStream- This abstract class is the superclass of all classes representing an input stream of bytes.
		// A FileInputStream obtains input bytes from a file in a file system. What files are available depends on the host environment.
		// FileInputStream is meant for reading streams of raw bytes such as image data. For reading streams of characters, consider using FileReader.
		
		
		//Byte stream performs IO on 8bit Bytes . Character stream 16bit unicodes (Java char are 2 bytes unicodes)
		
		File file = new File(System.getProperty("user.dir")+"\\src\\PracticeFiles\\input.txt");//File does not create a file
		if(!file.exists())
		{
			file.createNewFile();
		}	
		
		FileInputStream in = null; //
		FileOutputStream out = null;
		
		
		try {
			// FIS contructors can take a file as argument or the path to the file. if the file does not exist throw exception
			in = new FileInputStream(file); 
			out = new FileOutputStream(System.getProperty("user.dir")+"\\src\\PracticeFiles\\output.txt");
			
			int character;
				// read method returns -1 if its an end of file. Character is convered to int 
				// and when its written converted back to character
				while((character=in.read())!=-1) 
				{
					out.write(character);
							
				}
					
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(in!=null) in.close();
			if(out!=null) out.close();
		}
			
	}
	}
