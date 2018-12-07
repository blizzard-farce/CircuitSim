package resistors;

public class FixedResistor extends Resistor {
	
	private float tolerance;
	private float powerRating;
	
	public FixedResistor()
	{
		
	}
	
	public FixedResistor(float resistance) 
	{
		super(resistance);
	}
	
	public FixedResistor(float resistance, float tolerance, float powerRating)
	{
		super(resistance);
		this.tolerance = tolerance;
		this.powerRating = powerRating;
	}

	public float getTolerance() 
	{
		return tolerance;
	}
	
	public void setTolerance(float tolerance) 
	{
		this.tolerance = tolerance;
	}
	
	public float getPowerRating() 
	{
		return powerRating;
	}
	
	public void setPowerRating(float powerRating) 
	{
		this.powerRating = powerRating;
	}
}
