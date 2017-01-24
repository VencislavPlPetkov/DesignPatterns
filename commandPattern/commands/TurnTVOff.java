package commandPattern.commands;

import commandPattern.receivers.ElectronicDeviceInterface;

public class TurnTVOff implements CommandInterface {
	
	ElectronicDeviceInterface theDeviceInterface;
	
	public TurnTVOff(ElectronicDeviceInterface newDeviceInterface) {
		this.theDeviceInterface = newDeviceInterface;
	}
	
	
	@Override
	public void execute() {
		theDeviceInterface.off();
	}


	@Override
	public void undo() {
		theDeviceInterface.on();
	}


}