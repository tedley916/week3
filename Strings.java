package com.weekly.week3;

//package com.weekly.week3;

public class Strings {

	// Week 3 Arrays and Methods

	public static void main (String[] args) {

		if (!isCommandLineValid(args)) {
			return;
		}
		
		final String clArg = args[0];
		switch (clArg) {
		case "task1" :   // infinite loops
			example1();
			break;
		case "task2" :
			example2();
			break;
		default:
			System.out.print("Invalid command line argument.  Valid arguments are task1, task2, task3, task4");
		}
	}
	
	
	static void example1() {	
		System.out.println ("primitive data type initialization");
		double apple = 3.1415;
		double pi = 3.1415;
		System.out.println (apple == pi);

		//     Example from video
		System.out.println ("\n\n\n\n\n\n\nString initialization from the video");
		String foo = new String("fooBar");
		String bar = new String("fooBar");
		System.out.println ("contents the same: " + foo.equals(bar));
		System.out.println ("objects the same: " + (foo == bar));
		
		System.out.println ("\n\n\n\n\n\n\nMemory effecient string creation behaves differently (string pool)"); 
		String big = "bigMac";
		String mac = "bigMac";
		System.out.println ("contents the same: " + big.equals(mac));
		System.out.println ("objects the same: " + (big == mac));   // why???
	}
	
	static void example2() {

		
//		String immutability
		String fruit = "banana";
		fruit.concat(" split!");
		System.out.println (fruit);    // cannot change the value of a string
		
		fruit = fruit.concat(" split");
		System.out.println (fruit);
		
		fruit += " with nuts";             // but you can reassign the string value
		System.out.println (fruit);
		
		fruit = fruit + " and a cherry on top!";
		System.out.println (fruit);
	}

	
	static boolean isCommandLineValid(String[] clArgs) {
		boolean isValid = true;

		if (clArgs.length  == 0) {
			System.out.println ("Please run again and enter a command line argument!");
			isValid = false;
		}
		if (clArgs.length > 1) {
			System.out.println ("Command line Arguments");
			for (String clArg: clArgs) {
				System.out.println (clArg);
			}
			isValid = false;
		}
		return isValid;
	}
	
}  // END class
