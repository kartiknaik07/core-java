class Coleges {
	private String name;
	private String city;
	private int numCourses;
	private int numLabs;
	private char grade;
	static int totalProfessors;
	static String dean;

	public void setName(String a) {
		name = a;
	}
	public String getName() {
		return name;
	}
	public void setCity(String b) {
		city = b;
	}
	public String getCity() {
		return city;
	}
	public void setCourses(int c) {
		numCourses = c;
	}
	public int getCourses() {
		return numCourses;
	}
	public void setLabs(int d) {
		numLabs = d;
	}
	public int getLabs() {
		return numLabs;
	}
	public void setGrade(char e) {
		grade = e;
	}
	public char getGrade() {
		return grade;
	}
}


