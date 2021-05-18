package InputOutput2;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args)
	{
		
		
		
		
		
		
		

		try(Scanner in= new Scanner(new FileReader("FileReader1.txt")))
		{
			in.useDelimiter(" ");
			while(in.hasNextLine()){
			System.out.println(in.next());
			System.out.println(in.next());
			System.out.println(in.nextLine());
		}
			
		}catch(IOException e){
		 e.printStackTrace();	
		}
		
	
		
		
		
		
		
	}
	
	

}
