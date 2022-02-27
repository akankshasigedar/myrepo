package practiceprograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
        int n ;
        boolean isPrime =true;
		Scanner n1 = new Scanner(System.in);
		System.out.println("enter the number");
		n = n1.nextInt();
		n1.close();
	
	for(int i=2;i<n;i++) 
	{       
			if (n%i==0)
			{
				isPrime=false;
				System.out.println("number is not prime");
			     break;
			 }
	}
	   
	if(isPrime) 
	
	System.out.println(n + "is prime number");
	
	else
		System.out.println(n+"is not prime");
		

	}
}

