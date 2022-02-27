package javapractice;

public class Play {
	
	static int a=45;  //static variable
	       int b=75;  // non static 
	       
	  Play()        //constructor
	  {
		a=34;
		b=67;
	 }
	  		
	public static void main(String[] args)
	{
	    System.out.println(a);
	    
	    Play x=new Play();// constructor call
	    System.out.println(x.b);
	   
	   // System.out.println(x.a);
	    
	    System.out.println(Play.a);
	    
	    System.out.println(a);
	}

}
