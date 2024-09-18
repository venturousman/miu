package prob1;

import java.util.Arrays;
import java.util.List;

public class Solution {

	public static long countWords(List<String> words, char c, char d, int len) {
		return words.stream().filter(w -> w.length() == len).filter(w -> w.contains(c + "") && !w.contains(d + ""))
				.count();
	}

	public static void main(String[] args) {
		List<String> words = Arrays.asList("cat", "dog", "car", "dot", "cart", "cad");
		char c = 'c', d = 't';
		int len = 3;
		System.out.println(countWords(words, c, d, len));
	}

}

// requirement using Lambdas and streams in a Functional way.
// which counts the number of words in the input list words that have length equal to len, 
// that contain the character c, and that do not contain the character d.