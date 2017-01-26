package templateMethodPattern;

public class MainRestaurant {

	public static void main(String[] args) {

		Sandwich italianSandwich = new ItalianSandwich();

		italianSandwich.makeSandwich();
		
		System.out.println();
		
		Sandwich vegetableSandwich = new VegetableSandwich();

		vegetableSandwich.makeSandwich();

	}
}
