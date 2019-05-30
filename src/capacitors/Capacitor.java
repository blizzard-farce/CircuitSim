package capacitors;

public abstract class Capacitor extends circuitSim.DLLNode {
	
	private float capacitance;
	
	public float getCapacitance()
	{
		return capacitance;
	}
	
	public void setCapacitance(float capacitance)
	{
		this.capacitance = capacitance;
	}

}
