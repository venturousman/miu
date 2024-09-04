package problem2b;

public class OrderLine {
	private int orderLineNum;
	private double price;
	private int quantity;
	private Order order;

	// package level
	OrderLine(int orderLineNum, double price, int quantity) {
		this.orderLineNum = orderLineNum;
		this.price = price;
		this.quantity = quantity;
	}

	OrderLine(int orderLineNum, double price, int quantity, Order order) {
		this.orderLineNum = orderLineNum;
		this.price = price;
		this.quantity = quantity;
		this.order = order;
	}

	public int getOrderLineNum() {
		return this.orderLineNum;
	}

	public double getPrice() {
		return this.price;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
}
