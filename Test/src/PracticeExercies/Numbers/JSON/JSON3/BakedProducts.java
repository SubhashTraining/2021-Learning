package PracticeExercies.Numbers.JSON.JSON3;

import java.util.Arrays;

import com.google.gson.annotations.SerializedName;

public class BakedProducts {
	
	
	@SerializedName("id")
	private String id;
	private String type;
	private String name;
	private double ppu;
	private Batters batters;
	private Topping[] topping;
	
	
	public void setId(String id) {
		this.id = id;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPpu(double ppu) {
		this.ppu = ppu;
	}
	public void setBatters(Batters batters) {
		this.batters = batters;
	}
	public void setToppings(Topping[] toppings) {
		this.topping = toppings;
	}
	public String getId() {
		return id;
	}
	public String getType() {
		return type;
	}
	public String getName() {
		return name;
	}
	public double getPpu() {
		return ppu;
	}
	public Batters getBatters() {
		return batters;
	}
	public Topping[] getToppings() {
		return topping;
	}
	
	@Override
	public final String toString()
	{
		
		StringBuffer bf= new StringBuffer("Bakers:{\n");
		bf.append("\nid:"+id);
		bf.append("\ntype:"+type);
		bf.append("\nname:"+name);
		bf.append("\nppu:"+ppu);
		if(this.batters!=null)
		{
			bf.append("\nbatters:\n{\nbatter\n[");
			Batter[] batters = this.batters.getBatter();
			
			for(Batter batter:batters)
			{
				bf.append("\n{ id:"+batter.getId()+", type:"+batter.getType()+"}");
			}
			bf.append("\n]\n},");
		}
		
		if(this.topping!=null)
		{
			bf.append("\nTopping:\n[");
			for(Topping topping:this.topping)
			{
				bf.append("\n{ id:"+topping.getId()+", type:"+topping.getType()+"}");
			}
			bf.append("\n]\n},");
		}
		
		return new String(bf.toString());
	}
}
