package inheritance;

public class inherit3 {
	
	public static void main(String[] args) {
		inherit1.test();
		System.out.println(inherit1.s);
		
		inherit1 m=new inherit1();
		m.alpha(123);
		System.out.println(m.g);
		
		inherit2 k= new inherit2();
		k.set();
		
		//normal call from inherit 1 & inherit2 class
		
		//inheritance call
		    k.alpha(234);
	        inherit2.test();
	         k.set();
	         System.out.println(inherit2.s);
	         System.out.println(m.g);
	       }

}
