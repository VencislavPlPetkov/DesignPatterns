package decoratorPattern;

public class Mozzarella extends ToppingDecorator {

	public Mozzarella(Pizza newPizza) {
		super(newPizza);

		System.out.println("Adding Dough");
		System.out.println("Adding Mozzarella");
	}

	public String getDescription() {

		return tempPizza.getDescription() + ", mozzarella";
	}

	public double getCost() {

		System.out.println("Cost of Mozzarella: " + .50);

		return tempPizza.getCost() + .50;
	}

}
