package javapractice;
                           //calling abc.java variables in test class(different package & class)
import pack786.abc;

public class test extends abc {

	public static void main(String[] args)

	{
		System.out.println(abc.d); // public
		// System.out.println(abc.e); //default
		// System.out.println(abc.f); //private
		System.out.println(abc.g); // protected

		// non static object call in different class also in package
		abc obj2 = new abc();
		System.out.println(obj2.h); // public
		//System.out.println(obj2.i); // default
		test t = new test();
		// System.out.println(obj2.j); //private
		System.out.println(t.k); // protected
	}

}
// different package different class so we use extends to inherit properties of
//since i is a default variable  and default variables scope is in same package, so it will not get called in another package
//For calling protected variable in different package and different class using inheritance, 
//you have to create an object of the class in which you need to call the protected word.