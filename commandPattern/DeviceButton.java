package commandPattern;

import commandPattern.commands.CommandInterface;

public class DeviceButton {
	
	// Invoker
	
	CommandInterface commandInterface;

	public DeviceButton(CommandInterface commandInterface) {
		this.commandInterface = commandInterface;
	}

	public void press() {
		commandInterface.execute();
	}
	
	public void pressUndo() {
		commandInterface.undo();
	}

}
