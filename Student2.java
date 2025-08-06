class Student2 {
	private int rollNo;
	private String name;
	private String college;
	private String branch;
	private int year;

	public Student2() {
	}

	public Student2(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	public Student2(int rollNo, String name, String college) {
		this(rollNo, name);
		this.college = college;
	}

	public Student2(int rollNo, String name, String college, String branch) {
		this(rollNo, name, college);
		this.branch = branch;
	}

	public Student2(int rollNo, String name, String college, String branch, int year) {
		this(rollNo, name, college, branch);
		this.year = year;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public String getCollege() {
		return college;
	}

	public String getBranch() {
		return branch;
	}

	public int getYear() {
		return year;
	}
}


