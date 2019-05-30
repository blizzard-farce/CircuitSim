package resistors;

public abstract class Resistor extends circuitSim.DLLNode{
	
	private float resistance;
	
	public Resistor()
	{
		
	}
	
	public Resistor(float resistance)
	{
		this.resistance = resistance;
	}
	
	public float getResistance()
	{
		return resistance;
	}

	public void setResistance(float resistance)
	{
		this.resistance = resistance;
	}
}