package problem2b;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
	private int orderNum;
	private LocalDate orderDate;
	private List<OrderLine> orderLines;

	public Order(int orderNum, LocalDate orderDate) {
		this.orderNum = orderNum;
		this.orderDate = orderDate;
		this.orderLines = new ArrayList<OrderLine>();
	}

	public int getOrderNum() {
		return this.orderNum;
	}

	public LocalDate getOrderDate() {
		return this.orderDate;
	}

	public List<OrderLine> getOrderLines() {
		return this.orderLines;
	}

	public void addOrderLine(int orderLineNum, double price, int quantity) {
//		OrderLine newLine = new OrderLine(orderLineNum, price, quantity);
//		newLine.setOrder(this);
		OrderLine newLine = new OrderLine(orderLineNum, price, quantity, this);
		orderLines.add(newLine);
	}
}
