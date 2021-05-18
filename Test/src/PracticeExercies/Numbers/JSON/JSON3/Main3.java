package PracticeExercies.Numbers.JSON.JSON3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonWriter;

public class Main3 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		String sep = File.separator;
		String jsonFileData = new String(Files.readAllBytes(Paths.get("src"+sep+"PracticeExercies"+sep+"Numbers"+sep+"JSON"+sep+"JSON3"+sep+"json1.json")));
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		BakedProducts[] bakedProducts = gson.fromJson(jsonFileData, BakedProducts[].class);
		
		
		
		try
		( 
		FileOutputStream os = new FileOutputStream("src"+sep+"PracticeExercies"+sep+"Numbers"+sep+"JSON"+sep+"JSON3"+sep+"json2.json");
		OutputStreamWriter osr = new OutputStreamWriter(os); 
		JsonWriter writer = new JsonWriter(osr)	){
			
			
			writer.setIndent("  ");
			
			writer.beginArray();
			
			for(BakedProducts product:bakedProducts)
			{
				writeObjectToJson(writer,product);
			}
			
			writer.endArray();
			
			
			
		}
		

	}
	
	public static void writeObjectToJson(JsonWriter writer,BakedProducts product) throws IOException
	{
		writer.beginObject();
		writer.name("id").value(product.getName());
		writer.name("type").value(product.getType());
		writer.name("name").value(product.getName());
		writer.name("ppu").value(product.getPpu());
		writer.name("batters");
		writer.beginObject();
		writer.name("batter");
		Batter[] batters = product.getBatters().getBatter();
		writer.beginArray();
		for(Batter batter:batters)
		{
			writer.beginObject();
			writer.name("id").value(batter.getId());
			writer.name("type").value(batter.getType());
			writer.endObject();
		}
		
		writer.endArray();
		writer.endObject();
		
		
		writer.name("topping");
		Topping[] toppings = product.getToppings();
		writer.beginArray();
		for(Topping topping:toppings)
		{
			writer.beginObject();
			writer.name("id").value(topping.getId());
			writer.name("type").value(topping.getType());
			writer.endObject();
		}
				
		writer.endArray();
		writer.endObject();
	}

}
