package Ekart_Maps;

public class StockItem implements Comparable<StockItem>{

	private final String Name;
	private double price;
	private int quantity;
	
	
	public StockItem(String Name, double price)
	{
		this.Name= Name;
		this.price= price;
		this.quantity=0;
	}
	
	public StockItem(String Name, double price, int Quantity)
	{
		this.Name= Name;
		this.price= price;
		this.quantity=Quantity;
	}
	
	
	public void updatePrice(double price)
	{
		if(price>0)
		{
			this.price=price;
		}
	}
	
	
	public void addQuantity(int quantity)
	{
		this.quantity+=quantity;
		
	}
	
	public int updateQuantity(int quantity)
	{
		this.quantity=(quantity>0)?quantity:this.quantity;
		return this.quantity;
	}
	
	public String getName() {
		return Name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public int compareTo(StockItem obj)
	{
		if(this ==obj)
			return 0;
		
		if((obj!=null))
			return this.getName().compareTo(obj.getName());
		throw new NullPointerException("Object cannot be Null");
		
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(this==obj)
			return true;
		
		if((obj==null)|| (obj.getClass()!= this.getClass()))
			return false;
			
		StockItem object = (StockItem) obj;
			return this.getName().equals(object.getName());
				
	}
	
	
	@Override
	public int hashCode()
	{
		return this.getName().hashCode()+31;
	}
	
	
	@Override
	public String toString()
	{
		return this.getName()+"\t Price-"+this.getPrice()+"\t Quantity-"+this.quantity;
	}
	
	
}
