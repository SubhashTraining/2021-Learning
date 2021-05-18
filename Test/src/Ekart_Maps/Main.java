package Ekart_Maps;

import java.util.Map;

public class Main {
	
	
	private static StockList productStock = new StockList();
	
	
	public static void main(String[] args)
	{
		
		
		StockItem temp = new StockItem("Bread", 22.50,25);
		productStock.addStockItem(temp);
		productStock.addStockQuantity("Bread", 25);
		
		temp = new StockItem("Curd", 35.00,10);
		productStock.addStockItem(temp);
		temp = new StockItem("Jamun", 20.00,25);
		productStock.addStockItem(temp);
		
		System.out.println(productStock.toString());
		
		Basket subhash = new Basket("Subhash");
		
		addItemToBasket(subhash,"Curd",5);
		addItemToBasket(subhash,"Curd",5);
		addItemToBasket(subhash,"Dates",5);
		System.out.println(subhash.toString());
		
		
	}
	
	public static int addItemToBasket(Basket basket,String itemName, int itemQuantity)
	{
		
		StockItem item = productStock.getStockItem(itemName);
		if(item==null)
		{
			System.out.println(itemName+" Out of Stock");
			return 0;
		}
		
		if(productStock.sellStockItems(itemName, itemQuantity) ==true)
		{
			basket.addItemBasket(itemName, itemQuantity);
			
			return itemQuantity;
		}
			
		System.out.println(itemName+" Out of Stock");
		return 0;
			
		
	}
	

}
