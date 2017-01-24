package commandPattern.commands;

import java.util.List;

import commandPattern.receivers.ElectronicDeviceInterface;

public class TurnItAllOff implements CommandInterface {
	
	List<ElectronicDeviceInterface> theDevices;
	
	public TurnItAllOff(List<ElectronicDeviceInterface> theDevices) {
		this.theDevices = theDevices;
	}
	
	
	@Override
	public void execute() {
		
		for (ElectronicDeviceInterface device : theDevices) {
			device.off();
		}
		
	}
	
	@Override
	public void undo() {
		
		for (ElectronicDeviceInterface device : theDevices) {
			device.on();
		}
		
	}


}
