package prob7;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {
	public static final TriFunction<List<Employee>, Integer, Character, String> NAMES_IN_RANGE_N_Z = (list,
			searchSalary, searchChar) -> list.stream().filter(e -> e.salary > searchSalary)
					.filter(e -> e.lastName.charAt(0) > searchChar).map(e -> e.firstName + " " + e.lastName).sorted()
					.collect(Collectors.joining(", "));

}
