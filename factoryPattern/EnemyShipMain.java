package factoryPattern;

import java.util.Scanner;

public class EnemyShipMain {

	public static void main(String[] args) {

		EnemyShipFactory shipFactory = new EnemyShipFactory();

		EnemyShip theEnemy = null;

		Scanner userInput = new Scanner(System.in);

		System.out.println("What type of ship? (U / R)");

		if (userInput.hasNextLine()) {
			String typeOfShip = userInput.nextLine();

			theEnemy = shipFactory.makeEnemyShip(typeOfShip);
		}

		if (theEnemy != null) {

			doStuffEnemy(theEnemy);
		} else {
			System.out.println("Enter U or R next time ");
		}

	}

	private static void doStuffEnemy(EnemyShip anEnemyShip) {

		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();

	}

}
