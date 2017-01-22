package singletonPattern;

public class SingletonDoubleChecked {

	private volatile static SingletonDoubleChecked uniqueInstance;

	private SingletonDoubleChecked() {
	}

	public static SingletonDoubleChecked getInstance() {
		if (uniqueInstance == null) {
			// It only synchronises the first time
			synchronized (SingletonDoubleChecked.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new SingletonDoubleChecked();
				}
			}
		}
		return uniqueInstance;
	}

}
