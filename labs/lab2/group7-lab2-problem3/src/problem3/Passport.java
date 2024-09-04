package problem3;

import java.util.Date;

public class Passport {
	private String passportNumber;
	private PassportType type;
	private String code;
	private Date issuedDate;
	private Date expiryDate;
	private String issuingAuthority;

	public Passport(String passportNumber, PassportType type, String code, Date issuedDate, Date expiryDate,
			String issuingAuthority) {
		this.passportNumber = passportNumber;
		this.type = type;
		this.code = code;
		this.issuedDate = issuedDate;
		this.expiryDate = expiryDate;
		this.issuingAuthority = issuingAuthority;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public PassportType getPassportType() {
		return type;
	}

	public String getCode() {
		return code;
	}

	public Date getIssuedDate() {
		return issuedDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public String getIssuingAuthority() {
		return issuingAuthority;
	}
}
