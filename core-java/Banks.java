class Banks {
	private String name;
	private String location;
	private int numEmployees;
	private int numBranches;
	private char rating;
	static int totalATMs;
	static String chairman;

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
	public void setEmployees(int c) {
		numEmployees = c;
	}
	public int getEmployees() {
		return numEmployees;
	}
	public void setBranches(int d) {
		numBranches = d;
	}
	public int getBranches() {
		return numBranches;
	}
	public void setRating(char e) {
		rating = e;
	}
	public char getRating() {
		return rating;
	}
}

class BanksRunner {
	public static void main(String[] args) {
		Banks b1 = new Banks();
		b1.setName("SBI");
		System.out.println(b1.getName());

		b1.setLocation("Hubli");
		System.out.println(b1.getLocation());

		b1.setEmployees(1000);
		System.out.println(b1.getEmployees());

		b1.setBranches(25);
		System.out.println(b1.getBranches());

		b1.setRating('A');
		System.out.println(b1.getRating());

		Banks b2 = new Banks();
		b2.setName("Canara Bank");
		System.out.println(b2.getName());

		Banks b3 = new Banks();
		b3.setName("HDFC");
		System.out.println(b3.getName());

		Banks b4 = new Banks();
		b4.setName("ICICI");
		System.out.println(b4.getName());

		Banks b5 = new Banks();
		b5.setName("Axis Bank");
		System.out.println(b5.getName());

		Banks b6 = new Banks();
		b6.setName("Karnataka Bank");
		System.out.println(b6.getName());

		Banks b7 = new Banks();
		b7.setName("Union Bank");
		System.out.println(b7.getName());

		Banks b8 = new Banks();
		b8.setName("Bank of Baroda");
		System.out.println(b8.getName());

		Banks b9 = new Banks();
		b9.setName("IDBI");
		System.out.println(b9.getName());

		Banks b10 = new Banks();
		b10.setName("RBI");
		System.out.println(b10.getName());

		Banks.totalATMs = 400;
		System.out.println(Banks.totalATMs);

		Banks.chairman = "Mr. Shankar";
		System.out.println(Banks.chairman);
	}
}
