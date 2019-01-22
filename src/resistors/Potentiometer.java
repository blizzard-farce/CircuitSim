package resistors;

/**
 * 
 * @author Sam
 * potentiometer uses resistance as max resistance (position set to 100)
 * position is int between 1 and 100 as percent of rotation
 * 
 * 
 */

public class Potentiometer extends Resistor {
	
	private int position;
	private float currResistance;

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
	
	public Potentiometer(float resistance, int position, float currResistance)
	{
		super(resistance);
		this.position = position;
		this.currResistance = currResistance;
	}
	
	public int getPosition()
	{
		return position;
	}
	
	public void setPosition(int position)
	{
		if (0 < position)
		{
			if (position <= 100)
			{
				this.position = position;
				setCurrResistance();
			}
		}
	}
	
	public float getCurrResistance()
	{
		return currResistance;
	}
	
	private void setCurrResistance()
	{
		currResistance = (position/100)*getResistance();
	}
}
