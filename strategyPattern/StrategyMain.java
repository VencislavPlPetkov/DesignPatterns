package strategyPattern;

public class StrategyMain {

	public static void main(String[] args) {

		Animal dog = new Dog();
		Animal bird = new Bird();

		dog.setFlyingAbility(new CantFly());

		System.out.println("Dog says: " + dog.tryToFly());
		System.out.println("Bird says: " + bird.tryToFly());
	}

}
