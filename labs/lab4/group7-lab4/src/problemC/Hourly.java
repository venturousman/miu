package problemC;

public class Hourly extends Employee {

	private double hourlyWage;
	private int hoursPerWeek;

	public Hourly(String empId, double hourlyWage, int hoursPerWeek) {
		super(empId);
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}

	public double getHourlyWage() {
		return this.hourlyWage;
	}

	public int getHoursPerWeek() {
		return this.hoursPerWeek;
	}

	@Override
	public double calcGrossPay(int month, int year) {
		return this.hourlyWage * this.hoursPerWeek * 4;
	}

}
