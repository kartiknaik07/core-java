class Movie1Runner {
	public static void main(String[] args) {
		Movie1[] movies = new Movie1[5];

		Movie1 m1 = new Movie1();
		m1.setTitle("Inception");
		m1.setDirector("Christopher Nolan");
		movies[0] = m1;

		Movie1 m2 = new Movie1();
		m2.setTitle("RRR");
		m2.setDirector("Rajamouli");
		movies[1] = m2;

		Movie1 m3 = new Movie1();
		m3.setTitle("Pushpa");
		m3.setDirector("Sukumar");
		movies[2] = m3;

		Movie1 m4 = new Movie1();
		m4.setTitle("Kantara");
		m4.setDirector("Rishab Shetty");
		movies[3] = m4;

		Movie1 m5 = new Movie1();
		m5.setTitle("Vikram");
		m5.setDirector("Lokesh Kanagaraj");
		movies[4] = m5;

		for (int i = 0; i < movies.length; i++) {
			Movie1 m = movies[i];
			System.out.println("Title: " + m.getTitle());
			System.out.println("Director: " + m.getDirector());
		}
	}
}