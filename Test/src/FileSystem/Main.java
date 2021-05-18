package FileSystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

public static void main(String[] agrs){
	
	
	
	Path path = Paths.get("Files");
	Path path1 = FileSystems.getDefault().getPath(".","FileReader1.txt");
	
	//Files Class is used to check Exits, readble, executable and writable etc
	
	System.out.println(Files.exists(path1)); 
	System.out.println(Files.exists(Paths.get("Files")));
	System.out.println(path.toAbsolutePath());//Even though the files does not exists it still prints the path
	System.out.println(Files.isWritable(path1));
	System.out.println(Files.isReadable(path1));
	System.out.println(Files.isExecutable(path1));
	
}


}