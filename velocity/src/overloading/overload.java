package overloading;

public class overload {

	public static void test()
	{
		System.out.println("static method with zero argument");
	} 
	static void test(int a)
	{
	System.out.println("static method with with int argument");	
	}
	
	void demo() 
	{
		System.out.println("non static method with zero argument");
	}

	void demo(int b, char c)
	{
		System.out.println("non static method with argument"+23+'#');
	}
	
}
