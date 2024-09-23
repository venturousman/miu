package prob3;

import java.util.Arrays;
import java.util.List;

//NOTE: no score for lab 10

/*
 * We would like to generalize to a type variable T. 
 * Write the code for the most general possible contains method so that the type T can represent Employees, Account and other types.
 */

public class Solution {

	// Generalize the contains method for a List
	public static boolean contains1(List<String> list, String s) {
		for (String x : list) {
			if (x == null && s == null)
				return true;
			if (x == null || s == null)
				continue;
			if (x.equals(s))
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Bob", "Joe", "Tom");
		boolean result = Solution.contains1(list, "Tom");
		System.out.println(result);
	}

}
