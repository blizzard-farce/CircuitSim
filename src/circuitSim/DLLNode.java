package circuitSim;

/**
 * @author Sam Rowe
 *
 */

public class DLLNode<T> {
	
	private DLLNode<T> nextLink;
	private DLLNode<T> previousLink;
	private T info;
	
	public DLLNode()
	{
		nextLink = null;
		previousLink = null;
	}
		
	public DLLNode(T info)
	{
		this.info = info;
		nextLink = null;
		previousLink = null;
	}
		
	public void setInfo(T info)
	{
		this.info = info;
	}
		
	public T getInfo()
	{
		return info;
	}
	
	public void setNextLink(DLLNode<T> link)
	{
		this.nextLink = link;
	}
	
	public void setPreviousLink(DLLNode<T> link)
	{
		this.previousLink = link;
	}
	
	public DLLNode<T> getNextLink()
	{
		return nextLink;
	}
	
	public DLLNode<T> getPreviousLink()
	{
		return previousLink;
	}
}