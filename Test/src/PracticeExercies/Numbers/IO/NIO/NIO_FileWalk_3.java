package PracticeExercies.Numbers.IO.NIO;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;

/*

 To walk a file tree, you first need to implement a FileVisitor.
 A FileVisitor specifies the required behavior at key points in the traversal process:
 when a file is visited, before a directory is accessed, after a directory is accessed, 
 or when a failure occurs. The interface has four methods that correspond to these situations:
 
 
preVisitDirectory – Invoked before a directory's entries are visited.

postVisitDirectory – Invoked after all the entries in a directory are visited. 
If any errors are encountered, the specific exception is passed to the method.

visitFile – Invoked on the file being visited. The file's BasicFileAttributes is passed to the method, 
or you can use the file attributes package to read a specific set of attributes. 
For example, you can choose to read the file's DosFileAttributeView to determine if the file has the "hidden" bit set.

visitFileFailed – Invoked when the file cannot be accessed. 
The specific exception is passed to the method. You can choose whether to throw the exception, 
print it to the console or a log file, and so on. 

If you don't need to implement all four of the FileVisitor methods, instead of implementing the FileVisitor interface, 
you can extend the SimpleFileVisitor class. This class, which implements the FileVisitor interface, 
visits all files in a tree and throws an IOError when an error is encountered. 
You can extend this class and override only the methods that you require.
 
 */


public class NIO_FileWalk_3 extends SimpleFileVisitor<Path> {
	
	private  Path SourceRoot = null;
	private  Path TargetRoot = null;
	
	
	public NIO_FileWalk_3(Path SourceRoot,Path TargetRoot)
	{
		this.SourceRoot=SourceRoot;
		this.TargetRoot=TargetRoot;
		
	}


	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)  {
		// TODO Auto-generated method stub'
		System.out.println(dir.toAbsolutePath());
		Path RelativizedPath = SourceRoot.relativize(dir);
		System.out.println(RelativizedPath.toAbsolutePath());
		Path ResolvedPath = TargetRoot.resolve(RelativizedPath);
		System.out.println(ResolvedPath.toAbsolutePath());
		
		try {
			Files.copy(dir,ResolvedPath,StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			return FileVisitResult.SKIP_SUBTREE;
		}
		
		
			try {
				Files.deleteIfExists(dir);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		return FileVisitResult.CONTINUE;
	}


	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		Path RelativizedPath = SourceRoot.relativize(file);
		Path ResolvedPath = TargetRoot.resolve(RelativizedPath);
	
		
		try {
			Files.copy(file,ResolvedPath,StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			return FileVisitResult.SKIP_SUBTREE;
		}
		
		Files.deleteIfExists(file);
				
		return FileVisitResult.CONTINUE;
	}


	@Override
	public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Error Accessing File"+file.toAbsolutePath());
		System.out.println(exc.getLocalizedMessage());
		
		
		
		return super.visitFileFailed(file, exc);
	}
	

}
