package problem2a;

public class Solution {

	public static void main(String[] args) {
		Student student1 = new Student("Dustin");
		GradeReport report = student1.getGradeReport();
		report.setGrade("A+");
		System.out.println("Grade is " + report.getGrade());
	}

}
