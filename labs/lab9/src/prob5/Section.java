package prob5;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Section {
	public static Stream<String> streamSection(Stream<String> stream, int m, int n) {
		return stream.skip(m).limit(n - m + 1); // implement
		// extracts a substream from the input stream 'stream' consisting of all elements
		// from position m to position n, inclusive; you must use only functional style
		// of coding. You can assume 0 <= m <= n.
	}

	public static void main(String[] args) {
		/*
		 * Make three calls for the streamSection() method with different inputs range
		 * for the m and n. Use nextStream() method to supply the Stream input as a
		 * first argument in streamSection() method
		 */
		// streamSection(nextStream(), 0, 3). print the result as [aaa, bbb, ccc, ddd]
		System.out.println(streamSection(nextStream(), 0, 3).toList());
		System.out.println(streamSection(nextStream(), 2, 8).toList());
		System.out.println(streamSection(nextStream(), 1, 5).toList());
	}

	// support method for the main method -- for testing
	private static Stream<String> nextStream() {
		return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh", "iii").stream();
	}
}
