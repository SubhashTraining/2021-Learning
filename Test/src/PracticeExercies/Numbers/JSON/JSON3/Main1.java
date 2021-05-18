package PracticeExercies.Numbers.JSON.JSON3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main1 {
	
	public static void main(String[] agrs) throws IOException
	{
		
		String sep = File.separator;
		String jsonFileData = new String(Files.readAllBytes(Paths.get("src"+sep+"PracticeExercies"+sep+"Numbers"+sep+"JSON"+sep+"JSON3"+sep+"json1.json")));
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		BakedProducts[] bakedProducts = gson.fromJson(jsonFileData, BakedProducts[].class);
		
		for(BakedProducts bp: bakedProducts)
		{
			System.out.println(bp);
		}
		
		String jsonString = gson.toJson(bakedProducts[0]);
		System.out.println("*************************************");
		System.out.println(jsonString);
	}

}
