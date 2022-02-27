package pack786;
                                          // program for access specifier 1
public class abc{ 
	
        public static int d =36; //public specifier
		       static int e =67; //default
		private static int f= 85; //private
		protected static int g=43; //protected
		
		
		//Non static test
		public int h =100; //public specifier
	        int i =200; //default
	    private int j= 300; //private
	    protected int k=400; //protected
		
		
		
		public static void main(String[] args) 
		
		{
			System.out.println(d);
			System.out.println(e);  
			System.out.println(f);
			System.out.println(g);
			
			//Create the object for abc class
			abc obj=new abc();
			System.out.println(obj.h);
			System.out.println(obj.i);
			System.out.println(obj.j);
			System.out.println(obj.k);
		
	
	}
}
//all static variables are called in same class. For printing/calling static variables/methods no need to create the object of the class
//all non static  variables called in same class
//For non static you need to create an object of that class and by the reference of the object you can call that variables/methods


//abc main program calling in package-test1. java and out of package class-test.java