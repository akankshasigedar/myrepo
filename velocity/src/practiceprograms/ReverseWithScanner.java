package practiceprograms;

import java.util.Scanner;

public class ReverseWithScanner {

	public static void main(String[] args) {
		
		String str;
		Scanner g=new Scanner(System.in) ;
		System.out.println("enter the string :");
	        
	        str = g.nextLine();
	        g.close();
	        String[] token = str.split("");    //used split method to print in reverse order with token
	        for(int i=token.length-1; i>=0; i--)
	        {
	            System.out.print(token[i] + "");
	        }
	         
	    }
	 
	}

	
