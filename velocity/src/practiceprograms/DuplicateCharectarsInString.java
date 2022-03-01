package practiceprograms;

public class DuplicateCharectarsInString {

	public static void main(String[] args) {
		String str = new String("ajhsdfgggddhajkhdjahhfvhgfahj");
		int count = 0;
		char[] chars = str.toCharArray();// converted to char array

		System.out.println("duplicate char are ");
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++)

			{
				if (chars[i] == chars[j])//duplicate charactar cheking.
					System.out.println(chars[j]); 
				count++;
				break;

			}
		}

	}

}
