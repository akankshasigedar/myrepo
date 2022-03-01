package practiceprograms;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int c = 0, a = 0, temp;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		int n = sc.nextInt();
		sc.close();
		temp = n;
		while (n > 0) {
			a = n % 10;// mod
			n = n / 10;// quotient
			c = c + (a * a * a);
		}
		if (temp == c) {
			System.out.println("armstrong number");
		} else {
			System.out.println("not an armstrong number");
		}

	}

}
