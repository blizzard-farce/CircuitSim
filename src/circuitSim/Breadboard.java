package circuitSim;

import java.util.Scanner;

public class Breadboard 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		DoubleLinkedList circuit = new DoubleLinkedList();
		
		menu(circuit);
		
		
	}

	public static void menu(DoubleLinkedList circuit)
	{
		Scanner kb = new Scanner(System.in);
		
		while (true)
		{
			System.out.println("Select an option:");
			System.out.println("1: View current circuit");
			System.out.println("2. Add component");
			System.out.println("3. Remove component");
			System.out.println("4. Modify component");
			System.out.println("5. View component");
			System.out.println("0. Exit");

			String input = kb.next();

			switch (input)
			{
			case "1":
				printCircuit(circuit);
				break;
			case "2":
				if (circuit.isEmpty())
				{
					System.out.println("Enter the first component in this circuit: ");
				}
				else
				{
					System.out.println("Enter the next component in this circuit:");
				}
				System.out.println("D = DC Source, R = Resistor");
				input = kb.next();
				addComponent(circuit, input);
				break;
			case "3":
				removeComponent(circuit, input);
				break;
			case "4":
				updateComponent(circuit, input);
				break;
			case "5":
				viewComponent(circuit, input);
			case "0" :
				kb.close();
				System.exit(0);
				break;
			}
		}
	}
	
	public static void printCircuit(DoubleLinkedList circuit)
	{
		circuit.print();
	}
	
	public static void addComponent(DoubleLinkedList circuit, String input)
	{
		
		DLLNode node = new DLLNode();
		
		switch(input)
		{
			case "D":
				node.setInfo(new powerSourcesDC.DCSupply());
				circuit.add(node);
				break;
			case "R":
				node.setInfo(new resistors.FixedResistor());
				circuit.add(node);
				break;
		}
	}
	
	public static void removeComponent(DoubleLinkedList circuit, String input)
	{
		
	}
	
	public static void updateComponent(DoubleLinkedList circuit, String input)
	{
		
	}
	
	public static void viewComponent(DoubleLinkedList circuit, String input)
	{
		
	}
}
