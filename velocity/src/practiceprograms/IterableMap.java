package practiceprograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterableMap {

	public static void main(String[] args) {

		HashMap<Integer, String> testMap = new HashMap<Integer, String>();
		testMap.put(1, "vinay");
		testMap.put(2, "nikhil");
		testMap.put(3, "anup");
		testMap.put(4, "vaibhav");
		testMap.put(5, null);
		System.out.println(testMap.size());

		Iterator itr = testMap.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, String> me = (Map.Entry<Integer,String>) itr.next();
			System.out.println("the key is" + me.getKey() + "the value is" + me.getValue());
		}

		for (Map.Entry<Integer, String> me2 : testMap.entrySet()) {
			System.out.println("the key is" + me2.getKey() + "the value is" + me2.getValue());
		}
	}
}
