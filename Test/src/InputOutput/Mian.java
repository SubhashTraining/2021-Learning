package InputOutput;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;



public class Mian {

	private static Locations location = Locations.getInstance();
	
	private static Map<String,Location> locations = new HashMap<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Example for FileWriter
		
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

		
		
		//Example for File Reader
		Scanner scanner1=null;
		
		try{
			scanner1 = new Scanner(new FileReader("locations.txt"));//use file created by FileWriter example above
			scanner1.useDelimiter(",");
			while(scanner1.hasNextLine())
			{
				System.out.println(scanner.nextLine());
				String location = scanner1.next();
				scanner1.skip(scanner1.delimiter());
				String Location1D = scanner1.nextLine();
				String[] temp = Location1D.split(" ");
				int id=Integer.parseInt(temp[1]);
				System.out.println(location +" "+Location1D+" " +id );
				
			}
			
				
		}catch(IOException e){e.printStackTrace();}
		finally{
			if(scanner1!=null) scanner1.close();
		}
		
		
		//Example for BufferedReader
		Scanner scanner2 =null;
		try{
			scanner2 = new Scanner(new BufferedReader(new FileReader("locations.txt")));//Passing fileReader to BufferedReader const and BufferedReader to Scanners Const
			scanner2.useDelimiter(",");
			System.out.println("Buffered Reader Example");
			while(scanner2.hasNextLine())
			{
				String location = scanner2.next();
				scanner2.skip(scanner2.delimiter());
				String LocationNo = scanner2.nextLine();
				String[] temp = LocationNo.split(" ");
				int no = Integer.parseInt(temp[1]);
				System.out.println(location +" "+LocationNo+" " +no );

			}
		
		}catch(IOException e){e.printStackTrace();}
		finally{if(scanner2 !=null) scanner2.close();}
		
	
	
	
	//Example for Buffered Writer with try Resources
	try(BufferedWriter bw1 = new BufferedWriter(new FileWriter("BufferedWriter.txt"));
		 BufferedWriter bw2 = new BufferedWriter(new FileWriter("BufferedWriter2.txt"))){
		
		 bw1.write("Sajays Bithday is on Feb");
		 bw2.write("Suganys's birthday is on April");
						
	}catch(IOException e){e.printStackTrace();}
	
	DataOutputStream localfile =null;
	try {
		localfile = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("DataOutputStream.dat")));
		localfile.writeInt(1);
		localfile.writeUTF("First text");
		
	
	
	
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	catch(IOException y){y.printStackTrace();}
	finally{if (localfile!=null)
		try {
			localfile.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
	
	

	//Example for Buffered Writer. Data is taken from the buffer if the buffer is 
		Map<Integer,Location> temp = location.getLocations();
		for(Location location :temp.values())
		{
			System.out.println(location.getDescription());
		}
		
		try(DataOutputStream locFile = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("DataOutputStream2.dat")))){
		for(Location location :temp.values())
		{
			locFile.writeInt(location.getLocationID()); 
			locFile.writeUTF(location.getDescription());
			locFile.writeInt(location.getExists().size()); 
			for(String key : location.getExists().keySet())
			{
				locFile.writeUTF(key);
				locFile.writeInt(location.getExists().get(key));
			}
				
		}
		}catch(IOException e){e.printStackTrace();}
			
		System.out.println("_____________________________________________");	
		Locations newLocations = Locations.getInstance();
		try(DataInputStream inputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("DataOutputStream2.dat"))))
		{
			
			boolean EOF= false;
			while(!EOF)
			{
				try{	
				Map<String,Integer> tempExits = new LinkedHashMap<>();	// Linked hash maps as exits needs to be stored in order
				int LocationID = inputStream.readInt();
				String Description = inputStream.readUTF();
				int exitExists=  inputStream.readInt();
				Location location = new Location(LocationID,Description);
				System.out.println("********************************");
				System.out.println(LocationID+" "+Description);
				for(int i=0;i<exitExists;i++)
				{
					
					String Direction =inputStream.readUTF(); 
					int Id=inputStream.readInt();
					location.addDirection(Direction, Id);
					System.out.println(Direction+" "+Id);
					System.out.println("*************************************");
					
				}
				
				newLocations.put(LocationID, location);
			
				
				
				}catch(EOFException e){
				EOF=true;
				}
			}
			
			
			
		}catch(IOException e){e.printStackTrace();}
		for(Location location: newLocations.values()){
			System.out.println(location.getLocationID()+" "+location.getDescription());
			for(String key: location.getExists().keySet())
			{
				System.out.println(key+" "+location.getExists().get(key));
			}
		}
	
}
}









