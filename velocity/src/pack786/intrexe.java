package pack786;
//interface execution program
public class intrexe {
	public static void main(String[] args) {
	
	
		//delhi e=new delhi();
		
		delhi1 g=new delhi1();
		g.test();
		g.demo();
		
		System.out.println(delhi1.a);
		System.out.println(delhi.a);
		
		//delhi1.a=67;  final value can't be changed.
		
		
		//____________________________________________________________________
		
		//delhi1.statictest();
		delhi.statictest();
		
		// calling of default method after overriding in interface i.e. 
		//default methods gets override but not static method.
		
		g.defaulttest();
		
		
		
	//output	
		
/*public test
		public demo
		45
		45
		 static test in interface
		default test of delhi1
		*/

		
		
	}

}
