package Map_Adventure;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	private static Locations locations = new Locations();
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		FileWriter writer=null;
		try{
		
			
			 writer = new FileWriter("FileWriterExample.txt");//to write streams of character
			for(Location location: locations.values())
			{
				for(String exits:location.getExists().keySet())
				{
					writer.write(location.getLocationID()+","+exits+","+location.getExists().get(exits)+"\n");
				}
				
			}	
			
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(writer!=null){
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	
		
		
		
		
		
		
		int loc=1;
		while(true)
		{
			System.out.println(locations.get(loc).getDescription());
			if(loc=='Q') break;
			
			System.out.println("Available exits are: ");
			Map<String,Integer> exits = locations.get(loc).getExists();
			for(String s: exits.keySet())
			{
				System.out.printf(s+",");
			}
			
			String nextInput = scanner.nextLine();
			if(!exits.containsKey(nextInput))
			{
				System.out.println("the direction does not exists");
			}
			else
			{
				loc = exits.get(nextInput);
			}
			
			
			}	
		}
		
	}


