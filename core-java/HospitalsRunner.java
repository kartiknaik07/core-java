class HospitalsRunner {
	public static void main(String[] args) {
		Hospitals h1 = new Hospitals();
		h1.setName("Apollo");
		System.out.println(h1.getName());

		h1.setLocation("Bangalore");
		System.out.println(h1.getLocation());

		h1.setBeds(500);
		System.out.println(h1.getBeds());

		h1.setDepartments(15);
		System.out.println(h1.getDepartments());

		h1.setGrade('A');
		System.out.println(h1.getGrade());

		Hospitals h2 = new Hospitals();
		h2.setName("Manipal");
		System.out.println(h2.getName());

		Hospitals h3 = new Hospitals();
		h3.setName("Fortis");
		System.out.println(h3.getName());

		Hospitals h4 = new Hospitals();
		h4.setName("Narayana");
		System.out.println(h4.getName());

		Hospitals h5 = new Hospitals();
		h5.setName("Sakra");
		System.out.println(h5.getName());

		Hospitals h6 = new Hospitals();
		h6.setName("Columbia Asia");
		System.out.println(h6.getName());

		Hospitals h7 = new Hospitals();
		h7.setName("Aster");
		System.out.println(h7.getName());

		Hospitals h8 = new Hospitals();
		h8.setName("BGS Global");
		System.out.println(h8.getName());

		Hospitals h9 = new Hospitals();
		h9.setName("KIMS");
		System.out.println(h9.getName());

		Hospitals h10 = new Hospitals();
		h10.setName("Victoria");
		System.out.println(h10.getName());

		Hospitals.numDoctors = 120;
		System.out.println(Hospitals.numDoctors);

		Hospitals.directorName = "Dr. Ramesh";
		System.out.println(Hospitals.directorName);
	}
}