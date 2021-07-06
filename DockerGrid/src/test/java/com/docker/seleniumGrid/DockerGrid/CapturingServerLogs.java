package com.docker.seleniumGrid.DockerGrid;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Calendar;

import org.testng.annotations.BeforeSuite;

public class CapturingServerLogs {
	
	
	public static void main(String agrs[]) throws FileNotFoundException, IOException, InterruptedException
	{
		
	
	
		
		File f= new File("output.txt");
		if(f.exists())f.delete();
		
		Runtime runtime = Runtime.getRuntime();
		runtime.exec("cmd /c start dockerup.bat");
		
		Thread.sleep(40000);
		
		boolean dockerServerFlag= true;
		try(BufferedReader br = new BufferedReader(new FileReader("output.txt")))
		{
			String line;
			while((line=br.readLine())!=null)
			{
				if(line.contains("error") || line.contains("ERROR") || line.contains("Error"))
				{
					throw new FrameWorkException("Error Loading the Docker Server");
					
				}
			}
		}
		
	
		System.out.println("Docker Server is up and Running");
		File stopServer = new File("StopServer.txt");
		if (stopServer.exists()) stopServer.delete();
		
		Calendar futureTime = Calendar.getInstance();
		futureTime.add(Calendar.SECOND,20);
		Calendar currentTime = Calendar.getInstance();
		runtime = Runtime.getRuntime();
		runtime.exec("cmd /c start dockerdown.bat");
		Thread.sleep(3000);
		while(Calendar.getInstance().getTimeInMillis()<= futureTime.getTimeInMillis())
		{
			
			try(BufferedReader reader = new BufferedReader(new FileReader("StopServer.txt")))
			{
				System.out.println(reader.readLine());
				
			}
			
			
		}
				
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
