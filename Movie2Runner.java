class Movie2Runner {
	public static void main(String[] args) {
		Movie2[] movies = new Movie2[5];

		Movie2 m1 = new Movie2();
		m1.setTitle("Inception");
		m1.setDirector("Christopher Nolan");

		Movie2 m2 = new Movie2();
		m2.setTitle("RRR");
		m2.setDirector("Rajamouli");

		Movie2 m3 = new Movie2();
		m3.setTitle("Interstellar");
		m3.setDirector("Christopher Nolan");

		Movie2 m4 = new Movie2();
		m4.setTitle("Kantara");
		m4.setDirector("Rishab Shetty");

		Movie2 m5 = new Movie2();
		m5.setTitle("3 Idiots");
		m5.setDirector("Rajkumar Hirani");

		for(int i = 0; i < movies.length; i++) {
			if(i == 0) movies[i] = m1;
			else if(i == 1) movies[i] = m2;
			else if(i == 2) movies[i] = m3;
			else if(i == 3) movies[i] = m4;
			else if(i == 4) movies[i] = m5;
		}

		for(int i = 0; i < movies.length; i++) {
			System.out.println("Title: " + movies[i].getTitle());
			System.out.println("Director: " + movies[i].getDirector());
		}
	}
}