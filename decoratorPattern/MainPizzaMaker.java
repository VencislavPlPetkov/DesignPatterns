package decoratorPattern;

public class MainPizzaMaker {

	public static void main(String[] args) {

		Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));

		System.out.println("Ingrediants Basic Pizza: " + basicPizza.getDescription());

		System.out.println("Price Basic Pizza: " + basicPizza.getCost());

		System.out.println();

		Pizza specialPizza = new PlainPizza();

		specialPizza = new Mozzarella(specialPizza);

		specialPizza = new TomatoSauce(specialPizza);

		System.out.println("Ingrediants Special Pizza: " + specialPizza.getDescription());

		System.out.println("Price Special Pizza: " + specialPizza.getCost());

	}

}
