// Implements the Pizza interface with only the required
// methods from the interface

// Every Pizza made will start as a PlainPizza

public class PlainPizza implements Pizza {
 
	public String getDescription() {
		return "Thin dough";
		}

	public double getCost() {
		return 4.00;	
	}


 
}