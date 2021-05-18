package Sets;
import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody
{
	
	private final String Name;
	private final Double orbitalPeriod;
	private final Set<HeavenlyBody> Satellites;
	public enum bodyType{
		STAR,
		COMETS,
		ASTEROID,
		MOON,
		DWARF_PLANETS,
		PLANETS
	}
	private final bodyType BodyType;
	
	public HeavenlyBody(String Name, Double OrbitalPeriod , bodyType BodyType)
	{
		this.Name= Name;
		this.orbitalPeriod=OrbitalPeriod;
		this.BodyType=BodyType;
		this.Satellites= new HashSet<HeavenlyBody>();
	}

	public String getName() {
		return Name;
	}

	public Double getOrbitalPeriod() {
		return orbitalPeriod;
	}

	public Set<HeavenlyBody> getSatellites() {
		return Satellites;
	}

	public bodyType getBodyType() {
		return BodyType;
	}
	
	
	
	public boolean addSatellites(HeavenlyBody Satellites)
	{
	 return	this.Satellites.add(Satellites);
	}
	
	
	@Override
	public final boolean equals(Object obj)
	{
	
		if(this==obj)
			return true;
		if(obj instanceof HeavenlyBody)
		{
			if(this.getName().equals(((HeavenlyBody)obj).getName()))
			{
				return this.BodyType==((HeavenlyBody)obj).getBodyType();
			}
			return false;
		}
		return false;
				
	}
	
	
	@Override 
	public final int hashCode()
	{
		return this.getName().hashCode()+57+this.getOrbitalPeriod().hashCode();
	}
	
	
	@Override
	public String toString()
	{
		
		return this.getName().toString()+", "+this.getBodyType()+", "+this.getOrbitalPeriod();
	}
	
}