package builderPattern;

public class RobotDirector {

	private RobotBuilderInterface robotBuilderInterface;

	public RobotDirector(RobotBuilderInterface robotBuilderInterface) {
		this.robotBuilderInterface = robotBuilderInterface;
	}

	public Robot getRobot() {
		return this.robotBuilderInterface.getRobot();
	}

	public void makeRobot() {
		this.robotBuilderInterface.buildRobotHead();
		this.robotBuilderInterface.buildRobotTorso();
		this.robotBuilderInterface.buildRobotArms();
		this.robotBuilderInterface.buildRobotLegs();
	}

}
