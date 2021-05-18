package Package1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Test6_PropertiesFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	String sep = File.separator;
	try(FileReader reader = new FileReader(System.getProperty("user.dir")+sep+"src"+sep+"EnvironmentalVariables.properties"))
	{
		
		Properties property = new Properties();
		property.load(reader);
		System.out.println(property.getProperty("Sanjay"));// null --if there are no such properties
		
		
		
		property= System.getProperties();
		
		if(reader!=null)
		{
			reader.close();
		}
		
		
		property.store(new FileWriter(System.getProperty("user.dir")+sep+"src"+sep+"EnvironmentalVariables.properties"), "System Properties");
		
		

		for(Map.Entry entry : property.entrySet())
		{
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}
		
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		

	}

}
