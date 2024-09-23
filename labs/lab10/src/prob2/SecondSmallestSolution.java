package prob2;

import java.util.Arrays;
import java.util.List;

//NOTE: no score for lab 10

/*
 * Create a generic programming solution to the problem of finding the second smallest element in a list. 
 * In other words, devise a public static method secondSmallest so that it can handle the biggest possible range of types.
 */

public class SecondSmallestSolution {

	// public static <T extends Comparable<? super T>> T secondSmallest(List<T>
	// list) {
	public static <T extends Comparable<T>> T secondSmallest(List<T> list) {
		if (list == null || list.size() < 2) {
//			throw new IllegalArgumentException("List must contain at least two elements");
			return null;
		}

		/*
		 * // 1st way - sort list.sort((a, b) -> a.compareTo(b)); //
		 * System.out.println("After sorting: " + list); return list.get(1);
		 */

		// 2nd way - loop
		// Initialize the smallest and second smallest elements
		T smallest = list.get(0);
		T secondSmallest = null;

		for (T element : list) {
			if (smallest.compareTo(element) > 0) {
				// If the current element is smaller than the smallest, update both
				secondSmallest = smallest;
				smallest = element;
			} else if (smallest.compareTo(element) < 0
					&& (secondSmallest == null || secondSmallest.compareTo(element) > 0)) {
				// If the current element is larger than the smallest but smaller than the
				// second smallest, update second smallest
				secondSmallest = element;
			}
		}

		if (secondSmallest == null) {
			throw new IllegalArgumentException("List must contain at least two distinct elements");
		}
		return secondSmallest;
	}

	public static void main(String[] args) {
		System.out.println(secondSmallest(null));
		System.out.println(secondSmallest(Arrays.asList()));
		System.out.println(secondSmallest(Arrays.asList(17)));
		System.out.println(secondSmallest(Arrays.asList(5, 2, 4, 1, 7))); // should be 2
		System.out.println(secondSmallest(Arrays.asList("Bob", "Joe", "Tom"))); // should be Joe

		System.out.println(secondSmallest(Arrays.asList(3, 3, 3)));
		System.out.println(secondSmallest(Arrays.asList("apple", "apple", "apple")));
	}

}

// 1: sort, then pick the 2nd smallest -> classes of T type must override equals - NOT WORK if the list contains all the same elements
// 2: find the 1st smallest first, then find the 2nd smallest -> need to override equals too.