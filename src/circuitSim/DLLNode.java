package circuitSim;

/**
 * @author Sam Rowe
 *
 */

public class DLLNode {
	
	private DLLNode nextLink;
	private DLLNode previousLink;
	//private T info;
	
	public DLLNode()
	{
		nextLink = null;
		previousLink = null;
	}
		
//	public DLLNode(T info)
//	{
//		this.info = info;
//		nextLink = null;
//		previousLink = null;
//	}
		
//	public void setInfo(T info)
//	{
//		this.info = info;
//	}
//		
//	public T getInfo()
//	{
//		return info;
//	}
	
	public void setNextLink(DLLNode link)
	{
		this.nextLink = link;
	}
	
	public void setPreviousLink(DLLNode link)
	{
		this.previousLink = link;
	}
	
	public DLLNode getNextLink()
	{
		return nextLink;
	}
	
	public DLLNode getPreviousLink()
	{
		return previousLink;
	}
	
	public void print()
	{
		System.out.println(this.toString());
	}
}