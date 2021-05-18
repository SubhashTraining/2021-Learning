package PracticeExercies.Numbers.IO.NIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Comparator;
import java.util.function.Predicate;

import static java.nio.file.StandardCopyOption.*;
public class NIO_Files_2 {
	
	public static void main(String args[]) throws IOException
	{
		
		String sep = File.separator;
		Path f1 = Paths.get("src"+sep+"PracticeFiles"+sep+"pathExample1.txt");
		Path f2 = Paths.get("src"+sep+"PracticeFiles"+sep+"pathExample2.txt");
		Path d1 = Paths.get("src"+sep+"PracticeFiles"+sep+"NewDirectory");
		if(!Files.exists(f1)) {
			Files.createFile(f1);
		}
		
		if(!Files.exists(f2))
		{
			Files.createFile(f2);
		}
		
		if(!Files.exists(d1))
		{
			Files.createDirectory(d1);
		}
		//Files.createFile(f2);
		
		System.out.println(Files.exists(f1));
		System.out.println(Files.isWritable(f1));
		System.out.println(Files.isReadable(f1));
		System.out.println(Files.isExecutable(f1));
		System.out.println(Files.isSameFile(f1,f2));
		
		Files.delete(f1);
		Files.deleteIfExists(f1);
		Files.deleteIfExists(d1);
		
		
		if(!Files.exists(f1)) {
			Files.createFile(f1);
		}
		
		if(!Files.exists(f2))
		{
			Files.createFile(f2);
		}
		
		
		Files.copy(f1, f2, REPLACE_EXISTING);
		Files.copy(f1, f2,StandardCopyOption.REPLACE_EXISTING);
		//import static java.nio.file.StandardCopyOption.*; 
		//or use StandardCopyOption.REPLACE_EXISTING
		//need to import StandaryCopyOprion package for REPLACE_EXISTING to work
		
		Files.move(f1, f2, StandardCopyOption.REPLACE_EXISTING);
		//If you want to rename a file perform move opertion on the new Path
		//we are moving f1 to f2 , f2 already exists so replace f2 with f1 and delete f1
		
		if(!Files.exists(f1)) {
			Files.createFile(f1);
		}
		
		Path f3= Paths.get("src"+sep+"PracticeFiles"+sep+"pathExample3.txt");
		Files.move(f1, f3, StandardCopyOption.REPLACE_EXISTING);
		
		
		//Copy a directory with files to another destination
		//Moves all the files and directories in Folder 1 to 2\\1
		Path dir1 = Paths.get("C:\\Users\\778294\\workspace\\Test\\src\\PracticeFiles\\FileWalkTree\\CopyDir\\1");
		Path dir2 = Paths.get("C:\\Users\\778294\\workspace\\Test\\src\\PracticeFiles\\FileWalkTree\\CopyDir\\2\\1");
		
		
		boolean a=false;
		if(a)
		{
			Files.move(dir1,dir2, StandardCopyOption.REPLACE_EXISTING);	
		}
		
		Files.walk(dir2).filter(Files::isDirectory).forEach(i->{
			System.out.println(i.getFileName());});
		
		
		
		Files.walk(dir2).filter(new Predicate<Path>(){

			@Override
			public boolean test(Path t) {
				// TODO Auto-generated method stub
				return Files.isDirectory(t)==false;
			}
			
		}).forEach(i->{
			System.out.println(i.getFileName());
		});
		
		
	}
	

}
