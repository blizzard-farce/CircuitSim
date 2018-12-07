package powerSourcesDC;

public class Battery {
	
	private float voltage;
	private float current;

	public Battery() {
		// TODO Auto-generated constructor stub
	}
	
	public Battery(float voltage, float current)
	{
		this.voltage = voltage;
		this.current = current;
	}

	public float getVoltage() 
	{
		return voltage;
	}

	public void setVoltage(float voltage) 
	{
		this.voltage = voltage;
	}

	public float getCurrent() 
	{
		return current;
	}

	public void setCurrent(float current) 
	{
		this.current = current;
	}
}
