package InputOutput;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Locations implements Map<Integer,Location>{
	
	private static Map<Integer,Location> locations; 
	private static Locations location = new Locations();
	
	
	private Locations()
	{
		locations = new HashMap<>();
	}
	
	
	public static Locations getInstance()
	{
		return location;
	}
	
	static{
		
		locations.put(1, new Location(1,"Perumal Koil"));
		locations.put(2, new Location(2,"Kandigai"));
		locations.put(3, new Location(3,"Vandalore Zoo"));
		locations.put(4, new Location(2,"ByePass Road"));
	
		
		locations.get(1).addDirection("North", 2);
		locations.get(2).addDirection("North", 3);
		
		locations.get(2).addDirection("East",1 );
		locations.get(3).addDirection("West", 4);
		locations.get(3).addDirection("South", 2);
		locations.get(4).addDirection("West",2);
		locations.get(4).addDirection("South", 3);
		
		
	}
	
	public Map<Integer,Location> getLocations()
	{
		return this.locations;
	}


	@Override
	public int size() {
		// TODO Auto-generated method stub
		return location.size();
	}


	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return locations.isEmpty();
	}


	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return locations.containsKey(key);
	}


	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return locations.containsValue(value);
	}


	@Override
	public Location get(Object key) {
		// TODO Auto-generated method stub
		return locations.get(key);
	}


	@Override
	public Location put(Integer key, Location value) {
		// TODO Auto-generated method stub
		return locations.put(key, value);
	}


	@Override
	public Location remove(Object key) {
		// TODO Auto-generated method stub
		return locations.remove(key);
	}


	@Override
	public void putAll(Map<? extends Integer, ? extends Location> m) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Set<Integer> keySet() {
		// TODO Auto-generated method stub
		return locations.keySet();
	}


	@Override
	public Collection<Location> values() {
		// TODO Auto-generated method stub
		return locations.values();
	}


	@Override
	public Set<java.util.Map.Entry<Integer, Location>> entrySet() {
		// TODO Auto-generated method stub
		return locations.entrySet();
	}

	
	
}
