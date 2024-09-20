package prob8;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PuttingIntoPractice {
	public static void main(String... args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));

		// Query 1: Find all transactions from year 2011 and sort them by value (small
		// to high).
		var foundTransactions = transactions.stream().filter(t -> t.getYear() >= 2011)
				.sorted((a, b) -> Integer.compare(a.getValue(), b.getValue())).toList();

//		var foundTransactions2 = transactions.stream().filter(t -> t.getYear() >= 2011)
//				.sorted(Comparator.comparingInt(Transaction::getValue).reversed()).toList();

		System.out.println("1: All transactions from year 2011 and sort them by value: " + foundTransactions);

		// Query 2: What are all the unique cities where the traders work?
		var cities = transactions.stream().map(t -> t.getTrader().getCity()).distinct().toList();
		System.out.println("2: What are all the unique cities where the traders work? " + cities);

		// Query 3: Find all traders from Cambridge and sort them by name.
		var traders = transactions.stream().map(Transaction::getTrader).filter(x -> x.getCity() == "Cambridge")
				.distinct().sorted(Comparator.comparing(Trader::getName)).toList();
		System.out.println("3: All traders from Cambridge: " + traders);

		// Query 4: Return a string of all traders names sorted alphabetically.
		var names = transactions.stream().map(Transaction::getTrader).map(Trader::getName).distinct().sorted().toList();
		System.out.println("4: A string of all traders names sorted alphabetically: " + names);

		// Query 5: Are there any trader based in Milan?
		boolean isAnyTraderFromMilan = transactions.stream().map(Transaction::getTrader)
				.anyMatch(t -> t.getCity() == "Milan");
		System.out.println("5: Are there any trader based in Milan? " + isAnyTraderFromMilan);

		// Query 6: Update all transactions so that the traders from Milan are set to
		// Cambridge.
//		System.out.println("6: All transactions before updating " + transactions);
		System.out.println("6: All transactions so that the traders from Milan are set to Cambridge: ");
		System.out.println(transactions);
//		transactions.stream().filter(t -> t.getTrader().getCity() == "Milan").forEach(x -> x.getTrader().setCity("Cambridge"));
		var newTransactions = transactions.stream().filter(t -> "Milan".equals(t.getTrader().getCity()))
				.peek(t -> t.getTrader().setCity("Cambridge")).toList();
//		System.out.println("6: All transactions after updating " + transactions);
		System.out.println(transactions);

		// Query 7: What's the highest value in all the transactions?
		var theHighestValue = transactions.stream().map(Transaction::getValue).max(Integer::compareTo).get();
		System.out.println("7: What's the highest value in all the transactions? " + theHighestValue);
	}
}
