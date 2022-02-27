package collection;

import java.util.ArrayList;

import java.util.Iterator;

public class ListTest {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>(); // creating array list

		a.add(10); // adding elements in array list by add method
		a.add(16);
		a.add(80);
		a.add(45);
		a.add(70);
		System.out.println(a);// print the arraylist element

		int size = a.size();
		System.out.println("size" + size);
		System.out.println("--------------------------------------------------------------------");

		// to traverse ArrayList elements using the Iterator interface.

		System.out.println("traversing array through iterator");
		Iterator<Integer> itr = a.iterator(); // generating the iterator

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("--------------------------------------------------------------------");
		System.out.println("traversing array through for each loop");
		// traversing list through for each loop

		for (Integer number : a) {
			System.out.println(number);
			
		}
		System.out.println("--------------------------------------------------------------------");
	

	for (int i=0;i<size;i++) 
	{
	 //System.out.println(i);
	 System.out.println(a.get(i));
	}
}
}


/*
 * output [10, 16, 80, 45, 70] size5
 * --------------------------------------------------------------------
 * traversing array through iterator 10 16 80 45 70
 * --------------------------------------------------------------------
 * traversing array through for each loop 10 16 80 45 70
 * -------------------------------------------------------------------- 10 16 80
 * 45 70
 */