package problemC;

import java.time.LocalDate;
import java.util.List;

public class Commissioned extends Employee {

	private double commission;
	private double baseSalary;
	private List<Order> orders;

	public Commissioned(String empId, double commission, double baseSalary, List<Order> orders) {
		super(empId);
		this.commission = commission;
		this.baseSalary = baseSalary;
		this.orders = orders;
	}

	public double getBaseSalary() {
		return this.baseSalary;
	}

	public double getCommission() {
		return this.commission;
	}

	public List<Order> getOrders() {
		return this.orders;
	}

	@Override
	public double calcGrossPay(int month, int year) {
		// = base salary + a percentage (commission) on the total value of all orders
		// they sold during the previous month.
		double sum = 0;
		int previousMonth = month - 1;
		for (Order order : orders) {
			LocalDate orderDate = order.getOrderDate();
			if (orderDate.getMonthValue() == previousMonth) {
				sum += order.getOrderAmount();
			}
		}
		return this.baseSalary + (this.commission * sum);
	}

}
