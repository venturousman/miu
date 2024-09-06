package problem1;

public class PersonWithJob extends Person {

	private double salary;

	public double getSalary() {
		return salary;
	}

	PersonWithJob(String n, double s) {
		super(n);
		salary = s;
	}

	@Override
	public boolean equals(Object aPersonWithJob) {
		if (aPersonWithJob == null)
			return false;
		if (!(aPersonWithJob instanceof PersonWithJob))
			return false;
		PersonWithJob p = (PersonWithJob) aPersonWithJob;
		boolean isEqual = this.getName().equals(p.getName()) && this.getSalary() == p.getSalary();
		return isEqual;
	}

	public static void main(String[] args) {
		Person p1 = new PersonWithJob("Joe", 30000);
		Person p2 = new Person("Joe");
		// As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));

		// Explain why this has happened.
		// 1. p1.equals(p2) = false because p2 is not an instance of PersonWithJob class, at the second check in the equals function of PersonWithJob class
		// 2. p2.equals(p1) = true because p1 is (considered as) an instance of Person class, and has the same name "Joe" with p2, in the equals function of Person class.
		// Then provide a solution by replacing inheritance with composition. -> PersonWithJob2.java
	}

}
