class Hospitals {
	private String name;
	private String location;
	private int numBeds;
	private int departments;
	private char grade;
	static int numDoctors;
	static String directorName;

	public void setName(String a) {
		name = a;
	}
	public String getName() {
		return name;
	}
	public void setLocation(String b) {
		location = b;
	}
	public String getLocation() {
		return location;
	}
	public void setBeds(int c) {
		numBeds = c;
	}
	public int getBeds() {
		return numBeds;
	}
	public void setDepartments(int d) {
		departments = d;
	}
	public int getDepartments() {
		return departments;
	}
	public void setGrade(char e) {
		grade = e;
	}
	public char getGrade() {
		return grade;
	}
}


