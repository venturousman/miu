package prob1;

import java.util.*;

// NOTE: no score for lab 10

/*
 * The code does not compile. 
 * Fix the code by capturing the wildcard with a helper method. 
 * Startup code is provided in the directory for this lab problem. 
 * Use the main method provided there to test your implementation. 
 * Note that the Group class has a toString method that will help in your test.
 */

public class GroupUtil {
	// Fix this code
//	public static Group<?> copy(Group<?> group) {
//		List<?> elements = group.getElements();
//		Group<?> grp = new Group<?>(group.getSpecialElement(), elements);
//		return grp;
//	}

	// Test using this main method
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0, 1, 2, 3, 4);
		Group<Integer> group = new Group<>(0, list);
		System.out.println(group);
		// System.out.println(GroupUtil.copy(group));
	}
}
