package overloading;

public class override1 extends override {
	
	public void test(int g)
	{
		System.out.println("sub class");
	}
}
//test() and test(int g)
//static call

/*public static void demo()
{
	System.out.println("sub class");
}
*/
//hide==> override.demo()