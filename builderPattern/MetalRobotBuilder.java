package builderPattern;

public class MetalRobotBuilder implements RobotBuilderInterface {

	private Robot robot;

	public MetalRobotBuilder() {
		this.robot = new Robot();
	}

	@Override
	public void buildRobotHead() {
		robot.setRobotHead("Metal Head");
	}

	@Override
	public void buildRobotTorso() {
		robot.setRobotTorso("Metal Torso");
	}

	@Override
	public void buildRobotArms() {
		robot.setRobotArms("Iron Arms");
	}

	@Override
	public void buildRobotLegs() {
		robot.setRobotLegs("Stainless steel Legs");
	}

	@Override
	public Robot getRobot() {

		return this.robot;
	}

}
