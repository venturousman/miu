package prob4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * a. Use Arrays.sort() to sort the names by ignore case using Method reference.
 * b. Convert the sorted names array into List.
 * c. Print the sorted list using method reference.
 */

public class Solution {

	public static void printStrings(String[] items) {
		String combined = String.join(", ", items);
		System.out.println(combined);
	}

	public static void main(String[] args) {
		String[] names = { "Alexis", "Tim", "Kyleen", "Kristy" };
//		System.out.println("Before sorting ==========");
//		printStrings(names);

		// a. Use Arrays.sort() to sort the names by ignore case using Method reference.
//		Arrays.sort(names, (x, y) -> x.compareToIgnoreCase(y));
		Arrays.sort(names, String::compareToIgnoreCase);

//		System.out.println("\nAfter sorting ==========");
//		printStrings(names);

		// b. Convert the sorted names array into List.
		List<String> namesList = Arrays.asList(names);
		List<String> namesList2 = Stream.of(names).toList();

//		System.out.println("\nb. Convert the sorted names array into List.");
//		System.out.println(namesList);

		// c. Print the sorted list using method reference.
//		Consumer<String> pc = (x) -> System.out.println(x);
//		Consumer<String> pc = System.out::println;
//		namesList.forEach(pc);
		namesList.forEach(System.out::println);
	}

}
