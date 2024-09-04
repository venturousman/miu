package problem3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
	public static void main(String[] args) {
		try {
			Date birthDate = new SimpleDateFormat("dd/MM/yyyy").parse("29/01/1990");
			Date issuedDate = new SimpleDateFormat("dd/MM/yyyy").parse("23/07/2023");
			Date expiryDate = new SimpleDateFormat("dd/MM/yyyy").parse("23/07/2033");

			Person person1 = new Person("Dustin", "Nguyen", birthDate, "Ho Chi Minh city", "ssn12345", Gender.Male);
			person1.addPassport("no12345", PassportType.Regular, "VN123", issuedDate, expiryDate,
					"Immigration Department");

			Passport pp = person1.getPassport();
			System.out.println("Passport number: " + pp.getPassportNumber());
		} catch (ParseException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
