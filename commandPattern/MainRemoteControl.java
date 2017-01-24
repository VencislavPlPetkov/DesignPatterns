package commandPattern;

import java.util.ArrayList;
import java.util.List;

import commandPattern.commands.TurnItAllOff;
import commandPattern.commands.TurnTVOff;
import commandPattern.commands.TurnTVOn;
import commandPattern.commands.TurnTVUp;
import commandPattern.receivers.ElectronicDeviceInterface;
import commandPattern.receivers.Radio;
import commandPattern.receivers.Television;

public class MainRemoteControl {

	public static void main(String[] args) {

		// Turn TV On

		ElectronicDeviceInterface newDevice = TVRemote.getDevice();

		TurnTVOn onCommand = new TurnTVOn(newDevice);

		DeviceButton onPressed = new DeviceButton(onCommand);

		onPressed.press();
		
		System.out.println();

		// Turn TV Off

		TurnTVOff offCommand = new TurnTVOff(newDevice);

		onPressed = new DeviceButton(offCommand);

		onPressed.press();
		
		System.out.println();
		
		// Turn Volume Up

		TurnTVUp volUpCommand = new TurnTVUp(newDevice);

		onPressed = new DeviceButton(volUpCommand);

		onPressed.press();
		onPressed.press();
		
		System.out.println();
		
		// Turn Off TV and Radio

		Television theTV = new Television();

		Radio theRadio = new Radio();

		List<ElectronicDeviceInterface> allDevices = new ArrayList<ElectronicDeviceInterface>();

		allDevices.add(theTV);
		allDevices.add(theRadio);

		TurnItAllOff turnOffDevices = new TurnItAllOff(allDevices);

		DeviceButton turnThemOff = new DeviceButton(turnOffDevices);

		turnThemOff.press();
		
		System.out.println();
		
		// Undo Commands
		
		turnThemOff.pressUndo();

	}
}
