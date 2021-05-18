package Map_Adventure;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Locations implements Map<Integer,Location>{
	
	
	private static Map<Integer,Location> locations = new HashMap<Integer,Location>();
	
	
	
	
	static{//cant add the below assignment in a class variable declaration area, 
		//should be in a method. But we need locations to be loaded once when the class is loaded , 
		//so we are putting it in a static block
		
		locations.put(0, new Location(0,"In Location 1"));
		locations.put(1, new Location(1,"In Location 2"));
		locations.put(2, new Location(2,"In Location 3"));
		locations.put(3, new Location(3,"In Location 4"));
		locations.put(4, new Location(4,"In Location 5"));
		locations.put(5, new Location(5,"In Location 6"));
				
		locations.get(1).addDirection("W",2);
		locations.get(1).addDirection("N",5);
		locations.get(1).addDirection("E",3);
		locations.get(1).addDirection("S",4);
		locations.get(2).addDirection("N",5);
		locations.get(3).addDirection("W",1);
		locations.get(4).addDirection("N",1);
		locations.get(4).addDirection("W",2);
		locations.get(5).addDirection("W",2);
		locations.get(5).addDirection("S",1);
		
		
	}
	
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return locations.size();
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
		locations.clear();
		
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
