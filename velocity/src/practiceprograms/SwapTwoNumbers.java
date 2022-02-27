package practiceprograms;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int x, y; // temp;
		System.out.println("enter the two numbers");
		Scanner number = new Scanner(System.in);
		x = number.nextInt();
		y = number.nextInt();

		System.out.println("before swapping -" + x + "," + y);
		// temp=x;
		// x=y;
		// y=temp;

		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("after swapping -" + x + "," + y);

		/*
		 * output 
		 * enter the two numbers 20 30 
		 * before swapping -20,30 
		 * after swapping-30,20
		 */

	}

}
