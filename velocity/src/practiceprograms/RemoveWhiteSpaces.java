package practiceprograms;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String str1 = "my name    is akanksha      sigedar,i am  a  soft  ware test  er ";

		String str2 = str1.replaceAll("\\s", "");
		System.out.println("string after replace is=" + str2);
	}

}
