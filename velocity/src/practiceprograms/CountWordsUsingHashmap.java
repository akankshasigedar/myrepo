package practiceprograms;

import java.util.HashMap;

//count of word using hash map

public class CountWordsUsingHashmap {

	public static void main(String[] args) {
		String str2 = "i am working on manual testing and automation testing";
		String[] split = str2.split(" "); // string array used split function and stored each word in array based on
											// space

		for (int j = 0; j < split.length; j++) {
			System.out.println(split[j]);
		}
		// declaration hash map

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		// for loop to add the word in the map and find the count of word

		for (int i = 0; i < split.length; i++) {
			if (map.containsKey(split[i])) {
				int count = map.get(split[i]); // get the word from the array

				map.put(split[i], count + 1);// put the word in the map and increment the position by one
			} else {
				map.put(split[i], 1); // if the word is not present then increment position by one`
			}
		}
		System.out.println(map);
	}

}


/*
 * output i am working on manual testing and automation testing {automation=1,
 * and=1, testing=2, i=1, working=1, am=1, manual=1, on=1}
 */