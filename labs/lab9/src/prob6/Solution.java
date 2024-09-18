package prob6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Solution {

	public static Set<String> union(List<Set<String>> sets) {
		Set<String> unionSet = sets.stream().reduce(new HashSet<>(), (set1, set2) -> {
			set1.addAll(set2);
			return set1;
		});
		return unionSet;
	}

	public static void main(String[] args) {
		List<Set<String>> sets = Arrays.asList(
				new HashSet<>(Arrays.asList("A", "B")),
				new HashSet<>(Arrays.asList("D")), 
				new HashSet<>(Arrays.asList("1", "3", "5"))
		);

		System.out.println(union(sets));
	}

}

// creating a stream pipeline that transforms a list of sets (of type String) into the union of those sets. 
// Make use of the reduce method for streams.

// Example: The union method should transform the list [{“A”, “B”}, {“D”}, {“1”, “3”,“5”}] to the set {“A”, “B”, “D”, “1”, “3”, “5”}.