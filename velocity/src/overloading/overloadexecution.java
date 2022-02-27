package overloading;

public class overloadexecution {
	public static void main(String[] args) {
		
		overload.test();
		overload.test(123);
		
		overload d=new overload();
		d.demo();
		d.demo(23,'#');
		
		
	}

}

//output

/*static method with zero argument
static method with with int argument
non static method with zero argument
non static method with argument23# */
