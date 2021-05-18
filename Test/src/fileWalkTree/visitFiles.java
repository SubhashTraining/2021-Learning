package fileWalkTree;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;

public class visitFiles extends SimpleFileVisitor<Path>{
	
	private Path SourceRoot ;
	private Path TargetRoot;
	
	
	public visitFiles(Path sourceRoot, Path tagetRoot) {
		SourceRoot = sourceRoot;
		TargetRoot = tagetRoot;
	}


	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(dir.toAbsolutePath());
		Path realtivizedPath = SourceRoot.relativize(dir);
		System.out.println(realtivizedPath);
		Path resolvedPath = TargetRoot.resolve(realtivizedPath);
		System.out.println(resolvedPath.toAbsolutePath());
		try{
			
			Files.copy(dir,resolvedPath,StandardCopyOption.REPLACE_EXISTING );
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
			return FileVisitResult.SKIP_SUBTREE;
			
		
		}
		
		return FileVisitResult.CONTINUE;
		
		
	}


	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		// TODO Auto-generated method stub
		
		
		Path relativizedPath = SourceRoot.relativize(file);
		Path resolvedPath = TargetRoot.resolve(relativizedPath);
		System.out.println(relativizedPath);
		System.out.println(resolvedPath);
		
		
		try{
			
			Files.copy(file,resolvedPath,StandardCopyOption.REPLACE_EXISTING );
			
			
		}catch(IOException e)
		{
			return FileVisitResult.SKIP_SUBTREE;
		}
		
		return FileVisitResult.CONTINUE;
		
	}


	@Override
	public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Failed accessing File "+file.toAbsolutePath());
		System.out.println(exc.getMessage());
		return FileVisitResult.CONTINUE;
		
	}
	
	
	
	
	 
	
	
	
	
	

}
