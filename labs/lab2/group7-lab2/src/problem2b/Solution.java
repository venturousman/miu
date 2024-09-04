package problem2b;

import java.time.LocalDate;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		Order order1 = new Order(1, LocalDate.now());
		order1.addOrderLine(1, 3.87, 1);
		order1.addOrderLine(2, 4.25, 2);
		List<OrderLine> lines = order1.getOrderLines();
		for (OrderLine line : lines) {
			System.out.println("line " + line.getOrderLineNum() + " - " + line.getPrice() + " - " + line.getQuantity());
		}
	}

}
