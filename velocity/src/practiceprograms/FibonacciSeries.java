package practiceprograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num, a = 0, b = 0, c = 1;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number");
		num = in.nextInt();
		System.out.println("fabonacci series number is");
		for (int i = 0; i < num; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.println(a+ "");//to print number from a

		}

	}

}

/*
 * output enter the number 10 fabonacci series number is 0 1 1 2 3 5 8 13 21 34
 */