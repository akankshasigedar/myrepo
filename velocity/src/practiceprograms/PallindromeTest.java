package practiceprograms;

import java.util.Scanner;

public class PallindromeTest {

	public static void main(String[] args) {
		String original, reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		original = sc.nextLine();
		//char[] charst = original.toCharArray();// converted original string into character array
		int length = original.length();
		System.out.println(length);
		for (int i =length - 1; i>=0; i--) {
			reverse = reverse + original.charAt(i);// string is reversed
		}
		System.out.println("reverse string-" + reverse);

		if (original.equals(reverse)) // verified palindrome condition
		{
			System.out.println("string is palindrome");
		} else {
			System.out.println("string is not palindrome");
		}

	}

}

/*
 * output nayan 
 * 5 reverse 
 * string-nayan 
 * string is palindrome
 */