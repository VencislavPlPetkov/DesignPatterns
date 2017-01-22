package builderPattern;

public class RobotLabMain {

	public static void main(String[] args) {

		RobotBuilderInterface metalRobot = new MetalRobotBuilder();

		RobotDirector robotDirector = new RobotDirector(metalRobot);

		robotDirector.makeRobot();

		Robot firstRobot = robotDirector.getRobot();

		System.out.println("Robot ready");

		System.out.println("Robot Head Type: " + firstRobot.getRobotHead());
		System.out.println("Robot Torso Type: " + firstRobot.getRobotTorso());
		System.out.println("Robot Arms Type: " + firstRobot.getRobotArms());
		System.out.println("Robot Legs Type: " + firstRobot.getRobotLegs());

	}

}
