package singletonPattern;

public class Singleton {

	private static Singleton firstInstance = null;

	private Singleton() {
	}

	public static synchronized Singleton getInstance() {

		if (firstInstance == null) {

			firstInstance = new Singleton();
		}

		return firstInstance;
	}

}


