package powerSourcesDC;

public abstract class DCSource extends circuitSim.DLLNode{
	
	private float voltage;
	private float maxCurrent;

	public DCSource() {
		// TODO Auto-generated constructor stub
	}
	
	public DCSource(float voltage, float maxCurrent)
	{
		this.voltage = voltage;
		this.maxCurrent = maxCurrent;
	}

	public float getVoltage() 
	{
		return voltage;
	}

	public void setVoltage(float voltage) 
	{
		this.voltage = voltage;
	}

	public float getMaxCurrent() 
	{
		return maxCurrent;
	}

	public void setMaxCurrent(float maxCurrent) 
	{
		this.maxCurrent = maxCurrent;
	}
}
