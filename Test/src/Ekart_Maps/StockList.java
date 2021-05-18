package Ekart_Maps;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StockList {
	
	private final Map<String,StockItem> stockItems ;
	
	public StockList()
	{
		this.stockItems= new TreeMap<>();
	}
	
	public boolean addStockItem(StockItem item)
	{
		
		if(item!=null)
		{
			StockItem existingStockItem = stockItems.getOrDefault(item.getName(),item);
			//check if the item is available in the map, if yes return it else return item 
				if(existingStockItem.getQuantity()!=item.getQuantity())
				{
					item.updateQuantity(item.getQuantity()+existingStockItem.getQuantity());
				}
				stockItems.put(item.getName(),item);
				return true;
				
		}
		return false;
				
	}
	
	public boolean addStockQuantity(String Name,int quantity)
	{
		StockItem existingItem = stockItems.getOrDefault(Name, null);
		if(existingItem !=null)
		{
			existingItem.addQuantity(quantity);
			stockItems.put(existingItem.getName(),existingItem);
			return true;
		}
		return false;
	}
	
	
	public boolean removeStockItem(StockItem item)
	{
		StockItem existingItem = stockItems.getOrDefault(item.getName(),null);
		if(existingItem!= null)
		{
			this.stockItems.remove(existingItem);
			return true;
		}
		return false;		
	}
	
	public boolean removeStockItem(String Name)
	{
		StockItem existingItem = stockItems.getOrDefault(Name,null);
		if(existingItem!= null)
		{
			this.stockItems.remove(existingItem);
			return true;
		}
		return false;		
	}
	
	
	public boolean sellStockItems(String itemName, int quantity)
	{
		StockItem existingStock = this.stockItems.getOrDefault(itemName, null);
		if(existingStock!=null)
		{
			if(existingStock.getQuantity()>=quantity && quantity>0)
			{
				existingStock.addQuantity(-quantity);//remove quantity from the items aailable quantity
				return true;
			}
			
		}
		return false;
	}
	
	@Override
	public String toString()
	{
		String stringValue="";
		
		for(Map.Entry<String, StockItem> item:stockItems.entrySet())
		{
			StockItem currentItem = item.getValue();
			stringValue =stringValue+currentItem.getName()+"\tPrice:"+currentItem.getPrice()+"\tQuantity:"+currentItem.getQuantity()+"\n";
			
		}
		return stringValue;
	}
	
	
	public StockItem getStockItem(String Name)
	{
	  StockItem existingItem = stockItems.getOrDefault(Name, null);
	  if(existingItem!=null)
	  {
		  return stockItems.get(Name);
	  }
	  else
		  return null;
	}
	
	public Map<String,StockItem> get()
	{
		return Collections.unmodifiableMap(stockItems);
	}

}
