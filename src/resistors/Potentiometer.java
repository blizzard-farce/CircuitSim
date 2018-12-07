package resistors;

public class Potentiometer extends Resistor {
	
	private int position;

	public Potentiometer()
	{
		
	}

	public Potentiometer(float resistance) 
	{
		super(resistance);
	}

	public Potentiometer(float resistance, int position)
	{
		super(resistance);
		this.position = position;
	}
}
