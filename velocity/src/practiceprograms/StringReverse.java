package practiceprograms;

//using string builder 

public class StringReverse {

	public static void main(String[] args) {

		String s = "velocity testing academy"; // multiple words reverse by using string builder

		StringBuilder s1 = new StringBuilder(s);
		// s1.append(s);
		s1 = s1.reverse();
		System.out.println(s1);

		StringBuffer s2 = new StringBuffer(s); // multiple words reverse by using string buffer
		s2 = s2.reverse();
		System.out.println(s2);
	

	String s3 = "akanksha sigedar";
    char chars[] = s3.toCharArray();  // converted to character array and printed in reverse order
    for(int i=chars.length-1;i>=0;i--) { // last index we need to give length-1 index starts from 0 and length from 1
        System.out.print(chars[i]);
    }
	}
	}

/*
 * output 
 * ymedaca gnitset yticolev
 * ymedaca gnitset yticolev

 */




/*
 * //public class FinalReverseWithoutUsingInbuiltFunction{ // public static void
 * main(String[] args) { String s3 = "Saket Saurav"; 
 * char chars[] =s3.toCharArray(); // converted to character array and printed in reverse
 * order 
 * for(int i=chars.length;i>=0;i--) 
 * { System.out.print(chars[i]); }
 * 
 * } 
 * }
 */