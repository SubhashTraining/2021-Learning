package PracticeExercies.Numbers.IO.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScannerOnStream_4 {
	
	
	//We will use scanner to read the file as we read inputs from console
	
	public static void main(String[] args)
	{
		
		try(BufferedWriter writer = new BufferedWriter(new FileWriter("src\\PracticeFiles\\ScannerBufferFileReader.txt"));
			Scanner in = new Scanner(new BufferedReader(new FileReader("src\\PracticeFiles\\ScannerBufferFileReader.txt")))){
			
			writer.write("Subhash Perumalsamy is");
			writer.newLine();
			writer.write("Sanjay Subhash is");
			writer.newLine();
			writer.write("Suganya Nagaraj is");
			writer.close();
			
			
			
			//in.useDelimiter(" ");
			
			
			while(in.hasNextLine())//check if there is another line
			{
			
				
				String firstWord = in.next();
				//in.skip(in.delimiter());
			
				String secondWord = in.next();
				System.out.println(firstWord+":"+secondWord);
				//in.next() will pick the next word , whereas nextLine will take the whole
				//when us specifiy a delim
				in.nextLine();
				 
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	

}
