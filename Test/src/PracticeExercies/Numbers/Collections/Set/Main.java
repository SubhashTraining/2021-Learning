package PracticeExercies.Numbers.Collections.Set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
	
	private static final Map<String,HeavenlyBody> SolarSystem = new HashMap<>();
	private static final Set<HeavenlyBody> planets = new HashSet<>();
	
	public static void main(String[] args)
	{
		
		HeavenlyBody temp = new HeavenlyBody("Earth",25.8);
		SolarSystem.put(temp.getName(),temp);
		planets.add(temp);
		//Since temp, SolarYstem(temp) and Planets(temp) have the ref on Adding moon to temp will add it to Planets and SolarSYstem
		
		temp.addSatellite(new HeavenlyBody("Moon1",256));
		temp.addSatellite(new HeavenlyBody("Moon2",25.6));
		
		
		temp = new HeavenlyBody("Mercury",36.366);
		SolarSystem.put(temp.getName(), temp);
		planets.add(temp);
		temp.addSatellite(new HeavenlyBody("MercuryMoon1",25.6));
		temp.addSatellite(new HeavenlyBody("MercuryMoon2",2.56));
		temp.addSatellite(new HeavenlyBody("MercuryMoon3",25.6));
		
		
		//This is an unmodifiable set where we cant perform any operations
		Set<HeavenlyBody> MercurySatellites = SolarSystem.get("Mercury").getSatellites();
		//Collections.unmodifableSet(set)
		
		//The set does not have any dublicates and hash set does not maintain the order
		MercurySatellites.forEach(i->{
			System.out.print(i.getName()+" : ");//MercuryMoon2 : MercuryMoon3 : MercuryMoon1 : 
		});
		
		
		//Add another moon to Earth. 
		planets.forEach(i->{
			if(i.getName().equalsIgnoreCase("Earth"))
			{
				i.addSatellite(new HeavenlyBody("Moon3",853.2));
			}
		});
		
		//There is no get Method in HashSset
		System.out.println();
		for(HeavenlyBody planet:planets)
		{
			if(planet.getName().equals("Earth"))
			{
				planet.getSatellites().forEach(input->{
					
					System.out.print(input.getName()+" : ");
				});
				break;
			}
		}
		//Still the reference of SolarSystem and in planet are same change in one would reflect in the other
		
		
		
		//Unions in Sets
		//Add all satellites of different planets to a set 
		System.out.println();
		Set<HeavenlyBody> allSatellites = new HashSet<>();
		for(HeavenlyBody planet : planets)
		{
			allSatellites.addAll(planet.getSatellites());
		}
		
		allSatellites.forEach(input->{
			System.out.print(input.getName()+" : ");
		});
		
		//Moon2 : MercuryMoon2 : MercuryMoon3 : MercuryMoon1 : Moon1 : Moon3 : 
	}

}
