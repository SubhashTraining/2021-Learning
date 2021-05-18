package Sets;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import Sets.HeavenlyBody.bodyType;

public class Main {
	
	private static Map<String,HeavenlyBody> solarSystem = new HashMap<>();
	private static Set<HeavenlyBody> planets = new HashSet<>();
	
	public static void main(String[] args) {
		
		
		HeavenlyBody temp = new Planets("Earth",55.8);
		solarSystem.put(temp.getName(),temp);
		planets.add(temp);
		
		temp.addSatellites(new Moon("Moon",27.0));
		
		temp=new Planets("Jupiter",5666.0);
		solarSystem.put(temp.getName(),temp);
		
	
		HeavenlyBody tempMoon = new Moon("Moon2",26.0);
		solarSystem.get("Earth").addSatellites(tempMoon);
		
		for(HeavenlyBody s: planets)
		{
			if(s.getName()=="Earth")
			{
				s.addSatellites(new Moon("Moon3",28.0));
			}
			
		}
		
		
		for(HeavenlyBody s: planets)
		{
			Set<HeavenlyBody> satellites = s.getSatellites();
			for(HeavenlyBody t:satellites)
			{
				System.out.println(t.getName());
			}
		}
		
		System.out.println("___________");
		
		for(String s: solarSystem.keySet())
		{
			Set<HeavenlyBody> satellites = solarSystem.get(s).getSatellites();
			for(HeavenlyBody t:satellites)
			{
				System.out.println(t.getName());
			}
			
		}
				
		
		temp= new Planets("Pluto",234.0);
		solarSystem.put(temp.getName(),temp);
		planets.add(temp);
		
		temp= new Planets("Pluto",235.0);
		solarSystem.put(temp.getName(),temp);
		planets.add(temp);
		
		for(HeavenlyBody s:planets)
		{
			System.out.println(s.getName()+" : "+s.getOrbitalPeriod()+" : "+s.getBodyType());
		}
		
		
		HeavenlyBody planet1 = new Planets("Pluto",235.0);
		HeavenlyBody planet2 = new Planets("Pluto",234.0);
		
		System.out.println("Check Equals");
		System.out.println(planet1.equals(planet2));
		System.out.println(planet2.equals(planet1));
	}
	

}
