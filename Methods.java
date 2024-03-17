package com.weekly.week3;

import java.util.Scanner;

public class Methods {

	// Week 3 Arrays and Methods

	public static void main (String[] args) {

		if (!isCommandLineValid(args)) {
			return;
		}
		
		
		final String example1 = "example1";
		
		final String clArg = args[0];
		switch (clArg) {
		case "example1" :   
			example1();
			break;
		case "example2" :
			example2();
			break;
		case "example3" :
			example3();
			break;
		case "example4" :
			System.out.println ("The array contained " + example4() + " numbers.");
			break;
		case "example5" :
			example5();
			break;
		case "example6" :
			example6(args[1]);
			break;
		default:
			System.out.print("Invalid command line argument.  Valid arguments are example1, example2, example3, example4");
		}
	}
	
	
	/****************************************************/ 
	
	public static void example1() {
		int sum1 = returnSum1(33,33,33);
		System.out.println (sum1);

		int[] justNums = new int[] {10, 20, 30};
		int sum2 = returnSum2(justNums);
		System.out.println (sum2);
		
		int sum3 = returnSum3 (1,2,3,202, 4, 9, 2022);
		System.out.println (sum3);
	}

	public static int returnSum1(int num1, int num2, int num3 ) {
		return num1 + num2 + num3;
	}
	
	public static int returnSum2(int[] justNums) {
		int sumNum = 0;
		for (int justNum : justNums) {
			sumNum += justNum;
		}
		return sumNum;
	}
	
	// public static int returnSome(int[] nums)	
	public static int returnSum3(int... nums)
	{
		System.out.println ("nums length = " + nums.length);
		// int idx = nums[44];
		int sum = 0;
		for (int num : nums ) {
			sum += num;
		}
		return sum;
	}
	
	/****************************************************/ 
	
	public static void example2() {
		final String FUZZ = "Fuzz", BUZZ = "Buzz";
		boolean fuzz = false, buzz = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println ("Enter an integer");
		int number = scanner.nextInt();
		if (number % 3 == 0) {
			fuzz = true;
			System.out.print(FUZZ);
		}
		if (number % 5 == 0 ) {
			buzz = true;
			System.out.print(BUZZ);
		}
		if (!fuzz && !buzz) {
			System.out.println ("Hmaybe a prime, maybe...");
		}
	}

	
	public static void example3() {
		String password;
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter Password: ");
			password = scanner.next();
			boolean isValidPw = passwordChecker(password);
			if (!isValidPw) {
				System.out.println ("enter Valid password");
			} else {
				System.out.println ("valid password, Logging into system portal..");
				break;
			}
		} while (password.length() != 1);
	}

	/**
	 * Password must be at least 8 chars long and contain one of the following !$&%
	 * @param password
	 * @return true if password is valid, false if it is invalid
	 */
	public static boolean passwordChecker(String password) {
		boolean pwLen = false, pwChars = false;
		for (int idx = 0; idx < password.length(); idx++) {
			if (password.charAt(idx) == '!' ||
				password.charAt(idx) == '$' ||
				password.charAt(idx) == '&' ||
				password.charAt(idx) == '%') {
					pwChars = true;
					break;
			}
		}  // for
//		if (password.contains("!") ||
//			password.contains("$") ||
//			password.contains("&") ||
//			password.contains("%"))	{
//				pwChars = true;
//		}
		if (password.length() >= 8) {
			pwLen = true;
		}
		return pwLen && pwChars;
	}

	
	/****************************************************/ 
	// take 5 numbers
	// create an array with those 5 numbers
	// print the array
	
	public static int example4() {
		int[] intArray5 = createArray5(10, 20, 30, 40, 50);
		for (int idx = 0; idx < intArray5.length; idx++) {
			System.out.println (intArray5[idx]);
		}	
		return intArray5.length;
	}

	public static int[] createArray5(int a, int b, int c, int d, int e) {
		int[] arr = new int[5];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		arr[3] = d;
		arr[4] = e;
		
		return arr;
	}

	/****************************************************/ 
	// Using var args
	// take 5 numbers
	// create an array with those 5 numbers
	// print the array
	
	
	public static void example5() {
		int[] intArrayN = createArrayN(-1, 44, 10, 4, 5, 1023);
		for (int idx = 0; idx < intArrayN.length; idx++) {
			System.out.println (intArrayN[idx]);	
		}
		System.out.println ("This array has " + intArrayN.length + " elements" );
	}
	
	public static int[] createArrayN(int... nums) {
		int[] arr = new int[nums.length];
		int idx = 0;
		for (int num : nums) {
			arr[idx++] = num;
		}
		return arr;
	}
	
	// palindrome example
	/*
	 * civic, rotor, level, racecar, kayak, madam, deified, mom, dad, pop, repaper
	 */
	public static void example6(String phrase) {
		//   
		boolean palindrome = true;
		for (int beginIdx = 0, endIdx = phrase.length()-1; 
				beginIdx < phrase.length()/2 
				;beginIdx++, endIdx--) {
			if (phrase.charAt(beginIdx) != phrase.charAt(endIdx)) {
				palindrome = false;
				break;
			}
		}
		// String not = palindrome ? "" : "not";
		System.out.println (phrase + " is " + (palindrome ? "" : "not ") + "a palindrome.");
	}

	/****************************************************/ 
		
	private static boolean isCommandLineValid(String[] clArgs) {
		boolean isValid = true;

		if (clArgs.length  == 0) {
			System.out.println ("Please run again and enter a command line argument!");
			isValid = false;
		}
		if (clArgs.length > 2) {
			System.out.println ("Too many Command line Arguments");
			for (String clArg: clArgs) {
				System.out.println (clArg);
			}
			isValid = false;
		}
		return isValid;
	}

}  // END class
