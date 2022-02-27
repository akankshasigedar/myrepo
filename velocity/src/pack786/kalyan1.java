package pack786;

public class kalyan1 extends kalyan {
	
	void demo() 

	{
	System.out.println("demo");	
	}
	
	
	void beta()
	{
		System.out.println("beta");
	}
	
	public static void main(String[] args) {
		
		kalyan1.statictest();
		
		kalyan1 d=new kalyan1();
		d.demo();
		d.beta();
		d.test();
		
	}

}



/*
 output
 statictest
demo
beta
non static test
*/