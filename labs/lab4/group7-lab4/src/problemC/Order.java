package problemC;

import java.time.LocalDate;

public class Order {
	private String orderNo;
	private LocalDate orderDate;
	private int orderAmount;

	public Order(String orderNo, LocalDate orderDate, int orderAmount) {
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}

	public String getOrderNo() {
		return this.orderNo;
	}

	public LocalDate getOrderDate() {
		return this.orderDate;
	}

	public int getOrderAmount() {
		return this.orderAmount;
	}
}
