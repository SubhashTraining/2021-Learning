package InputOutput;


import java.util.HashMap;
import java.util.Map;

public class Location {

	private final Integer LocationID;
	private final String Description;
	private final Map<String,Integer> exists; 
	
	public Location(int LocationID, String Description)
	{
		this.LocationID= LocationID;
		this.Description=Description;
		this.exists= new HashMap<String,Integer>();
		this.exists.put("Q", 0);
	}

	public void addDirection(String Direction, int Location)
	{
		exists.put(Direction, Location);
	}
	

	
	
	public int getLocationID() {
		return LocationID;
	}

	public String getDescription() {
		return Description;
	}

	public Map<String, Integer> getExists() {
		return new HashMap<String,Integer>(exists);
	}
	
}
