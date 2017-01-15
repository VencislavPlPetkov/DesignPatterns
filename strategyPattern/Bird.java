package strategyPattern;

public class Bird extends Animal {

	public Bird() {
		super();
		setSound("Tweet");

		flyingInterface = new ItFlys();
	}

}
