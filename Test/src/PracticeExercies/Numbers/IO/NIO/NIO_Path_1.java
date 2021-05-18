package PracticeExercies.Numbers.IO.NIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIO_Path_1 {
	
	public static void main(String args[]) throws IOException
	{
		
		  /*
		   	The java.nio.file package and its related package, java.nio.file.attribute, 
		   	provide comprehensive support for file I/O and for accessing the default file system. 
		   	Though the API has many classes, you need to focus on only a few entry points. 
		   	You will see that this API is very intuitive and easy to use.
		   */
		
		
		Path p1 = Paths.get("src\\PracticeFiles\\pathExample.txt");
		//return FileSystems.getDefault().getPath(first, more); 
		
		//The Paths.get method is shorthand for the following code:
		Path p3 = FileSystems.getDefault().getPath("/users/sally");
		
		String sep = File.separator;
		
		Path p2= Paths.get("src"+sep+"PracticeFiles"+sep+"pathExample.txt");
		System.out.println(p2.toAbsolutePath());//C:\Users\778294\workspace\Test\src\PracticeFiles\pathExample.txt
		
		
		System.out.println(p2.getFileName());//pathExample.txt
		System.out.println(p2.toAbsolutePath().getRoot());//C:\
		System.out.println(p2.getFileSystem().toString());//sun.nio.fs.WindowsFileSystem@15db9742
		System.out.println(p2.getParent());//src\PracticeFiles
		System.out.println(p2.getName(0));//PracticeFiles
		
		//only when you use the toAbsolute path method you would get the defaults else
		//you would get the info on the relative path only
		
		
		Path p4 = Paths.get("src");
		System.out.println(p4.toAbsolutePath());//  C:\Users\778294\workspace\Test\src
		//Uri converting a path to URI . URI can be use to open the file in browser
		System.out.println(p4.toUri());//file:///C:/Users/778294/workspace/Test/
		System.out.println(p4.toRealPath());//the real path  - C:\Users\778294\workspace\Test\src
	}

}
