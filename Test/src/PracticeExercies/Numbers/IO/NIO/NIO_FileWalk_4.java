package PracticeExercies.Numbers.IO.NIO;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Comparator;

public class NIO_FileWalk_4 {
	
	
	public static void main(String args[])
	{
		
		Path soureRoot = Paths.get("C:\\Users\\778294\\workspace\\Test\\src\\PracticeFiles\\FileWalkTree\\");
		Path TragetRoot = Paths.get("C:\\Users\\778294\\workspace\\Test\\src\\PracticeFiles\\FileWalkTree\\Dir4");
		Path traverseFrom = Paths.get("C:\\Users\\778294\\workspace\\Test\\src\\PracticeFiles\\FileWalkTree\\Dir2");
		
		int i=0;
		if(i==1)
		
		{
		
		try {
			Files.walkFileTree(traverseFrom, new NIO_FileWalk_3(soureRoot,TragetRoot));
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		
		try {
			Files.walkFileTree(traverseFrom, new SimpleFileVisitor<Path>(){

				@Override
				public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
					// TODO Auto-generated method stub
					Files.walk(dir)
					.sorted(Comparator.reverseOrder())
					.forEach(path -> {
						try {
							Files.delete(path);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					});
					
					
					
					return FileVisitResult.CONTINUE;
				}

							
				
				
			});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
