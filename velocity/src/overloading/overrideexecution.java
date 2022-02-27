package overloading;

public class overrideexecution {
	public static void main(String[] args) {
		
				
		override1 h=new override1();
		h.test();
		h.test(45);
	
		override g=new override();
		g.test();
	//	g.test(78);

		
		
		/*method hiding
		override.demo();
		override1.demo();
		 */
		 
	}

}
