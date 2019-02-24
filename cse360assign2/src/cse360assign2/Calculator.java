package cse360assign2;

/**
 * @author Monica Perez
 * class ID: 524
 * Assignment: 2
 * Description: This program performs calculator functions such as 
 * adding,subtracting,multiplying, and dividing integers. 
 * It also displays a history of actions and the total.
 */
public class Calculator {

	private int total;
	private String history = "";
	
	/**
	 * Class Constructor
	 */
	public Calculator () {
		total = 0;
		history = "0";
	}
	
	/**
	 *  Returns an integer that contain the current total.
	 * @return The current total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds the parameter to the total variable
	 * @param value An integer
	 */
	public void add (int value) {
		total = total + value;
		history = history + " + " + value;
	}
	
	/**
	 * Subtracts the parameter from the total variable
	 * @param value an integer
	 */
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;
	}
	
	/**
	 * Multiplies the total by the parameter
	 * @param value an integer
	 */
	public void multiply (int value) {
		total = total * value;
		history = history + " * " + value;
	}
	
	/**
	 * divides the total by the parameter
	 * @param value an integer
	 */
	public void divide (int value) {
		if(value != 0)
			total = total/value;
		else
			total = 0;
		history = history + " / " + value;
	}
	
	/**
	 * Returns a String that displays a history of all previous actions
	 * @return  A history of all actions as a String
	 */
	public String getHistory () {
		return history;
	}
}
