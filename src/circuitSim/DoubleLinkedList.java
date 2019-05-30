package circuitSim;

import java.util.ArrayList;

public class DoubleLinkedList 
{
	DLLNode head; //stores the start of the list
	DLLNode currNode; //iterator for list
	DLLNode prevNode; //node before currNode for removing nodes
	
	/**
	 * default constructor
	 * creates empty SortedLinkedList and defaults markers to null
	 */
	public DoubleLinkedList()
	{
		head = null;
		currNode = null;
	}
	
	/**
	 * creates new node and adds to front of queue
	 * @param info
	 */
	public void add(DLLNode newNode)
	{
		newNode.setNextLink(head);
		head = newNode;
	}
	
	/**
	 * removes first node from DoubleLinkedList containing specified info
	 * be careful - will remove first node it finds - need to use a unique info
	 * @param info
	 * @return info
	 */
//	public T remove(T info)
//	{
//		if (isEmpty())
//		{
//			return null;
//		}
//		else if (find(info))
//		{
//			prevNode = currNode.getPreviousLink();
//			
//			prevNode.setNextLink(currNode.getNextLink());
//			return currNode.getInfo();
//		}
//		return null;
//	}
	
	/**
	 * returns true if the list is empty
	 * used primarily for error checking
	 * @return
	 */
	public boolean isEmpty()
	{
		if (head == null)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	/**
	 * returns true if given info is found in list
	 * returns false if info doesn't exist in list
	 * 
	 * basic implementation that takes generic type argument
	 * @param info
	 * @return
	 */
//	public boolean find(T info)
//	{
//		resetCurrNode();
//		
//		while (currNode.getNextLink() != null)
//		{
//			if (currNode.getInfo() == info)
//			{
//				return true;
//			}
//			else
//			{
//				currNode = currNode.getNextLink();
//			}
//		}
//		
//		return false;
//	}
	
	/**
	 * returns true if given info is found in list
	 * returns false if info doesn't exist in list
	 * 
	 * overloaded implementation for ArrayList using index of node's info
	 * @param info
	 * @param index
	 * @return
	 */
//	public boolean find(T info, int index)
//	{
//		resetCurrNode();
//		
//		while (currNode.getNextLink() != null)
//		{
//			ArrayList<String> testArray = (ArrayList<String>) currNode.getInfo();
//			
//			if (testArray.get(index) == info)
//			{
//				return true;
//			}
//			else
//			{
//				currNode = currNode.getNextLink();
//			}
//		}
//		
//		return false;
//	}
	
	/**
	 * iterates through list until given node is the next node
	 * 
	 * returns the previous node to the supplied node
	 * 
	 * legacy code from SortedLinkedList
	 * @param node
	 */
//	public LLNode findPrevious(LLNode node)
//	{
//		DLLNode prevNode = head;
//		
//		while (prevNode.getLink() != null)
//		{
//			if (prevNode.getLink() == node)
//			{
//				return prevNode;
//			}
//			else
//			{
//				prevNode = prevNode.getLink();
//			}
//		}
//		return null;
//	}
	
	/**
	 * resets currNode iterator to beginning of list
	 */
	public void resetCurrNode()
	{
		currNode = head;
	}
	
	/**
	 * sorts list by comparing first element to second, then third...
	 * first element after sorting will be the largest
	 * 
	 * currently set up to only handle info of type ArrayList<String>
	 * will need to be generalized to reuse for other projects
	 * 
	 * legacy code from SortedLinkedList
	 * 
	 * @param index is the index of the array in each node that will be sorted on
	 * @param sortFlag true for descending, false for ascending
	 */
//	public void sort(int index, boolean sortFlag) throws InvalidSortTypeException
//	{
//		resetCurrNode();
//		
//		LLNode otherNode;
////		T currNodeInfo; currently unused - might be needed for generalized types
////		T otherNodeInfo;
//		ArrayList<String> currNodeArray;
//		ArrayList<String> otherNodeArray;
//		
//		//sortFlag = true means that the array will be sorted largest to smallest
//		if (sortFlag)
//		{
//			//
//			while (currNode.getLink() != null)
//			{
////				currNodeInfo = currNode.getInfo();
//				//sets otherNode as the node immediately following currNode
//				otherNode = currNode.getLink();
//				
//				//checking to make sure that currNode info is an appropriate type for the sort function
//				if (currNode.getInfo() instanceof ArrayList)
//				{
//					currNodeArray = (ArrayList<String>) currNode.getInfo();
//				}
//				else
//				{
//					throw new InvalidSortTypeException("Unexpected class encountered on currNode");
//				}
//				
//				while (otherNode.getLink() != null)
//				{
////					otherNodeInfo = otherNode.getInfo();
//					if(otherNode.getInfo() instanceof ArrayList)
//					{
//						otherNodeArray = (ArrayList<String>) otherNode.getInfo();
//					}
//					else
//					{
//						throw new InvalidSortTypeException("Unexpected class encountered on otherNode");
//					}
//					
//					if (currNodeArray.get(index).compareTo(otherNodeArray.get(index)) < 0)
//					{
//						trade(currNode, otherNode);
//					}
//					otherNode = otherNode.getLink();
//				}
//				currNode = currNode.getLink();
//			}
//		}
//		if (!sortFlag)
//		{
//			while (currNode.getLink() != null)
//			{
////				currNodeInfo = currNode.getInfo();
//				if (currNode.getInfo() instanceof ArrayList)
//				{
//					currNodeArray = (ArrayList<String>) currNode.getInfo();
//				}
//				else
//				{
//					throw new InvalidSortTypeException("Unexpected class encountered on currNode");
//				}
//				
//				otherNode = currNode.getLink();
//				while (otherNode.getLink() != null)
//				{
////					otherNodeInfo = otherNode.getInfo();
//					if (otherNode.getInfo() instanceof ArrayList)
//					{
//						otherNodeArray = (ArrayList<String>) otherNode.getInfo();
//					}
//					else
//					{
//						throw new InvalidSortTypeException("Unexpected class found on otherNode");
//					}
//					if (currNodeArray.get(index).compareTo(otherNodeArray.get(index)) > 0)
//					{
//						trade(currNode, otherNode);
//					}
//					otherNode = otherNode.getLink();
//				}
//				currNode = currNode.getLink();
//			}
//		}
//	}
	
	/**
	 * exchanges position of the two specified nodes
	 * @param nodeC
	 * @param nodeO
	 */
	public void trade(DLLNode nodeC, DLLNode nodeO)
	{
		DLLNode prevC;
		DLLNode prevO;
		
		if (nodeC == head)
		{
			prevC = null;
		}
		else
		{
			prevC = nodeC.getPreviousLink();
		}
		
		if (nodeC.getNextLink() == nodeO)
		{
			prevO = nodeC;
		}
		else
		{
			prevO = nodeO.getPreviousLink();
		}
		
		prevC.setNextLink(nodeO);
		prevO.setNextLink(nodeC);
	}
	
	/**
	 * simple print method that prints the contents of each link 
	 * in the list on their own line
	 * primarily for testing output
	 */
	public void print()
	{
		resetCurrNode();
		while (currNode.getNextLink() != null)
		{
			currNode.print();
			
			currNode = currNode.getNextLink();
		}
	}
}