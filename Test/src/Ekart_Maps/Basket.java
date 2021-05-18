package Ekart_Maps;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class Basket {
	
	private final Map<String,Integer> basket ;
	private final String Name;
	public Basket(String name)
	{
		this.Name=name;
		this.basket= new HashMap<>();
	}
	
	
	public void addItemBasket(String Name, int quantity)
	{
		int itemAvailable = basket.getOrDefault(Name,0);
		basket.put(Name,itemAvailable+quantity);
		
	}
	
	public boolean removeItem(String Name, int Quantity)
	{
		
		int availableItem = basket.getOrDefault(Name,0);
		if(availableItem>=Quantity && Quantity>0)
		{
			basket.put(Name,availableItem-Quantity);
			return true;
		}
		return false;
	
	}

	
	public boolean removeItem(String Name)
	{
		int itemAvailable = basket.getOrDefault(Name,0);
		if(itemAvailable==0)
			return false;
		basket.remove(Name);
		return true;
	}
	
	
	public Map<String,Integer> get()
	{
		return Collections.unmodifiableMap(basket);
	}
	
	@Override
	public String toString()
	{
		String stringValue="";
		for(Map.Entry<String,Integer> item:this.basket.entrySet())
		{
			stringValue= stringValue+ item.getKey()+"\tOrderQuantity-"+item.getValue()+"\n";
		}
		return stringValue;
	}
	
}


