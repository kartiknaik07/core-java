class StudenttRunner {
	public static void main(String[] args) {
		Studentt s = new Studentt("Rahul", "CSE");
		System.out.println("Name: " + s.getName());
		System.out.println("Department: " + s.getDepartment());
		System.out.println("==================");
		s.setName("Anjali");
		System.out.println("Name: " + s.getName());
		s.setDepartment("ECE");
		System.out.println("Department: " + s.getDepartment());
	}
}