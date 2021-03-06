package PracticeExercies.Numbers.Collections.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class map1 {
	
	public static void main(String args[])
	{
		
		Map<String,String> Favbooks= new HashMap<>();
		
		Map<String,String> book1 = new LinkedHashMap<>();
		//Linked HashMap inherits hashmap class and its methods, maintains the order of the elements
		//public class LinkedHashMap<K,v> extends HashMap implements Map<K,V>
		//1 null key and multiple null values possible
		//Maintains inserton order
		//HashMap requires low memory than doubly linked list which maintains the order
		//Stores elements in the bucket. Elements with the same hash codes should fall under the same bucket. 
		
		
		Map<String,String> book2 = new TreeMap<>();
		//Sorted Map representation
		//the keys in TreeMap must implement the comparable interface to store the element in a order
		
		
		
		System.out.println(Favbooks.put("Java", "HeadsFirst"));//null
		System.out.println(Favbooks.put("C++","BalSub"));//null - when the element uis successfully added to a map
		System.out.println(Favbooks.put("Java", "QuickJava"));//HeadsFirst - when the key is already present replaces the value and returns the old value
		Favbooks.put("Dave", "One");
		Favbooks.put("Brave", "Two");
		Favbooks.put("Drul", "Three");
				
		System.out.println(Favbooks.remove("Java"));//QuickJava . removes and returns the value
		System.out.println(Favbooks.replace("C++", "NewC"));// replaces and returns the old value
		
		System.out.println(Favbooks.containsKey("Dave"));//true
		System.out.println(Favbooks.get("Dave"));//One
		
		System.out.println(Favbooks.containsValue("NewC"));//true
		
		Favbooks.forEach((k,v)->
		{
			System.out.println(k+" - "+v);
		});
		
		List<String> mapKeys = Favbooks.keySet().stream().collect(Collectors.toList());
		mapKeys.forEach(i->System.out.println(i));
		
		List<String> mapsstream = Favbooks.entrySet().stream().map(e->e.getValue()).collect(Collectors.toList());
		mapsstream.forEach(i->System.out.println(i));
				
		
		//Looping through Map
		//Map.Entry - Entry is an interface inside Map interface hence we use Map.Entry to refer it
		//map.entrySet() method returns a set view of the mapping contained in the map. 
		
		for(Map.Entry<String,String> entry:Favbooks.entrySet())
		{
			String key = entry.getKey();
			String value = entry.getValue();
		}
		
		
		
		
		//Iterator using Entry Set
		
		Iterator<Map.Entry<String, String>> itr = Favbooks.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<String,String> entry = itr.next();
			//entry.setValue("");
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.print(value+" : ");
		}
		
		
		System.out.println();
		
		//Iterator using KeySet
		for(String key : Favbooks.keySet())
		{
			String Value = Favbooks.get(key);
			System.out.print(Value+" : ");
		}
		System.out.println();
		
		//Using for Each loop
		Favbooks.forEach((k,v)->{
			
			System.out.print(v+" : ");
			
			
		});
		System.out.println();
		
		
		
		
		String existingValue = Favbooks.getOrDefault("Java","Mava");
		if(existingValue.equals("Java"));
		
		Map<String,Integer> duplicateWords = new HashMap<>();
		String[] string = "find find duplicate duplicate words words words".split(" ");
		
		for(int i=0;i<string.length;i++)
		{
			
			int count = duplicateWords.getOrDefault(string[i],0);
			duplicateWords.put(string[i], count+1);
			
		}
		
		
		 duplicateWords.entrySet().stream().map(e->e.getValue()==1).collect(Collectors.toList());
		 
		
		
	}
	
	
	
	
	
	

}
