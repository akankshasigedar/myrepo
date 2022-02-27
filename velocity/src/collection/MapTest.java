package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {

		Map<Integer, String> p = new HashMap<Integer, String>();

		p.put(1, "Vinay");// map allows multiple null values but only one null key.
		p.put(2, null);
		p.put(3, "seema");
		p.put(null, null);
		p.put(null, "abc");

		System.out.println(p);

		// iterating map by using for each loop

		for (Map.Entry<Integer, String> j : p.entrySet())// we need to convert the map into set using entry set
		// method in order to iterate over a map.
		{
			System.out.println("the key is -" + j.getKey() + "the value is -" + j.getValue());
		}

		// iterating map by using iterator

		Iterator<?> itr = p.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry k = (Map.Entry) itr.next();
			System.out.println("the key is -" + k.getKey() + "the value is -" + k.getValue());
		}
	}

}
