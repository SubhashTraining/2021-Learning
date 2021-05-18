package PracticeExercies.Numbers.JSON.JSON3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;

import PracticeExercies.Numbers.Collections.List.list;

public class Main2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		String sep = File.separator;
		try(InputStream is = new FileInputStream("src"+sep+"PracticeExercies"+sep+"Numbers"+sep+"JSON"+sep+"JSON3"+sep+"json1.json");
				InputStreamReader isr = new InputStreamReader(is); JsonReader reader = new JsonReader(isr)){
			
			
			List<BakedProducts> products = new ArrayList<>();
			
			reader.beginArray();
			while(reader.hasNext())
			{
				products.add(gsonParseReader(reader));
			}
			reader.endArray();
			
			products.forEach(i->System.out.println(i));	
		}
					

	}
	
	public static BakedProducts gsonParseReader(JsonReader reader) throws IOException
	{
		BakedProducts product = new BakedProducts();
		reader.beginObject();
		while(reader.hasNext())
		{
			String name = reader.nextName();
			if(name.equals("id"))
			{
				product.setId(reader.nextString());
			}
			if(name.equals("type"))
			{
				product.setType(reader.nextString());
			}
			if(name.equals("name"))
			{
				product.setName(reader.nextString());
			}
			if(name.equals("ppu"))
			{
				product.setPpu(reader.nextDouble());
			}
			if(name.equals("batters") && reader.peek()!= JsonToken.NULL)
			{
				
				parseBatters(reader,product);
				
			}
			if(name.equals("topping")){
				
				
				parseToppings(reader,product);
				
			}
			
		}
		reader.endObject();	
		return product;
	}
	
	
	public static void parseToppings(JsonReader reader,BakedProducts product) throws IOException
	{
		List<Topping> toppings = new ArrayList<>();
		
		reader.beginArray();
		while(reader.hasNext())
		{
			Topping topping = new Topping();
			reader.beginObject();
			while(reader.hasNext())
			{
			 String name = reader.nextName();
			 if(name.equals("id"))
				{
				 topping.setId(reader.nextString());
				}
				if(name.equals("type"))
				{
					topping.setType(reader.nextString());
				}
			}
			reader.endObject();
			toppings.add(topping);
		}
		reader.endArray();
		
		
		Topping[] toppingsArray = new Topping[toppings.size()];
		toppingsArray = toppings.toArray(toppingsArray);
		product.setToppings(toppingsArray);
		
		
	}
	
	
	public static void parseBatters(JsonReader reader, BakedProducts product) throws IOException
	{
		
		
		reader.beginObject();
		while(reader.hasNext())
		{
			parserBattersObject(reader,product);
		}
		reader.endObject();
		
		
	}
	
	public static void parserBattersObject(JsonReader reader, BakedProducts product) throws IOException
	{
		
		List<Batter> batterList = new ArrayList<>();
		reader.nextName();
		reader.beginArray();
		
		while(reader.hasNext())
		{
			Batter batter = new Batter();
			reader.beginObject();
			while(reader.hasNext())
			{
				String name= reader.nextName();
				if(name.equals("id"))
				{
					batter.setId(reader.nextString());
				}
				if(name.equals("type"))
				{
					batter.setType(reader.nextString());
				}
			}
			
			reader.endObject();
			batterList.add(batter);
		}		
		reader.endArray();
		
		
		Batters battersObject = new Batters();
		Batter[] batterArray = new Batter[batterList.size()];
		batterArray = batterList.toArray(batterArray);
		battersObject.setBatter(batterArray);
		product.setBatters(battersObject);
		
		
	}
	
	


}
