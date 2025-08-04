class SubjectRunner {
	public static void main(String[] args) {
		Subject[] subjects = new Subject[5];

		Subject s1 = new Subject();
		s1.setName("Mathematics");
		s1.setCode("MATH101");
		subjects[0] = s1;

		Subject s2 = new Subject();
		s2.setName("Physics");
		s2.setCode("PHY102");
		subjects[1] = s2;

		Subject s3 = new Subject();
		s3.setName("Java Programming");
		s3.setCode("CSE201");
		subjects[2] = s3;

		Subject s4 = new Subject();
		s4.setName("Data Structures");
		s4.setCode("CSE202");
		subjects[3] = s4;

		Subject s5 = new Subject();
		s5.setName("Operating Systems");
		s5.setCode("CSE303");
		subjects[4] = s5;

		for (int i = 0; i < subjects.length; i++) {
			Subject s = subjects[i];
			System.out.println("Subject: " + s.getName());
			System.out.println("Code: " + s.getCode());
		}
	}
}
