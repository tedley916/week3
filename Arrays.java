package com.weekly.week3;

import java.util.Scanner;

public class Arrays 
{

		public static void main(String[] args) {
			if (!isCommandLineValid(args)) {
				return;
			}
		
		final String clArg = args[0];
		switch (clArg) {
		case "example1" :
			example1();
			break;
		case "example2" :
			example2();
			break;
		case "example3" :
			 // int[] arrayOfInts = new int[6];  
			 // int[] arrayOfInts = new int[] {4,5,3,10,2,6,7,8};
			 // (arrayOfInts);
		
			System.out.println ( "smallest array element: " + example3a( new int[] {4,5,3,10,2,6,1,8}));
			System.out.println ( "smallest array element: " + example3b( new int[] {4,5,3,10,2,6,1,8}));
			break;
		case "example4" :
			example4();
			break;
		case "example5" :
			example5();
			break;
		case "example6" :
			example6();
			break;
		default:
			System.out.print("Invalid command line argument.  Valid arguments are example1, example2, example3, example4");
		}
	}

	// example 1
	static void example1() {
		// Initializing arrays
		
		System.out.println("----- int ----");
		
		int[] dogs = new int[4];
		
		int foo = 999;
		dogs[0] = foo;
		dogs[1] = 2;
		dogs[2] = 4;
		dogs[3] = 7;
		// dogs[4] = 33;
		
		for (int x = 0; x < dogs.length; x++) {
			System.out.println("dogs[" + x + "] = " + dogs[x]);
		}
		
		System.out.println("----- String ----");
		
		String[] colors1 = { "Red", "Green", "Yellow", "blue" };
		
		/// switch these
		String[] colors2 = colors1;              // shallow copy
		//String[] colors2 = colors1.clone();    // deep copy
		
		colors2[2] = "black";
		System.out.println ("ojects are equal : " + (colors1 == colors2));
	
		for (int x = 0; x < colors2.length; x++)
		{
			System.out.println (colors1[x] + " " + colors2[x]);
		}
		
	}
	
	// example 2
	static void example2()	{
		/*
		Create & Return An Array of Characters: In the method wordToArray take the value 
		of userWord and turn it into an array of char taking each letter in userWord and 
		storing it into that array. Name your new array variable charArray and return that 
		variable in the method wordToArray.
		*/
		
		// get user word
		System.out.println ("Enter a word");
		Scanner scanner = new Scanner (System.in);
		String userWord = scanner.nextLine();
		
		// create character array with the same length as the userWord
		char[] charArray = new char[userWord.length()];
		
		// fill the character array with the characters from user word
		for (int idx = 0; idx < userWord.length(); idx++) {
			charArray[idx] = userWord.charAt(idx);
		}
		
		System.out.println("Print the characters");
		for (int x = 0; x < charArray.length; x++) {
			System.out.print(charArray[x]);
		}
		System.out.println("\nPrint out using a enhanced for loop");
		// Enhanced for loop
		for (char letter : charArray) {
			System.out.print(letter);
		}
	}

	// finds the smallest array value
	// example 3
	// new int[] {4,5,3,10,2,6,1,8}	
	
	static int example3a(int [] numbers) {
		int smallest = numbers[0];
		System.out.println ("3a");
		for (int index = 0; index < numbers.length; index++) {
			if(numbers[index] < smallest) {
				smallest = numbers[index];
			}
			System.out.println ("numbers[" + index + "] = " + numbers[index] + ", smallest = " + smallest);		
		} return smallest;		
	}
	
	static int example3b(int [] numbers) {
		int smallest = numbers[0];
		System.out.println ("3b");
		for(int number: numbers) {
			if(number < smallest) {
				smallest = number;
			}
			System.out.println ("number = " + number + ", smallest = " + smallest);		
		} return smallest;		
	}
	
	
	// example 4 OPTIONAL quiz question
	static void example4() {
		// error checking for input.
		System.out.println ("Enter two integers greater that 2");
		int dimX = 0, dimY = 0;
		do {
			Scanner scanner = new Scanner (System.in);
			dimX = scanner.nextInt();
			dimY = scanner.nextInt();
			if (dimX <= 2 || dimY <= 2)
			{
				System.out.println ("both values must be > 2");
			}
		} while (dimX <= 2 || dimY <= 2);
	
		// load the array
		int x, y;
		int[][] arr = new int[dimX][dimY];
		for (x = 0; x < dimX; x++) {
			for (y = 0; y < dimY; y++) {
//				arr [x][y] = y;
				arr [x][y] = y + (x * 10);
			}
		}
		// print the array
		System.out.println (dimX + " arrays of " + dimY + " elements each");
		for (x = 0; x < dimX; x++) {
			for (y = 0; y < dimY; y++) {
				System.out.print ( arr[x][y] + " " );
			}
			System.out.println ();
		}

		//System.out.println("Last element of first array : " + arr[2][arr[0].length - 1]);
		
	}
	
	// example 6, reverse the array
	static void example5() {
		System.out.println ("Enter 5 integers and they will be reversed");
		int[] nums = new int[5];	
		Scanner scanner = new Scanner (System.in);
		
		// read the numbers and stick into an array
		for (int idx = 0; idx < nums.length; idx++) {			
			nums[idx] = scanner.nextInt();
		}
		
		// reverse the numbers, take from numbs array and put into snum
		int[] smun = new int[5];
		for (int inc = 0, dec = nums.length-1; dec >= 0 /* || inc < mums.length */; inc++, dec--) {
			smun[dec] = nums[inc];
		}			
		/*
		 * inc dec
		 * 0   4
		 * 1   3
		 * 2   2
		 * 3   1
		 * 4   0
		 */
		
		// print out snum
		for (int x = 0; x < smun.length; x++) {
			System.out.print(smun[x] + " ");
		}
	}
	
	// add two smaller arrays 
	static void example6() {
		String[] arr = new String[3];
		String word1 = "word1";
		String word2 = "word2";
		String word3 = "word3";
		arr[0] = word1;
		arr[1] = word2;
		arr[2] = word3;
		
		String[] newArr = new String[3];
		String word4 = "word4";
		String word5 = "word5";
		String word6 = "word6";
		newArr[0] = word4;
		newArr[1] = word5;
		newArr[2] = word6;
		
		String[] bigArr = new String[arr.length + newArr.length];
	
		// load the bigArr with the values from arr
		int count=0; // keeps track of the the last element inserted into the bigArr.  
		for (int idx = 0; idx < arr.length; idx++)
		{
			bigArr[idx] = arr[idx];
			System.out.println ("count = " + count);
			count++;
		}
		
		// load the bigArr with values from the newArr
		for (int x = 0; x < newArr.length; x++) {
			System.out.println ("count = " + count);
			bigArr[count++] = newArr[x];
		}
		
		for (int idx = 0; idx < bigArr.length; idx++) {
			System.out.println (bigArr[idx]);
		}
	}
	
	static boolean isCommandLineValid(String[] clArgs) {
		boolean isValid = true;

		if (clArgs.length  == 0) {
			System.out.println ("Please run again and enter a command line argument!");
			isValid = false;
		} else if (clArgs.length > 1) {
			System.out.println ("The following " + clArgs.length + " were provided.\nPlease run again with one only.");
			for (String clArg: clArgs) {
				System.out.println (clArg);
			}
			isValid = false;
		}
		return isValid;
	}
	
	
	
} // END class
