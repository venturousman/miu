package problem1;

// remove inheritance (extends Person)
public class PersonWithJob2 {

	private double salary;
	private Person person; // composition

	// get person's name
	public String getName() {
		return person.getName();
	}

	public Person getPerson() {
		return this.person;
	}

	public double getSalary() {
		return salary;
	}

	PersonWithJob2(String n, double s) {
		person = new Person(n);
		salary = s;
	}

//	@Override
//	public boolean equals(Object aPersonWithJob) {
//		if (aPersonWithJob == null)
//			return false;
//		if (!(aPersonWithJob instanceof PersonWithJob2))
//			return false;
//		PersonWithJob2 p = (PersonWithJob2) aPersonWithJob;
//		boolean isEqual = this.getName().equals(p.getName()) && this.getSalary() == p.getSalary();
//		return isEqual;
//	}

	public static void main(String[] args) {
		PersonWithJob2 pwj = new PersonWithJob2("Joe", 30000);
		Person p1 = pwj.getPerson();
		Person p2 = new Person("Joe");
		// As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
	}

}
