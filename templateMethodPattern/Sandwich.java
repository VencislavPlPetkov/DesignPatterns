package templateMethodPattern;

public abstract class Sandwich {

	final void makeSandwich() {

		cutBun();

		if (customerWantsMeat()) {
			addMeat();
		}

		if (customerWantsCheese()) {
			addCheese();
		}

		if (customerWantsVegetables()) {
			addVegetables();
		}

		if (customerWantsCondiments()) {
			addCondiments();
		}

		wrapTheSandwich();

	}// End of template Method

	private void cutBun() {
		System.out.println("The sandwich is cut.");
	}

	abstract void addMeat();

	abstract void addCheese();

	abstract void addVegetables();

	abstract void addCondiments();

	boolean customerWantsMeat() {
		return true;
	};

	boolean customerWantsCheese() {
		return true;
	};

	boolean customerWantsVegetables() {
		return true;
	};

	boolean customerWantsCondiments() {
		return true;
	};

	private void wrapTheSandwich() {
		System.out.println("Wrap the Sandwich");
	}

}// End of Sandwich
