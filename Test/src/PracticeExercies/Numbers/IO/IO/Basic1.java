package PracticeExercies.Numbers.IO.IO;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Basic1 {
	
	public static void main(String args[]) throws IOException
	{
		//Java NIO
		Path path = Paths.get("");
		
		
		//Reader takes chracter Stream
		Reader reader = new FileReader("");
		FileReader reader1 = new FileReader("");
		Reader reader2 = new BufferedReader(reader1);
		Reader reader3 = Files.newBufferedReader(path);//nio so wll give path
		BufferedReader reader4 = Files.newBufferedReader(path);
		
		
		
		File file = new File("");
		InputStream is = new FileInputStream("");
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(""));
		BufferedInputStream bis1 = new BufferedInputStream(new FileInputStream(file));
	
		int input;
		
		
		//Reader reads character stream and can pick only one character at a time and the characters are read as integer and to be convered as char
		while((input = reader.read()) !=-1)//if there are no char left returns -1
		{
			char c=(char)input;
			
		}
		
		
		while((input= reader2.read())!=-1)
		{
			
		}
		
		String line="";
		while((line=reader4.readLine())!=null)
		{
			
		}
		
		
		Scanner in = new Scanner(reader1);
		
		while(in.hasNextLine())
		{
			
		}
		
		
		BufferedWriter writer = Files.newBufferedWriter(path);
		//String input= String.format("%s\t%s\t%s", item.getDescription(),item.getToDo(),item.getBirthdate());
		writer.write("");
		writer.newLine();
		
		
	}

}
