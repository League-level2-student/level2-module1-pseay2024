package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList class
		ArrayList<String> ss = new ArrayList<String>();
		// 2. Add five Strings to your list
		ss.add("aae");
		ss.add("abr");
		ss.add("ace");
		ss.add("adq");
		ss.add("aeh");

		// 3. Print all the Strings using a standard for-each loop
		for (String s : ss) {
			System.out.println(s);
		}
		// 4. Print all the Strings using a for loop
		for (int i = 0; i < ss.size(); i++) {
			System.out.println(ss.get(i));
		}
		// 5. Print only the even numbered elements in the list.
		for (int i = 0; i < ss.size(); i++) {
			if (i % 2 == 0) {
				System.out.println(ss.get(i));
			}
		}
		// 6. Print all the Strings in reverse order.
		for (int i = ss.size() - 1; i > 0; i--) {
			System.out.println(ss.get(i));
		}
		System.out.println("only eeeeees");
		// 7. Print only the Strings that have the letter 'e' in them.
		for (String s : ss) {
			if (s.contains("e")) {
				System.out.println(s);
			}
		}
	}
}
