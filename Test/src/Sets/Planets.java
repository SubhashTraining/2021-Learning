package Sets;

import Sets.HeavenlyBody.bodyType;

public class Planets extends HeavenlyBody {
	
	
	public Planets(String Name, Double OrbitalPeriod)
	{
		super(Name,OrbitalPeriod,bodyType.PLANETS);
	}
	
	@Override
	public boolean addSatellites(HeavenlyBody Satellites)
	{
		if(Satellites.getBodyType()==bodyType.MOON)
		{
			return super.addSatellites(Satellites);
		}
		else
			return false;
	
	}
}
