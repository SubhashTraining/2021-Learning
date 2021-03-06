package PracticeExercies.Numbers.IO.IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class test1 {
	


	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		String sep = File.separator;
		File file = new File(System.getProperty("user.dir")+"\\src\\PracticeFiles\\input.txt");
		try(FileOutputStream fos = new FileOutputStream(file)){
			
			String string = "Subhash is a good boy \nSanjay is Subhash's Son";
			char[] charArray = string.toCharArray();
			for(char c:charArray)
			{
				fos.write(c);
			}						
		}
		
		StringBuilder sb = new StringBuilder();
		try(FileInputStream fis = new FileInputStream(file))
		{
			int c ;
			while((c=fis.read())!=-1)
			{
				sb.append((char)c);
			}			
		}	
		System.out.println(sb.toString());
		
		//******************No difference in InputStream and Buffered Input Stream in code*****
		// InputStream 8 bits of data
		sb = new StringBuilder();
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file)))
		{
			
			
			int c;
			while((c=bis.read())!=-1)
			{
				sb.append((char)c);
			}
			System.out.println("*********");
			System.out.println(sb.toString());
		}
		
		
		
		//***************** Reads Data in bits ***************
		sb = new StringBuilder();
		Path path = Paths.get(System.getProperty("user.dir")+"\\src\\PracticeFiles\\input.txt");
		try(InputStream fis = Files.newInputStream(path))
		{
			
			int c;
			while((c=fis.read())!=-1)
			{
				sb.append((char)c);
			}
			System.out.println("*********");
			System.out.println(sb.toString());
			
		}
		
		
		//*********Scanner****************
		sb = new StringBuilder();
		try(FileInputStream fis = new FileInputStream(file);Scanner in = new Scanner(fis)){
			
			
			while(in.hasNextLine())
			{
				sb.append(in.nextLine());
				sb.append("\n");
			}
			
			System.out.println("__________________________________________");
			System.out.println(sb.toString());
		}
		
		
		
	}

}



