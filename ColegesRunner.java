class ColegesRunner {
	public static void main(String[] args) {
		Coleges c1 = new Coleges();
		c1.setName("SDIT");
		System.out.println(c1.getName());

		c1.setCity("Mangalore");
		System.out.println(c1.getCity());

		c1.setCourses(8);
		System.out.println(c1.getCourses());

		c1.setLabs(6);
		System.out.println(c1.getLabs());

		c1.setGrade('A');
		System.out.println(c1.getGrade());

		Coleges c2 = new Coleges();
		c2.setName("NMAMIT");
		System.out.println(c2.getName());

		Coleges c3 = new Coleges();
		c3.setName("KLE Tech");
		System.out.println(c3.getName());

		Coleges c4 = new Coleges();
		c4.setName("PESU");
		System.out.println(c4.getName());

		Coleges c5 = new Coleges();
		c5.setName("RNSIT");
		System.out.println(c5.getName());

		Coleges c6 = new Coleges();
		c6.setName("BIT");
		System.out.println(c6.getName());

		Coleges c7 = new Coleges();
		c7.setName("MIT");
		System.out.println(c7.getName());

		Coleges c8 = new Coleges();
		c8.setName("Jain University");
		System.out.println(c8.getName());

		Coleges c9 = new Coleges();
		c9.setName("Christ University");
		System.out.println(c9.getName());

		Coleges c10 = new Coleges();
		c10.setName("BMS");
		System.out.println(c10.getName());

		Coleges.totalProfessors = 85;
		System.out.println(Coleges.totalProfessors);

		Coleges.dean = "Dr. Veena Rao";
		System.out.println(Coleges.dean);
	}
}