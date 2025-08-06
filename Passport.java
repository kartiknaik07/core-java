class Passport {
	private int passportNo;
	private String holderName;
	private String nationality;
	private String issuePlace;
	private int expiryYear;

	public Passport() {
	}

	public Passport(int passportNo, String holderName) {
		this.passportNo = passportNo;
		this.holderName = holderName;
	}

	public Passport(int passportNo, String holderName, String nationality) {
		this(passportNo, holderName);
		this.nationality = nationality;
	}

	public Passport(int passportNo, String holderName, String nationality, String issuePlace) {
		this(passportNo, holderName, nationality);
		this.issuePlace = issuePlace;
	}

	public Passport(int passportNo, String holderName, String nationality, String issuePlace, int expiryYear) {
		this(passportNo, holderName, nationality, issuePlace);
		this.expiryYear = expiryYear;
	}

	public int getPassportNo() {
		return passportNo;
	}

	public String getHolderName() {
		return holderName;
	}

	public String getNationality() {
		return nationality;
	}

	public String getIssuePlace() {
		return issuePlace;
	}

	public int getExpiryYear() {
		return expiryYear;
	}
}


