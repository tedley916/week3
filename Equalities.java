package com.weekly.week3;

public class Equalities {

	// Week 3 Arrays and Methods

	public static void main (String[] args) {

		if (!isCommandLineValid(args)) {
			return;
		}
		
		final String clArg = args[0];
		switch (clArg) {

		case "example1" :   // string immutability
			example1();
			break;
		case "example2" :   // String initialization
			example2();
			break;
		case "example3" :   // String initialization 2
			example3();
			break;
		default:
			System.out.print("Invalid command line argument.  Valid arguments are example1, example2");
		}
	}
	
	
	static void example1() {	
		//	String immutability
		System.out.println ("example1");
		String fruit = "banana";
		System.out.println (fruit); 
		
		fruit.concat(" split!");
		System.out.println (fruit);    // cannot 'change' the value of a string but you can reassign
		
		fruit = fruit.concat(" split");  // similar to x = x + 1;
		System.out.println (fruit);
		
		fruit += " with nuts";             // but you can reassign the string value
		System.out.println (fruit);
		
		fruit = fruit + " and a cherry on top!";
		System.out.println (fruit);
	}

	
	
	static void example2() {	
		System.out.println ("example2");
		System.out.println ("0. primitive data type initialization");
		double apple = 3.1415;
		double pi = 3.1415;
		System.out.println (apple == pi);

		System.out.println ("\n1. String initialization from the video");
		String car1 = new String("Ford Mustang");
		String car2 = new String("Ford Mustang");
		System.out.println ("a. contents the same: " + car1.equals(car2));  // both are Ford Mustangs
		System.out.println ("b. objects the same: " + (car1 == car2));  // VIN numbers are different
		
		// STRNG POOL SLIDES
		
		System.out.println ("\n2. Memory effecient string creation behaves differently (string pool)"); 
		String big = "bigMac";
		String mac = "bigMac";
		System.out.println ("a. contents the same: " + big.equals(mac));
		System.out.println ("b. objects the same: " + (big == mac));   // why???  SEE String pool slide
		
	}
	
	static void example3() {
		System.out.println ("example3");
        String foo = "foobar";
        String bar = "foobar";

        System.out.println (foo==bar);
        // since it is true both strings point to the same object

        foo = foo.concat("!");
        System.out.println (foo==bar);
        // notice they changed because you changed the contents 
        // of foo to point to some other string

        // as soon as "foobar" is not pointed to by anything, it's deleted from the string pool
        // thus being memory effecient.  If it's pointed to again, it's recreated in 
        // and added back into the sting pool 
        // managed by garbage collection.

        foo = new String ("apple");
        bar = new String ("apple");
        System.out.println (foo==bar);
        // different objects.  
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
