package practiceprograms;

public class CountWordsUsingArray {

	public static void main(String[] args) {

		String str = "i am working on manual testing and automation testing";

		int count = 0;
		String[] str1 = str.split(" ");
		// count of words in string using array without any loop

		System.out.println("count of words in string str is " + str1.length);

		// count of words in string using array with for loop
		for (int i = 0; i < str1.length; i++) {
			count++;
		}
		System.out.println("count of words in string str using for loop is " + count);

	}

}


/*
 * output count of words in string str is 9 count of words in string str using
 * for loop is 9
 */

