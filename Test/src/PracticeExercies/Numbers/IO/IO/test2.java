package PracticeExercies.Numbers.IO.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;

public class test2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		File file = new File(System.getProperty("user.dir")+"\\src\\PracticeFiles\\input.txt");
		
		// do not use \\n use \n only
		String s = "Suganya is Sanjay's Mother \nSubhash is Suganya's Husband";
		try(Writer writer = new FileWriter(file))
		{
			writer.write(s);
		}
		
		
		try(Reader reader = new FileReader(file))
		{	String newString="";
			int c;
			while((c=reader.read())!=-1)
			{
				newString=newString+(char)c;
			}
			System.out.println(newString);
		}
		
		
		
		s="";
		try(BufferedReader reader = new BufferedReader(new FileReader(file))){
			
			String line;
			while((line=reader.readLine())!=null)
			{
			 s=s+line;
			 s=s+"\n";
			}
			System.out.println(s);
			
		}
		
		
		s="";
		try(BufferedReader br= Files.newBufferedReader(Paths.get(System.getProperty("user.dir")+"\\src\\PracticeFiles\\input.txt"))){
			
			String line;
			while((line=br.readLine())!=null)
			{
			 s=s+line;
			 s=s+"\n";
			}
			System.out.println(s);
			
			
		}
		
		
		try(Writer writer= new FileWriter(file))
		{
			s ="Good \ngood";
			writer.write(s);
			
		}
		
		
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(file)))
		{
			writer.write("Subhash is goooge and bad");
			writer.newLine();
		}
		
		//same way Files.newBufferedWriter(Paths.get("")
		

	}

}
