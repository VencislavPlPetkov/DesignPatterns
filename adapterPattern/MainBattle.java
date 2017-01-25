package adapterPattern;

public class MainBattle {

	public static void main(String[] args) {
		
		EnemyTank panzer = new EnemyTank();
		
		EnemyRobot terminator = new EnemyRobot();
		
		EnemyAttackerInterface robotAdapter = new EnemyRobotAdapter(terminator);
		
		System.out.println("The Robot");
		
		terminator.reactToHuman("Jane");
		terminator.walkForward();
		terminator.smashWithHands();
		
		System.out.println();
		
		System.out.println("The Enemy Tank");
		
		panzer.assignDriver("Ivan");
		panzer.driveForward();
		panzer.fireWeapon();
		
		System.out.println();
		
		System.out.println("The Robot with Adapter");
		robotAdapter.assignDriver("Jon");
		robotAdapter.driveForward();
		robotAdapter.fireWeapon();
		
	}

}
