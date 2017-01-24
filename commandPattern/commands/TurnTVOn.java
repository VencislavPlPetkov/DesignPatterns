package commandPattern.commands;

import commandPattern.receivers.ElectronicDeviceInterface;

public class TurnTVOn implements CommandInterface {
	
	ElectronicDeviceInterface theDeviceInterface;
	
	public TurnTVOn(ElectronicDeviceInterface newDeviceInterface) {
		this.theDeviceInterface = newDeviceInterface;
	}
	
	
	@Override
	public void execute() {
		theDeviceInterface.on();
	}


	@Override
	public void undo() {
		theDeviceInterface.off();
	}

}
