
public class PizzaMaker {
	public static void main(String[] args){
		 Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
		 
		
		//tomatosauce.getDescription();
		//tomatosauce.getCost();
		
		System.out.println("Ingredients: " +basicPizza.getDescription());
		System.out.println("Total Cost: " +basicPizza.getCost());
	}

}
