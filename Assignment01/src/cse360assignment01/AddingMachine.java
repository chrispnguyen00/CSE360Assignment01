/**
 * Name: Chris Nguyen
 * ID: 1214641077
 * Class Time: TH 9am - 10:15am
 */
package cse360assignment01;

public class AddingMachine {
	  private int total;
	  private String str;
	  
	  /**
	   * This is the constructor where I initialized the two private
	   * variables its default value. 
	   */
	  public AddingMachine() {
		  total = 0;
		  str = "0";
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
		  str += " + " + value;
	  }

	  /**
	   * This method subtracts the total from a given value
	   */
	  public void subtract (int value) {
		  total -= value;
		  str += " - " + value;
	  }

	  /**
	   * This method prints out the string including the value started with which was 0 and
	   * then the symbols add or subtract and the value and so on.
	   */
	  public String toString () {
		  return str;
	  }
	  
	  /**
	   * This method clears the "memory" by setting the total back to zero and
	   * then creating a new string buffer, getting "rid" of the old one.
	   */
	  public void clear() {
		  total = 0;
		  str = "0";
		  
	  }
	  
	  /*
	  public static void main(String[] args) {
		  AddingMachine myCalculator = new AddingMachine();
		  myCalculator.add(4);
		  myCalculator.subtract(2);
		  myCalculator.add(5);
		  //System.out.println(myCalculator.toString());
		  
		  myCalculator.clear();
		  System.out.println(myCalculator.toString());
	  }
	  */
}

