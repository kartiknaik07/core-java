class Student1Runner {
	public static void main(String[] args) {
		Student1[] students = new Student1[5];

		Student1 s1 = new Student1();
		s1.setName("Kiran");
		s1.setCollege("SDIT");
		students[0] = s1;

		Student1 s2 = new Student1();
		s2.setName("Megha");
		s2.setCollege("KUD");
		students[1] = s2;

		Student1 s3 = new Student1();
		s3.setName("Raj");
		s3.setCollege("NITK");
		students[2] = s3;

		Student1 s4 = new Student1();
		s4.setName("Sneha");
		s4.setCollege("MIT");
		students[3] = s4;

		Student1 s5 = new Student1();
		s5.setName("Ajay");
		s5.setCollege("PESU");
		students[4] = s5;

		for (int i = 0; i < students.length; i++) {
			Student1 s = students[i];
			System.out.println("Name: " + s.getName());
			System.out.println("College: " + s.getCollege());
		}
	}
}
