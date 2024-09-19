package prob2;

import java.util.stream.IntStream;

public class Solution {

	public static void printSquares(int num) {
		IntStream stream = IntStream.iterate(1, n -> n + 1).limit(num).map(n -> n * n);
		stream.forEach(System.out::println);
//		stream.forEach(x -> System.out.printf("%d, ", x));
	}

	public static void main(String[] args) {
		printSquares(4);
	}
}

// which creates an IntStream using the iterate method. The method prints to the console the first num squares.
// For example, if num = 4, then your method would output 1, 4, 9, 16