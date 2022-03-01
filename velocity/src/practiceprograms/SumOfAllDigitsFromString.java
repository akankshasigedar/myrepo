package practiceprograms;

public class SumOfAllDigitsFromString {

	public static void main(String[] args) {
		// Java program to calculate sum of all digits from the string

		String str = "akankshais29yearsoldandfamilyincludes5membersflatnumberis203.";
		int sum = 0;
		String temp = "0";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i); // To read each character from given string
			if (Character.isDigit(ch)) { // It is checking from each character if it contains digits
				temp = temp + ch; // add it to the temp string
			} else {
				sum = sum + Integer.parseInt(temp); // Sum the all digits
				temp = "0"; // again make the temp as null
			}
		}
		System.out.println("The sum of digitys is " + sum);
	}

}
