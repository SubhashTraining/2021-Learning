package com.docker.seleniumGrid.DockerGrid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class ProcessBuilderEg {
	
	
	public static void main (String[] args) throws InterruptedException
	{
		
		ProcessBuilder processBuilder = new ProcessBuilder("dockerup.bat");
		
		
		try {
			Process process = processBuilder.start();
			StringBuilder sb = new StringBuilder();
			
			Calendar futureTime = Calendar.getInstance();
			futureTime.add(Calendar.SECOND, 40);
			Calendar currentTime = Calendar.getInstance();
		
			
			boolean flag = true;
			while(currentTime.getTimeInMillis() < futureTime.getTimeInMillis())
			{
				
				try(BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream())))
				{
					
					System.out.println("_________________________________________________________");
					String line;
					while((line=br.readLine())!=null)
					{						
						if(line.contains("error") || line.contains("ERROR") || line.contains("Error"))
						{
							flag=false;
							break;	
						}
						else {
							System.out.println(line);
						}
					}
					
				}
				
				if(flag=false)
				{
					System.out.println("The docker compose failed to Load the server");
					break;
				}
				
				
			}
			
		
	}catch(Exception e) {e.printStackTrace();}

}
}
