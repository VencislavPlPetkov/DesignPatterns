package commandPattern.commands;

import commandPattern.receivers.ElectronicDeviceInterface;

public class TurnTVUp implements CommandInterface {

	ElectronicDeviceInterface theDeviceInterface;

	public TurnTVUp(ElectronicDeviceInterface newDeviceInterface) {
		this.theDeviceInterface = newDeviceInterface;
	}

	@Override
	public void execute() {
		theDeviceInterface.volumeUp();
	}

	@Override
	public void undo() {
		theDeviceInterface.volumeDown();
	}

}
