package com.weekly.week3;

import java.util.Scanner;

public class SumTheDigits {

		static int sumOfDigits(int digits) {
		    
		    // WRITE YOUR CODE HERE

	        String strNum = String.valueOf(digits);
	        int sum = 0;	        
	        for(int x = 0; x < strNum.length(); x++) {
	            char tempChar = strNum.charAt(x);
	            sum += Integer.parseInt(String.valueOf(tempChar));
	        }
	        return sum;
		}

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int digits = in.nextInt();
			int sumAll = sumOfDigits(digits);
			System.out.println("The sum of all digits for the value " + digits + " is " + sumAll + ".");
		}

}
