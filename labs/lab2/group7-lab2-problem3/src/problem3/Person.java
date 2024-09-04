package problem3;

import java.util.Date;

public class Person {
	private String firstName;
	private String lastName;
	private Date birthDate;
	private String birthPlace;
	private String ssn;
	private Gender gender;
	private Passport passport;

	public Person(String firstName, String lastName, Date birthDate, String birthPlace, String ssn, Gender gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.birthPlace = birthPlace;
		this.ssn = ssn;
		this.gender = gender;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public String getSSN() {
		return ssn;
	}

	public Gender getGender() {
		return gender;
	}

	public void addPassport(String passportNumber, PassportType type, String code, Date issuedDate, Date expiryDate,
			String issuingAuthority) {
		if (passport == null)
			passport = new Passport(passportNumber, type, code, issuedDate, expiryDate, issuingAuthority);
	}

	public Passport getPassport() {
		return passport;
	}
}
