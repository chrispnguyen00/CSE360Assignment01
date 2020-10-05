package cse360assignment01;

public class AddingMachine {
	  private int total;
	  private StringBuffer str;
	  
	  /**
	   * This is the constructor where I initialized the two private
	   * variables its default value. 
	   */
	  public AddingMachine() {
		  total = 0;
		  str = new StringBuffer("0");
	  }
	  
	  /**
	   * This method returns the total amount after adding and/or subtracting
	   */
	  public int getTotal () { 
	    return total;
	  }
	  
	  /**
	   * This method adds a given value to the total
	   */
	  public void add (int value) {
		  total += value;
		  str.append(" + " + value);
		  
	  }

	  /**
	   * This method subtracts the total from a given value
	   */
	  public void subtract (int value) {
		  total -= value;
		  str.append(" - " + value);
	  }

	  /**
	   * This method prints out the string including the value started with which was 0 and
	   * then the symbols add or subtract and the value and so on.
	   */
	  public String toString () {
		  System.out.println(str);
		  return "";
	  }
	  
	  /**
	   * This method clears the "memory" by setting the total back to zero and
	   * then creating a new string buffer, getting "rid" of the old one.
	   */
	  public void clear() {
		  total = 0;
		  str = new StringBuffer("0");
		  
	  }
}

