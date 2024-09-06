package problemC;

//import java.time.LocalDate;

public abstract class Employee {
	private String empId;

	public Employee(String empId) {
		this.empId = empId;
	}

	public String getEmpId() {
		return this.empId;
	}

	public void print(int month, int year) {
//		LocalDate now = LocalDate.now();
//		System.out.println(calcCompensation(now.getMonthValue(), now.getYear()));

		System.out.println("Employee Id: " + this.empId);
		System.out.println("Paystub:");
		Paycheck pc = calcCompensation(month, year);
		System.out.println("Gross Pay: " + this.calcGrossPay(month, year));
		System.out.println("Fica: " + pc.getFica());
		System.out.println("State: " + pc.getState());
		System.out.println("Local: " + pc.getLocal());
		System.out.println("Medicare: " + pc.getMedicare());
		System.out.println("Social Security: " + pc.getSocialSecurity());
		pc.print();
	};

	public Paycheck calcCompensation(int month, int year) {
		// This method takes the month and year as arguments
		// to calculate the compensation and return the Paycheck.
		double grossPay = this.calcGrossPay(month, year);
		Paycheck pc = new Paycheck(grossPay);
		return pc;
	}

	public abstract double calcGrossPay(int month, int year);

}
