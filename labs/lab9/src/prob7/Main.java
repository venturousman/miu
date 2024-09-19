package prob7;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000), new Employee("John", "Sims", 110000),
				new Employee("Joe", "Stevens", 200000), new Employee("Andrew", "Reardon", 80000),
				new Employee("Joe", "Cummings", 760000), new Employee("Steven", "Walters", 135000),
				new Employee("Thomas", "Blake", 111000), new Employee("Alice", "Richards", 101000),
				new Employee("Donald", "Trump", 100000));

		// your stream pipeline here
		// a.
		var names = list.stream().filter(e -> e.salary > 100000).filter(e -> e.lastName.charAt(0) > 'M')
				.map(e -> e.firstName + " " + e.lastName).sorted().collect(Collectors.joining(", "));
		System.out.println(names);

		// b.
		System.out.println(LambdaLibrary.NAMES_IN_RANGE_N_Z.apply(list, 100000, 'M'));
	}

}