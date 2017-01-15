package strategyPattern;

public interface Flys {
	String fly();
}

class ItFlys implements Flys {

	public String fly() {
		return "I am flying";
	}
}

class CantFly implements Flys {

	public String fly() {
		return "I can't fly";
	}
}
