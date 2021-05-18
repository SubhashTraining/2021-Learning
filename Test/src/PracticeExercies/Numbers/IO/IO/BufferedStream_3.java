package PracticeExercies.Numbers.IO.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStream_3 {
	
	/*
	 	Most of the examples we've seen so far use unbuffered I/O. 
	 	This means each read or write request is handled directly by the underlying OS.
	  	This can make a program much less efficient, since each such request often triggers disk access, 
	  	network activity, or some other operation that is relatively expensive.
	
	  	To reduce this kind of overhead, the Java platform implements buffered I/O streams. 
	  	Buffered input streams read data from a memory area known as a buffer; 
	  	the native input API is called only when the buffer is empty. Similarly, buffered output streams write data to a buffer, and the native output API is called only when the buffer is full.

		A program can convert an unbuffered stream into a buffered stream using 
		the wrapping idiom we've used several times now, where the unbuffered stream object is passed 
		to the constructor for a buffered stream class. 
		 
	 */
	
	
	
	public static void main(String args[]) 
	{
		
		try(
				BufferedWriter bw = new BufferedWriter(new FileWriter("src\\PracticeFiles\\bufferdfilewriter.txt"));
				BufferedReader br = new BufferedReader(new FileReader("src\\PracticeFiles\\bufferdfilewriter.txt"))){
			
			bw.write("Subhash is");
			bw.newLine();
			bw.write("sanjay is");
			bw.close();	
			int ch;
			while((ch=br.read())!=-1)
			{
				System.out.print((char)ch);// the newline is also printed in a new line
				/*
				  Subhash is
				  sanjay is
				 
				 */
				
			}
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	

}
