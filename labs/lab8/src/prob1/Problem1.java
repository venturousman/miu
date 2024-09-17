package prob1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Problem1 {

	// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/function/package-summary.html
	// Problem 1: Identify the suitable functional Interface from the Java API and
	// complete code for the given tasks.

	public static void main(String[] args) {
		// To understand functions as First class citizen
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		// Task 1: Identify the suitable interface to read the input and print doubled
		Consumer<Integer> action = (x) -> System.out.println(x * x);
		changeDouble(numbers, action);// Output: 2 4 6 8 10

		List<String> data = Arrays.asList("apple", "banana", "cherry");
		// Task 2: Take input of String and transform into Upper case
		Function<String, String> transformer = (s) -> s.toUpperCase();
		transformStrings(data, transformer);

		// Task 3: Check the inputs of given value is divisible by 5.
		List<Integer> inputs = Arrays.asList(10, 21, 12, 25, 33);
		Predicate<Integer> condition = (x) -> x % 5 == 0;
		printIf(inputs, condition);
	}

	public static void changeDouble(List<Integer> numbers, Consumer<Integer> action) {
		for (Integer number : numbers) {
			action.accept(number);
		}
	}

	public static void transformStrings(List<String> list, Function<String, String> transformer) {
		for (String s : list) {
			System.out.println(transformer.apply(s));
		}
	}

	public static void printIf(List<Integer> numbers, Predicate<Integer> condition) {
		for (Integer number : numbers) {
			if (condition.test(number)) {
				System.out.println(number);
			}
		}
	}
}
