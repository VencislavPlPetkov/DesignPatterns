package commandPattern;

import commandPattern.receivers.ElectronicDeviceInterface;
import commandPattern.receivers.Television;

public class TVRemote {

	public static ElectronicDeviceInterface getDevice() {
		return new Television(); 
	}

}
