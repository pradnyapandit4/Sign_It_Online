package org.signitonline.utilities;

import java.io.IOException;

public class Utilities {

	public static void hardWait(int timeInSeconds) {
		try {
			Thread.sleep(timeInSeconds * 1000);
		}catch(InterruptedException e) {
			
		}
	}
	
	public static void terminatorDriverInstances() {
		try {
			Runtime.getRuntime().exec("");
		}catch(IOException e) {
			
		}
	}
}
