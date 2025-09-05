package com.weekly.week3;

public class CommandLine
{

	public static void main(String[] args) {
		if (!isCommandLineValid(args)) {
			System.out.println ("Enter at least one command line argument!");
			return;
		}
		for (int index = 0; index < args.length; index++) {
			System.out.println ("args[" + index + "] = " + args[index]);
		}
	
	}
	
	static boolean isCommandLineValid(String[] clArgs) {
		boolean isValid = true;

		if (clArgs.length  == 0) {
			System.out.println ("Please run again and enter a command line argument!");
			isValid = false;
		} else  {
			isValid = true;
		}
		return isValid;
	}
	
} // END class

// PATH: 
// /Volumes/USB1/work/projects/test-play/Weekly/src/com/weekly/week3
// /users/tedstandley/Documents/work/projects/test-play/Weekly/src/com/weekly/week3
