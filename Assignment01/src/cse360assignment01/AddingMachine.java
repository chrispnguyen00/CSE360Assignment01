package cse360assignment01;

public class AddingMachine {
	  private int total;
	  private StringBuffer str;
	  
	  public AddingMachine() {
		  total = 0;
		  str = new StringBuffer("0");
	  }
	  
	  public int getTotal () { 
	    return total;
	  }
	  
	  public void add (int value) {
		  total += value;
		  str.append(" + " + value);
		  
	  }

	  public void subtract (int value) {
		  total -= value;
		  str.append(" - " + value);
	  }

	  public String toString () {
		  System.out.println(str);
		  return "";
	  }

	  public void clear() {
		  total = 0;
		  str = new StringBuffer("0");
		  
	  }
	  
	  public static void main(String[] args) {
		  AddingMachine myCalculator = new AddingMachine();
		  myCalculator.add(4);
		  myCalculator.subtract(2);
		  myCalculator.add(5);
		  myCalculator.toString();
	  }
}

