package javapractice;

public class Starpattern {
	public static void main(String[] args) {
		// 6 star 5 lines
		for (int a = 1; a <= 5; a++) {
			for (int b = 1; b <= 5; b++) {

				System.out.print("*");

			}
			System.out.println();

		}
		System.out.println("======================================================");

		// first pattern no of line = no of star

		for (int c = 1; c <= 5; c++) // line
		{
			for (int d = 1; d <= c; d++) // no ofstars
			{
				System.out.print("* "); // * space

			}
			System.out.println();

		}
		System.out.println("==================================================");
		// second pattern max no of line = max no of star

		for (int e = 5; e >= 1; e--) // no of starts
		{
			for (int f = 1; f <= e; f++) // line
			{
				System.out.print("* "); // * space

			}
			System.out.println();

		}
		System.out.println("==================================================");

		// third pattern three space then star
		for (int g = 1; g <= 5; g++) {       //Line
			for (int h = (5 - g); h >= 1; h--) {  //Space
				System.out.print(" ");
			}
			for (int h = 1; h <= g; h++) {    //Stars
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("==================================================");
		

		// fourth pattern reverse of third pattern(pyramid)
		for (int g1 = 5; g1 >= 1; g1--) {       //Line
			for (int h1 = (5 - g1); h1 >= 1; h1--) {  //Space
				System.out.print(" ");
			}
			for (int h1 = 1; h1 <= g1; h1++) {    //Stars
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("==================================================");
		
		//give space after star
		// fifth pattern three space then star(reverse pyramid)
				for (int g = 1; g <= 5; g++) {       //Line
					for (int h = (5 - g); h >= 1; h--) {  //Space
						System.out.print(" ");
					}
					for (int h = 1; h <= g; h++) {    //Stars
						System.out.print("* ");
					}
					System.out.println();
				}
				
				System.out.println("==================================================");

				// sixth pattern reverse of third pattern
				for (int g1 = 5; g1 >= 1; g1--) //line
				{       
					for (int h1 = (5 - g1); h1 >= 1; h1--) 
					{  
						System.out.print(" ");//space
					}
					    for (int h1 = 1; h1 <= g1; h1++) 
					         {    
						System.out.print("* ");//stars
					         }
					
					    System.out.println();
	}
	 
				//line 1=star 1,line 2=star 3,line3=star 5
	}
	
}
