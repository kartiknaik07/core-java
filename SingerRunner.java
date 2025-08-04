class SingerRunner {
	public static void main(String[] args) {
		Singer[] singers = new Singer[5];

		Singer s1 = new Singer();
		s1.setName("Arijit Singh");
		s1.setLanguage("Hindi");

		Singer s2 = new Singer();
		s2.setName("Sonu Nigam");
		s2.setLanguage("Hindi");

		Singer s3 = new Singer();
		s3.setName("SP Balasubrahmanyam");
		s3.setLanguage("Telugu");

		Singer s4 = new Singer();
		s4.setName("Sid Sriram");
		s4.setLanguage("Tamil");

		Singer s5 = new Singer();
		s5.setName("Shreya Ghoshal");
		s5.setLanguage("Bengali");

		for(int i = 0; i < singers.length; i++) {
			if(i == 0) singers[i] = s1;
			else if(i == 1) singers[i] = s2;
			else if(i == 2) singers[i] = s3;
			else if(i == 3) singers[i] = s4;
			else if(i == 4) singers[i] = s5;
		}

		for(int i = 0; i < singers.length; i++) {
			System.out.println("Name: " + singers[i].getName());
			System.out.println("Language: " + singers[i].getLanguage());
		}
	}
}