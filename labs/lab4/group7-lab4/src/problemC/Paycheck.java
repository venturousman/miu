package problemC;

public class Paycheck {

	private double grossPay;
	private double fica;
	private double state;
	private double local;
	private double medicare;
	private double socialSecurity;

	public Paycheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity) {
		this.grossPay = grossPay;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.socialSecurity = socialSecurity;
	}

	public Paycheck(double grossPay) {
		this(grossPay, 0.23, 0.05, 0.01, 0.03, 0.075);
	}

	public double getGrossPay() {
		return this.grossPay;
	}

	public double getFica() {
		return this.fica;
	}

	public double getState() {
		return this.state;
	}

	public double getLocal() {
		return this.local;
	}

	public double getMedicare() {
		return this.medicare;
	}

	public double getSocialSecurity() {
		return this.socialSecurity;
	}

	public void print() {
		System.out.println("NET PAY:" + getNetPay());
	}

	public double getNetPay() {
		return this.grossPay
				- (this.fica + this.state + this.local + this.medicare + this.socialSecurity) * this.grossPay;
	}
}
