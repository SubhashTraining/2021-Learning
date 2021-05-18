package fileWalkTree;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Path SourceFile = FileSystems.getDefault().getPath("fileWalkTree\\Dir2");
		System.out.println(SourceFile.toAbsolutePath());
		
		Path SourceRoot = FileSystems.getDefault().getPath("fileWalkTree");
		
		Path TargetRoot = FileSystems.getDefault().getPath("fileWalkTree"+"\\"+"Dir4");
		System.out.println(TargetRoot.toAbsolutePath());
		try{
			
			Files.walkFileTree(SourceFile, new visitFiles(SourceRoot,TargetRoot));
			
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
		
		//Delete files added to Directory 4

	}

}
