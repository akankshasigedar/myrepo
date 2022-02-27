package casting;

public class akanksha {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		// Upcasting example
		parent p = new child();
		p.show();
		// p.display(); This method is available in child class and we have created
		// object of parent class so we can only access parent class methods.

		// Downcasting example
		// child c=new parent(); In downcasting directly creatingb child class object
		// with parent reference is not possible we have to cast that.
		
		child c=(child)p;
		c.display();
		c.show();
	}

}
