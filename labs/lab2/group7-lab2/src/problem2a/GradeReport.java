package problem2a;

public class GradeReport {
	private String grade;
	private Student student;

	// package level
	GradeReport(Student student) {
		this.student = student;
	}

	public Student getStudent() {
		return this.student;
	}

	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
}
