package pack786;

public class test1 {
	
public static void main(String[] args) 
	
	{
		System.out.println(abc.d); //public
		System.out.println(abc.e);  //default
		//System.out.println(abc.f);  //private
		System.out.println(abc.g);  //protected
		
		
		//non static object call in different class but in same package
		abc obj1=new abc();
		System.out.println(obj1.h); //public
		System.out.println(obj1.i); //default
		//System.out.println(obj1.j); //private
		System.out.println(obj1.k); //protected
}

}
 
//same package different class
//Since j is private it can't be accessed in different class