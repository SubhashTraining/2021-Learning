package PracticeExercies.Numbers.Collections.Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
	
	private final String Name;
	private final double OrbitalPeriod;
	private final Set<HeavenlyBody> satellites ;
	
	
	public HeavenlyBody(String Name, double OrbitalPeriod)
	{
		this.Name=Name;
		this.OrbitalPeriod=OrbitalPeriod;
		this.satellites= new HashSet<>();
		
	}
	
	public boolean addSatellite(HeavenlyBody moon)
	{
		return this.satellites.add(moon);
		
	}
	
	public Set<HeavenlyBody> getSatellites()
	{
		return Collections.unmodifiableSet(this.satellites);
	}

	public String getName() {
		return Name;
	}

	public double getOrbitalPeriod() {
		return OrbitalPeriod;
	}

	
	
}
