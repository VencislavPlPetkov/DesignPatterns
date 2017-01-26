package templateMethodPattern;

public class VegetableSandwich extends Sandwich {
	
	String[] vegetablesUsed = { "Lettuce", "Tomatoes", "Onions", "Sweet Peppers" };
	String[] condimentsUsed = { "Oil", "Vinegar" };
	
	boolean customerWantsMeat() {
		return false;
	};

	boolean customerWantsCheese() {
		return false;
	};
	

	@Override
	void addVegetables() {
		System.out.println("Adding the Vegetables: ");

		for (String vegetable : vegetablesUsed) {
			System.out.println(vegetable + " ");
		}
	}

	@Override
	void addCondiments() {
		System.out.println("Adding the Condiments: ");

		for (String condiment : condimentsUsed) {
			System.out.println(condiment + " ");
		}
	}

	@Override
	void addMeat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void addCheese() {
		// TODO Auto-generated method stub
		
	}
}
